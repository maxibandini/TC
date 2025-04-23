package com.compilador;

import org.antlr.v4.runtime.*;
import java.io.*;

public class App {
    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.err.println("Uso: java -jar demo.jar <archivo>");
            System.exit(1);
        }

        // Leer archivo de entrada
        CharStream input = CharStreams.fromFileName(args[0]);
        MiniLenguajeLexer lexer = new MiniLenguajeLexer(input);

        // Capturar errores personalizados
        lexer.removeErrorListeners();
        lexer.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                    int line, int charPositionInLine,
                                    String msg, RecognitionException e) {
                System.err.printf("❌ Error léxico en línea %d, columna %d: %s\n", line, charPositionInLine, msg);
            }
        });

        // Obtener e imprimir tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        tokens.fill();

        System.out.println("Análisis léxico completado.");
        for (Token token : tokens.getTokens()) {
            String tipo = MiniLenguajeLexer.VOCABULARY.getSymbolicName(token.getType());
            if (tipo != null) {
                System.out.printf("%-20s %-30s Linea: %-3d Columna: %-3d\n",
                        tipo, token.getText(), token.getLine(), token.getCharPositionInLine());
            }
        }
        System.out.println("Análisis léxico completado.");
    }
}
