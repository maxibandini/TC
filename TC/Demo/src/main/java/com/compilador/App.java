// Archivo: src/main/java/com/compilador/App.java
package com.compilador;

import java.io.File;
import java.io.IOException;
import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.tree.*;
import javax.swing.*;

public class App {
    public static final String RESET  = "\u001B[0m";
    public static final String RED    = "\u001B[31m";
    public static final String GREEN  = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE   = "\u001B[34m";
    public static final String CYAN   = "\u001B[36m";

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println(RED + "Uso: java -jar demo.jar <ruta_al_archivo>" + RESET);
            System.exit(1);
        }

        // Directorio de salida: la carpeta desde donde se ejecuta (Demo)
        String salidaDir = System.getProperty("user.dir");

        try {
            String inputFilePath = args[0];
            String inputFileName = new File(inputFilePath).getName();
            String baseName = inputFileName.contains(".")
                    ? inputFileName.substring(0, inputFileName.lastIndexOf('.'))
                    : inputFileName;

            System.out.println(CYAN + "🚀 Iniciando compilación de: " + inputFilePath + RESET);

            // Fase 1: Léxico
            CharStream input = CharStreams.fromFileName(inputFilePath);
            MiLenguajeLexer lexer = new MiLenguajeLexer(input);
            List<String> lexErrors = new ArrayList<>();
            lexer.removeErrorListeners();
            lexer.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> r, Object o, int line, int pos, String msg, RecognitionException e) {
                    lexErrors.add("ERROR LÉXICO línea " + line + ":" + pos + " - " + msg);
                }
            });
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            tokens.fill();
            if (!lexErrors.isEmpty()) {
                lexErrors.forEach(err -> System.out.println(RED + err + RESET));
                return;
            }
            System.out.println(GREEN + "✅ Análisis léxico completado" + RESET);

            // Fase 2: Sintaxis
            MiLenguajeParser parser = new MiLenguajeParser(tokens);
            List<String> synErrors = new ArrayList<>();
            parser.removeErrorListeners();
            parser.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> r, Object o, int line, int pos, String msg, RecognitionException e) {
                    synErrors.add("ERROR SINTÁCTICO línea " + line + ":" + pos + " - " + msg);
                }
            });
            ParseTree tree = parser.inicio();
            if (!synErrors.isEmpty()) {
                synErrors.forEach(err -> System.out.println(RED + err + RESET));
                return;
            }
            System.out.println(GREEN + "✅ Análisis sintáctico completado" + RESET);

            // Fase 4: Semántica
            SimbolosListener semListener = new SimbolosListener();
            ParseTreeWalker.DEFAULT.walk(semListener, tree);
            TablaSimbolos tabla = semListener.getTablaSimbolos();
            List<String> semErrors = semListener.getErrores();
            List<String> semWarnings = semListener.getAdvertencias();
           if (!semErrors.isEmpty()) {
                 semErrors.forEach(err -> System.out.println(RED + err + RESET));
                     System.out.println(YELLOW + "⚠️ Hay errores semánticos, pero procedo a generar los archivos." + RESET);
                     // ← NO retornamos; seguimos al Fase 5 y 6
}

            semWarnings.forEach(warn -> System.out.println(YELLOW + warn + RESET));
            System.out.println(GREEN + "✅ Análisis semántico completado" + RESET);

            // Fase 5: Generación de código intermedio
            CodigoVisitor visitor = new CodigoVisitor(tabla);
            visitor.visit(tree);
            GeneradorCodigo gen = visitor.getGenerador();
            gen.imprimirCodigo();
            gen.imprimirEstadisticas();

            // Fase 5b: Optimización
            System.out.println(CYAN + "\n=== OPTIMIZACIÓN DE CÓDIGO ===" + RESET);
            Optimizador opt = new Optimizador(gen.getCodigo());
            List<String> codigoOpt = opt.optimizar();
            opt.imprimirCodigoOptimizado();

            // Fase 6: Salidas del compilador - guardamos en Demo (salidaDir)
            String codigoIntermedioPath = Paths.get(salidaDir, baseName + "_codigo_intermedio.txt").toString();
            System.out.println("▶ Guardando intermedio en: " + codigoIntermedioPath);
            guardarCodigoEnArchivo(gen.getCodigo(), codigoIntermedioPath);
            System.out.println(GREEN + "✅ Código intermedio guardado en: " + codigoIntermedioPath + RESET);

            String codigoOptPath = Paths.get(salidaDir, baseName + "_codigo_optimizado.txt").toString();
            System.out.println("▶ Guardando optimizado en: " + codigoOptPath);
            guardarCodigoEnArchivo(codigoOpt, codigoOptPath);
            System.out.println(GREEN + "✅ Código optimizado guardado en: " + codigoOptPath + RESET);

            System.out.println(BLUE + "\n=== 6. SALIDAS DEL COMPILADOR ===" + RESET);
            System.out.println("   📁 Archivo procesado: " + inputFilePath);
            System.out.println("   🔤 Tokens analizados: " + (tokens.size() - 1));
            System.out.println("   📊 Símbolos en tabla: " + contarSimbolos(tabla));
            System.out.println("   📝 Instrucciones generadas: " + gen.getCodigo().size());
            System.out.println("   📄 Archivo intermedio: " + codigoIntermedioPath);
            System.out.println("   📄 Archivo optimizado: " + codigoOptPath);
            System.out.println(GREEN + "\n🎉 ¡COMPILACIÓN COMPLETA! 🎉" + RESET);

        } catch (IOException e) {
            System.err.println(RED + "❌ Error al leer/escribir archivos: " + e.getMessage() + RESET);
        } catch (ParseCancellationException e) {
            System.err.println(RED + "❌ Error de análisis léxico: " + e.getMessage() + RESET);
        } catch (Exception e) {
            System.err.println(RED + "❌ Error inesperado:" + RESET);
            e.printStackTrace();
        }
    }

    private static int contarSimbolos(TablaSimbolos tabla) {
        return tabla.getSimbolos().size();
    }

    private static void guardarCodigoEnArchivo(List<String> codigo, String rutaArchivo) throws IOException {
        Path path = Paths.get(rutaArchivo);
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            writer.write("// Código de tres direcciones generado automáticamente");
            writer.newLine();
            writer.write("// Total instrucciones: " + codigo.size());
            writer.newLine();
            writer.newLine();
            for (int i = 0; i < codigo.size(); i++) {
                writer.write(String.format("%3d: %s", i, codigo.get(i)));
                writer.newLine();
            }
        }
    }

    private static void mostrarArbol(ParseTree tree, Parser parser) {
        JFrame frame = new JFrame("Árbol Sintáctico");
        TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
        viewer.setScale(1.4);
        JScrollPane scroll = new JScrollPane(viewer);
        frame.add(scroll);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setVisible(true);
    }
}
