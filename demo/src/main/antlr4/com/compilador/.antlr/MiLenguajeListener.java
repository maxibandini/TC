// Generated from c:/Users/Martino/Desktop/Ejercicios_Sintacticos-ejercicio1/Ejercicio/demo/src/main/antlr4/com/compilador/MiLenguaje.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiLenguajeParser}.
 */
public interface MiLenguajeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(MiLenguajeParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(MiLenguajeParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link MiLenguajeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddition(MiLenguajeParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link MiLenguajeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddition(MiLenguajeParser.AdditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JustTerm}
	 * labeled alternative in {@link MiLenguajeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterJustTerm(MiLenguajeParser.JustTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JustTerm}
	 * labeled alternative in {@link MiLenguajeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitJustTerm(MiLenguajeParser.JustTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link MiLenguajeParser#term}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication(MiLenguajeParser.MultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link MiLenguajeParser#term}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication(MiLenguajeParser.MultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JustFactor}
	 * labeled alternative in {@link MiLenguajeParser#term}.
	 * @param ctx the parse tree
	 */
	void enterJustFactor(MiLenguajeParser.JustFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JustFactor}
	 * labeled alternative in {@link MiLenguajeParser#term}.
	 * @param ctx the parse tree
	 */
	void exitJustFactor(MiLenguajeParser.JustFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parentheses}
	 * labeled alternative in {@link MiLenguajeParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterParentheses(MiLenguajeParser.ParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parentheses}
	 * labeled alternative in {@link MiLenguajeParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitParentheses(MiLenguajeParser.ParenthesesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Number}
	 * labeled alternative in {@link MiLenguajeParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterNumber(MiLenguajeParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link MiLenguajeParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitNumber(MiLenguajeParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecimalNumber}
	 * labeled alternative in {@link MiLenguajeParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterDecimalNumber(MiLenguajeParser.DecimalNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecimalNumber}
	 * labeled alternative in {@link MiLenguajeParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitDecimalNumber(MiLenguajeParser.DecimalNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link MiLenguajeParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(MiLenguajeParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link MiLenguajeParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(MiLenguajeParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#token}.
	 * @param ctx the parse tree
	 */
	void enterToken(MiLenguajeParser.TokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#token}.
	 * @param ctx the parse tree
	 */
	void exitToken(MiLenguajeParser.TokenContext ctx);
}