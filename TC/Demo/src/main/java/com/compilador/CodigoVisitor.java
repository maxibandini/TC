package com.compilador;

import com.compilador.MiLenguajeBaseVisitor;
import com.compilador.MiLenguajeParser.*;

import java.util.ArrayList;
import java.util.List;

public class CodigoVisitor extends MiLenguajeBaseVisitor<String> {
    private final GeneradorCodigo generador;
    private final TablaSimbolos tabla;

    public CodigoVisitor(TablaSimbolos tabla) {
        this.generador = new GeneradorCodigo();
        this.tabla = tabla;
        System.out.println("VISITOR: Iniciado con tabla de símbolos");
    }

    public GeneradorCodigo getGenerador() {
        return generador;
    }

    @Override
    public String visitInicio(MiLenguajeParser.InicioContext ctx) {
        System.out.println("VISITOR: Inicio del programa");
        // Recorremos sólo las instrucciones globales (instruccionIniciales)
        for (InstruccionInicialesContext ins : ctx.instruccionIniciales()) {
            visit(ins);
        }
        System.out.println("VISITOR: Programa completado");
        return null;
    }

    // Este método hace de “dispatcher” para cada instruccionIniciales
    @Override
    public String visitInstruccionIniciales(InstruccionInicialesContext ctx) {
        if (ctx.definicionFuncion() != null) {
            return visit(ctx.definicionFuncion());
        }
        if (ctx.definicionVariable() != null) {
            return visit(ctx.definicionVariable());
        }
        if (ctx.asignacionVariable() != null) {
            return visit(ctx.asignacionVariable());
        }
        return null;
    }

    @Override
    public String visitAsignacionVariable(AsignacionVariableContext ctx) {
        String var = ctx.ID().getText();
        System.out.println("VISITOR: Asignación -> " + var);
        String val = visit(ctx.expresion());
        generador.genAsignacion(var, val);
        return null;
    }

    @Override
    public String visitRetornoInst(RetornoInstContext ctx) {
        System.out.println("VISITOR: Return");
        if (ctx.expresion() != null) {
            String v = visit(ctx.expresion());
            generador.genReturn(v);
        } else {
            generador.genReturn(null);
        }
        return null;
    }

    @Override
    public String visitCondicionIf(CondicionIfContext ctx) {
        System.out.println("VISITOR: IF encontrado");
        String cond = visit(ctx.expresion());
        String lblElse = generador.newLabel();
        String lblEnd = generador.newLabel();

        generador.genIfFalse(cond, lblElse);
        visit(ctx.cuerpo(0));

        if (ctx.ELSE() != null) {
            generador.genGoto(lblEnd);
            generador.genLabel(lblElse);
            visit(ctx.cuerpo(1));
            generador.genLabel(lblEnd);
        } else {
            generador.genLabel(lblElse);
        }
        System.out.println("VISITOR: IF completado");
        return null;
    }

    @Override
    public String visitBucleWhile(BucleWhileContext ctx) {
        System.out.println("VISITOR: WHILE encontrado");
        String lblCond = generador.newLabel();
        String lblEnd = generador.newLabel();

        generador.genLabel(lblCond);
        String cond = visit(ctx.expresion());
        generador.genIfFalse(cond, lblEnd);
        visit(ctx.cuerpo());
        generador.genGoto(lblCond);
        generador.genLabel(lblEnd);
        System.out.println("VISITOR: WHILE completado");
        return null;
    }

    @Override
    public String visitBucleFor(BucleForContext ctx) {
        System.out.println("VISITOR: FOR encontrado");
        // init-for (definicionSinPunto o asignacionSinPunto)
        if (ctx.initFor() != null) {
            visit(ctx.initFor());
        }

        String lblCond = generador.newLabel();
        String lblEnd = generador.newLabel();
        generador.genLabel(lblCond);

        // condición
        if (ctx.expresion() != null) {
            String cond = visit(ctx.expresion());
            generador.genIfFalse(cond, lblEnd);
        }

        // cuerpo
        visit(ctx.cuerpo());

        // update
        if (ctx.updateFor() != null) {
            visit(ctx.updateFor());
        }

        generador.genGoto(lblCond);
        generador.genLabel(lblEnd);
        System.out.println("VISITOR: FOR completado");
        return null;
    }

    @Override
    public String visitDefinicionFuncion(DefinicionFuncionContext ctx) {
        String fn = ctx.ID().getText();
        System.out.println("VISITOR: Definición de función -> " + fn);
        generador.genLabel("func_" + fn);
        visit(ctx.cuerpo());
        return null;
    }

    @Override
    public String visitDefinicionVariable(DefinicionVariableContext ctx) {
        // Si viene con “= expresion”, generamos la asignación
        if (ctx.expresion() != null) {
            String var = ctx.ID().getText();
            String val = visit(ctx.expresion());
            generador.genAsignacion(var, val);
        }
        return null;
    }

    @Override
    public String visitLlamadaExpr(LlamadaExprContext ctx) {
        String fn = ctx.ID().getText();
        List<String> args = new ArrayList<>();
        if (ctx.listaArgumentos() != null) {
            for (ExpresionContext e : ctx.listaArgumentos().expresion()) {
                args.add(visit(e));
            }
        }
        String tmp = generador.newTemp();
        generador.genCall(fn, args, tmp);
        return tmp;
    }

    @Override
    public String visitExpBinaria(ExpBinariaContext ctx) {
        String op = ctx.opBinaria().getText();
        String left = visit(ctx.expresion(0));
        String right = visit(ctx.expresion(1));
        return generador.genOperacionBinaria(op, left, right);
    }

    @Override
    public String visitExpVariable(ExpVariableContext ctx) {
        return ctx.ID().getText();
    }

    @Override
    public String visitExpEntero(ExpEnteroContext ctx) {
        return ctx.INTEGER().getText();
    }

    @Override
    public String visitExpParentesis(ExpParentesisContext ctx) {
        return visit(ctx.expresion());
    }
}
