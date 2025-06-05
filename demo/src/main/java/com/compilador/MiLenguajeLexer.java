// Generated from com\compilador\MiLenguaje.g4 by ANTLR 4.9.3
package com.compilador;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiLenguajeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PA=1, PC=2, CA=3, CC=4, LA=5, LC=6, PYC=7, COMA=8, IGUAL=9, MAYOR=10, 
		MAYOR_IGUAL=11, MENOR=12, MENOR_IGUAL=13, EQL=14, DISTINTO=15, SUM=16, 
		RES=17, MUL=18, DIV=19, MOD=20, OR=21, AND=22, NOT=23, FOR=24, WHILE=25, 
		IF=26, ELSE=27, INT=28, CHAR=29, DOUBLE=30, VOID=31, RETURN=32, INCREMENTO=33, 
		DECREMENTO=34, TRUE=35, FALSE=36, FLOAT=37, STRING_TIPO=38, EMAIL=39, 
		CUIL=40, DNI=41, FECHA=42, IP=43, TARJETA_CREDITO=44, STRING=45, ID=46, 
		INTEGER=47, DECIMAL=48, CHARACTER=49, COMENTARIO_LINEA=50, COMENTARIO_BLOQUE=51, 
		WS=52, OTRO=53;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LETRA", "DIGITO", "PA", "PC", "CA", "CC", "LA", "LC", "PYC", "COMA", 
			"IGUAL", "MAYOR", "MAYOR_IGUAL", "MENOR", "MENOR_IGUAL", "EQL", "DISTINTO", 
			"SUM", "RES", "MUL", "DIV", "MOD", "OR", "AND", "NOT", "FOR", "WHILE", 
			"IF", "ELSE", "INT", "CHAR", "DOUBLE", "VOID", "RETURN", "INCREMENTO", 
			"DECREMENTO", "TRUE", "FALSE", "FLOAT", "STRING_TIPO", "EMAIL", "CUIL", 
			"DNI", "FECHA", "IP", "TARJETA_CREDITO", "STRING", "LETRA_MINUSCULA", 
			"MAYUSCULA", "SIMBOLO", "ID", "INTEGER", "DECIMAL", "CHARACTER", "COMENTARIO_LINEA", 
			"COMENTARIO_BLOQUE", "WS", "OTRO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'['", "']'", "'{'", "'}'", "';'", "','", "'='", 
			"'>'", "'>='", "'<'", "'<='", "'=='", "'!='", "'+'", "'-'", "'*'", "'/'", 
			"'%'", "'||'", "'&&'", "'!'", "'for'", "'while'", "'if'", "'else'", "'int'", 
			"'char'", "'double'", "'void'", "'return'", "'++'", "'--'", "'true'", 
			"'false'", "'float'", "'string'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PA", "PC", "CA", "CC", "LA", "LC", "PYC", "COMA", "IGUAL", "MAYOR", 
			"MAYOR_IGUAL", "MENOR", "MENOR_IGUAL", "EQL", "DISTINTO", "SUM", "RES", 
			"MUL", "DIV", "MOD", "OR", "AND", "NOT", "FOR", "WHILE", "IF", "ELSE", 
			"INT", "CHAR", "DOUBLE", "VOID", "RETURN", "INCREMENTO", "DECREMENTO", 
			"TRUE", "FALSE", "FLOAT", "STRING_TIPO", "EMAIL", "CUIL", "DNI", "FECHA", 
			"IP", "TARJETA_CREDITO", "STRING", "ID", "INTEGER", "DECIMAL", "CHARACTER", 
			"COMENTARIO_LINEA", "COMENTARIO_BLOQUE", "WS", "OTRO"
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


	public MiLenguajeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MiLenguaje.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\67\u01c1\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#"+
		"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3*\6*\u00fd\n*\r*\16*\u00fe"+
		"\3*\3*\6*\u0103\n*\r*\16*\u0104\3*\3*\6*\u0109\n*\r*\16*\u010a\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u011b\n+\3+\3+\3+\3+\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\5,\u0131\n,\3-\3-\3-\3-\3-\3-\3"+
		"-\3-\5-\u013b\n-\3-\3-\3-\3-\3-\5-\u0142\n-\3-\3-\3-\3-\3-\3-\3.\6.\u014b"+
		"\n.\r.\16.\u014c\3.\3.\6.\u0151\n.\r.\16.\u0152\3.\3.\6.\u0157\n.\r.\16"+
		".\u0158\3.\3.\6.\u015d\n.\r.\16.\u015e\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3"+
		"/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\7\60\u0179\n\60\f\60"+
		"\16\60\u017c\13\60\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\5"+
		"\64\u0188\n\64\3\64\3\64\3\64\7\64\u018d\n\64\f\64\16\64\u0190\13\64\3"+
		"\65\6\65\u0193\n\65\r\65\16\65\u0194\3\66\3\66\3\66\3\66\3\67\3\67\3\67"+
		"\3\67\5\67\u019f\n\67\3\67\3\67\38\38\38\38\78\u01a7\n8\f8\168\u01aa\13"+
		"8\38\38\39\39\39\39\79\u01b2\n9\f9\169\u01b5\139\39\39\39\39\39\3:\3:"+
		"\3:\3:\3;\3;\3\u01b3\2<\3\2\5\2\7\3\t\4\13\5\r\6\17\7\21\b\23\t\25\n\27"+
		"\13\31\f\33\r\35\16\37\17!\20#\21%\22\'\23)\24+\25-\26/\27\61\30\63\31"+
		"\65\32\67\339\34;\35=\36?\37A C!E\"G#I$K%M&O\'Q(S)U*W+Y,[-]._/a\2c\2e"+
		"\2g\60i\61k\62m\63o\64q\65s\66u\67\3\2\20\4\2C\\c|\3\2\62;\t\2\'\'--/"+
		"\60\62;C\\aac|\6\2/\60\62;C\\c|\3\2\63;\3\2\62\63\3\2\62\64\3\2$$\t\2"+
		"c|\u00e3\u00e3\u00eb\u00eb\u00ef\u00ef\u00f3\u00f3\u00f5\u00f5\u00fc\u00fc"+
		"\t\2C\\\u00c3\u00c3\u00cb\u00cb\u00cf\u00cf\u00d3\u00d3\u00d5\u00d5\u00dc"+
		"\u00dc\b\2##%(*-/\61>B`a\5\2\f\f\17\17))\4\2\f\f\17\17\5\2\13\f\17\17"+
		"\"\"\2\u01d7\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2"+
		"\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W"+
		"\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2g\3\2\2\2\2i\3\2"+
		"\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2"+
		"\3w\3\2\2\2\5y\3\2\2\2\7{\3\2\2\2\t}\3\2\2\2\13\177\3\2\2\2\r\u0081\3"+
		"\2\2\2\17\u0083\3\2\2\2\21\u0085\3\2\2\2\23\u0087\3\2\2\2\25\u0089\3\2"+
		"\2\2\27\u008b\3\2\2\2\31\u008d\3\2\2\2\33\u008f\3\2\2\2\35\u0092\3\2\2"+
		"\2\37\u0094\3\2\2\2!\u0097\3\2\2\2#\u009a\3\2\2\2%\u009d\3\2\2\2\'\u009f"+
		"\3\2\2\2)\u00a1\3\2\2\2+\u00a3\3\2\2\2-\u00a5\3\2\2\2/\u00a7\3\2\2\2\61"+
		"\u00aa\3\2\2\2\63\u00ad\3\2\2\2\65\u00af\3\2\2\2\67\u00b3\3\2\2\29\u00b9"+
		"\3\2\2\2;\u00bc\3\2\2\2=\u00c1\3\2\2\2?\u00c5\3\2\2\2A\u00ca\3\2\2\2C"+
		"\u00d1\3\2\2\2E\u00d6\3\2\2\2G\u00dd\3\2\2\2I\u00e0\3\2\2\2K\u00e3\3\2"+
		"\2\2M\u00e8\3\2\2\2O\u00ee\3\2\2\2Q\u00f4\3\2\2\2S\u00fc\3\2\2\2U\u011a"+
		"\3\2\2\2W\u0128\3\2\2\2Y\u013a\3\2\2\2[\u014a\3\2\2\2]\u0160\3\2\2\2_"+
		"\u0174\3\2\2\2a\u017f\3\2\2\2c\u0181\3\2\2\2e\u0183\3\2\2\2g\u0187\3\2"+
		"\2\2i\u0192\3\2\2\2k\u0196\3\2\2\2m\u019a\3\2\2\2o\u01a2\3\2\2\2q\u01ad"+
		"\3\2\2\2s\u01bb\3\2\2\2u\u01bf\3\2\2\2wx\t\2\2\2x\4\3\2\2\2yz\t\3\2\2"+
		"z\6\3\2\2\2{|\7*\2\2|\b\3\2\2\2}~\7+\2\2~\n\3\2\2\2\177\u0080\7]\2\2\u0080"+
		"\f\3\2\2\2\u0081\u0082\7_\2\2\u0082\16\3\2\2\2\u0083\u0084\7}\2\2\u0084"+
		"\20\3\2\2\2\u0085\u0086\7\177\2\2\u0086\22\3\2\2\2\u0087\u0088\7=\2\2"+
		"\u0088\24\3\2\2\2\u0089\u008a\7.\2\2\u008a\26\3\2\2\2\u008b\u008c\7?\2"+
		"\2\u008c\30\3\2\2\2\u008d\u008e\7@\2\2\u008e\32\3\2\2\2\u008f\u0090\7"+
		"@\2\2\u0090\u0091\7?\2\2\u0091\34\3\2\2\2\u0092\u0093\7>\2\2\u0093\36"+
		"\3\2\2\2\u0094\u0095\7>\2\2\u0095\u0096\7?\2\2\u0096 \3\2\2\2\u0097\u0098"+
		"\7?\2\2\u0098\u0099\7?\2\2\u0099\"\3\2\2\2\u009a\u009b\7#\2\2\u009b\u009c"+
		"\7?\2\2\u009c$\3\2\2\2\u009d\u009e\7-\2\2\u009e&\3\2\2\2\u009f\u00a0\7"+
		"/\2\2\u00a0(\3\2\2\2\u00a1\u00a2\7,\2\2\u00a2*\3\2\2\2\u00a3\u00a4\7\61"+
		"\2\2\u00a4,\3\2\2\2\u00a5\u00a6\7\'\2\2\u00a6.\3\2\2\2\u00a7\u00a8\7~"+
		"\2\2\u00a8\u00a9\7~\2\2\u00a9\60\3\2\2\2\u00aa\u00ab\7(\2\2\u00ab\u00ac"+
		"\7(\2\2\u00ac\62\3\2\2\2\u00ad\u00ae\7#\2\2\u00ae\64\3\2\2\2\u00af\u00b0"+
		"\7h\2\2\u00b0\u00b1\7q\2\2\u00b1\u00b2\7t\2\2\u00b2\66\3\2\2\2\u00b3\u00b4"+
		"\7y\2\2\u00b4\u00b5\7j\2\2\u00b5\u00b6\7k\2\2\u00b6\u00b7\7n\2\2\u00b7"+
		"\u00b8\7g\2\2\u00b88\3\2\2\2\u00b9\u00ba\7k\2\2\u00ba\u00bb\7h\2\2\u00bb"+
		":\3\2\2\2\u00bc\u00bd\7g\2\2\u00bd\u00be\7n\2\2\u00be\u00bf\7u\2\2\u00bf"+
		"\u00c0\7g\2\2\u00c0<\3\2\2\2\u00c1\u00c2\7k\2\2\u00c2\u00c3\7p\2\2\u00c3"+
		"\u00c4\7v\2\2\u00c4>\3\2\2\2\u00c5\u00c6\7e\2\2\u00c6\u00c7\7j\2\2\u00c7"+
		"\u00c8\7c\2\2\u00c8\u00c9\7t\2\2\u00c9@\3\2\2\2\u00ca\u00cb\7f\2\2\u00cb"+
		"\u00cc\7q\2\2\u00cc\u00cd\7w\2\2\u00cd\u00ce\7d\2\2\u00ce\u00cf\7n\2\2"+
		"\u00cf\u00d0\7g\2\2\u00d0B\3\2\2\2\u00d1\u00d2\7x\2\2\u00d2\u00d3\7q\2"+
		"\2\u00d3\u00d4\7k\2\2\u00d4\u00d5\7f\2\2\u00d5D\3\2\2\2\u00d6\u00d7\7"+
		"t\2\2\u00d7\u00d8\7g\2\2\u00d8\u00d9\7v\2\2\u00d9\u00da\7w\2\2\u00da\u00db"+
		"\7t\2\2\u00db\u00dc\7p\2\2\u00dcF\3\2\2\2\u00dd\u00de\7-\2\2\u00de\u00df"+
		"\7-\2\2\u00dfH\3\2\2\2\u00e0\u00e1\7/\2\2\u00e1\u00e2\7/\2\2\u00e2J\3"+
		"\2\2\2\u00e3\u00e4\7v\2\2\u00e4\u00e5\7t\2\2\u00e5\u00e6\7w\2\2\u00e6"+
		"\u00e7\7g\2\2\u00e7L\3\2\2\2\u00e8\u00e9\7h\2\2\u00e9\u00ea\7c\2\2\u00ea"+
		"\u00eb\7n\2\2\u00eb\u00ec\7u\2\2\u00ec\u00ed\7g\2\2\u00edN\3\2\2\2\u00ee"+
		"\u00ef\7h\2\2\u00ef\u00f0\7n\2\2\u00f0\u00f1\7q\2\2\u00f1\u00f2\7c\2\2"+
		"\u00f2\u00f3\7v\2\2\u00f3P\3\2\2\2\u00f4\u00f5\7u\2\2\u00f5\u00f6\7v\2"+
		"\2\u00f6\u00f7\7t\2\2\u00f7\u00f8\7k\2\2\u00f8\u00f9\7p\2\2\u00f9\u00fa"+
		"\7i\2\2\u00faR\3\2\2\2\u00fb\u00fd\t\4\2\2\u00fc\u00fb\3\2\2\2\u00fd\u00fe"+
		"\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\3\2\2\2\u0100"+
		"\u0102\7B\2\2\u0101\u0103\t\5\2\2\u0102\u0101\3\2\2\2\u0103\u0104\3\2"+
		"\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\3\2\2\2\u0106"+
		"\u0108\7\60\2\2\u0107\u0109\t\2\2\2\u0108\u0107\3\2\2\2\u0109\u010a\3"+
		"\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010bT\3\2\2\2\u010c\u010d"+
		"\7\64\2\2\u010d\u011b\7\62\2\2\u010e\u010f\7\64\2\2\u010f\u011b\7\65\2"+
		"\2\u0110\u0111\7\64\2\2\u0111\u011b\7\66\2\2\u0112\u0113\7\64\2\2\u0113"+
		"\u011b\79\2\2\u0114\u0115\7\65\2\2\u0115\u011b\7\62\2\2\u0116\u0117\7"+
		"\65\2\2\u0117\u011b\7\65\2\2\u0118\u0119\7\65\2\2\u0119\u011b\7\66\2\2"+
		"\u011a\u010c\3\2\2\2\u011a\u010e\3\2\2\2\u011a\u0110\3\2\2\2\u011a\u0112"+
		"\3\2\2\2\u011a\u0114\3\2\2\2\u011a\u0116\3\2\2\2\u011a\u0118\3\2\2\2\u011b"+
		"\u011c\3\2\2\2\u011c\u011d\7/\2\2\u011d\u011e\5\5\3\2\u011e\u011f\5\5"+
		"\3\2\u011f\u0120\5\5\3\2\u0120\u0121\5\5\3\2\u0121\u0122\5\5\3\2\u0122"+
		"\u0123\5\5\3\2\u0123\u0124\5\5\3\2\u0124\u0125\5\5\3\2\u0125\u0126\7/"+
		"\2\2\u0126\u0127\5\5\3\2\u0127V\3\2\2\2\u0128\u0129\5\5\3\2\u0129\u012a"+
		"\5\5\3\2\u012a\u012b\5\5\3\2\u012b\u012c\5\5\3\2\u012c\u012d\5\5\3\2\u012d"+
		"\u012e\5\5\3\2\u012e\u0130\5\5\3\2\u012f\u0131\5\5\3\2\u0130\u012f\3\2"+
		"\2\2\u0130\u0131\3\2\2\2\u0131X\3\2\2\2\u0132\u0133\7\62\2\2\u0133\u013b"+
		"\t\6\2\2\u0134\u0135\7\63\2\2\u0135\u013b\t\3\2\2\u0136\u0137\7\64\2\2"+
		"\u0137\u013b\t\3\2\2\u0138\u0139\7\65\2\2\u0139\u013b\t\7\2\2\u013a\u0132"+
		"\3\2\2\2\u013a\u0134\3\2\2\2\u013a\u0136\3\2\2\2\u013a\u0138\3\2\2\2\u013b"+
		"\u013c\3\2\2\2\u013c\u0141\7\61\2\2\u013d\u013e\7\62\2\2\u013e\u0142\t"+
		"\6\2\2\u013f\u0140\7\63\2\2\u0140\u0142\t\b\2\2\u0141\u013d\3\2\2\2\u0141"+
		"\u013f\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144\7\61\2\2\u0144\u0145\5"+
		"\5\3\2\u0145\u0146\5\5\3\2\u0146\u0147\5\5\3\2\u0147\u0148\5\5\3\2\u0148"+
		"Z\3\2\2\2\u0149\u014b\5\5\3\2\u014a\u0149\3\2\2\2\u014b\u014c\3\2\2\2"+
		"\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0150"+
		"\7\60\2\2\u014f\u0151\5\5\3\2\u0150\u014f\3\2\2\2\u0151\u0152\3\2\2\2"+
		"\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0156"+
		"\7\60\2\2\u0155\u0157\5\5\3\2\u0156\u0155\3\2\2\2\u0157\u0158\3\2\2\2"+
		"\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015c"+
		"\7\60\2\2\u015b\u015d\5\5\3\2\u015c\u015b\3\2\2\2\u015d\u015e\3\2\2\2"+
		"\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f\\\3\2\2\2\u0160\u0161\5"+
		"\5\3\2\u0161\u0162\5\5\3\2\u0162\u0163\5\5\3\2\u0163\u0164\5\5\3\2\u0164"+
		"\u0165\7\"\2\2\u0165\u0166\5\5\3\2\u0166\u0167\5\5\3\2\u0167\u0168\5\5"+
		"\3\2\u0168\u0169\5\5\3\2\u0169\u016a\7\"\2\2\u016a\u016b\5\5\3\2\u016b"+
		"\u016c\5\5\3\2\u016c\u016d\5\5\3\2\u016d\u016e\5\5\3\2\u016e\u016f\7\""+
		"\2\2\u016f\u0170\5\5\3\2\u0170\u0171\5\5\3\2\u0171\u0172\5\5\3\2\u0172"+
		"\u0173\5\5\3\2\u0173^\3\2\2\2\u0174\u017a\7$\2\2\u0175\u0179\n\t\2\2\u0176"+
		"\u0177\7^\2\2\u0177\u0179\13\2\2\2\u0178\u0175\3\2\2\2\u0178\u0176\3\2"+
		"\2\2\u0179\u017c\3\2\2\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b"+
		"\u017d\3\2\2\2\u017c\u017a\3\2\2\2\u017d\u017e\7$\2\2\u017e`\3\2\2\2\u017f"+
		"\u0180\t\n\2\2\u0180b\3\2\2\2\u0181\u0182\t\13\2\2\u0182d\3\2\2\2\u0183"+
		"\u0184\t\f\2\2\u0184f\3\2\2\2\u0185\u0188\5\3\2\2\u0186\u0188\7a\2\2\u0187"+
		"\u0185\3\2\2\2\u0187\u0186\3\2\2\2\u0188\u018e\3\2\2\2\u0189\u018d\5\3"+
		"\2\2\u018a\u018d\5\5\3\2\u018b\u018d\7a\2\2\u018c\u0189\3\2\2\2\u018c"+
		"\u018a\3\2\2\2\u018c\u018b\3\2\2\2\u018d\u0190\3\2\2\2\u018e\u018c\3\2"+
		"\2\2\u018e\u018f\3\2\2\2\u018fh\3\2\2\2\u0190\u018e\3\2\2\2\u0191\u0193"+
		"\5\5\3\2\u0192\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0192\3\2\2\2\u0194"+
		"\u0195\3\2\2\2\u0195j\3\2\2\2\u0196\u0197\5i\65\2\u0197\u0198\7\60\2\2"+
		"\u0198\u0199\5i\65\2\u0199l\3\2\2\2\u019a\u019e\7)\2\2\u019b\u019f\n\r"+
		"\2\2\u019c\u019d\7^\2\2\u019d\u019f\13\2\2\2\u019e\u019b\3\2\2\2\u019e"+
		"\u019c\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a1\7)\2\2\u01a1n\3\2\2\2\u01a2"+
		"\u01a3\7\61\2\2\u01a3\u01a4\7\61\2\2\u01a4\u01a8\3\2\2\2\u01a5\u01a7\n"+
		"\16\2\2\u01a6\u01a5\3\2\2\2\u01a7\u01aa\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8"+
		"\u01a9\3\2\2\2\u01a9\u01ab\3\2\2\2\u01aa\u01a8\3\2\2\2\u01ab\u01ac\b8"+
		"\2\2\u01acp\3\2\2\2\u01ad\u01ae\7\61\2\2\u01ae\u01af\7,\2\2\u01af\u01b3"+
		"\3\2\2\2\u01b0\u01b2\13\2\2\2\u01b1\u01b0\3\2\2\2\u01b2\u01b5\3\2\2\2"+
		"\u01b3\u01b4\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b4\u01b6\3\2\2\2\u01b5\u01b3"+
		"\3\2\2\2\u01b6\u01b7\7,\2\2\u01b7\u01b8\7\61\2\2\u01b8\u01b9\3\2\2\2\u01b9"+
		"\u01ba\b9\2\2\u01bar\3\2\2\2\u01bb\u01bc\t\17\2\2\u01bc\u01bd\3\2\2\2"+
		"\u01bd\u01be\b:\2\2\u01bet\3\2\2\2\u01bf\u01c0\13\2\2\2\u01c0v\3\2\2\2"+
		"\27\2\u00fe\u0104\u010a\u011a\u0130\u013a\u0141\u014c\u0152\u0158\u015e"+
		"\u0178\u017a\u0187\u018c\u018e\u0194\u019e\u01a8\u01b3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}