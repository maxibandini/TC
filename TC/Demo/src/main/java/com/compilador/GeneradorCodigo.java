package com.compilador;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GeneradorCodigo {
    private final List<String> codigo = new ArrayList<>();
    private int tempCounter = 0;
    private int labelCounter = 0;

    public GeneradorCodigo() {
        System.out.println("GENERADOR: Iniciado y listo");
    }

    public String newTemp() {
        String t = "t" + (tempCounter++);
        System.out.println("GENERADOR: Creé temporal -> " + t);
        return t;
    }

    public String newLabel() {
        String l = "L" + (labelCounter++);
        System.out.println("GENERADOR: Creé etiqueta -> " + l);
        return l;
    }

    public String genOperacionBinaria(String op, String left, String right) {
        System.out.println("GENERADOR: Operación " + left + " " + op + " " + right);
        String t = newTemp();
        String instr = t + " = " + left + " " + op + " " + right;
        codigo.add(instr);
        return t;
    }

    public void genAsignacion(String var, String val) {
        System.out.println("GENERADOR: Asignación " + var + " = " + val);
        codigo.add(var + " = " + val);
    }

    public void genLabel(String lbl) {
        System.out.println("GENERADOR: Etiqueta " + lbl);
        codigo.add(lbl + ":");
    }

    public void genIfFalse(String cond, String lbl) {
        System.out.println("GENERADOR: IfFalse " + cond + " -> " + lbl);
        codigo.add("if !" + cond + " goto " + lbl);
    }

    public void genGoto(String lbl) {
        System.out.println("GENERADOR: Goto " + lbl);
        codigo.add("goto " + lbl);
    }

    public void genReturn(String val) {
        if (val != null) {
            System.out.println("GENERADOR: Return " + val);
            codigo.add("return " + val);
        } else {
            System.out.println("GENERADOR: Return");
            codigo.add("return");
        }
    }

    public void genCall(String fn, List<String> args, String dest) {
        System.out.println("GENERADOR: Call " + fn + " -> " + dest);
        // empuja parámetros
        for (String a : args) {
            codigo.add("param " + a);
        }
        // invocación
        codigo.add(dest + " = call " + fn + ", " + args.size());
    }

    public List<String> getCodigo() {
        return codigo;
    }

    public void imprimirCodigo() {
        System.out.println("\n=== CÓDIGO 3 DIRECCIONES ===");
        for (int i = 0; i < codigo.size(); i++) {
            System.out.printf("%3d: %s\n", i, codigo.get(i));
        }
        System.out.println("Total instrucciones: " + codigo.size());
    }

    public void imprimirEstadisticas() {
        System.out.println("\nESTADÍSTICAS:");
        System.out.println("  - Temporales creados: " + tempCounter);
        System.out.println("  - Etiquetas creadas:  " + labelCounter);
        System.out.println("  - Total instrucciones: " + codigo.size());
    }

    // Métodos dummy…
    public Map<String, String> getTiposVariables() {
        return null;
    }

    public void imprimirTipos() {
    }
}
