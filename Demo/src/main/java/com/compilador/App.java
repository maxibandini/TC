package com.compilador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class App {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Uso: java -jar demo.jar <ruta_al_archivo>");
            System.exit(1);
        }

        try {
            // Paso 1: Léxico
            System.out.println("Procesando fichero: " + args[0]);
            CharStream flujo = CharStreams.fromFileName(args[0]);
            List<String> listaErroresLex = new ArrayList<>();
            MiLenguajeLexer lexer = new MiLenguajeLexer(flujo);
            lexer.removeErrorListeners();
            lexer.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> r, Object o,
                        int line, int pos, String msg, RecognitionException e) {
                    listaErroresLex.add("ERROR LÉXICO línea " + line + ", columna " + pos + ": " + msg);
                    throw new ParseCancellationException(msg);
                }
            });
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            tokens.fill();

            System.out.println("\n=== ETAPA LÉXICA ===");
            if (listaErroresLex.isEmpty()) {
                System.out.printf("%-18s %-28s %-8s %-8s\n", "CATEGORÍA", "LEXEMA", "LÍNEA", "COL");
                System.out.println("-------------------------------------------------------");
                for (Token t : tokens.getTokens()) {
                    if (t.getType() != Token.EOF) {
                        String name = MiLenguajeLexer.VOCABULARY.getSymbolicName(t.getType());
                        System.out.printf("%-18s %-28s %-8d %-8d\n",
                                name, t.getText(), t.getLine(), t.getCharPositionInLine());
                    }
                }
                System.out.println("\n[OK] Etapa léxica completada exitosamente.");
            } else {
                listaErroresLex.forEach(System.out::println);
                return;
            }

            // Paso 2: Sintaxis
            MiLenguajeParser parser = new MiLenguajeParser(tokens);
            List<String> listaErroresSin = new ArrayList<>();
            parser.removeErrorListeners();
            parser.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> r, Object o,
                        int line, int pos, String msg, RecognitionException e) {
                    listaErroresSin.add("ERROR SINTÁCTICO línea " + line + ", col " + pos + ": " + msg);
                }
            });

            System.out.println("\n=== ETAPA SINTÁCTICA ===");
            ParseTree arbol = parser.inicio();
            if (!listaErroresSin.isEmpty()) {
                listaErroresSin.forEach(System.out::println);
                return;
            } else {
                System.out.println("[OK] Etapa sintáctica sin incidencias.");
                System.out.println(arbol.toStringTree(parser));
                mostrarArbol(arbol, parser);
            }

            // Paso 3: Semántica
            SimbolosListener escucha = new SimbolosListener();
            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(escucha, arbol);

            TablaSimbolos tabla = escucha.getTablaSimbolos();
            tabla.imprimir();

            List<String> errSem = escucha.getErrores();
            List<String> avisos = escucha.getAdvertencias();
            if (!errSem.isEmpty()) {
                System.out.println("\n=== ERRORES SEMÁNTICOS ===");
                errSem.forEach(System.out::println);
            } else {
                System.out.println("\n[OK] Etapa semántica completada sin errores.");
            }
            if (!avisos.isEmpty()) {
                System.out.println("\n=== AVISOS ===");
                avisos.forEach(System.out::println);
            }

            // Paso 4: Generación de código intermedio
            System.out.println("\n=== GENERACIÓN DE CÓDIGO INTERMEDIO ===");
            CodigoVisitor codigoVisitor = new CodigoVisitor(tabla);
            codigoVisitor.visit(arbol);

            GeneradorCodigo gen = codigoVisitor.getGenerador();
            gen.imprimirCodigo();
            gen.imprimirEstadisticas();

        } catch (IOException ioe) {
            System.err.println("[ERROR] Fallo al cargar el archivo: " + ioe.getMessage());
        } catch (ParseCancellationException pce) {
            System.err.println("[ERROR] Análisis interrumpido: " + pce.getMessage());
        } catch (Exception ex) {
            System.err.println("[ERROR] Excepción inesperada:");
            ex.printStackTrace();
        }
    }

    private static void mostrarArbol(ParseTree arbol, Parser parser) {
        JFrame ventana = new JFrame("Visualizador de Árbol");
        JPanel cont = new JPanel();
        TreeViewer visor = new TreeViewer(Arrays.asList(parser.getRuleNames()), arbol);
        visor.setScale(1.4);
        cont.add(visor);
        JScrollPane scroll = new JScrollPane(cont);
        ventana.add(scroll);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(800, 600);
        ventana.setVisible(true);
    }
}
