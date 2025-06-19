// Generated from c:/Users/maxim/OneDrive/Documentos/TrabajoFinalTC-Bandini-Cecconello/Demo/src/main/antlr4/com/compilador/MiLenguaje.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MiLenguajeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PA=1, PC=2, CA=3, CC=4, LA=5, LC=6, PYC=7, COMA=8, IGUAL=9, MAYOR=10, 
		MAYOR_IGUAL=11, MENOR=12, MENOR_IGUAL=13, EQL=14, DISTINTO=15, SUM=16, 
		RES=17, MUL=18, DIV=19, MOD=20, OR=21, AND=22, NOT=23, FOR=24, WHILE=25, 
		IF=26, ELSE=27, BREAK=28, INT=29, CHAR=30, CONST=31, DOUBLE=32, VOID=33, 
		FLOAT=34, STRING_TIPO=35, RETURN=36, INCREMENTO=37, DECREMENTO=38, TRUE=39, 
		FALSE=40, URL=41, EMAIL=42, CUIL=43, DNI=44, FECHA=45, FECHAISO=46, TELEFONO_INTERNACIONAL=47, 
		TELEFONO_NACIONAL=48, CODIGO_POSTAL=49, IP=50, PASSWORD=51, NOMBRE_APELLIDO=52, 
		PATENTE=53, TARJETA_CREDITO=54, ID=55, STRING=56, INTEGER=57, DECIMAL=58, 
		CHARACTER=59, COMENTARIO_LINEA=60, COMENTARIO_BLOQUE=61, WS=62, OTRO=63;
	public static final int
		RULE_inicio = 0, RULE_instruccion = 1, RULE_llamadaExpr = 2, RULE_cuerpo = 3, 
		RULE_nota = 4, RULE_condicionIf = 5, RULE_bucleWhile = 6, RULE_bucleFor = 7, 
		RULE_initFor = 8, RULE_updateFor = 9, RULE_incDec = 10, RULE_interrupcion = 11, 
		RULE_definicionFuncion = 12, RULE_listaParams = 13, RULE_parametro = 14, 
		RULE_definicionVariable = 15, RULE_definicionSinPunto = 16, RULE_asignacionVariable = 17, 
		RULE_asignacionSinPunto = 18, RULE_retornoInst = 19, RULE_tipoDato = 20, 
		RULE_expresion = 21, RULE_opBinaria = 22, RULE_listaArgumentos = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "instruccion", "llamadaExpr", "cuerpo", "nota", "condicionIf", 
			"bucleWhile", "bucleFor", "initFor", "updateFor", "incDec", "interrupcion", 
			"definicionFuncion", "listaParams", "parametro", "definicionVariable", 
			"definicionSinPunto", "asignacionVariable", "asignacionSinPunto", "retornoInst", 
			"tipoDato", "expresion", "opBinaria", "listaArgumentos"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'['", "']'", "'{'", "'}'", "';'", "','", "'='", 
			"'>'", "'>='", "'<'", "'<='", "'=='", "'!='", "'+'", "'-'", "'*'", "'/'", 
			"'%'", "'||'", "'&&'", "'!'", "'for'", "'while'", "'if'", "'else'", "'break'", 
			"'int'", "'char'", "'const'", "'double'", "'void'", "'float'", "'string'", 
			"'return'", "'++'", "'--'", "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PA", "PC", "CA", "CC", "LA", "LC", "PYC", "COMA", "IGUAL", "MAYOR", 
			"MAYOR_IGUAL", "MENOR", "MENOR_IGUAL", "EQL", "DISTINTO", "SUM", "RES", 
			"MUL", "DIV", "MOD", "OR", "AND", "NOT", "FOR", "WHILE", "IF", "ELSE", 
			"BREAK", "INT", "CHAR", "CONST", "DOUBLE", "VOID", "FLOAT", "STRING_TIPO", 
			"RETURN", "INCREMENTO", "DECREMENTO", "TRUE", "FALSE", "URL", "EMAIL", 
			"CUIL", "DNI", "FECHA", "FECHAISO", "TELEFONO_INTERNACIONAL", "TELEFONO_NACIONAL", 
			"CODIGO_POSTAL", "IP", "PASSWORD", "NOMBRE_APELLIDO", "PATENTE", "TARJETA_CREDITO", 
			"ID", "STRING", "INTEGER", "DECIMAL", "CHARACTER", "COMENTARIO_LINEA", 
			"COMENTARIO_BLOQUE", "WS", "OTRO"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MiLenguaje.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiLenguajeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InicioContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MiLenguajeParser.EOF, 0); }
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public List<NotaContext> nota() {
			return getRuleContexts(NotaContext.class);
		}
		public NotaContext nota(int i) {
			return getRuleContext(NotaContext.class,i);
		}
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4611686018284781570L) != 0)) {
				{
				setState(50);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PA:
				case NOT:
				case FOR:
				case WHILE:
				case IF:
				case BREAK:
				case INT:
				case CHAR:
				case CONST:
				case DOUBLE:
				case VOID:
				case FLOAT:
				case STRING_TIPO:
				case RETURN:
				case INCREMENTO:
				case DECREMENTO:
				case TRUE:
				case FALSE:
				case URL:
				case EMAIL:
				case CUIL:
				case DNI:
				case FECHA:
				case FECHAISO:
				case TELEFONO_INTERNACIONAL:
				case TELEFONO_NACIONAL:
				case CODIGO_POSTAL:
				case IP:
				case PASSWORD:
				case NOMBRE_APELLIDO:
				case PATENTE:
				case TARJETA_CREDITO:
				case ID:
				case STRING:
				case INTEGER:
				case DECIMAL:
				case CHARACTER:
					{
					setState(48);
					instruccion();
					}
					break;
				case COMENTARIO_LINEA:
				case COMENTARIO_BLOQUE:
					{
					setState(49);
					nota();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstruccionContext extends ParserRuleContext {
		public BucleForContext bucleFor() {
			return getRuleContext(BucleForContext.class,0);
		}
		public DefinicionFuncionContext definicionFuncion() {
			return getRuleContext(DefinicionFuncionContext.class,0);
		}
		public DefinicionVariableContext definicionVariable() {
			return getRuleContext(DefinicionVariableContext.class,0);
		}
		public AsignacionVariableContext asignacionVariable() {
			return getRuleContext(AsignacionVariableContext.class,0);
		}
		public CondicionIfContext condicionIf() {
			return getRuleContext(CondicionIfContext.class,0);
		}
		public BucleWhileContext bucleWhile() {
			return getRuleContext(BucleWhileContext.class,0);
		}
		public InterrupcionContext interrupcion() {
			return getRuleContext(InterrupcionContext.class,0);
		}
		public RetornoInstContext retornoInst() {
			return getRuleContext(RetornoInstContext.class,0);
		}
		public LlamadaExprContext llamadaExpr() {
			return getRuleContext(LlamadaExprContext.class,0);
		}
		public TerminalNode PYC() { return getToken(MiLenguajeParser.PYC, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instruccion);
		try {
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				bucleFor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				definicionFuncion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
				definicionVariable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(60);
				asignacionVariable();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(61);
				condicionIf();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(62);
				bucleWhile();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(63);
				interrupcion();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(64);
				retornoInst();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(65);
				llamadaExpr();
				setState(66);
				match(PYC);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(68);
				expresion(0);
				setState(69);
				match(PYC);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LlamadaExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
		public TerminalNode PA() { return getToken(MiLenguajeParser.PA, 0); }
		public TerminalNode PC() { return getToken(MiLenguajeParser.PC, 0); }
		public ListaArgumentosContext listaArgumentos() {
			return getRuleContext(ListaArgumentosContext.class,0);
		}
		public LlamadaExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamadaExpr; }
	}

	public final LlamadaExprContext llamadaExpr() throws RecognitionException {
		LlamadaExprContext _localctx = new LlamadaExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_llamadaExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(ID);
			setState(74);
			match(PA);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1152921367176282114L) != 0)) {
				{
				setState(75);
				listaArgumentos();
				}
			}

			setState(78);
			match(PC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CuerpoContext extends ParserRuleContext {
		public TerminalNode LA() { return getToken(MiLenguajeParser.LA, 0); }
		public TerminalNode LC() { return getToken(MiLenguajeParser.LC, 0); }
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public List<NotaContext> nota() {
			return getRuleContexts(NotaContext.class);
		}
		public NotaContext nota(int i) {
			return getRuleContext(NotaContext.class,i);
		}
		public CuerpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpo; }
	}

	public final CuerpoContext cuerpo() throws RecognitionException {
		CuerpoContext _localctx = new CuerpoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_cuerpo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(LA);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4611686018284781570L) != 0)) {
				{
				setState(83);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PA:
				case NOT:
				case FOR:
				case WHILE:
				case IF:
				case BREAK:
				case INT:
				case CHAR:
				case CONST:
				case DOUBLE:
				case VOID:
				case FLOAT:
				case STRING_TIPO:
				case RETURN:
				case INCREMENTO:
				case DECREMENTO:
				case TRUE:
				case FALSE:
				case URL:
				case EMAIL:
				case CUIL:
				case DNI:
				case FECHA:
				case FECHAISO:
				case TELEFONO_INTERNACIONAL:
				case TELEFONO_NACIONAL:
				case CODIGO_POSTAL:
				case IP:
				case PASSWORD:
				case NOMBRE_APELLIDO:
				case PATENTE:
				case TARJETA_CREDITO:
				case ID:
				case STRING:
				case INTEGER:
				case DECIMAL:
				case CHARACTER:
					{
					setState(81);
					instruccion();
					}
					break;
				case COMENTARIO_LINEA:
				case COMENTARIO_BLOQUE:
					{
					setState(82);
					nota();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88);
			match(LC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NotaContext extends ParserRuleContext {
		public TerminalNode COMENTARIO_LINEA() { return getToken(MiLenguajeParser.COMENTARIO_LINEA, 0); }
		public TerminalNode COMENTARIO_BLOQUE() { return getToken(MiLenguajeParser.COMENTARIO_BLOQUE, 0); }
		public NotaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nota; }
	}

	public final NotaContext nota() throws RecognitionException {
		NotaContext _localctx = new NotaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_nota);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_la = _input.LA(1);
			if ( !(_la==COMENTARIO_LINEA || _la==COMENTARIO_BLOQUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CondicionIfContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(MiLenguajeParser.IF, 0); }
		public TerminalNode PA() { return getToken(MiLenguajeParser.PA, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PC() { return getToken(MiLenguajeParser.PC, 0); }
		public List<CuerpoContext> cuerpo() {
			return getRuleContexts(CuerpoContext.class);
		}
		public CuerpoContext cuerpo(int i) {
			return getRuleContext(CuerpoContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(MiLenguajeParser.ELSE, 0); }
		public CondicionIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicionIf; }
	}

	public final CondicionIfContext condicionIf() throws RecognitionException {
		CondicionIfContext _localctx = new CondicionIfContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_condicionIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(IF);
			setState(93);
			match(PA);
			setState(94);
			expresion(0);
			setState(95);
			match(PC);
			setState(96);
			cuerpo();
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(97);
				match(ELSE);
				setState(98);
				cuerpo();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BucleWhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(MiLenguajeParser.WHILE, 0); }
		public TerminalNode PA() { return getToken(MiLenguajeParser.PA, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PC() { return getToken(MiLenguajeParser.PC, 0); }
		public CuerpoContext cuerpo() {
			return getRuleContext(CuerpoContext.class,0);
		}
		public BucleWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bucleWhile; }
	}

	public final BucleWhileContext bucleWhile() throws RecognitionException {
		BucleWhileContext _localctx = new BucleWhileContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_bucleWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(WHILE);
			setState(102);
			match(PA);
			setState(103);
			expresion(0);
			setState(104);
			match(PC);
			setState(105);
			cuerpo();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BucleForContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(MiLenguajeParser.FOR, 0); }
		public TerminalNode PA() { return getToken(MiLenguajeParser.PA, 0); }
		public List<TerminalNode> PYC() { return getTokens(MiLenguajeParser.PYC); }
		public TerminalNode PYC(int i) {
			return getToken(MiLenguajeParser.PYC, i);
		}
		public TerminalNode PC() { return getToken(MiLenguajeParser.PC, 0); }
		public CuerpoContext cuerpo() {
			return getRuleContext(CuerpoContext.class,0);
		}
		public InitForContext initFor() {
			return getRuleContext(InitForContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public UpdateForContext updateFor() {
			return getRuleContext(UpdateForContext.class,0);
		}
		public BucleForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bucleFor; }
	}

	public final BucleForContext bucleFor() throws RecognitionException {
		BucleForContext _localctx = new BucleForContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_bucleFor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(FOR);
			setState(108);
			match(PA);
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 36028865201569792L) != 0)) {
				{
				setState(109);
				initFor();
				}
			}

			setState(112);
			match(PYC);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1152921367176282114L) != 0)) {
				{
				setState(113);
				expresion(0);
				}
			}

			setState(116);
			match(PYC);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(117);
				updateFor();
				}
			}

			setState(120);
			match(PC);
			setState(121);
			cuerpo();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InitForContext extends ParserRuleContext {
		public DefinicionSinPuntoContext definicionSinPunto() {
			return getRuleContext(DefinicionSinPuntoContext.class,0);
		}
		public AsignacionSinPuntoContext asignacionSinPunto() {
			return getRuleContext(AsignacionSinPuntoContext.class,0);
		}
		public InitForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initFor; }
	}

	public final InitForContext initFor() throws RecognitionException {
		InitForContext _localctx = new InitForContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_initFor);
		try {
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case CHAR:
			case CONST:
			case DOUBLE:
			case VOID:
			case FLOAT:
			case STRING_TIPO:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				definicionSinPunto();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				asignacionSinPunto();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UpdateForContext extends ParserRuleContext {
		public AsignacionSinPuntoContext asignacionSinPunto() {
			return getRuleContext(AsignacionSinPuntoContext.class,0);
		}
		public IncDecContext incDec() {
			return getRuleContext(IncDecContext.class,0);
		}
		public UpdateForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateFor; }
	}

	public final UpdateForContext updateFor() throws RecognitionException {
		UpdateForContext _localctx = new UpdateForContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_updateFor);
		try {
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				asignacionSinPunto();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				incDec();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IncDecContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
		public TerminalNode INCREMENTO() { return getToken(MiLenguajeParser.INCREMENTO, 0); }
		public TerminalNode DECREMENTO() { return getToken(MiLenguajeParser.DECREMENTO, 0); }
		public IncDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incDec; }
	}

	public final IncDecContext incDec() throws RecognitionException {
		IncDecContext _localctx = new IncDecContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_incDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(ID);
			setState(132);
			_la = _input.LA(1);
			if ( !(_la==INCREMENTO || _la==DECREMENTO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterrupcionContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(MiLenguajeParser.BREAK, 0); }
		public TerminalNode PYC() { return getToken(MiLenguajeParser.PYC, 0); }
		public InterrupcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interrupcion; }
	}

	public final InterrupcionContext interrupcion() throws RecognitionException {
		InterrupcionContext _localctx = new InterrupcionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_interrupcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(BREAK);
			setState(135);
			match(PYC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefinicionFuncionContext extends ParserRuleContext {
		public TipoDatoContext tipoDato() {
			return getRuleContext(TipoDatoContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
		public TerminalNode PA() { return getToken(MiLenguajeParser.PA, 0); }
		public TerminalNode PC() { return getToken(MiLenguajeParser.PC, 0); }
		public CuerpoContext cuerpo() {
			return getRuleContext(CuerpoContext.class,0);
		}
		public ListaParamsContext listaParams() {
			return getRuleContext(ListaParamsContext.class,0);
		}
		public DefinicionFuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicionFuncion; }
	}

	public final DefinicionFuncionContext definicionFuncion() throws RecognitionException {
		DefinicionFuncionContext _localctx = new DefinicionFuncionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_definicionFuncion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			tipoDato();
			setState(138);
			match(ID);
			setState(139);
			match(PA);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 66035122176L) != 0)) {
				{
				setState(140);
				listaParams();
				}
			}

			setState(143);
			match(PC);
			setState(144);
			cuerpo();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListaParamsContext extends ParserRuleContext {
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(MiLenguajeParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(MiLenguajeParser.COMA, i);
		}
		public ListaParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaParams; }
	}

	public final ListaParamsContext listaParams() throws RecognitionException {
		ListaParamsContext _localctx = new ListaParamsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_listaParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			parametro();
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(147);
				match(COMA);
				setState(148);
				parametro();
				}
				}
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametroContext extends ParserRuleContext {
		public TipoDatoContext tipoDato() {
			return getRuleContext(TipoDatoContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_parametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			tipoDato();
			setState(155);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefinicionVariableContext extends ParserRuleContext {
		public TipoDatoContext tipoDato() {
			return getRuleContext(TipoDatoContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
		public TerminalNode PYC() { return getToken(MiLenguajeParser.PYC, 0); }
		public TerminalNode CONST() { return getToken(MiLenguajeParser.CONST, 0); }
		public TerminalNode IGUAL() { return getToken(MiLenguajeParser.IGUAL, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public DefinicionVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicionVariable; }
	}

	public final DefinicionVariableContext definicionVariable() throws RecognitionException {
		DefinicionVariableContext _localctx = new DefinicionVariableContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_definicionVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(157);
				match(CONST);
				}
			}

			setState(160);
			tipoDato();
			setState(161);
			match(ID);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IGUAL) {
				{
				setState(162);
				match(IGUAL);
				setState(163);
				expresion(0);
				}
			}

			setState(166);
			match(PYC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefinicionSinPuntoContext extends ParserRuleContext {
		public TipoDatoContext tipoDato() {
			return getRuleContext(TipoDatoContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
		public TerminalNode CONST() { return getToken(MiLenguajeParser.CONST, 0); }
		public TerminalNode IGUAL() { return getToken(MiLenguajeParser.IGUAL, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public DefinicionSinPuntoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicionSinPunto; }
	}

	public final DefinicionSinPuntoContext definicionSinPunto() throws RecognitionException {
		DefinicionSinPuntoContext _localctx = new DefinicionSinPuntoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_definicionSinPunto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(168);
				match(CONST);
				}
			}

			setState(171);
			tipoDato();
			setState(172);
			match(ID);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IGUAL) {
				{
				setState(173);
				match(IGUAL);
				setState(174);
				expresion(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AsignacionVariableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
		public TerminalNode IGUAL() { return getToken(MiLenguajeParser.IGUAL, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PYC() { return getToken(MiLenguajeParser.PYC, 0); }
		public AsignacionVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacionVariable; }
	}

	public final AsignacionVariableContext asignacionVariable() throws RecognitionException {
		AsignacionVariableContext _localctx = new AsignacionVariableContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_asignacionVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(ID);
			setState(178);
			match(IGUAL);
			setState(179);
			expresion(0);
			setState(180);
			match(PYC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AsignacionSinPuntoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
		public TerminalNode IGUAL() { return getToken(MiLenguajeParser.IGUAL, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public AsignacionSinPuntoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacionSinPunto; }
	}

	public final AsignacionSinPuntoContext asignacionSinPunto() throws RecognitionException {
		AsignacionSinPuntoContext _localctx = new AsignacionSinPuntoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_asignacionSinPunto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(ID);
			setState(183);
			match(IGUAL);
			setState(184);
			expresion(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RetornoInstContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(MiLenguajeParser.RETURN, 0); }
		public TerminalNode PYC() { return getToken(MiLenguajeParser.PYC, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public RetornoInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retornoInst; }
	}

	public final RetornoInstContext retornoInst() throws RecognitionException {
		RetornoInstContext _localctx = new RetornoInstContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_retornoInst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(RETURN);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1152921367176282114L) != 0)) {
				{
				setState(187);
				expresion(0);
				}
			}

			setState(190);
			match(PYC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TipoDatoContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(MiLenguajeParser.INT, 0); }
		public TerminalNode CHAR() { return getToken(MiLenguajeParser.CHAR, 0); }
		public TerminalNode DOUBLE() { return getToken(MiLenguajeParser.DOUBLE, 0); }
		public TerminalNode VOID() { return getToken(MiLenguajeParser.VOID, 0); }
		public TerminalNode FLOAT() { return getToken(MiLenguajeParser.FLOAT, 0); }
		public TerminalNode STRING_TIPO() { return getToken(MiLenguajeParser.STRING_TIPO, 0); }
		public TipoDatoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoDato; }
	}

	public final TipoDatoContext tipoDato() throws RecognitionException {
		TipoDatoContext _localctx = new TipoDatoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_tipoDato);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 66035122176L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionContext extends ParserRuleContext {
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
	 
		public ExpresionContext() { }
		public void copyFrom(ExpresionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpNegacionContext extends ExpresionContext {
		public TerminalNode NOT() { return getToken(MiLenguajeParser.NOT, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public ExpNegacionContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpDecimalContext extends ExpresionContext {
		public TerminalNode DECIMAL() { return getToken(MiLenguajeParser.DECIMAL, 0); }
		public ExpDecimalContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpIPContext extends ExpresionContext {
		public TerminalNode IP() { return getToken(MiLenguajeParser.IP, 0); }
		public ExpIPContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpNomApeContext extends ExpresionContext {
		public TerminalNode NOMBRE_APELLIDO() { return getToken(MiLenguajeParser.NOMBRE_APELLIDO, 0); }
		public ExpNomApeContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpFechaContext extends ExpresionContext {
		public TerminalNode FECHA() { return getToken(MiLenguajeParser.FECHA, 0); }
		public ExpFechaContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpVariableContext extends ExpresionContext {
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
		public ExpVariableContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpTelIntContext extends ExpresionContext {
		public TerminalNode TELEFONO_INTERNACIONAL() { return getToken(MiLenguajeParser.TELEFONO_INTERNACIONAL, 0); }
		public ExpTelIntContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpFuncionContext extends ExpresionContext {
		public LlamadaExprContext llamadaExpr() {
			return getRuleContext(LlamadaExprContext.class,0);
		}
		public ExpFuncionContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpStringContext extends ExpresionContext {
		public TerminalNode STRING() { return getToken(MiLenguajeParser.STRING, 0); }
		public ExpStringContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpFechaISOContext extends ExpresionContext {
		public TerminalNode FECHAISO() { return getToken(MiLenguajeParser.FECHAISO, 0); }
		public ExpFechaISOContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpCUILContext extends ExpresionContext {
		public TerminalNode CUIL() { return getToken(MiLenguajeParser.CUIL, 0); }
		public ExpCUILContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpEnteroContext extends ExpresionContext {
		public TerminalNode INTEGER() { return getToken(MiLenguajeParser.INTEGER, 0); }
		public ExpEnteroContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpEmailContext extends ExpresionContext {
		public TerminalNode EMAIL() { return getToken(MiLenguajeParser.EMAIL, 0); }
		public ExpEmailContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpPassContext extends ExpresionContext {
		public TerminalNode PASSWORD() { return getToken(MiLenguajeParser.PASSWORD, 0); }
		public ExpPassContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpTrueContext extends ExpresionContext {
		public TerminalNode TRUE() { return getToken(MiLenguajeParser.TRUE, 0); }
		public ExpTrueContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpBinariaContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public OpBinariaContext opBinaria() {
			return getRuleContext(OpBinariaContext.class,0);
		}
		public ExpBinariaContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpDNIContext extends ExpresionContext {
		public TerminalNode DNI() { return getToken(MiLenguajeParser.DNI, 0); }
		public ExpDNIContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpTarjetaContext extends ExpresionContext {
		public TerminalNode TARJETA_CREDITO() { return getToken(MiLenguajeParser.TARJETA_CREDITO, 0); }
		public ExpTarjetaContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpPostDecrementoContext extends ExpresionContext {
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
		public TerminalNode DECREMENTO() { return getToken(MiLenguajeParser.DECREMENTO, 0); }
		public ExpPostDecrementoContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpTelNacContext extends ExpresionContext {
		public TerminalNode TELEFONO_NACIONAL() { return getToken(MiLenguajeParser.TELEFONO_NACIONAL, 0); }
		public ExpTelNacContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpFalseContext extends ExpresionContext {
		public TerminalNode FALSE() { return getToken(MiLenguajeParser.FALSE, 0); }
		public ExpFalseContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpPostIncrementoContext extends ExpresionContext {
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
		public TerminalNode INCREMENTO() { return getToken(MiLenguajeParser.INCREMENTO, 0); }
		public ExpPostIncrementoContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpPreIncrementoContext extends ExpresionContext {
		public TerminalNode INCREMENTO() { return getToken(MiLenguajeParser.INCREMENTO, 0); }
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
		public ExpPreIncrementoContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpParentesisContext extends ExpresionContext {
		public TerminalNode PA() { return getToken(MiLenguajeParser.PA, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PC() { return getToken(MiLenguajeParser.PC, 0); }
		public ExpParentesisContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpCaracterContext extends ExpresionContext {
		public TerminalNode CHARACTER() { return getToken(MiLenguajeParser.CHARACTER, 0); }
		public ExpCaracterContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpURLContext extends ExpresionContext {
		public TerminalNode URL() { return getToken(MiLenguajeParser.URL, 0); }
		public ExpURLContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpCodPostalContext extends ExpresionContext {
		public TerminalNode CODIGO_POSTAL() { return getToken(MiLenguajeParser.CODIGO_POSTAL, 0); }
		public ExpCodPostalContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpPatenteContext extends ExpresionContext {
		public TerminalNode PATENTE() { return getToken(MiLenguajeParser.PATENTE, 0); }
		public ExpPatenteContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpPreDecrementoContext extends ExpresionContext {
		public TerminalNode DECREMENTO() { return getToken(MiLenguajeParser.DECREMENTO, 0); }
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
		public ExpPreDecrementoContext(ExpresionContext ctx) { copyFrom(ctx); }
	}

	public final ExpresionContext expresion() throws RecognitionException {
		return expresion(0);
	}

	private ExpresionContext expresion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpresionContext _localctx = new ExpresionContext(_ctx, _parentState);
		ExpresionContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_expresion, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				_localctx = new ExpNegacionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(195);
				match(NOT);
				setState(196);
				expresion(28);
				}
				break;
			case 2:
				{
				_localctx = new ExpParentesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(197);
				match(PA);
				setState(198);
				expresion(0);
				setState(199);
				match(PC);
				}
				break;
			case 3:
				{
				_localctx = new ExpPreIncrementoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(201);
				match(INCREMENTO);
				setState(202);
				match(ID);
				}
				break;
			case 4:
				{
				_localctx = new ExpPreDecrementoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(203);
				match(DECREMENTO);
				setState(204);
				match(ID);
				}
				break;
			case 5:
				{
				_localctx = new ExpPostIncrementoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(205);
				match(ID);
				setState(206);
				match(INCREMENTO);
				}
				break;
			case 6:
				{
				_localctx = new ExpPostDecrementoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(207);
				match(ID);
				setState(208);
				match(DECREMENTO);
				}
				break;
			case 7:
				{
				_localctx = new ExpVariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(209);
				match(ID);
				}
				break;
			case 8:
				{
				_localctx = new ExpEnteroContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(210);
				match(INTEGER);
				}
				break;
			case 9:
				{
				_localctx = new ExpDecimalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(211);
				match(DECIMAL);
				}
				break;
			case 10:
				{
				_localctx = new ExpCaracterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(212);
				match(CHARACTER);
				}
				break;
			case 11:
				{
				_localctx = new ExpStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(213);
				match(STRING);
				}
				break;
			case 12:
				{
				_localctx = new ExpURLContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(214);
				match(URL);
				}
				break;
			case 13:
				{
				_localctx = new ExpEmailContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(215);
				match(EMAIL);
				}
				break;
			case 14:
				{
				_localctx = new ExpDNIContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(216);
				match(DNI);
				}
				break;
			case 15:
				{
				_localctx = new ExpCUILContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(217);
				match(CUIL);
				}
				break;
			case 16:
				{
				_localctx = new ExpFechaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(218);
				match(FECHA);
				}
				break;
			case 17:
				{
				_localctx = new ExpFechaISOContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(219);
				match(FECHAISO);
				}
				break;
			case 18:
				{
				_localctx = new ExpTelIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(220);
				match(TELEFONO_INTERNACIONAL);
				}
				break;
			case 19:
				{
				_localctx = new ExpTelNacContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(221);
				match(TELEFONO_NACIONAL);
				}
				break;
			case 20:
				{
				_localctx = new ExpCodPostalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(222);
				match(CODIGO_POSTAL);
				}
				break;
			case 21:
				{
				_localctx = new ExpIPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(223);
				match(IP);
				}
				break;
			case 22:
				{
				_localctx = new ExpPassContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(224);
				match(PASSWORD);
				}
				break;
			case 23:
				{
				_localctx = new ExpNomApeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(225);
				match(NOMBRE_APELLIDO);
				}
				break;
			case 24:
				{
				_localctx = new ExpPatenteContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(226);
				match(PATENTE);
				}
				break;
			case 25:
				{
				_localctx = new ExpTarjetaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(227);
				match(TARJETA_CREDITO);
				}
				break;
			case 26:
				{
				_localctx = new ExpFuncionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(228);
				llamadaExpr();
				}
				break;
			case 27:
				{
				_localctx = new ExpTrueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(229);
				match(TRUE);
				}
				break;
			case 28:
				{
				_localctx = new ExpFalseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(230);
				match(FALSE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(239);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpBinariaContext(new ExpresionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expresion);
					setState(233);
					if (!(precpred(_ctx, 29))) throw new FailedPredicateException(this, "precpred(_ctx, 29)");
					setState(234);
					opBinaria();
					setState(235);
					expresion(30);
					}
					} 
				}
				setState(241);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OpBinariaContext extends ParserRuleContext {
		public TerminalNode SUM() { return getToken(MiLenguajeParser.SUM, 0); }
		public TerminalNode RES() { return getToken(MiLenguajeParser.RES, 0); }
		public TerminalNode MUL() { return getToken(MiLenguajeParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(MiLenguajeParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(MiLenguajeParser.MOD, 0); }
		public TerminalNode MAYOR() { return getToken(MiLenguajeParser.MAYOR, 0); }
		public TerminalNode MAYOR_IGUAL() { return getToken(MiLenguajeParser.MAYOR_IGUAL, 0); }
		public TerminalNode MENOR() { return getToken(MiLenguajeParser.MENOR, 0); }
		public TerminalNode MENOR_IGUAL() { return getToken(MiLenguajeParser.MENOR_IGUAL, 0); }
		public TerminalNode EQL() { return getToken(MiLenguajeParser.EQL, 0); }
		public TerminalNode DISTINTO() { return getToken(MiLenguajeParser.DISTINTO, 0); }
		public TerminalNode AND() { return getToken(MiLenguajeParser.AND, 0); }
		public TerminalNode OR() { return getToken(MiLenguajeParser.OR, 0); }
		public OpBinariaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opBinaria; }
	}

	public final OpBinariaContext opBinaria() throws RecognitionException {
		OpBinariaContext _localctx = new OpBinariaContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_opBinaria);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8387584L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListaArgumentosContext extends ParserRuleContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(MiLenguajeParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(MiLenguajeParser.COMA, i);
		}
		public ListaArgumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaArgumentos; }
	}

	public final ListaArgumentosContext listaArgumentos() throws RecognitionException {
		ListaArgumentosContext _localctx = new ListaArgumentosContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_listaArgumentos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			expresion(0);
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(245);
				match(COMA);
				setState(246);
				expresion(0);
				}
				}
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 21:
			return expresion_sempred((ExpresionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expresion_sempred(ExpresionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 29);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001?\u00fd\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0001\u0000\u0001\u0000"+
		"\u0005\u00003\b\u0000\n\u0000\f\u00006\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001H\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002M\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u0003T\b\u0003\n\u0003\f\u0003W\t\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"d\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007o\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007s\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007w\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0003\b~\b\b\u0001\t\u0001\t\u0003\t\u0082\b\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0003\f\u008e\b\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0005"+
		"\r\u0096\b\r\n\r\f\r\u0099\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0003\u000f\u009f\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u00a5\b\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0003"+
		"\u0010\u00aa\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003"+
		"\u0010\u00b0\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u00bd\b\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0003\u0015\u00e8\b\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0005\u0015\u00ee\b\u0015\n\u0015\f\u0015\u00f1\t\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017"+
		"\u00f8\b\u0017\n\u0017\f\u0017\u00fb\t\u0017\u0001\u0017\u0000\u0001*"+
		"\u0018\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.\u0000\u0004\u0001\u0000<=\u0001\u0000%&\u0002"+
		"\u0000\u001d\u001e #\u0001\u0000\n\u0016\u011c\u00004\u0001\u0000\u0000"+
		"\u0000\u0002G\u0001\u0000\u0000\u0000\u0004I\u0001\u0000\u0000\u0000\u0006"+
		"P\u0001\u0000\u0000\u0000\bZ\u0001\u0000\u0000\u0000\n\\\u0001\u0000\u0000"+
		"\u0000\fe\u0001\u0000\u0000\u0000\u000ek\u0001\u0000\u0000\u0000\u0010"+
		"}\u0001\u0000\u0000\u0000\u0012\u0081\u0001\u0000\u0000\u0000\u0014\u0083"+
		"\u0001\u0000\u0000\u0000\u0016\u0086\u0001\u0000\u0000\u0000\u0018\u0089"+
		"\u0001\u0000\u0000\u0000\u001a\u0092\u0001\u0000\u0000\u0000\u001c\u009a"+
		"\u0001\u0000\u0000\u0000\u001e\u009e\u0001\u0000\u0000\u0000 \u00a9\u0001"+
		"\u0000\u0000\u0000\"\u00b1\u0001\u0000\u0000\u0000$\u00b6\u0001\u0000"+
		"\u0000\u0000&\u00ba\u0001\u0000\u0000\u0000(\u00c0\u0001\u0000\u0000\u0000"+
		"*\u00e7\u0001\u0000\u0000\u0000,\u00f2\u0001\u0000\u0000\u0000.\u00f4"+
		"\u0001\u0000\u0000\u000003\u0003\u0002\u0001\u000013\u0003\b\u0004\u0000"+
		"20\u0001\u0000\u0000\u000021\u0001\u0000\u0000\u000036\u0001\u0000\u0000"+
		"\u000042\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u000057\u0001\u0000"+
		"\u0000\u000064\u0001\u0000\u0000\u000078\u0005\u0000\u0000\u00018\u0001"+
		"\u0001\u0000\u0000\u00009H\u0003\u000e\u0007\u0000:H\u0003\u0018\f\u0000"+
		";H\u0003\u001e\u000f\u0000<H\u0003\"\u0011\u0000=H\u0003\n\u0005\u0000"+
		">H\u0003\f\u0006\u0000?H\u0003\u0016\u000b\u0000@H\u0003&\u0013\u0000"+
		"AB\u0003\u0004\u0002\u0000BC\u0005\u0007\u0000\u0000CH\u0001\u0000\u0000"+
		"\u0000DE\u0003*\u0015\u0000EF\u0005\u0007\u0000\u0000FH\u0001\u0000\u0000"+
		"\u0000G9\u0001\u0000\u0000\u0000G:\u0001\u0000\u0000\u0000G;\u0001\u0000"+
		"\u0000\u0000G<\u0001\u0000\u0000\u0000G=\u0001\u0000\u0000\u0000G>\u0001"+
		"\u0000\u0000\u0000G?\u0001\u0000\u0000\u0000G@\u0001\u0000\u0000\u0000"+
		"GA\u0001\u0000\u0000\u0000GD\u0001\u0000\u0000\u0000H\u0003\u0001\u0000"+
		"\u0000\u0000IJ\u00057\u0000\u0000JL\u0005\u0001\u0000\u0000KM\u0003.\u0017"+
		"\u0000LK\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MN\u0001\u0000"+
		"\u0000\u0000NO\u0005\u0002\u0000\u0000O\u0005\u0001\u0000\u0000\u0000"+
		"PU\u0005\u0005\u0000\u0000QT\u0003\u0002\u0001\u0000RT\u0003\b\u0004\u0000"+
		"SQ\u0001\u0000\u0000\u0000SR\u0001\u0000\u0000\u0000TW\u0001\u0000\u0000"+
		"\u0000US\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VX\u0001\u0000"+
		"\u0000\u0000WU\u0001\u0000\u0000\u0000XY\u0005\u0006\u0000\u0000Y\u0007"+
		"\u0001\u0000\u0000\u0000Z[\u0007\u0000\u0000\u0000[\t\u0001\u0000\u0000"+
		"\u0000\\]\u0005\u001a\u0000\u0000]^\u0005\u0001\u0000\u0000^_\u0003*\u0015"+
		"\u0000_`\u0005\u0002\u0000\u0000`c\u0003\u0006\u0003\u0000ab\u0005\u001b"+
		"\u0000\u0000bd\u0003\u0006\u0003\u0000ca\u0001\u0000\u0000\u0000cd\u0001"+
		"\u0000\u0000\u0000d\u000b\u0001\u0000\u0000\u0000ef\u0005\u0019\u0000"+
		"\u0000fg\u0005\u0001\u0000\u0000gh\u0003*\u0015\u0000hi\u0005\u0002\u0000"+
		"\u0000ij\u0003\u0006\u0003\u0000j\r\u0001\u0000\u0000\u0000kl\u0005\u0018"+
		"\u0000\u0000ln\u0005\u0001\u0000\u0000mo\u0003\u0010\b\u0000nm\u0001\u0000"+
		"\u0000\u0000no\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pr\u0005"+
		"\u0007\u0000\u0000qs\u0003*\u0015\u0000rq\u0001\u0000\u0000\u0000rs\u0001"+
		"\u0000\u0000\u0000st\u0001\u0000\u0000\u0000tv\u0005\u0007\u0000\u0000"+
		"uw\u0003\u0012\t\u0000vu\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000"+
		"wx\u0001\u0000\u0000\u0000xy\u0005\u0002\u0000\u0000yz\u0003\u0006\u0003"+
		"\u0000z\u000f\u0001\u0000\u0000\u0000{~\u0003 \u0010\u0000|~\u0003$\u0012"+
		"\u0000}{\u0001\u0000\u0000\u0000}|\u0001\u0000\u0000\u0000~\u0011\u0001"+
		"\u0000\u0000\u0000\u007f\u0082\u0003$\u0012\u0000\u0080\u0082\u0003\u0014"+
		"\n\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0080\u0001\u0000\u0000"+
		"\u0000\u0082\u0013\u0001\u0000\u0000\u0000\u0083\u0084\u00057\u0000\u0000"+
		"\u0084\u0085\u0007\u0001\u0000\u0000\u0085\u0015\u0001\u0000\u0000\u0000"+
		"\u0086\u0087\u0005\u001c\u0000\u0000\u0087\u0088\u0005\u0007\u0000\u0000"+
		"\u0088\u0017\u0001\u0000\u0000\u0000\u0089\u008a\u0003(\u0014\u0000\u008a"+
		"\u008b\u00057\u0000\u0000\u008b\u008d\u0005\u0001\u0000\u0000\u008c\u008e"+
		"\u0003\u001a\r\u0000\u008d\u008c\u0001\u0000\u0000\u0000\u008d\u008e\u0001"+
		"\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0090\u0005"+
		"\u0002\u0000\u0000\u0090\u0091\u0003\u0006\u0003\u0000\u0091\u0019\u0001"+
		"\u0000\u0000\u0000\u0092\u0097\u0003\u001c\u000e\u0000\u0093\u0094\u0005"+
		"\b\u0000\u0000\u0094\u0096\u0003\u001c\u000e\u0000\u0095\u0093\u0001\u0000"+
		"\u0000\u0000\u0096\u0099\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000"+
		"\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u001b\u0001\u0000"+
		"\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u009a\u009b\u0003(\u0014"+
		"\u0000\u009b\u009c\u00057\u0000\u0000\u009c\u001d\u0001\u0000\u0000\u0000"+
		"\u009d\u009f\u0005\u001f\u0000\u0000\u009e\u009d\u0001\u0000\u0000\u0000"+
		"\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a1\u0003(\u0014\u0000\u00a1\u00a4\u00057\u0000\u0000\u00a2\u00a3"+
		"\u0005\t\u0000\u0000\u00a3\u00a5\u0003*\u0015\u0000\u00a4\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a7\u0005\u0007\u0000\u0000\u00a7\u001f\u0001"+
		"\u0000\u0000\u0000\u00a8\u00aa\u0005\u001f\u0000\u0000\u00a9\u00a8\u0001"+
		"\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001"+
		"\u0000\u0000\u0000\u00ab\u00ac\u0003(\u0014\u0000\u00ac\u00af\u00057\u0000"+
		"\u0000\u00ad\u00ae\u0005\t\u0000\u0000\u00ae\u00b0\u0003*\u0015\u0000"+
		"\u00af\u00ad\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000"+
		"\u00b0!\u0001\u0000\u0000\u0000\u00b1\u00b2\u00057\u0000\u0000\u00b2\u00b3"+
		"\u0005\t\u0000\u0000\u00b3\u00b4\u0003*\u0015\u0000\u00b4\u00b5\u0005"+
		"\u0007\u0000\u0000\u00b5#\u0001\u0000\u0000\u0000\u00b6\u00b7\u00057\u0000"+
		"\u0000\u00b7\u00b8\u0005\t\u0000\u0000\u00b8\u00b9\u0003*\u0015\u0000"+
		"\u00b9%\u0001\u0000\u0000\u0000\u00ba\u00bc\u0005$\u0000\u0000\u00bb\u00bd"+
		"\u0003*\u0015\u0000\u00bc\u00bb\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001"+
		"\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u00bf\u0005"+
		"\u0007\u0000\u0000\u00bf\'\u0001\u0000\u0000\u0000\u00c0\u00c1\u0007\u0002"+
		"\u0000\u0000\u00c1)\u0001\u0000\u0000\u0000\u00c2\u00c3\u0006\u0015\uffff"+
		"\uffff\u0000\u00c3\u00c4\u0005\u0017\u0000\u0000\u00c4\u00e8\u0003*\u0015"+
		"\u001c\u00c5\u00c6\u0005\u0001\u0000\u0000\u00c6\u00c7\u0003*\u0015\u0000"+
		"\u00c7\u00c8\u0005\u0002\u0000\u0000\u00c8\u00e8\u0001\u0000\u0000\u0000"+
		"\u00c9\u00ca\u0005%\u0000\u0000\u00ca\u00e8\u00057\u0000\u0000\u00cb\u00cc"+
		"\u0005&\u0000\u0000\u00cc\u00e8\u00057\u0000\u0000\u00cd\u00ce\u00057"+
		"\u0000\u0000\u00ce\u00e8\u0005%\u0000\u0000\u00cf\u00d0\u00057\u0000\u0000"+
		"\u00d0\u00e8\u0005&\u0000\u0000\u00d1\u00e8\u00057\u0000\u0000\u00d2\u00e8"+
		"\u00059\u0000\u0000\u00d3\u00e8\u0005:\u0000\u0000\u00d4\u00e8\u0005;"+
		"\u0000\u0000\u00d5\u00e8\u00058\u0000\u0000\u00d6\u00e8\u0005)\u0000\u0000"+
		"\u00d7\u00e8\u0005*\u0000\u0000\u00d8\u00e8\u0005,\u0000\u0000\u00d9\u00e8"+
		"\u0005+\u0000\u0000\u00da\u00e8\u0005-\u0000\u0000\u00db\u00e8\u0005."+
		"\u0000\u0000\u00dc\u00e8\u0005/\u0000\u0000\u00dd\u00e8\u00050\u0000\u0000"+
		"\u00de\u00e8\u00051\u0000\u0000\u00df\u00e8\u00052\u0000\u0000\u00e0\u00e8"+
		"\u00053\u0000\u0000\u00e1\u00e8\u00054\u0000\u0000\u00e2\u00e8\u00055"+
		"\u0000\u0000\u00e3\u00e8\u00056\u0000\u0000\u00e4\u00e8\u0003\u0004\u0002"+
		"\u0000\u00e5\u00e8\u0005\'\u0000\u0000\u00e6\u00e8\u0005(\u0000\u0000"+
		"\u00e7\u00c2\u0001\u0000\u0000\u0000\u00e7\u00c5\u0001\u0000\u0000\u0000"+
		"\u00e7\u00c9\u0001\u0000\u0000\u0000\u00e7\u00cb\u0001\u0000\u0000\u0000"+
		"\u00e7\u00cd\u0001\u0000\u0000\u0000\u00e7\u00cf\u0001\u0000\u0000\u0000"+
		"\u00e7\u00d1\u0001\u0000\u0000\u0000\u00e7\u00d2\u0001\u0000\u0000\u0000"+
		"\u00e7\u00d3\u0001\u0000\u0000\u0000\u00e7\u00d4\u0001\u0000\u0000\u0000"+
		"\u00e7\u00d5\u0001\u0000\u0000\u0000\u00e7\u00d6\u0001\u0000\u0000\u0000"+
		"\u00e7\u00d7\u0001\u0000\u0000\u0000\u00e7\u00d8\u0001\u0000\u0000\u0000"+
		"\u00e7\u00d9\u0001\u0000\u0000\u0000\u00e7\u00da\u0001\u0000\u0000\u0000"+
		"\u00e7\u00db\u0001\u0000\u0000\u0000\u00e7\u00dc\u0001\u0000\u0000\u0000"+
		"\u00e7\u00dd\u0001\u0000\u0000\u0000\u00e7\u00de\u0001\u0000\u0000\u0000"+
		"\u00e7\u00df\u0001\u0000\u0000\u0000\u00e7\u00e0\u0001\u0000\u0000\u0000"+
		"\u00e7\u00e1\u0001\u0000\u0000\u0000\u00e7\u00e2\u0001\u0000\u0000\u0000"+
		"\u00e7\u00e3\u0001\u0000\u0000\u0000\u00e7\u00e4\u0001\u0000\u0000\u0000"+
		"\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e7\u00e6\u0001\u0000\u0000\u0000"+
		"\u00e8\u00ef\u0001\u0000\u0000\u0000\u00e9\u00ea\n\u001d\u0000\u0000\u00ea"+
		"\u00eb\u0003,\u0016\u0000\u00eb\u00ec\u0003*\u0015\u001e\u00ec\u00ee\u0001"+
		"\u0000\u0000\u0000\u00ed\u00e9\u0001\u0000\u0000\u0000\u00ee\u00f1\u0001"+
		"\u0000\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001"+
		"\u0000\u0000\u0000\u00f0+\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000"+
		"\u0000\u0000\u00f2\u00f3\u0007\u0003\u0000\u0000\u00f3-\u0001\u0000\u0000"+
		"\u0000\u00f4\u00f9\u0003*\u0015\u0000\u00f5\u00f6\u0005\b\u0000\u0000"+
		"\u00f6\u00f8\u0003*\u0015\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f8"+
		"\u00fb\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000\u00f9"+
		"\u00fa\u0001\u0000\u0000\u0000\u00fa/\u0001\u0000\u0000\u0000\u00fb\u00f9"+
		"\u0001\u0000\u0000\u0000\u001624GLSUcnrv}\u0081\u008d\u0097\u009e\u00a4"+
		"\u00a9\u00af\u00bc\u00e7\u00ef\u00f9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}