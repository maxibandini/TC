// Archivo: src/main/java/com/compilador/Optimizador.java
package com.compilador;

import java.util.*;

/**
 * Optimizador de código de tres direcciones: punto 5 (optimización).
 */
public class Optimizador {
    private List<String> codigo;

    public Optimizador(List<String> codigo) {
        this.codigo = new ArrayList<>(codigo);
    }

    /** Ejecuta todas las optimizaciones en orden */
    public List<String> optimizar() {
        eliminarCodigoMuerto();
        propagarConstantes();
        simplificarExpresiones();
        eliminarSentenciasRedundantes();
        return codigo;
    }

    /** 1. Elimina código muerto (inaccesible) */
    private void eliminarCodigoMuerto() {
        Set<Integer> alcanzables = new HashSet<>();
        Map<String, Integer> etiquetas = new HashMap<>();
        // Registro de etiquetas
        for (int i = 0; i < codigo.size(); i++) {
            String linea = codigo.get(i);
            if (linea.endsWith(":")) {
                 String lbl = linea.substring(0, linea.length() - 1);
                    etiquetas.put(lbl, i);
            }
        }
        // Marcar desde inicio y desde func_main si existe
        marcarLineas(0, alcanzables, etiquetas);
        if (etiquetas.containsKey("func_main")) {
            marcarLineas(etiquetas.get("func_main"), alcanzables, etiquetas);
        }
        // Filtrar código
        List<String> out = new ArrayList<>();
        for (int i = 0; i < codigo.size(); i++) {
            if (alcanzables.contains(i)) out.add(codigo.get(i));
        }
        codigo = out;
    }

    private void marcarLineas(int idx, Set<Integer> acc, Map<String, Integer> etiq) {
        if (idx < 0 || idx >= codigo.size() || acc.contains(idx)) return;
        acc.add(idx);
        String ln = codigo.get(idx);
        // goto incondicional
        if (ln.startsWith("goto ")) {
            String lbl = ln.substring(5);
            if (etiq.containsKey(lbl)) marcarLineas(etiq.get(lbl), acc, etiq);
            return;
        }
        // if condicional
        if (ln.startsWith("if ") && ln.contains(" goto ")) {
            String lbl = ln.split(" goto ")[1];
            if (etiq.containsKey(lbl)) marcarLineas(etiq.get(lbl), acc, etiq);
        }
        // return detiene
        if (ln.equals("return") || ln.startsWith("return ")) return;
        // siguiente instrucción
        marcarLineas(idx + 1, acc, etiq);
    }

    /** 2. Propagación de constantes simples */
    private void propagarConstantes() {
        Map<String, String> consts = new HashMap<>();
        List<String> out = new ArrayList<>();
        for (String ln : codigo) {
            // detección de asignación simple a constante
            if (ln.matches("\\w+ = [-]?\\d+(\\.\\d+)?")) {
                String[] p = ln.split(" = ");
                consts.put(p[0].trim(), p[1].trim());
                out.add(ln);
                continue;
            }
            // reemplazo de constantes conocidas
            String opt = ln;
            for (Map.Entry<String, String> e : consts.entrySet()) {
                opt = opt.replaceAll("\\b" + e.getKey() + "\\b", e.getValue());
            }
            out.add(opt);
        }
        codigo = out;
    }

    /** 3. Simplificación de expresiones constantes */
    private void simplificarExpresiones() {
        List<String> out = new ArrayList<>();
        for (String ln : codigo) {
            if (ln.contains(" = ")) {
                String[] parts = ln.split(" = ");
                String dst = parts[0].trim();
                String expr = parts[1].trim();
                // aritmética constante
                if (expr.matches("[-]?\\d+ [+\\-*/%] [-]?\\d+")) {
                    String[] op = expr.split(" ");
                    int a = Integer.parseInt(op[0]);
                    int b = Integer.parseInt(op[2]);
                    int r = 0;
                    switch (op[1]) {
                        case "+": r = a + b; break;
                        case "-": r = a - b; break;
                        case "*": r = a * b; break;
                        case "/": r = (b != 0) ? a / b : a / b; break;
                        case "%": r = (b != 0) ? a % b : a % b; break;
                    }
                    out.add(dst + " = " + r);
                    continue;
                }
                // lógicas constantes
                if (expr.matches("[-]?\\d+ (>=|<=|==|!=|>|<) [-]?\\d+")) {
                    String[] op = expr.split(" ");
                    int a = Integer.parseInt(op[0]);
                    int b = Integer.parseInt(op[2]);
                    boolean res;
switch (op[1]) {
    case ">":
        res = a > b;
        break;
    case ">=":
        res = a >= b;
        break;
    case "<":
        res = a < b;
        break;
    case "<=":
        res = a <= b;
        break;
    case "==":
        res = a == b;
        break;
    case "!=":
        res = a != b;
        break;
    default:
        res = false;
}
out.add(dst + " = " + (res ? 1 : 0));

                    continue;
                }
            }
            out.add(ln);
        }
        codigo = out;
    }

    /** 4. Eliminación de asignaciones redundantes */
    private void eliminarSentenciasRedundantes() {
        List<String> out = new ArrayList<>();
        for (String ln : codigo) {
            if (ln.matches("\\w+ = \\w+")) {
                String[] p = ln.split(" = ");
                if (p[0].trim().equals(p[1].trim())) continue;
            }
            out.add(ln);
        }
        codigo = out;
    }

    public List<String> getCodigoOptimizado() {
        return codigo;
    }

    public void imprimirCodigoOptimizado() {
        System.out.println("\n=== CÓDIGO OPTIMIZADO ===");
        for (int i = 0; i < codigo.size(); i++) {
            System.out.printf("%3d: %s\n", i, codigo.get(i));
        }
    }
}
