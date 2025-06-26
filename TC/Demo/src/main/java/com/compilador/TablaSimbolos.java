package com.compilador;

import java.util.ArrayList;
import java.util.List;

public class TablaSimbolos {

    public static class Simbolo {
        private String nombre;
        private String tipo;
        private String categoria;
        private int linea;
        private int columna;
        private String ambito;
        private boolean usado = false;
        private boolean inicializada = false;
        private boolean esConstante = false;

        public List<String> tiposParametros;

        public Simbolo(String nombre, String tipo, String categoria, int linea, int columna, String ambito) {
            this.nombre = nombre;
            this.tipo = tipo;
            this.categoria = categoria;
            this.linea = linea;
            this.columna = columna;
            this.ambito = ambito;
            this.tiposParametros = new ArrayList<>();
        }

        public String getNombre() { return nombre; }
        public String getTipo() { return tipo; }
        public String getCategoria() { return categoria; }
        public int getLinea() { return linea; }
        public int getColumna() { return columna; }
        public String getAmbito() { return ambito; }

        public boolean fueUsado() { return usado; }
        public void marcarComoUsado() { this.usado = true; }

        public boolean fueInicializada() { return inicializada; }
        public void marcarComoInicializada() { this.inicializada = true; }

        public boolean esConstante() { return esConstante; }
        public void setConstante(boolean valor) { this.esConstante = valor; }

        public List<String> getTiposParametros() { return tiposParametros; }
        public void addParametro(String tipo) { tiposParametros.add(tipo); }

        @Override
        public String toString() {
            return String.format("Simbolo(nombre=%s, tipo=%s, categoria=%s, ambito=%s, linea=%d)",
                    nombre, tipo, categoria, ambito, linea);
        }
    }

    private List<Simbolo> simbolos = new ArrayList<>();
    private String ambitoActual = "global";
    private List<String> pilaAmbitos = new ArrayList<>();

    public void agregar(Simbolo simbolo) { simbolos.add(simbolo); }

    public Simbolo buscar(String nombre, int lineaUso) {
        for (int i = pilaAmbitos.size() - 1; i >= 0; i--) {
            String ambito = pilaAmbitos.get(i);
            for (int j = simbolos.size() - 1; j >= 0; j--) {
                Simbolo s = simbolos.get(j);
                if (s.getNombre().equals(nombre) && s.getAmbito().equals(ambito)) {
                    if (s.getLinea() > lineaUso) return null;
                    return s;
                }
            }
        }

        // Si no se encontró, revisamos global como última opción
        for (int j = simbolos.size() - 1; j >= 0; j--) {
            Simbolo s = simbolos.get(j);
            if (s.getNombre().equals(nombre) && s.getAmbito().equals("global")) {
                if (s.getLinea() > lineaUso) return null;
                return s;
            }
        }

        return null;
    }

    public boolean existeSimbolo(String nombre, String ambito) {
        return simbolos.stream().anyMatch(s ->
                s.getNombre().equals(nombre) &&
                        s.getAmbito().equals(ambito));
    }

    public boolean existeSimbolo(String nombre, String categoria, String ambito) {
        return simbolos.stream().anyMatch(s ->
                s.getNombre().equals(nombre) &&
                        s.getCategoria().equals(categoria) &&
                        s.getAmbito().equals(ambito));
    }

    public Simbolo obtenerSimbolo(String nombre, String ambito) {
        for (Simbolo s : simbolos) {
            if (s.getNombre().equals(nombre) && s.getAmbito().equals(ambito)) {
                return s;
            }
        }
        return null;
    }

    public boolean existeEnOtroAmbito(String nombre, String ambitoActual) {
        for (Simbolo s : simbolos) {
            if (s.getNombre().equals(nombre) && !s.getAmbito().equals(ambitoActual)) {
                return true;
            }
        }
        return false;
    }

    public List<Simbolo> getSimbolos() { return simbolos; }

    public void setAmbito(String ambito) {
        this.ambitoActual = ambito;
        if (pilaAmbitos.isEmpty() || !pilaAmbitos.get(pilaAmbitos.size() - 1).equals(ambito)) {
            pilaAmbitos.add(ambito);
        }
    }

    public String getAmbito() { return ambitoActual; }

    public void imprimir() {
        System.out.println("\n=== TABLA DE SIMBOLOS ===");
        System.out.printf("%-15s %-10s %-12s %-10s %-8s %-8s %-8s %-10s\n",
                "Nombre", "Tipo", "Categoria", "Ambito", "Linea", "Usado", "Init", "Constante");
        System.out.println("-------------------------------------------------------------------------------------");

        for (Simbolo s : simbolos) {
            System.out.printf("%-15s %-10s %-12s %-10s %-8d %-8s %-8s %-10s\n",
                    s.getNombre(),
                    s.getTipo(),
                    s.getCategoria(),
                    s.getAmbito(),
                    s.getLinea(),
                    s.fueUsado() ? "Sí" : "No",
                    s.fueInicializada() ? "Sí" : "No",
                    s.esConstante() ? "Sí" : "No"
            );
        }
    }
}
