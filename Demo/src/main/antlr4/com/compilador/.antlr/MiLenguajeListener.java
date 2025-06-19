// Generated from d:/GitHubTC/TrabajoTecnicasCompilacion/Demo/src/main/antlr4/com/compilador/MiLenguaje.g4 by ANTLR 4.13.1
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
	 * Enter a parse tree produced by {@link MiLenguajeParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(MiLenguajeParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(MiLenguajeParser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#llamadaFuncion}.
	 * @param ctx the parse tree
	 */
	void enterLlamadaFuncion(MiLenguajeParser.LlamadaFuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#llamadaFuncion}.
	 * @param ctx the parse tree
	 */
	void exitLlamadaFuncion(MiLenguajeParser.LlamadaFuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#sentenciaInternas}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaInternas(MiLenguajeParser.SentenciaInternasContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#sentenciaInternas}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaInternas(MiLenguajeParser.SentenciaInternasContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#sentenciaIf}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaIf(MiLenguajeParser.SentenciaIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#sentenciaIf}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaIf(MiLenguajeParser.SentenciaIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#sentenciaWhile}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaWhile(MiLenguajeParser.SentenciaWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#sentenciaWhile}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaWhile(MiLenguajeParser.SentenciaWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#sentenciaFor}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaFor(MiLenguajeParser.SentenciaForContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#sentenciaFor}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaFor(MiLenguajeParser.SentenciaForContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#incremento}.
	 * @param ctx the parse tree
	 */
	void enterIncremento(MiLenguajeParser.IncrementoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#incremento}.
	 * @param ctx the parse tree
	 */
	void exitIncremento(MiLenguajeParser.IncrementoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#sentenciaBreak}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaBreak(MiLenguajeParser.SentenciaBreakContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#sentenciaBreak}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaBreak(MiLenguajeParser.SentenciaBreakContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(MiLenguajeParser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(MiLenguajeParser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#declaracionFuncion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionFuncion(MiLenguajeParser.DeclaracionFuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#declaracionFuncion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionFuncion(MiLenguajeParser.DeclaracionFuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(MiLenguajeParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(MiLenguajeParser.ParametrosContext ctx);
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
	 * Enter a parse tree produced by {@link MiLenguajeParser#declaracionVariable}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionVariable(MiLenguajeParser.DeclaracionVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#declaracionVariable}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionVariable(MiLenguajeParser.DeclaracionVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#declaracionVariableSinPYC}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionVariableSinPYC(MiLenguajeParser.DeclaracionVariableSinPYCContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#declaracionVariableSinPYC}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionVariableSinPYC(MiLenguajeParser.DeclaracionVariableSinPYCContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(MiLenguajeParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(MiLenguajeParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#retorno}.
	 * @param ctx the parse tree
	 */
	void enterRetorno(MiLenguajeParser.RetornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#retorno}.
	 * @param ctx the parse tree
	 */
	void exitRetorno(MiLenguajeParser.RetornoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(MiLenguajeParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(MiLenguajeParser.TipoContext ctx);
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
	 * Enter a parse tree produced by the {@code expNombreApellido}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpNombreApellido(MiLenguajeParser.ExpNombreApellidoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expNombreApellido}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpNombreApellido(MiLenguajeParser.ExpNombreApellidoContext ctx);
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
	 * Enter a parse tree produced by the {@code expCP}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpCP(MiLenguajeParser.ExpCPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expCP}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpCP(MiLenguajeParser.ExpCPContext ctx);
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
	 * Enter a parse tree produced by the {@code expParentizada}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpParentizada(MiLenguajeParser.ExpParentizadaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expParentizada}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpParentizada(MiLenguajeParser.ExpParentizadaContext ctx);
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
	 * Enter a parse tree produced by {@link MiLenguajeParser#operadorBinario}.
	 * @param ctx the parse tree
	 */
	void enterOperadorBinario(MiLenguajeParser.OperadorBinarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#operadorBinario}.
	 * @param ctx the parse tree
	 */
	void exitOperadorBinario(MiLenguajeParser.OperadorBinarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void enterArgumentos(MiLenguajeParser.ArgumentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void exitArgumentos(MiLenguajeParser.ArgumentosContext ctx);
}