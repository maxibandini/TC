// Generated from com\compilador\MiLenguaje.g4 by ANTLR 4.9.3
package com.compilador;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiLenguajeParser}.
 */
public interface MiLenguajeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#inicio}.
	 * @param ctx the parse tree
	 */
	void enterInicio(MiLenguajeParser.InicioContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#inicio}.
	 * @param ctx the parse tree
	 */
	void exitInicio(MiLenguajeParser.InicioContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#instruccionIniciales}.
	 * @param ctx the parse tree
	 */
	void enterInstruccionIniciales(MiLenguajeParser.InstruccionInicialesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#instruccionIniciales}.
	 * @param ctx the parse tree
	 */
	void exitInstruccionIniciales(MiLenguajeParser.InstruccionInicialesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(MiLenguajeParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(MiLenguajeParser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#llamadaExpr}.
	 * @param ctx the parse tree
	 */
	void enterLlamadaExpr(MiLenguajeParser.LlamadaExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#llamadaExpr}.
	 * @param ctx the parse tree
	 */
	void exitLlamadaExpr(MiLenguajeParser.LlamadaExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#cuerpo}.
	 * @param ctx the parse tree
	 */
	void enterCuerpo(MiLenguajeParser.CuerpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#cuerpo}.
	 * @param ctx the parse tree
	 */
	void exitCuerpo(MiLenguajeParser.CuerpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#nota}.
	 * @param ctx the parse tree
	 */
	void enterNota(MiLenguajeParser.NotaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#nota}.
	 * @param ctx the parse tree
	 */
	void exitNota(MiLenguajeParser.NotaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#condicionIf}.
	 * @param ctx the parse tree
	 */
	void enterCondicionIf(MiLenguajeParser.CondicionIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#condicionIf}.
	 * @param ctx the parse tree
	 */
	void exitCondicionIf(MiLenguajeParser.CondicionIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#bucleWhile}.
	 * @param ctx the parse tree
	 */
	void enterBucleWhile(MiLenguajeParser.BucleWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#bucleWhile}.
	 * @param ctx the parse tree
	 */
	void exitBucleWhile(MiLenguajeParser.BucleWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#bucleFor}.
	 * @param ctx the parse tree
	 */
	void enterBucleFor(MiLenguajeParser.BucleForContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#bucleFor}.
	 * @param ctx the parse tree
	 */
	void exitBucleFor(MiLenguajeParser.BucleForContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#initFor}.
	 * @param ctx the parse tree
	 */
	void enterInitFor(MiLenguajeParser.InitForContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#initFor}.
	 * @param ctx the parse tree
	 */
	void exitInitFor(MiLenguajeParser.InitForContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#updateFor}.
	 * @param ctx the parse tree
	 */
	void enterUpdateFor(MiLenguajeParser.UpdateForContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#updateFor}.
	 * @param ctx the parse tree
	 */
	void exitUpdateFor(MiLenguajeParser.UpdateForContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#incDec}.
	 * @param ctx the parse tree
	 */
	void enterIncDec(MiLenguajeParser.IncDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#incDec}.
	 * @param ctx the parse tree
	 */
	void exitIncDec(MiLenguajeParser.IncDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#interrupcion}.
	 * @param ctx the parse tree
	 */
	void enterInterrupcion(MiLenguajeParser.InterrupcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#interrupcion}.
	 * @param ctx the parse tree
	 */
	void exitInterrupcion(MiLenguajeParser.InterrupcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#definicionFuncion}.
	 * @param ctx the parse tree
	 */
	void enterDefinicionFuncion(MiLenguajeParser.DefinicionFuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#definicionFuncion}.
	 * @param ctx the parse tree
	 */
	void exitDefinicionFuncion(MiLenguajeParser.DefinicionFuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#listaParams}.
	 * @param ctx the parse tree
	 */
	void enterListaParams(MiLenguajeParser.ListaParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#listaParams}.
	 * @param ctx the parse tree
	 */
	void exitListaParams(MiLenguajeParser.ListaParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(MiLenguajeParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(MiLenguajeParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#definicionVariable}.
	 * @param ctx the parse tree
	 */
	void enterDefinicionVariable(MiLenguajeParser.DefinicionVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#definicionVariable}.
	 * @param ctx the parse tree
	 */
	void exitDefinicionVariable(MiLenguajeParser.DefinicionVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#definicionSinPunto}.
	 * @param ctx the parse tree
	 */
	void enterDefinicionSinPunto(MiLenguajeParser.DefinicionSinPuntoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#definicionSinPunto}.
	 * @param ctx the parse tree
	 */
	void exitDefinicionSinPunto(MiLenguajeParser.DefinicionSinPuntoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#asignacionVariable}.
	 * @param ctx the parse tree
	 */
	void enterAsignacionVariable(MiLenguajeParser.AsignacionVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#asignacionVariable}.
	 * @param ctx the parse tree
	 */
	void exitAsignacionVariable(MiLenguajeParser.AsignacionVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#asignacionSinPunto}.
	 * @param ctx the parse tree
	 */
	void enterAsignacionSinPunto(MiLenguajeParser.AsignacionSinPuntoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#asignacionSinPunto}.
	 * @param ctx the parse tree
	 */
	void exitAsignacionSinPunto(MiLenguajeParser.AsignacionSinPuntoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#retornoInst}.
	 * @param ctx the parse tree
	 */
	void enterRetornoInst(MiLenguajeParser.RetornoInstContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#retornoInst}.
	 * @param ctx the parse tree
	 */
	void exitRetornoInst(MiLenguajeParser.RetornoInstContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#tipoDato}.
	 * @param ctx the parse tree
	 */
	void enterTipoDato(MiLenguajeParser.TipoDatoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#tipoDato}.
	 * @param ctx the parse tree
	 */
	void exitTipoDato(MiLenguajeParser.TipoDatoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expNegacion}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpNegacion(MiLenguajeParser.ExpNegacionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expNegacion}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpNegacion(MiLenguajeParser.ExpNegacionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expDecimal}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpDecimal(MiLenguajeParser.ExpDecimalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expDecimal}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpDecimal(MiLenguajeParser.ExpDecimalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expIP}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpIP(MiLenguajeParser.ExpIPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expIP}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpIP(MiLenguajeParser.ExpIPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expNomApe}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpNomApe(MiLenguajeParser.ExpNomApeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expNomApe}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpNomApe(MiLenguajeParser.ExpNomApeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expFecha}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpFecha(MiLenguajeParser.ExpFechaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expFecha}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpFecha(MiLenguajeParser.ExpFechaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expVariable}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpVariable(MiLenguajeParser.ExpVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expVariable}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpVariable(MiLenguajeParser.ExpVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expTelInt}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpTelInt(MiLenguajeParser.ExpTelIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expTelInt}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpTelInt(MiLenguajeParser.ExpTelIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expFuncion}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpFuncion(MiLenguajeParser.ExpFuncionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expFuncion}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpFuncion(MiLenguajeParser.ExpFuncionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expString}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpString(MiLenguajeParser.ExpStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expString}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpString(MiLenguajeParser.ExpStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expFechaISO}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpFechaISO(MiLenguajeParser.ExpFechaISOContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expFechaISO}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpFechaISO(MiLenguajeParser.ExpFechaISOContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expCUIL}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpCUIL(MiLenguajeParser.ExpCUILContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expCUIL}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpCUIL(MiLenguajeParser.ExpCUILContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expEntero}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpEntero(MiLenguajeParser.ExpEnteroContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expEntero}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpEntero(MiLenguajeParser.ExpEnteroContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expEmail}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpEmail(MiLenguajeParser.ExpEmailContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expEmail}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpEmail(MiLenguajeParser.ExpEmailContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expPass}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpPass(MiLenguajeParser.ExpPassContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expPass}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpPass(MiLenguajeParser.ExpPassContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expTrue}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpTrue(MiLenguajeParser.ExpTrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expTrue}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpTrue(MiLenguajeParser.ExpTrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expBinaria}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpBinaria(MiLenguajeParser.ExpBinariaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expBinaria}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpBinaria(MiLenguajeParser.ExpBinariaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expDNI}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpDNI(MiLenguajeParser.ExpDNIContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expDNI}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpDNI(MiLenguajeParser.ExpDNIContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expTarjeta}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpTarjeta(MiLenguajeParser.ExpTarjetaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expTarjeta}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpTarjeta(MiLenguajeParser.ExpTarjetaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expPostDecremento}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpPostDecremento(MiLenguajeParser.ExpPostDecrementoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expPostDecremento}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpPostDecremento(MiLenguajeParser.ExpPostDecrementoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expTelNac}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpTelNac(MiLenguajeParser.ExpTelNacContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expTelNac}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpTelNac(MiLenguajeParser.ExpTelNacContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expFalse}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpFalse(MiLenguajeParser.ExpFalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expFalse}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpFalse(MiLenguajeParser.ExpFalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expPostIncremento}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpPostIncremento(MiLenguajeParser.ExpPostIncrementoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expPostIncremento}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpPostIncremento(MiLenguajeParser.ExpPostIncrementoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expPreIncremento}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpPreIncremento(MiLenguajeParser.ExpPreIncrementoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expPreIncremento}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpPreIncremento(MiLenguajeParser.ExpPreIncrementoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expParentesis}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpParentesis(MiLenguajeParser.ExpParentesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expParentesis}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpParentesis(MiLenguajeParser.ExpParentesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expCaracter}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpCaracter(MiLenguajeParser.ExpCaracterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expCaracter}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpCaracter(MiLenguajeParser.ExpCaracterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expURL}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpURL(MiLenguajeParser.ExpURLContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expURL}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpURL(MiLenguajeParser.ExpURLContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expCodPostal}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpCodPostal(MiLenguajeParser.ExpCodPostalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expCodPostal}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpCodPostal(MiLenguajeParser.ExpCodPostalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expPatente}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpPatente(MiLenguajeParser.ExpPatenteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expPatente}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpPatente(MiLenguajeParser.ExpPatenteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expPreDecremento}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpPreDecremento(MiLenguajeParser.ExpPreDecrementoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expPreDecremento}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpPreDecremento(MiLenguajeParser.ExpPreDecrementoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#opBinaria}.
	 * @param ctx the parse tree
	 */
	void enterOpBinaria(MiLenguajeParser.OpBinariaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#opBinaria}.
	 * @param ctx the parse tree
	 */
	void exitOpBinaria(MiLenguajeParser.OpBinariaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#listaArgumentos}.
	 * @param ctx the parse tree
	 */
	void enterListaArgumentos(MiLenguajeParser.ListaArgumentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#listaArgumentos}.
	 * @param ctx the parse tree
	 */
	void exitListaArgumentos(MiLenguajeParser.ListaArgumentosContext ctx);
}