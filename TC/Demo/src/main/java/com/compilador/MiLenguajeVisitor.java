// Generated from com\compilador\MiLenguaje.g4 by ANTLR 4.9.3
package com.compilador;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MiLenguajeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MiLenguajeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#inicio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicio(MiLenguajeParser.InicioContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#instruccionIniciales}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccionIniciales(MiLenguajeParser.InstruccionInicialesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion(MiLenguajeParser.InstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#llamadaExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamadaExpr(MiLenguajeParser.LlamadaExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#cuerpo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCuerpo(MiLenguajeParser.CuerpoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#nota}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNota(MiLenguajeParser.NotaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#condicionIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionIf(MiLenguajeParser.CondicionIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#bucleWhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBucleWhile(MiLenguajeParser.BucleWhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#bucleFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBucleFor(MiLenguajeParser.BucleForContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#initFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitFor(MiLenguajeParser.InitForContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#updateFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateFor(MiLenguajeParser.UpdateForContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#incDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncDec(MiLenguajeParser.IncDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#interrupcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterrupcion(MiLenguajeParser.InterrupcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#definicionFuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinicionFuncion(MiLenguajeParser.DefinicionFuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#listaParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaParams(MiLenguajeParser.ListaParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(MiLenguajeParser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#definicionVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinicionVariable(MiLenguajeParser.DefinicionVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#definicionSinPunto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinicionSinPunto(MiLenguajeParser.DefinicionSinPuntoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#asignacionVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacionVariable(MiLenguajeParser.AsignacionVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#asignacionSinPunto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacionSinPunto(MiLenguajeParser.AsignacionSinPuntoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#retornoInst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetornoInst(MiLenguajeParser.RetornoInstContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#tipoDato}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoDato(MiLenguajeParser.TipoDatoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expNegacion}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpNegacion(MiLenguajeParser.ExpNegacionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expDecimal}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpDecimal(MiLenguajeParser.ExpDecimalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expIP}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpIP(MiLenguajeParser.ExpIPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expNomApe}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpNomApe(MiLenguajeParser.ExpNomApeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expFecha}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpFecha(MiLenguajeParser.ExpFechaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expVariable}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpVariable(MiLenguajeParser.ExpVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expTelInt}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpTelInt(MiLenguajeParser.ExpTelIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expFuncion}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpFuncion(MiLenguajeParser.ExpFuncionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expString}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpString(MiLenguajeParser.ExpStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expFechaISO}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpFechaISO(MiLenguajeParser.ExpFechaISOContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expCUIL}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpCUIL(MiLenguajeParser.ExpCUILContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expEntero}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpEntero(MiLenguajeParser.ExpEnteroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expEmail}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpEmail(MiLenguajeParser.ExpEmailContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expPass}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpPass(MiLenguajeParser.ExpPassContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expTrue}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpTrue(MiLenguajeParser.ExpTrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expBinaria}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpBinaria(MiLenguajeParser.ExpBinariaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expDNI}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpDNI(MiLenguajeParser.ExpDNIContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expTarjeta}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpTarjeta(MiLenguajeParser.ExpTarjetaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expPostDecremento}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpPostDecremento(MiLenguajeParser.ExpPostDecrementoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expTelNac}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpTelNac(MiLenguajeParser.ExpTelNacContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expFalse}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpFalse(MiLenguajeParser.ExpFalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expPostIncremento}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpPostIncremento(MiLenguajeParser.ExpPostIncrementoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expPreIncremento}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpPreIncremento(MiLenguajeParser.ExpPreIncrementoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expParentesis}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpParentesis(MiLenguajeParser.ExpParentesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expCaracter}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpCaracter(MiLenguajeParser.ExpCaracterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expURL}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpURL(MiLenguajeParser.ExpURLContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expCodPostal}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpCodPostal(MiLenguajeParser.ExpCodPostalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expPatente}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpPatente(MiLenguajeParser.ExpPatenteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expPreDecremento}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpPreDecremento(MiLenguajeParser.ExpPreDecrementoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#opBinaria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpBinaria(MiLenguajeParser.OpBinariaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#listaArgumentos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaArgumentos(MiLenguajeParser.ListaArgumentosContext ctx);
}