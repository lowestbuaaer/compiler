// Generated from minisysy.g4 by ANTLR 4.9.2
        //一种action,定义生成的词法语法解析文件的头，当使用java的时候，生成的类需要包名，可以在这里统一定义
 package antlr;
 
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class minisysyParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUMBER=1, HEXADECIMAL_DIGIT=2, NONZERO_DIGIT=3, DIGIT=4, OCTAL_DIGIT=5, 
		HEXADECIMAL_PREFIX=6, HEXADECIMAL_CONST=7, OCTAL_CONST=8, DECIMAL_CONST=9, 
		INDENT=10, FUNCTYPE=11, RETURN=12, LEFT_S=13, RIGHT_S=14, LEFT_L=15, RIGHT_L=16, 
		EXC=17, SPACE=18, ONE_LINE=19, MULTI_LINE=20;
	public static final int
		RULE_stmt = 0, RULE_block = 1, RULE_funcdef = 2, RULE_comunit = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"stmt", "block", "funcdef", "comunit"
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

	@Override
	public String getGrammarFileName() { return "minisysy.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public minisysyParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(minisysyParser.RETURN, 0); }
		public TerminalNode NUMBER() { return getToken(minisysyParser.NUMBER, 0); }
		public TerminalNode EXC() { return getToken(minisysyParser.EXC, 0); }
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minisysyListener ) ((minisysyListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minisysyListener ) ((minisysyListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minisysyVisitor ) return ((minisysyVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			match(RETURN);
			setState(9);
			match(NUMBER);
			setState(10);
			match(EXC);
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LEFT_L() { return getToken(minisysyParser.LEFT_L, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode RIGHT_L() { return getToken(minisysyParser.RIGHT_L, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minisysyListener ) ((minisysyListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minisysyListener ) ((minisysyListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minisysyVisitor ) return ((minisysyVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			match(LEFT_L);
			setState(13);
			stmt();
			setState(14);
			match(RIGHT_L);
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

	public static class FuncdefContext extends ParserRuleContext {
		public TerminalNode FUNCTYPE() { return getToken(minisysyParser.FUNCTYPE, 0); }
		public TerminalNode INDENT() { return getToken(minisysyParser.INDENT, 0); }
		public TerminalNode LEFT_S() { return getToken(minisysyParser.LEFT_S, 0); }
		public TerminalNode RIGHT_S() { return getToken(minisysyParser.RIGHT_S, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FuncdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcdef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minisysyListener ) ((minisysyListener)listener).enterFuncdef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minisysyListener ) ((minisysyListener)listener).exitFuncdef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minisysyVisitor ) return ((minisysyVisitor<? extends T>)visitor).visitFuncdef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncdefContext funcdef() throws RecognitionException {
		FuncdefContext _localctx = new FuncdefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_funcdef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			match(FUNCTYPE);
			setState(17);
			match(INDENT);
			setState(18);
			match(LEFT_S);
			setState(19);
			match(RIGHT_S);
			setState(20);
			block();
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

	public static class ComunitContext extends ParserRuleContext {
		public FuncdefContext funcdef() {
			return getRuleContext(FuncdefContext.class,0);
		}
		public ComunitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comunit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minisysyListener ) ((minisysyListener)listener).enterComunit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minisysyListener ) ((minisysyListener)listener).exitComunit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minisysyVisitor ) return ((minisysyVisitor<? extends T>)visitor).visitComunit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComunitContext comunit() throws RecognitionException {
		ComunitContext _localctx = new ComunitContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_comunit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			funcdef();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26\33\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\2\2\6\2\4\6\b\2\2\2\26\2\n\3\2\2\2\4\16\3\2\2\2\6\22"+
		"\3\2\2\2\b\30\3\2\2\2\n\13\7\16\2\2\13\f\7\3\2\2\f\r\7\23\2\2\r\3\3\2"+
		"\2\2\16\17\7\21\2\2\17\20\5\2\2\2\20\21\7\22\2\2\21\5\3\2\2\2\22\23\7"+
		"\r\2\2\23\24\7\f\2\2\24\25\7\17\2\2\25\26\7\20\2\2\26\27\5\4\3\2\27\7"+
		"\3\2\2\2\30\31\5\6\4\2\31\t\3\2\2\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}