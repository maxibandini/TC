package com.compilador;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;

import com.compilador.MiLenguajeParser.InstruccionInicialesContext;

public class SimbolosListener extends MiLenguajeBaseListener {

    // Tabla de símbolos y reportes de problemas
    private TablaSimbolos tablaSimbolos;
    private List<String> listaErrores;
    private List<String> listaAvisos;
    private String tipoRetornoActual;
    private Stack<String> pilaAmbitos;

    public SimbolosListener() {
        tablaSimbolos = new TablaSimbolos();
        listaErrores = new ArrayList<>();
        listaAvisos = new ArrayList<>();
        tipoRetornoActual = null;
        pilaAmbitos = new Stack<>();
        pilaAmbitos.push("global"); // ámbito raíz
    }

    public TablaSimbolos getTablaSimbolos() {
        return tablaSimbolos;
    }

    public List<String> getErrores() {
        return listaErrores;
    }

    public List<String> getAdvertencias() {
        return listaAvisos;
    }

    // ------ Gestión de ámbitos ------
    private String ambitoActual() {
        return pilaAmbitos.peek();
    }

    private void pushAmbito(String nombre) {
        pilaAmbitos.push(nombre);
        tablaSimbolos.setAmbito(nombre);
    }

    private void popAmbito() {
        if (pilaAmbitos.size() > 1) {
            pilaAmbitos.pop();
            tablaSimbolos.setAmbito(ambitoActual());
        }
    }

    @Override
    public void enterBucleWhile(MiLenguajeParser.BucleWhileContext ctx) {
        // Advertencia si condición es siempre verdadera o constante
        String cond = ctx.expresion().getText();
        if ("1".equals(cond) || "true".equals(cond)) {
            listaAvisos.add("[WARNING] Línea " + ctx.getStart().getLine() +
                    ": bucle WHILE con condición inmutable.");
        }
    }

    @Override
    public void enterDefinicionFuncion(MiLenguajeParser.DefinicionFuncionContext ctx) {
        String name = ctx.ID().getText();
        String type = ctx.tipoDato().getText();
        int ln = ctx.ID().getSymbol().getLine();
        int col = ctx.ID().getSymbol().getCharPositionInLine();

        TablaSimbolos.Simbolo sym = new TablaSimbolos.Simbolo(
                name, type, "funcion", ln, col, "global");
        boolean existed = tablaSimbolos.existeSimbolo(name, ambitoActual());
        tablaSimbolos.agregar(sym);

        if (existed) {
            TablaSimbolos.Simbolo old = tablaSimbolos.obtenerSimbolo(name, ambitoActual());
            if (old != null && "funcion".equals(old.getCategoria())) {
                listaErrores.add("[SEMANTIC] Línea " + ln +
                        ": función '" + name + "' ya declarada.");
            } else {
                listaAvisos.add("[WARNING] Línea " + ln +
                        ": duplicado de función '" + name + "'.");
            }
        }

        // Parámetros de función
        if (ctx.listaParams() != null) {
            for (MiLenguajeParser.ParametroContext p : ctx.listaParams().parametro()) {
                String pType = p.tipoDato().getText();
                String pName = p.ID().getText();
                sym.addParametro(pType);
                TablaSimbolos.Simbolo ps = new TablaSimbolos.Simbolo(
                        pName, pType, "parametro",
                        p.ID().getSymbol().getLine(),
                        p.ID().getSymbol().getCharPositionInLine(),
                        name);
                boolean pExisted = tablaSimbolos.existeSimbolo(pName, name);
                tablaSimbolos.agregar(ps);
                if (pExisted) {
                    listaAvisos.add("[WARNING] Línea " + p.ID().getSymbol().getLine() +
                            ": parámetro duplicado '" + pName + "'.");
                }
            }
        }

        pushAmbito(name);
        tipoRetornoActual = type;
    }

    @Override
    public void exitDefinicionFuncion(MiLenguajeParser.DefinicionFuncionContext ctx) {
        String func = ctx.ID().getText();
        // Limpieza de símbolos no usados o no inicializados
        for (TablaSimbolos.Simbolo s : tablaSimbolos.getSimbolos()) {
            if (func.equals(s.getAmbito())) {
                if (!s.fueUsado()) {
                    String tag = "[CLEANUP]";
                    listaAvisos.add(tag + " Línea " + s.getLinea() +
                            ": " + s.getCategoria() + " '" + s.getNombre() + "' no usado.");
                }
                if (!s.fueInicializada() && "variable".equals(s.getCategoria())) {
                    listaAvisos.add("[CLEANUP] Línea " + s.getLinea() +
                            ": variable '" + s.getNombre() + "' sin inicializar.");
                }
            }
        }
        popAmbito();
        tipoRetornoActual = null;
    }

    @Override
    public void enterBucleFor(MiLenguajeParser.BucleForContext ctx) {
        // Nuevo ámbito dentro de FOR
        int ln = ctx.getStart().getLine();
        String fb = "for_" + ln;
        pushAmbito(fb);

        MiLenguajeParser.InitForContext init = ctx.initFor();
        if (init != null && init.definicionSinPunto() != null) {
            var dv = init.definicionSinPunto();
            String vName = dv.ID().getText();
            String vType = dv.tipoDato().getText();
            int vCol = dv.ID().getSymbol().getCharPositionInLine();
            TablaSimbolos.Simbolo varSym = new TablaSimbolos.Simbolo(
                    vName, vType, "variable", ln, vCol, ambitoActual());
            if (dv.expresion() != null)
                varSym.marcarComoInicializada();
            if (dv.CONST() != null)
                varSym.setConstante(true);
            boolean existedVar = tablaSimbolos.existeSimbolo(vName, ambitoActual());
            tablaSimbolos.agregar(varSym);
            if (existedVar) {
                listaAvisos.add("[WARNING] Línea " + ln +
                        ": variable '" + vName + "' re-declarada.");
            }
        }
    }

    @Override
    public void exitBucleFor(MiLenguajeParser.BucleForContext ctx) {
        popAmbito();
    }

    @Override
    public void enterDefinicionVariable(MiLenguajeParser.DefinicionVariableContext ctx) {
        String nVar = ctx.ID().getText();
        String tVar = ctx.tipoDato().getText();
        int ln = ctx.ID().getSymbol().getLine();
        int col = ctx.ID().getSymbol().getCharPositionInLine();
        String amb = ambitoActual();

        TablaSimbolos.Simbolo vs = new TablaSimbolos.Simbolo(
                nVar, tVar, "variable", ln, col, amb);
        boolean existed = tablaSimbolos.existeSimbolo(nVar, amb);
        tablaSimbolos.agregar(vs);
        if (existed) {
            listaAvisos.add("[WARNING] Línea " + ln + ": variable '" + nVar + "' duplicada.");
        }
        if (ctx.expresion() != null)
            vs.marcarComoInicializada();
        if (ctx.CONST() != null)
            vs.setConstante(true);
    }

    @Override
    public void enterAsignacionVariable(MiLenguajeParser.AsignacionVariableContext ctx) {
        String nm = ctx.ID().getText();
        int ln = ctx.ID().getSymbol().getLine();
        var s = tablaSimbolos.buscar(nm, ln);
        if (s == null) {
            listaErrores.add("[SEMANTIC] Línea " + ln + ": variable '" + nm + "' no declarada.");
        } else if (s.esConstante()) {
            listaErrores.add("[SEMANTIC] Línea " + ln + ": reasignación de constante '" + nm + "'.");
        } else {
            s.marcarComoInicializada();
        }
    }

    @Override
    public void enterExpFuncion(MiLenguajeParser.ExpFuncionContext ctx) {
        var call = ctx.llamadaExpr();
        String nm = call.ID().getText();
        int ln = call.ID().getSymbol().getLine();
        var s = tablaSimbolos.buscar(nm, ln);
        if (s == null) {
            listaErrores.add("[SEMANTIC] Línea " + ln + ": función '" + nm + "' indefinida.");
        } else {
            s.marcarComoUsado();
            if (s.getLinea() > ln) {
                listaErrores.add("[SEMANTIC] Línea " + ln + ": llamada antes de declarar '" + nm + "'.");
            }
            int expCount = s.tiposParametros.size();
            var args = call.listaArgumentos();
            int gotCount = args != null ? args.expresion().size() : 0;
            if (expCount != gotCount) {
                listaErrores.add("[SEMANTIC] Línea " + ln + ": '" + nm + "' esperaba " +
                        expCount + " args, recibió " + gotCount + ".");
            }
        }
    }

    @Override
    public void enterExpVariable(MiLenguajeParser.ExpVariableContext ctx) {
        String nm = ctx.ID().getText();
        int ln = ctx.ID().getSymbol().getLine();
        var s = tablaSimbolos.buscar(nm, ln);
        if (s == null) {
            listaErrores.add("[SEMANTIC] Línea " + ln + ": variable '" + nm + "' no declarada.");
        } else {
            s.marcarComoUsado();
        }
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        listaErrores.add("[SYNTAX] nodo: " + node.getText());
    }

    @Override
    public void enterInicio(MiLenguajeParser.InicioContext ctx) {
        boolean foundMain = false;
        boolean flagged = false;

        for (ParseTree ch : ctx.children) {
            if (ch instanceof InstruccionInicialesContext) {
                InstruccionInicialesContext ins = (InstruccionInicialesContext) ch;

                // Si es una definición de función
                if (ins.definicionFuncion() != null) {
                    String name = ins.definicionFuncion().ID().getText();
                    if ("main".equals(name)) {
                        foundMain = true;
                    }
                    // NO marcar error aquí: cualquier función es válida en raíz
                }
                // Si es variable o asignación en raíz, tampoco hay error
                else if (ins.definicionVariable() != null
                        || ins.asignacionVariable() != null) {
                    // permitido, no hacer nada
                }
            }
            // notas (comentarios) se ignoran
        }

        // Si no hay main, sí error
        if (!foundMain) {
            listaErrores.add("[SEMANTIC] falta función 'main' como punto de entrada.");
        }
    }

}
