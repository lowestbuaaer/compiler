// Generated from minisysy.g4 by ANTLR 4.9.2
        //一种action,定义生成的词法语法解析文件的头，当使用java的时候，生成的类需要包名，可以在这里统一定义

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class minisysyLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUMBER=1, HEXADECIMAL_DIGIT=2, NONZERO_DIGIT=3, DIGIT=4, OCTAL_DIGIT=5, 
		HEXADECIMAL_PREFIX=6, HEXADECIMAL_CONST=7, OCTAL_CONST=8, DECIMAL_CONST=9, 
		INDENT=10, FUNCTYPE=11, RETURN=12, LEFT_S=13, RIGHT_S=14, LEFT_L=15, RIGHT_L=16, 
		EXC=17, SPACE=18, ONE_LINE=19, MULTI_LINE=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NUMBER", "HEXADECIMAL_DIGIT", "NONZERO_DIGIT", "DIGIT", "OCTAL_DIGIT", 
			"HEXADECIMAL_PREFIX", "HEXADECIMAL_CONST", "OCTAL_CONST", "DECIMAL_CONST", 
			"INDENT", "FUNCTYPE", "RETURN", "LEFT_S", "RIGHT_S", "LEFT_L", "RIGHT_L", 
			"EXC", "SPACE", "ONE_LINE", "MULTI_LINE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "'main'", 
			"'int'", "'return'", "'('", "')'", "'{'", "'}'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NUMBER", "HEXADECIMAL_DIGIT", "NONZERO_DIGIT", "DIGIT", "OCTAL_DIGIT", 
			"HEXADECIMAL_PREFIX", "HEXADECIMAL_CONST", "OCTAL_CONST", "DECIMAL_CONST", 
			"INDENT", "FUNCTYPE", "RETURN", "LEFT_S", "RIGHT_S", "LEFT_L", "RIGHT_L", 
			"EXC", "SPACE", "ONE_LINE", "MULTI_LINE"
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


	public minisysyLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "minisysy.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u0090\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\5\2/\n\2\3\3\3\3\3\4\3"+
		"\4\3\5\3\5\5\5\67\n\5\3\6\3\6\3\7\3\7\3\7\3\7\5\7?\n\7\3\b\3\b\7\bC\n"+
		"\b\f\b\16\bF\13\b\3\t\3\t\7\tJ\n\t\f\t\16\tM\13\t\3\n\3\n\7\nQ\n\n\f\n"+
		"\16\nT\13\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\6\23"+
		"q\n\23\r\23\16\23r\3\23\3\23\3\24\3\24\3\24\7\24z\n\24\f\24\16\24}\13"+
		"\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\7\25\u0087\n\25\f\25\16\25"+
		"\u008a\13\25\3\25\3\25\3\25\3\25\3\25\4{\u0088\2\26\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26\3\2\5\5\2\62;CHch\5\2\13\f\17\17\"\"\3\2\f\f\2\u0099\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\3.\3\2\2\2\5\60\3\2\2\2\7\62\3\2\2\2\t\66"+
		"\3\2\2\2\138\3\2\2\2\r>\3\2\2\2\17@\3\2\2\2\21G\3\2\2\2\23N\3\2\2\2\25"+
		"U\3\2\2\2\27Z\3\2\2\2\31^\3\2\2\2\33e\3\2\2\2\35g\3\2\2\2\37i\3\2\2\2"+
		"!k\3\2\2\2#m\3\2\2\2%p\3\2\2\2\'v\3\2\2\2)\u0082\3\2\2\2+/\5\23\n\2,/"+
		"\5\21\t\2-/\5\17\b\2.+\3\2\2\2.,\3\2\2\2.-\3\2\2\2/\4\3\2\2\2\60\61\t"+
		"\2\2\2\61\6\3\2\2\2\62\63\4\63;\2\63\b\3\2\2\2\64\67\7\62\2\2\65\67\5"+
		"\7\4\2\66\64\3\2\2\2\66\65\3\2\2\2\67\n\3\2\2\289\4\629\29\f\3\2\2\2:"+
		";\7\62\2\2;?\7z\2\2<=\7\62\2\2=?\7Z\2\2>:\3\2\2\2><\3\2\2\2?\16\3\2\2"+
		"\2@D\5\r\7\2AC\5\5\3\2BA\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2E\20\3\2"+
		"\2\2FD\3\2\2\2GK\7\62\2\2HJ\5\13\6\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3"+
		"\2\2\2L\22\3\2\2\2MK\3\2\2\2NR\5\7\4\2OQ\5\t\5\2PO\3\2\2\2QT\3\2\2\2R"+
		"P\3\2\2\2RS\3\2\2\2S\24\3\2\2\2TR\3\2\2\2UV\7o\2\2VW\7c\2\2WX\7k\2\2X"+
		"Y\7p\2\2Y\26\3\2\2\2Z[\7k\2\2[\\\7p\2\2\\]\7v\2\2]\30\3\2\2\2^_\7t\2\2"+
		"_`\7g\2\2`a\7v\2\2ab\7w\2\2bc\7t\2\2cd\7p\2\2d\32\3\2\2\2ef\7*\2\2f\34"+
		"\3\2\2\2gh\7+\2\2h\36\3\2\2\2ij\7}\2\2j \3\2\2\2kl\7\177\2\2l\"\3\2\2"+
		"\2mn\7=\2\2n$\3\2\2\2oq\t\3\2\2po\3\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2"+
		"\2st\3\2\2\2tu\b\23\2\2u&\3\2\2\2vw\7\61\2\2w{\7\61\2\2xz\n\4\2\2yx\3"+
		"\2\2\2z}\3\2\2\2{|\3\2\2\2{y\3\2\2\2|~\3\2\2\2}{\3\2\2\2~\177\7\f\2\2"+
		"\177\u0080\3\2\2\2\u0080\u0081\b\24\2\2\u0081(\3\2\2\2\u0082\u0083\7\61"+
		"\2\2\u0083\u0084\7,\2\2\u0084\u0088\3\2\2\2\u0085\u0087\13\2\2\2\u0086"+
		"\u0085\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0089\3\2\2\2\u0088\u0086\3\2"+
		"\2\2\u0089\u008b\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008c\7,\2\2\u008c"+
		"\u008d\7\61\2\2\u008d\u008e\3\2\2\2\u008e\u008f\b\25\2\2\u008f*\3\2\2"+
		"\2\f\2.\66>DKRr{\u0088\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}