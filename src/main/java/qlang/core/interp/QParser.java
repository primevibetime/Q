// Generated from /Users/harrymarlowe/Documents/GitHub/Q/src/main/java/qlang/core/internal/Q.g4 by ANTLR 4.10.1
package qlang.core.interp;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class QParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, Println=14, Async=15, Var=16, Import=17, 
		Print=18, Input=19, Assert=20, Function=21, If=22, Else=23, Package=24, 
		Return=25, For=26, While=27, JavaJuice=28, To=29, Do=30, End=31, In=32, 
		Null=33, Try=34, Class=35, Const=36, Self=37, Native=38, Or=39, Accessor=40, 
		And=41, Equals=42, NEquals=43, GTEquals=44, LTEquals=45, Pow=46, Excl=47, 
		GT=48, LT=49, Add=50, Subtract=51, Multiply=52, Divide=53, Modulus=54, 
		OBrace=55, CBrace=56, OBracket=57, CBracket=58, OParen=59, CParen=60, 
		SColon=61, Assign=62, Comma=63, QMark=64, Colon=65, Bool=66, Number=67, 
		Identifier=68, Identifier2=69, String=70, Comment=71, Space=72;
	public static final int
		RULE_parse = 0, RULE_block = 1, RULE_statement = 2, RULE_reAssignment = 3, 
		RULE_assignment = 4, RULE_functionCall = 5, RULE_allImport = 6, RULE_objFunctionCall = 7, 
		RULE_folderImport = 8, RULE_packageStatement = 9, RULE_header = 10, RULE_ifStatement = 11, 
		RULE_ifStat = 12, RULE_hereStatement = 13, RULE_varHereStatement = 14, 
		RULE_elseIfStat = 15, RULE_constructorStatement = 16, RULE_objCreateStatement = 17, 
		RULE_sysFunctionCall = 18, RULE_fileWriteStatement = 19, RULE_elseStat = 20, 
		RULE_functionDecl = 21, RULE_nativeFunction = 22, RULE_forStatement = 23, 
		RULE_forInStatement = 24, RULE_importStatement = 25, RULE_anonymousFunction = 26, 
		RULE_importFromGithubStatement = 27, RULE_importAllStatement = 28, RULE_atStatement = 29, 
		RULE_tryCatchStatement = 30, RULE_whileStatement = 31, RULE_mainFunctionStatement = 32, 
		RULE_idList = 33, RULE_javaMethodReference = 34, RULE_classStatement = 35, 
		RULE_exprList = 36, RULE_expression = 37, RULE_list = 38, RULE_objVar = 39, 
		RULE_indexes = 40;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "block", "statement", "reAssignment", "assignment", "functionCall", 
			"allImport", "objFunctionCall", "folderImport", "packageStatement", "header", 
			"ifStatement", "ifStat", "hereStatement", "varHereStatement", "elseIfStat", 
			"constructorStatement", "objCreateStatement", "sysFunctionCall", "fileWriteStatement", 
			"elseStat", "functionDecl", "nativeFunction", "forStatement", "forInStatement", 
			"importStatement", "anonymousFunction", "importFromGithubStatement", 
			"importAllStatement", "atStatement", "tryCatchStatement", "whileStatement", 
			"mainFunctionStatement", "idList", "javaMethodReference", "classStatement", 
			"exprList", "expression", "list", "objVar", "indexes"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'#'", "'.'", "'@'", "'header'", "'cn'", "'new'", "'as'", "'sys'", 
			"'i3v8wm08wxpudwty0'", "'range'", "'except'", "'main'", "'3YCMPJ8W8VVTUA48TIHR8K332PYKTXOKVDFG'", 
			null, "'async'", "'var'", "'import'", null, null, "'assert'", "'fn'", 
			"'if'", "'else'", "'namespace'", "'return'", "'for'", "'while'", "'Java'", 
			"'to'", "'do'", "'end'", "'in'", "'null'", "'try'", "'class'", "'const'", 
			"'self'", "'native'", "'||'", "'::'", "'&&'", "'=='", "'!='", "'>='", 
			"'<='", "'^'", "'!'", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'%'", 
			"'{'", "'}'", "'['", "']'", "'('", "')'", "';'", "'='", "','", "'?'", 
			"':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "Println", "Async", "Var", "Import", "Print", "Input", "Assert", 
			"Function", "If", "Else", "Package", "Return", "For", "While", "JavaJuice", 
			"To", "Do", "End", "In", "Null", "Try", "Class", "Const", "Self", "Native", 
			"Or", "Accessor", "And", "Equals", "NEquals", "GTEquals", "LTEquals", 
			"Pow", "Excl", "GT", "LT", "Add", "Subtract", "Multiply", "Divide", "Modulus", 
			"OBrace", "CBrace", "OBracket", "CBracket", "OParen", "CParen", "SColon", 
			"Assign", "Comma", "QMark", "Colon", "Bool", "Number", "Identifier", 
			"Identifier2", "String", "Comment", "Space"
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
	public String getGrammarFileName() { return "Q.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public QParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ParseContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(QParser.EOF, 0); }
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public PackageStatementContext packageStatement() {
			return getRuleContext(PackageStatementContext.class,0);
		}
		public List<AllImportContext> allImport() {
			return getRuleContexts(AllImportContext.class);
		}
		public AllImportContext allImport(int i) {
			return getRuleContext(AllImportContext.class,i);
		}
		public List<TerminalNode> SColon() { return getTokens(QParser.SColon); }
		public TerminalNode SColon(int i) {
			return getToken(QParser.SColon, i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(82);
				header();
				}
				break;
			}
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Package) {
				{
				setState(85);
				packageStatement();
				}
			}

			setState(93);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(88);
					allImport();
					setState(89);
					match(SColon);
					}
					} 
				}
				setState(95);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(96);
			block();
			setState(97);
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<FunctionDeclContext> functionDecl() {
			return getRuleContexts(FunctionDeclContext.class);
		}
		public FunctionDeclContext functionDecl(int i) {
			return getRuleContext(FunctionDeclContext.class,i);
		}
		public TerminalNode Return() { return getToken(QParser.Return, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SColon() { return getToken(QParser.SColon, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__7) | (1L << Println) | (1L << Async) | (1L << Var) | (1L << Print) | (1L << Assert) | (1L << Function) | (1L << If) | (1L << For) | (1L << While) | (1L << JavaJuice) | (1L << Try) | (1L << Class) | (1L << Const) | (1L << Self) | (1L << Native))) != 0) || _la==Identifier) {
				{
				setState(101);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(99);
					statement();
					}
					break;
				case 2:
					{
					setState(100);
					functionDecl();
					}
					break;
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Return) {
				{
				setState(106);
				match(Return);
				setState(107);
				expression(0);
				setState(108);
				match(SColon);
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

	public static class StatementContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode SColon() { return getToken(QParser.SColon, 0); }
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public ForInStatementContext forInStatement() {
			return getRuleContext(ForInStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public TryCatchStatementContext tryCatchStatement() {
			return getRuleContext(TryCatchStatementContext.class,0);
		}
		public MainFunctionStatementContext mainFunctionStatement() {
			return getRuleContext(MainFunctionStatementContext.class,0);
		}
		public ReAssignmentContext reAssignment() {
			return getRuleContext(ReAssignmentContext.class,0);
		}
		public ClassStatementContext classStatement() {
			return getRuleContext(ClassStatementContext.class,0);
		}
		public ConstructorStatementContext constructorStatement() {
			return getRuleContext(ConstructorStatementContext.class,0);
		}
		public FileWriteStatementContext fileWriteStatement() {
			return getRuleContext(FileWriteStatementContext.class,0);
		}
		public ObjFunctionCallContext objFunctionCall() {
			return getRuleContext(ObjFunctionCallContext.class,0);
		}
		public ObjCreateStatementContext objCreateStatement() {
			return getRuleContext(ObjCreateStatementContext.class,0);
		}
		public SysFunctionCallContext sysFunctionCall() {
			return getRuleContext(SysFunctionCallContext.class,0);
		}
		public AnonymousFunctionContext anonymousFunction() {
			return getRuleContext(AnonymousFunctionContext.class,0);
		}
		public HereStatementContext hereStatement() {
			return getRuleContext(HereStatementContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public NativeFunctionContext nativeFunction() {
			return getRuleContext(NativeFunctionContext.class,0);
		}
		public JavaMethodReferenceContext javaMethodReference() {
			return getRuleContext(JavaMethodReferenceContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		int _la;
		try {
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				functionCall();
				setState(113);
				match(SColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				ifStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(116);
				forStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(117);
				forInStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(118);
				whileStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(119);
				tryCatchStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(120);
				mainFunctionStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(121);
				reAssignment();
				setState(122);
				match(SColon);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(124);
				classStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(125);
				constructorStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(126);
				fileWriteStatement();
				setState(127);
				match(SColon);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(129);
				objFunctionCall();
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SColon) {
					{
					setState(130);
					match(SColon);
					}
				}

				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(133);
				objCreateStatement();
				setState(134);
				match(SColon);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(136);
				sysFunctionCall();
				setState(137);
				match(SColon);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(139);
				anonymousFunction();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(140);
				hereStatement();
				setState(141);
				match(SColon);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(143);
				assignment();
				setState(144);
				match(SColon);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(146);
				nativeFunction();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(147);
				javaMethodReference();
				setState(148);
				match(SColon);
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

	public static class ReAssignmentContext extends ParserRuleContext {
		public TerminalNode Assign() { return getToken(QParser.Assign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(QParser.Identifier, 0); }
		public ObjVarContext objVar() {
			return getRuleContext(ObjVarContext.class,0);
		}
		public IndexesContext indexes() {
			return getRuleContext(IndexesContext.class,0);
		}
		public ReAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterReAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitReAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitReAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReAssignmentContext reAssignment() throws RecognitionException {
		ReAssignmentContext _localctx = new ReAssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_reAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(152);
				match(Identifier);
				}
				break;
			case 2:
				{
				setState(153);
				objVar();
				}
				break;
			}
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OBracket) {
				{
				setState(156);
				indexes();
				}
			}

			setState(159);
			match(Assign);
			setState(160);
			expression(0);
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(QParser.Identifier, 0); }
		public TerminalNode Const() { return getToken(QParser.Const, 0); }
		public TerminalNode Var() { return getToken(QParser.Var, 0); }
		public TerminalNode Assign() { return getToken(QParser.Assign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IndexesContext indexes() {
			return getRuleContext(IndexesContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_la = _input.LA(1);
			if ( !(_la==Var || _la==Const) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(163);
			match(Identifier);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OBracket || _la==Assign) {
				{
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OBracket) {
					{
					setState(164);
					indexes();
					}
				}

				setState(167);
				match(Assign);
				setState(168);
				expression(0);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	 
		public FunctionCallContext() { }
		public void copyFrom(FunctionCallContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssertFunctionCallContext extends FunctionCallContext {
		public TerminalNode Assert() { return getToken(QParser.Assert, 0); }
		public TerminalNode OParen() { return getToken(QParser.OParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CParen() { return getToken(QParser.CParen, 0); }
		public AssertFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterAssertFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitAssertFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitAssertFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintlnFunctionCallContext extends FunctionCallContext {
		public TerminalNode Println() { return getToken(QParser.Println, 0); }
		public TerminalNode OParen() { return getToken(QParser.OParen, 0); }
		public TerminalNode CParen() { return getToken(QParser.CParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintlnFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterPrintlnFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitPrintlnFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitPrintlnFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ObjFunctionCallExpressionContext extends FunctionCallContext {
		public List<TerminalNode> Identifier() { return getTokens(QParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(QParser.Identifier, i);
		}
		public TerminalNode Accessor() { return getToken(QParser.Accessor, 0); }
		public TerminalNode OParen() { return getToken(QParser.OParen, 0); }
		public TerminalNode CParen() { return getToken(QParser.CParen, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public ObjFunctionCallExpressionContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterObjFunctionCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitObjFunctionCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitObjFunctionCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierFunctionCallContext extends FunctionCallContext {
		public TerminalNode Identifier() { return getToken(QParser.Identifier, 0); }
		public TerminalNode OParen() { return getToken(QParser.OParen, 0); }
		public TerminalNode CParen() { return getToken(QParser.CParen, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public IdentifierFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterIdentifierFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitIdentifierFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitIdentifierFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintFunctionCallContext extends FunctionCallContext {
		public TerminalNode Print() { return getToken(QParser.Print, 0); }
		public TerminalNode OParen() { return getToken(QParser.OParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CParen() { return getToken(QParser.CParen, 0); }
		public PrintFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterPrintFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitPrintFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitPrintFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionCall);
		int _la;
		try {
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new IdentifierFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				match(Identifier);
				setState(172);
				match(OParen);
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (T__12 - 13)) | (1L << (Println - 13)) | (1L << (Print - 13)) | (1L << (Input - 13)) | (1L << (Assert - 13)) | (1L << (Function - 13)) | (1L << (Null - 13)) | (1L << (Self - 13)) | (1L << (Excl - 13)) | (1L << (Subtract - 13)) | (1L << (OBracket - 13)) | (1L << (OParen - 13)) | (1L << (Bool - 13)) | (1L << (Number - 13)) | (1L << (Identifier - 13)) | (1L << (String - 13)))) != 0)) {
					{
					setState(173);
					exprList();
					}
				}

				setState(176);
				match(CParen);
				}
				break;
			case 2:
				_localctx = new PrintlnFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				match(Println);
				setState(178);
				match(OParen);
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (T__12 - 13)) | (1L << (Println - 13)) | (1L << (Print - 13)) | (1L << (Input - 13)) | (1L << (Assert - 13)) | (1L << (Function - 13)) | (1L << (Null - 13)) | (1L << (Self - 13)) | (1L << (Excl - 13)) | (1L << (Subtract - 13)) | (1L << (OBracket - 13)) | (1L << (OParen - 13)) | (1L << (Bool - 13)) | (1L << (Number - 13)) | (1L << (Identifier - 13)) | (1L << (String - 13)))) != 0)) {
					{
					setState(179);
					expression(0);
					}
				}

				setState(182);
				match(CParen);
				}
				break;
			case 3:
				_localctx = new PrintFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(183);
				match(Print);
				setState(184);
				match(OParen);
				setState(185);
				expression(0);
				setState(186);
				match(CParen);
				}
				break;
			case 4:
				_localctx = new AssertFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(188);
				match(Assert);
				setState(189);
				match(OParen);
				setState(190);
				expression(0);
				setState(191);
				match(CParen);
				}
				break;
			case 5:
				_localctx = new ObjFunctionCallExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(193);
				match(Identifier);
				setState(194);
				match(Accessor);
				setState(195);
				match(Identifier);
				setState(196);
				match(OParen);
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (T__12 - 13)) | (1L << (Println - 13)) | (1L << (Print - 13)) | (1L << (Input - 13)) | (1L << (Assert - 13)) | (1L << (Function - 13)) | (1L << (Null - 13)) | (1L << (Self - 13)) | (1L << (Excl - 13)) | (1L << (Subtract - 13)) | (1L << (OBracket - 13)) | (1L << (OParen - 13)) | (1L << (Bool - 13)) | (1L << (Number - 13)) | (1L << (Identifier - 13)) | (1L << (String - 13)))) != 0)) {
					{
					setState(197);
					exprList();
					}
				}

				setState(200);
				match(CParen);
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

	public static class AllImportContext extends ParserRuleContext {
		public AllImportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allImport; }
	 
		public AllImportContext() { }
		public void copyFrom(AllImportContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FileSystemImportStatementContext extends AllImportContext {
		public ImportStatementContext importStatement() {
			return getRuleContext(ImportStatementContext.class,0);
		}
		public FileSystemImportStatementContext(AllImportContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterFileSystemImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitFileSystemImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitFileSystemImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GithubImportStatementContext extends AllImportContext {
		public ImportFromGithubStatementContext importFromGithubStatement() {
			return getRuleContext(ImportFromGithubStatementContext.class,0);
		}
		public GithubImportStatementContext(AllImportContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterGithubImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitGithubImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitGithubImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FolderImportStatementContext extends AllImportContext {
		public FolderImportContext folderImport() {
			return getRuleContext(FolderImportContext.class,0);
		}
		public FolderImportStatementContext(AllImportContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterFolderImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitFolderImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitFolderImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ImportAllContext extends AllImportContext {
		public ImportAllStatementContext importAllStatement() {
			return getRuleContext(ImportAllStatementContext.class,0);
		}
		public ImportAllContext(AllImportContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterImportAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitImportAll(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitImportAll(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AllImportContext allImport() throws RecognitionException {
		AllImportContext _localctx = new AllImportContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_allImport);
		try {
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new FileSystemImportStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				importStatement();
				}
				break;
			case 2:
				_localctx = new GithubImportStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				importFromGithubStatement();
				}
				break;
			case 3:
				_localctx = new ImportAllContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(205);
				importAllStatement();
				}
				break;
			case 4:
				_localctx = new FolderImportStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(206);
				folderImport();
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

	public static class ObjFunctionCallContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(QParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(QParser.Identifier, i);
		}
		public TerminalNode Accessor() { return getToken(QParser.Accessor, 0); }
		public TerminalNode OParen() { return getToken(QParser.OParen, 0); }
		public TerminalNode CParen() { return getToken(QParser.CParen, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public ObjFunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objFunctionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterObjFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitObjFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitObjFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjFunctionCallContext objFunctionCall() throws RecognitionException {
		ObjFunctionCallContext _localctx = new ObjFunctionCallContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_objFunctionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(Identifier);
			setState(210);
			match(Accessor);
			setState(211);
			match(Identifier);
			setState(212);
			match(OParen);
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (T__12 - 13)) | (1L << (Println - 13)) | (1L << (Print - 13)) | (1L << (Input - 13)) | (1L << (Assert - 13)) | (1L << (Function - 13)) | (1L << (Null - 13)) | (1L << (Self - 13)) | (1L << (Excl - 13)) | (1L << (Subtract - 13)) | (1L << (OBracket - 13)) | (1L << (OParen - 13)) | (1L << (Bool - 13)) | (1L << (Number - 13)) | (1L << (Identifier - 13)) | (1L << (String - 13)))) != 0)) {
				{
				setState(213);
				exprList();
				}
			}

			setState(216);
			match(CParen);
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

	public static class FolderImportContext extends ParserRuleContext {
		public TerminalNode Import() { return getToken(QParser.Import, 0); }
		public TerminalNode OBracket() { return getToken(QParser.OBracket, 0); }
		public List<TerminalNode> Identifier() { return getTokens(QParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(QParser.Identifier, i);
		}
		public TerminalNode CBracket() { return getToken(QParser.CBracket, 0); }
		public FolderImportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_folderImport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterFolderImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitFolderImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitFolderImport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FolderImportContext folderImport() throws RecognitionException {
		FolderImportContext _localctx = new FolderImportContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_folderImport);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(T__0);
			setState(219);
			match(Import);
			setState(220);
			match(OBracket);
			setState(221);
			match(Identifier);
			setState(226);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(222);
					match(T__1);
					setState(223);
					match(Identifier);
					}
					} 
				}
				setState(228);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(229);
			match(CBracket);
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

	public static class PackageStatementContext extends ParserRuleContext {
		public TerminalNode Package() { return getToken(QParser.Package, 0); }
		public List<TerminalNode> Identifier() { return getTokens(QParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(QParser.Identifier, i);
		}
		public TerminalNode SColon() { return getToken(QParser.SColon, 0); }
		public PackageStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterPackageStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitPackageStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitPackageStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageStatementContext packageStatement() throws RecognitionException {
		PackageStatementContext _localctx = new PackageStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_packageStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(Package);
			setState(232);
			match(Identifier);
			setState(237);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(233);
					match(T__1);
					setState(234);
					match(Identifier);
					}
					} 
				}
				setState(239);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(240);
			match(SColon);
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

	public static class HeaderContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(QParser.Identifier, 0); }
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(T__2);
			setState(243);
			match(T__3);
			setState(244);
			match(Identifier);
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

	public static class IfStatementContext extends ParserRuleContext {
		public IfStatContext ifStat() {
			return getRuleContext(IfStatContext.class,0);
		}
		public TerminalNode End() { return getToken(QParser.End, 0); }
		public List<ElseIfStatContext> elseIfStat() {
			return getRuleContexts(ElseIfStatContext.class);
		}
		public ElseIfStatContext elseIfStat(int i) {
			return getRuleContext(ElseIfStatContext.class,i);
		}
		public ElseStatContext elseStat() {
			return getRuleContext(ElseStatContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			ifStat();
			setState(250);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(247);
					elseIfStat();
					}
					} 
				}
				setState(252);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(253);
				elseStat();
				}
			}

			setState(256);
			match(End);
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

	public static class IfStatContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(QParser.If, 0); }
		public TerminalNode OParen() { return getToken(QParser.OParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CParen() { return getToken(QParser.CParen, 0); }
		public TerminalNode Colon() { return getToken(QParser.Colon, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterIfStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitIfStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitIfStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatContext ifStat() throws RecognitionException {
		IfStatContext _localctx = new IfStatContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ifStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(If);
			setState(259);
			match(OParen);
			setState(260);
			expression(0);
			setState(261);
			match(CParen);
			setState(262);
			match(Colon);
			setState(263);
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

	public static class HereStatementContext extends ParserRuleContext {
		public TerminalNode Self() { return getToken(QParser.Self, 0); }
		public TerminalNode Accessor() { return getToken(QParser.Accessor, 0); }
		public TerminalNode Identifier() { return getToken(QParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(QParser.Assign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public HereStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hereStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterHereStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitHereStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitHereStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HereStatementContext hereStatement() throws RecognitionException {
		HereStatementContext _localctx = new HereStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_hereStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(Self);
			setState(266);
			match(Accessor);
			setState(267);
			match(Identifier);
			setState(268);
			match(Assign);
			setState(269);
			expression(0);
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

	public static class VarHereStatementContext extends ParserRuleContext {
		public TerminalNode Self() { return getToken(QParser.Self, 0); }
		public TerminalNode Accessor() { return getToken(QParser.Accessor, 0); }
		public TerminalNode Identifier() { return getToken(QParser.Identifier, 0); }
		public VarHereStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varHereStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterVarHereStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitVarHereStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitVarHereStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarHereStatementContext varHereStatement() throws RecognitionException {
		VarHereStatementContext _localctx = new VarHereStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_varHereStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(Self);
			setState(272);
			match(Accessor);
			setState(273);
			match(Identifier);
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

	public static class ElseIfStatContext extends ParserRuleContext {
		public TerminalNode Else() { return getToken(QParser.Else, 0); }
		public TerminalNode If() { return getToken(QParser.If, 0); }
		public TerminalNode OParen() { return getToken(QParser.OParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CParen() { return getToken(QParser.CParen, 0); }
		public TerminalNode Colon() { return getToken(QParser.Colon, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseIfStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterElseIfStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitElseIfStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitElseIfStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfStatContext elseIfStat() throws RecognitionException {
		ElseIfStatContext _localctx = new ElseIfStatContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_elseIfStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(Else);
			setState(276);
			match(If);
			setState(277);
			match(OParen);
			setState(278);
			expression(0);
			setState(279);
			match(CParen);
			setState(280);
			match(Colon);
			setState(281);
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

	public static class ConstructorStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(QParser.Identifier, 0); }
		public TerminalNode OParen() { return getToken(QParser.OParen, 0); }
		public TerminalNode CParen() { return getToken(QParser.CParen, 0); }
		public TerminalNode Colon() { return getToken(QParser.Colon, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode End() { return getToken(QParser.End, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public ConstructorStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterConstructorStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitConstructorStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitConstructorStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorStatementContext constructorStatement() throws RecognitionException {
		ConstructorStatementContext _localctx = new ConstructorStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_constructorStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(T__4);
			setState(284);
			match(Identifier);
			setState(285);
			match(OParen);
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (T__12 - 13)) | (1L << (Println - 13)) | (1L << (Print - 13)) | (1L << (Input - 13)) | (1L << (Assert - 13)) | (1L << (Function - 13)) | (1L << (Null - 13)) | (1L << (Self - 13)) | (1L << (Excl - 13)) | (1L << (Subtract - 13)) | (1L << (OBracket - 13)) | (1L << (OParen - 13)) | (1L << (Bool - 13)) | (1L << (Number - 13)) | (1L << (Identifier - 13)) | (1L << (String - 13)))) != 0)) {
				{
				setState(286);
				exprList();
				}
			}

			setState(289);
			match(CParen);
			setState(290);
			match(Colon);
			setState(291);
			block();
			setState(292);
			match(End);
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

	public static class ObjCreateStatementContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(QParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(QParser.Identifier, i);
		}
		public TerminalNode OParen() { return getToken(QParser.OParen, 0); }
		public TerminalNode CParen() { return getToken(QParser.CParen, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public ObjCreateStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objCreateStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterObjCreateStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitObjCreateStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitObjCreateStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjCreateStatementContext objCreateStatement() throws RecognitionException {
		ObjCreateStatementContext _localctx = new ObjCreateStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_objCreateStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(T__5);
			setState(295);
			match(Identifier);
			setState(296);
			match(T__6);
			setState(297);
			match(Identifier);
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OParen) {
				{
				setState(298);
				match(OParen);
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (T__12 - 13)) | (1L << (Println - 13)) | (1L << (Print - 13)) | (1L << (Input - 13)) | (1L << (Assert - 13)) | (1L << (Function - 13)) | (1L << (Null - 13)) | (1L << (Self - 13)) | (1L << (Excl - 13)) | (1L << (Subtract - 13)) | (1L << (OBracket - 13)) | (1L << (OParen - 13)) | (1L << (Bool - 13)) | (1L << (Number - 13)) | (1L << (Identifier - 13)) | (1L << (String - 13)))) != 0)) {
					{
					setState(299);
					exprList();
					}
				}

				setState(302);
				match(CParen);
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

	public static class SysFunctionCallContext extends ParserRuleContext {
		public TerminalNode Accessor() { return getToken(QParser.Accessor, 0); }
		public TerminalNode Identifier() { return getToken(QParser.Identifier, 0); }
		public TerminalNode OParen() { return getToken(QParser.OParen, 0); }
		public TerminalNode CParen() { return getToken(QParser.CParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SysFunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sysFunctionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterSysFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitSysFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitSysFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SysFunctionCallContext sysFunctionCall() throws RecognitionException {
		SysFunctionCallContext _localctx = new SysFunctionCallContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_sysFunctionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(T__7);
			setState(306);
			match(Accessor);
			setState(307);
			match(Identifier);
			setState(308);
			match(OParen);
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (T__12 - 13)) | (1L << (Println - 13)) | (1L << (Print - 13)) | (1L << (Input - 13)) | (1L << (Assert - 13)) | (1L << (Function - 13)) | (1L << (Null - 13)) | (1L << (Self - 13)) | (1L << (Excl - 13)) | (1L << (Subtract - 13)) | (1L << (OBracket - 13)) | (1L << (OParen - 13)) | (1L << (Bool - 13)) | (1L << (Number - 13)) | (1L << (Identifier - 13)) | (1L << (String - 13)))) != 0)) {
				{
				setState(309);
				expression(0);
				}
			}

			setState(312);
			match(CParen);
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

	public static class FileWriteStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(QParser.Identifier, 0); }
		public TerminalNode Accessor() { return getToken(QParser.Accessor, 0); }
		public TerminalNode OParen() { return getToken(QParser.OParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CParen() { return getToken(QParser.CParen, 0); }
		public FileWriteStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileWriteStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterFileWriteStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitFileWriteStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitFileWriteStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileWriteStatementContext fileWriteStatement() throws RecognitionException {
		FileWriteStatementContext _localctx = new FileWriteStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_fileWriteStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(Identifier);
			setState(315);
			match(Accessor);
			setState(316);
			match(T__8);
			setState(317);
			match(OParen);
			setState(318);
			expression(0);
			setState(319);
			match(CParen);
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

	public static class ElseStatContext extends ParserRuleContext {
		public TerminalNode Else() { return getToken(QParser.Else, 0); }
		public TerminalNode Colon() { return getToken(QParser.Colon, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterElseStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitElseStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitElseStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatContext elseStat() throws RecognitionException {
		ElseStatContext _localctx = new ElseStatContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_elseStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(Else);
			setState(322);
			match(Colon);
			setState(323);
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

	public static class FunctionDeclContext extends ParserRuleContext {
		public TerminalNode Function() { return getToken(QParser.Function, 0); }
		public TerminalNode Identifier() { return getToken(QParser.Identifier, 0); }
		public TerminalNode OParen() { return getToken(QParser.OParen, 0); }
		public TerminalNode CParen() { return getToken(QParser.CParen, 0); }
		public TerminalNode Colon() { return getToken(QParser.Colon, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode End() { return getToken(QParser.End, 0); }
		public TerminalNode Async() { return getToken(QParser.Async, 0); }
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public FunctionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterFunctionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitFunctionDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitFunctionDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclContext functionDecl() throws RecognitionException {
		FunctionDeclContext _localctx = new FunctionDeclContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_functionDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Async) {
				{
				setState(325);
				match(Async);
				}
			}

			setState(328);
			match(Function);
			setState(329);
			match(Identifier);
			setState(330);
			match(OParen);
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(331);
				idList();
				}
			}

			setState(334);
			match(CParen);
			setState(335);
			match(Colon);
			setState(336);
			block();
			setState(337);
			match(End);
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

	public static class NativeFunctionContext extends ParserRuleContext {
		public TerminalNode Native() { return getToken(QParser.Native, 0); }
		public TerminalNode Function() { return getToken(QParser.Function, 0); }
		public List<TerminalNode> Identifier() { return getTokens(QParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(QParser.Identifier, i);
		}
		public TerminalNode OBrace() { return getToken(QParser.OBrace, 0); }
		public TerminalNode CBrace() { return getToken(QParser.CBrace, 0); }
		public TerminalNode OBracket() { return getToken(QParser.OBracket, 0); }
		public TerminalNode CBracket() { return getToken(QParser.CBracket, 0); }
		public List<TerminalNode> String() { return getTokens(QParser.String); }
		public TerminalNode String(int i) {
			return getToken(QParser.String, i);
		}
		public NativeFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nativeFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterNativeFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitNativeFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitNativeFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NativeFunctionContext nativeFunction() throws RecognitionException {
		NativeFunctionContext _localctx = new NativeFunctionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_nativeFunction);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(Native);
			setState(340);
			match(Function);
			setState(341);
			match(Identifier);
			setState(342);
			match(OBrace);
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OBracket) {
				{
				setState(343);
				match(OBracket);
				setState(344);
				match(Identifier);
				setState(345);
				match(CBracket);
				}
			}

			setState(351);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(348);
					match(String);
					}
					} 
				}
				setState(353);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(354);
			match(CBrace);
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

	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode For() { return getToken(QParser.For, 0); }
		public TerminalNode OParen() { return getToken(QParser.OParen, 0); }
		public TerminalNode Identifier() { return getToken(QParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(QParser.Assign, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode To() { return getToken(QParser.To, 0); }
		public TerminalNode CParen() { return getToken(QParser.CParen, 0); }
		public TerminalNode Colon() { return getToken(QParser.Colon, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode End() { return getToken(QParser.End, 0); }
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(For);
			setState(357);
			match(OParen);
			setState(358);
			match(Identifier);
			setState(359);
			match(Assign);
			setState(360);
			expression(0);
			setState(361);
			match(To);
			setState(362);
			expression(0);
			setState(363);
			match(CParen);
			setState(364);
			match(Colon);
			setState(365);
			block();
			setState(366);
			match(End);
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

	public static class ForInStatementContext extends ParserRuleContext {
		public TerminalNode For() { return getToken(QParser.For, 0); }
		public List<TerminalNode> OParen() { return getTokens(QParser.OParen); }
		public TerminalNode OParen(int i) {
			return getToken(QParser.OParen, i);
		}
		public TerminalNode Identifier() { return getToken(QParser.Identifier, 0); }
		public TerminalNode In() { return getToken(QParser.In, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> CParen() { return getTokens(QParser.CParen); }
		public TerminalNode CParen(int i) {
			return getToken(QParser.CParen, i);
		}
		public TerminalNode Colon() { return getToken(QParser.Colon, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode End() { return getToken(QParser.End, 0); }
		public ForInStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterForInStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitForInStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitForInStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInStatementContext forInStatement() throws RecognitionException {
		ForInStatementContext _localctx = new ForInStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_forInStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(For);
			setState(369);
			match(OParen);
			setState(370);
			match(Identifier);
			setState(371);
			match(In);
			setState(372);
			match(T__9);
			setState(373);
			match(OParen);
			setState(374);
			expression(0);
			setState(375);
			match(CParen);
			setState(376);
			match(CParen);
			setState(377);
			match(Colon);
			setState(378);
			block();
			setState(379);
			match(End);
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

	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode Import() { return getToken(QParser.Import, 0); }
		public List<TerminalNode> Identifier() { return getTokens(QParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(QParser.Identifier, i);
		}
		public TerminalNode LT() { return getToken(QParser.LT, 0); }
		public TerminalNode GT() { return getToken(QParser.GT, 0); }
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_importStatement);
		try {
			int _alt;
			setState(398);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(381);
				match(T__0);
				setState(382);
				match(Import);
				setState(383);
				match(Identifier);
				setState(388);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(384);
						match(T__1);
						setState(385);
						match(Identifier);
						}
						} 
					}
					setState(390);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(391);
				match(T__0);
				setState(392);
				match(Import);
				setState(393);
				match(LT);
				setState(394);
				match(Identifier);
				setState(395);
				match(T__1);
				setState(396);
				match(Identifier);
				setState(397);
				match(GT);
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

	public static class AnonymousFunctionContext extends ParserRuleContext {
		public TerminalNode Function() { return getToken(QParser.Function, 0); }
		public TerminalNode OParen() { return getToken(QParser.OParen, 0); }
		public TerminalNode CParen() { return getToken(QParser.CParen, 0); }
		public TerminalNode Colon() { return getToken(QParser.Colon, 0); }
		public TerminalNode Subtract() { return getToken(QParser.Subtract, 0); }
		public TerminalNode GT() { return getToken(QParser.GT, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode End() { return getToken(QParser.End, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public AnonymousFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymousFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterAnonymousFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitAnonymousFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitAnonymousFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnonymousFunctionContext anonymousFunction() throws RecognitionException {
		AnonymousFunctionContext _localctx = new AnonymousFunctionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_anonymousFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			match(Function);
			setState(401);
			match(OParen);
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (T__12 - 13)) | (1L << (Println - 13)) | (1L << (Print - 13)) | (1L << (Input - 13)) | (1L << (Assert - 13)) | (1L << (Function - 13)) | (1L << (Null - 13)) | (1L << (Self - 13)) | (1L << (Excl - 13)) | (1L << (Subtract - 13)) | (1L << (OBracket - 13)) | (1L << (OParen - 13)) | (1L << (Bool - 13)) | (1L << (Number - 13)) | (1L << (Identifier - 13)) | (1L << (String - 13)))) != 0)) {
				{
				setState(402);
				exprList();
				}
			}

			setState(405);
			match(CParen);
			setState(406);
			match(Colon);
			setState(407);
			match(Subtract);
			setState(408);
			match(GT);
			setState(409);
			block();
			setState(410);
			match(End);
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

	public static class ImportFromGithubStatementContext extends ParserRuleContext {
		public TerminalNode Import() { return getToken(QParser.Import, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ImportFromGithubStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importFromGithubStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterImportFromGithubStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitImportFromGithubStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitImportFromGithubStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportFromGithubStatementContext importFromGithubStatement() throws RecognitionException {
		ImportFromGithubStatementContext _localctx = new ImportFromGithubStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_importFromGithubStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			match(T__0);
			setState(413);
			match(Import);
			setState(414);
			expression(0);
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

	public static class ImportAllStatementContext extends ParserRuleContext {
		public TerminalNode Import() { return getToken(QParser.Import, 0); }
		public TerminalNode OBracket() { return getToken(QParser.OBracket, 0); }
		public TerminalNode Multiply() { return getToken(QParser.Multiply, 0); }
		public TerminalNode CBracket() { return getToken(QParser.CBracket, 0); }
		public ImportAllStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importAllStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterImportAllStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitImportAllStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitImportAllStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportAllStatementContext importAllStatement() throws RecognitionException {
		ImportAllStatementContext _localctx = new ImportAllStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_importAllStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			match(T__0);
			setState(417);
			match(Import);
			setState(418);
			match(OBracket);
			setState(419);
			match(Multiply);
			setState(420);
			match(CBracket);
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

	public static class AtStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(QParser.Identifier, 0); }
		public AtStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterAtStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitAtStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitAtStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtStatementContext atStatement() throws RecognitionException {
		AtStatementContext _localctx = new AtStatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_atStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			match(T__2);
			setState(423);
			match(Identifier);
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

	public static class TryCatchStatementContext extends ParserRuleContext {
		public TerminalNode Try() { return getToken(QParser.Try, 0); }
		public List<TerminalNode> Colon() { return getTokens(QParser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(QParser.Colon, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode End() { return getToken(QParser.End, 0); }
		public List<TerminalNode> LT() { return getTokens(QParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(QParser.LT, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> GT() { return getTokens(QParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(QParser.GT, i);
		}
		public TryCatchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryCatchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterTryCatchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitTryCatchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitTryCatchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryCatchStatementContext tryCatchStatement() throws RecognitionException {
		TryCatchStatementContext _localctx = new TryCatchStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_tryCatchStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			match(Try);
			setState(426);
			match(Colon);
			setState(427);
			block();
			setState(428);
			match(T__10);
			setState(429);
			match(Colon);
			setState(436);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(430);
					match(LT);
					setState(431);
					expression(0);
					setState(432);
					match(GT);
					}
					} 
				}
				setState(438);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			setState(439);
			block();
			setState(440);
			match(End);
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

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(QParser.While, 0); }
		public TerminalNode OParen() { return getToken(QParser.OParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CParen() { return getToken(QParser.CParen, 0); }
		public TerminalNode Colon() { return getToken(QParser.Colon, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode End() { return getToken(QParser.End, 0); }
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			match(While);
			setState(443);
			match(OParen);
			setState(444);
			expression(0);
			setState(445);
			match(CParen);
			setState(446);
			match(Colon);
			setState(447);
			block();
			setState(448);
			match(End);
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

	public static class MainFunctionStatementContext extends ParserRuleContext {
		public TerminalNode Function() { return getToken(QParser.Function, 0); }
		public TerminalNode OParen() { return getToken(QParser.OParen, 0); }
		public TerminalNode Identifier() { return getToken(QParser.Identifier, 0); }
		public TerminalNode CParen() { return getToken(QParser.CParen, 0); }
		public TerminalNode Colon() { return getToken(QParser.Colon, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode End() { return getToken(QParser.End, 0); }
		public MainFunctionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainFunctionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterMainFunctionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitMainFunctionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitMainFunctionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainFunctionStatementContext mainFunctionStatement() throws RecognitionException {
		MainFunctionStatementContext _localctx = new MainFunctionStatementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_mainFunctionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			match(Function);
			setState(451);
			match(T__11);
			setState(452);
			match(OParen);
			setState(453);
			match(Identifier);
			setState(454);
			match(CParen);
			setState(455);
			match(Colon);
			setState(456);
			block();
			setState(457);
			match(End);
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

	public static class IdListContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(QParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(QParser.Identifier, i);
		}
		public List<TerminalNode> Comma() { return getTokens(QParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(QParser.Comma, i);
		}
		public IdListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterIdList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitIdList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitIdList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdListContext idList() throws RecognitionException {
		IdListContext _localctx = new IdListContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_idList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			match(Identifier);
			setState(464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(460);
				match(Comma);
				setState(461);
				match(Identifier);
				}
				}
				setState(466);
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

	public static class JavaMethodReferenceContext extends ParserRuleContext {
		public TerminalNode JavaJuice() { return getToken(QParser.JavaJuice, 0); }
		public TerminalNode OParen() { return getToken(QParser.OParen, 0); }
		public TerminalNode CParen() { return getToken(QParser.CParen, 0); }
		public List<TerminalNode> Identifier() { return getTokens(QParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(QParser.Identifier, i);
		}
		public List<TerminalNode> Comma() { return getTokens(QParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(QParser.Comma, i);
		}
		public List<TerminalNode> Identifier2() { return getTokens(QParser.Identifier2); }
		public TerminalNode Identifier2(int i) {
			return getToken(QParser.Identifier2, i);
		}
		public List<TerminalNode> String() { return getTokens(QParser.String); }
		public TerminalNode String(int i) {
			return getToken(QParser.String, i);
		}
		public JavaMethodReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javaMethodReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterJavaMethodReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitJavaMethodReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitJavaMethodReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JavaMethodReferenceContext javaMethodReference() throws RecognitionException {
		JavaMethodReferenceContext _localctx = new JavaMethodReferenceContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_javaMethodReference);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			match(JavaJuice);
			setState(472);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(468);
					match(T__1);
					setState(469);
					match(Identifier);
					}
					} 
				}
				setState(474);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			setState(475);
			match(OParen);
			{
			setState(479);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(476);
					_la = _input.LA(1);
					if ( !(_la==Identifier2 || _la==String) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(481);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			setState(485);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(482);
					match(Comma);
					}
					} 
				}
				setState(487);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			}
			setState(488);
			match(CParen);
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

	public static class ClassStatementContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(QParser.Class, 0); }
		public List<TerminalNode> Identifier() { return getTokens(QParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(QParser.Identifier, i);
		}
		public TerminalNode OBrace() { return getToken(QParser.OBrace, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode CBrace() { return getToken(QParser.CBrace, 0); }
		public AtStatementContext atStatement() {
			return getRuleContext(AtStatementContext.class,0);
		}
		public TerminalNode Colon() { return getToken(QParser.Colon, 0); }
		public ClassStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterClassStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitClassStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitClassStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassStatementContext classStatement() throws RecognitionException {
		ClassStatementContext _localctx = new ClassStatementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_classStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(490);
				atStatement();
				}
			}

			setState(493);
			match(Class);
			setState(494);
			match(Identifier);
			setState(497);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(495);
				match(Colon);
				setState(496);
				match(Identifier);
				}
			}

			setState(499);
			match(OBrace);
			setState(500);
			block();
			setState(501);
			match(CBrace);
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

	public static class ExprListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(QParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(QParser.Comma, i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitExprList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			expression(0);
			setState(508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(504);
				match(Comma);
				setState(505);
				expression(0);
				}
				}
				setState(510);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumberExpressionContext extends ExpressionContext {
		public TerminalNode Number() { return getToken(QParser.Number, 0); }
		public NumberExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterNumberExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitNumberExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitNumberExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierExpressionContext extends ExpressionContext {
		public TerminalNode Identifier() { return getToken(QParser.Identifier, 0); }
		public IndexesContext indexes() {
			return getRuleContext(IndexesContext.class,0);
		}
		public IdentifierExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterIdentifierExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitIdentifierExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitIdentifierExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotExpressionContext extends ExpressionContext {
		public TerminalNode Excl() { return getToken(QParser.Excl, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode And() { return getToken(QParser.And, 0); }
		public AndExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringExpressionContext extends ExpressionContext {
		public TerminalNode String() { return getToken(QParser.String, 0); }
		public IndexesContext indexes() {
			return getRuleContext(IndexesContext.class,0);
		}
		public StringExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterStringExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitStringExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitStringExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AnonymousFunctionExpressionContext extends ExpressionContext {
		public AnonymousFunctionContext anonymousFunction() {
			return getRuleContext(AnonymousFunctionContext.class,0);
		}
		public AnonymousFunctionExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterAnonymousFunctionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitAnonymousFunctionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitAnonymousFunctionExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionExpressionContext extends ExpressionContext {
		public TerminalNode OParen() { return getToken(QParser.OParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CParen() { return getToken(QParser.CParen, 0); }
		public IndexesContext indexes() {
			return getRuleContext(IndexesContext.class,0);
		}
		public ExpressionExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterExpressionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitExpressionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitExpressionExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode GTEquals() { return getToken(QParser.GTEquals, 0); }
		public TerminalNode LTEquals() { return getToken(QParser.LTEquals, 0); }
		public TerminalNode GT() { return getToken(QParser.GT, 0); }
		public TerminalNode LT() { return getToken(QParser.LT, 0); }
		public CompExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterCompExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitCompExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitCompExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullExpressionContext extends ExpressionContext {
		public TerminalNode Null() { return getToken(QParser.Null, 0); }
		public NullExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterNullExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitNullExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitNullExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallExpressionContext extends ExpressionContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public IndexesContext indexes() {
			return getRuleContext(IndexesContext.class,0);
		}
		public FunctionCallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterFunctionCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitFunctionCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitFunctionCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Multiply() { return getToken(QParser.Multiply, 0); }
		public TerminalNode Divide() { return getToken(QParser.Divide, 0); }
		public TerminalNode Modulus() { return getToken(QParser.Modulus, 0); }
		public MultExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterMultExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitMultExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitMultExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListExpressionContext extends ExpressionContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public IndexesContext indexes() {
			return getRuleContext(IndexesContext.class,0);
		}
		public ListExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterListExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitListExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitListExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolExpressionContext extends ExpressionContext {
		public TerminalNode Bool() { return getToken(QParser.Bool, 0); }
		public BoolExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterBoolExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitBoolExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitBoolExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ObjVarExpressionContext extends ExpressionContext {
		public ObjVarContext objVar() {
			return getRuleContext(ObjVarContext.class,0);
		}
		public ObjVarExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterObjVarExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitObjVarExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitObjVarExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Or() { return getToken(QParser.Or, 0); }
		public OrExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryMinusExpressionContext extends ExpressionContext {
		public TerminalNode Subtract() { return getToken(QParser.Subtract, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnaryMinusExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterUnaryMinusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitUnaryMinusExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitUnaryMinusExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowerExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Pow() { return getToken(QParser.Pow, 0); }
		public PowerExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterPowerExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitPowerExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitPowerExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class HereVarExpressionContext extends ExpressionContext {
		public VarHereStatementContext varHereStatement() {
			return getRuleContext(VarHereStatementContext.class,0);
		}
		public HereVarExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterHereVarExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitHereVarExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitHereVarExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Equals() { return getToken(QParser.Equals, 0); }
		public TerminalNode NEquals() { return getToken(QParser.NEquals, 0); }
		public EqExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterEqExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitEqExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitEqExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode In() { return getToken(QParser.In, 0); }
		public InExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterInExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitInExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitInExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Add() { return getToken(QParser.Add, 0); }
		public TerminalNode Subtract() { return getToken(QParser.Subtract, 0); }
		public AddExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterAddExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitAddExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitAddExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SelfExpressionContext extends ExpressionContext {
		public VarHereStatementContext varHereStatement() {
			return getRuleContext(VarHereStatementContext.class,0);
		}
		public SelfExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterSelfExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitSelfExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitSelfExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RandomExpressionContext extends ExpressionContext {
		public TerminalNode OParen() { return getToken(QParser.OParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CParen() { return getToken(QParser.CParen, 0); }
		public RandomExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterRandomExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitRandomExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitRandomExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TernaryExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode QMark() { return getToken(QParser.QMark, 0); }
		public TerminalNode Colon() { return getToken(QParser.Colon, 0); }
		public TernaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterTernaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitTernaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitTernaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InputExpressionContext extends ExpressionContext {
		public TerminalNode Input() { return getToken(QParser.Input, 0); }
		public TerminalNode OParen() { return getToken(QParser.OParen, 0); }
		public TerminalNode CParen() { return getToken(QParser.CParen, 0); }
		public TerminalNode String() { return getToken(QParser.String, 0); }
		public InputExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterInputExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitInputExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitInputExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryMinusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(512);
				match(Subtract);
				setState(513);
				expression(25);
				}
				break;
			case 2:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(514);
				match(Excl);
				setState(515);
				expression(24);
				}
				break;
			case 3:
				{
				_localctx = new NumberExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(516);
				match(Number);
				}
				break;
			case 4:
				{
				_localctx = new BoolExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(517);
				match(Bool);
				}
				break;
			case 5:
				{
				_localctx = new NullExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(518);
				match(Null);
				}
				break;
			case 6:
				{
				_localctx = new FunctionCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(519);
				functionCall();
				setState(521);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(520);
					indexes();
					}
					break;
				}
				}
				break;
			case 7:
				{
				_localctx = new ListExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(523);
				list();
				setState(525);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(524);
					indexes();
					}
					break;
				}
				}
				break;
			case 8:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(527);
				match(Identifier);
				setState(529);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(528);
					indexes();
					}
					break;
				}
				}
				break;
			case 9:
				{
				_localctx = new StringExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(531);
				match(String);
				setState(533);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(532);
					indexes();
					}
					break;
				}
				}
				break;
			case 10:
				{
				_localctx = new ExpressionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(535);
				match(OParen);
				setState(536);
				expression(0);
				setState(537);
				match(CParen);
				setState(539);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(538);
					indexes();
					}
					break;
				}
				}
				break;
			case 11:
				{
				_localctx = new InputExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(541);
				match(Input);
				setState(542);
				match(OParen);
				setState(544);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==String) {
					{
					setState(543);
					match(String);
					}
				}

				setState(546);
				match(CParen);
				}
				break;
			case 12:
				{
				_localctx = new HereVarExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(547);
				varHereStatement();
				}
				break;
			case 13:
				{
				_localctx = new RandomExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(548);
				match(T__12);
				setState(549);
				match(OParen);
				setState(550);
				expression(0);
				setState(551);
				match(CParen);
				}
				break;
			case 14:
				{
				_localctx = new AnonymousFunctionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(553);
				anonymousFunction();
				}
				break;
			case 15:
				{
				_localctx = new SelfExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(554);
				varHereStatement();
				}
				break;
			case 16:
				{
				_localctx = new ObjVarExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(555);
				objVar();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(590);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(588);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
					case 1:
						{
						_localctx = new PowerExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(558);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(559);
						match(Pow);
						setState(560);
						expression(23);
						}
						break;
					case 2:
						{
						_localctx = new MultExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(561);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(562);
						((MultExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Multiply) | (1L << Divide) | (1L << Modulus))) != 0)) ) {
							((MultExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(563);
						expression(23);
						}
						break;
					case 3:
						{
						_localctx = new AddExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(564);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(565);
						((AddExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Add || _la==Subtract) ) {
							((AddExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(566);
						expression(22);
						}
						break;
					case 4:
						{
						_localctx = new CompExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(567);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(568);
						((CompExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GTEquals) | (1L << LTEquals) | (1L << GT) | (1L << LT))) != 0)) ) {
							((CompExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(569);
						expression(21);
						}
						break;
					case 5:
						{
						_localctx = new EqExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(570);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(571);
						((EqExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Equals || _la==NEquals) ) {
							((EqExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(572);
						expression(20);
						}
						break;
					case 6:
						{
						_localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(573);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(574);
						match(And);
						setState(575);
						expression(19);
						}
						break;
					case 7:
						{
						_localctx = new OrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(576);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(577);
						match(Or);
						setState(578);
						expression(18);
						}
						break;
					case 8:
						{
						_localctx = new TernaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(579);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(580);
						match(QMark);
						setState(581);
						expression(0);
						setState(582);
						match(Colon);
						setState(583);
						expression(17);
						}
						break;
					case 9:
						{
						_localctx = new InExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(585);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(586);
						match(In);
						setState(587);
						expression(16);
						}
						break;
					}
					} 
				}
				setState(592);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
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

	public static class ListContext extends ParserRuleContext {
		public TerminalNode OBracket() { return getToken(QParser.OBracket, 0); }
		public TerminalNode CBracket() { return getToken(QParser.CBracket, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			match(OBracket);
			setState(595);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (T__12 - 13)) | (1L << (Println - 13)) | (1L << (Print - 13)) | (1L << (Input - 13)) | (1L << (Assert - 13)) | (1L << (Function - 13)) | (1L << (Null - 13)) | (1L << (Self - 13)) | (1L << (Excl - 13)) | (1L << (Subtract - 13)) | (1L << (OBracket - 13)) | (1L << (OParen - 13)) | (1L << (Bool - 13)) | (1L << (Number - 13)) | (1L << (Identifier - 13)) | (1L << (String - 13)))) != 0)) {
				{
				setState(594);
				exprList();
				}
			}

			setState(597);
			match(CBracket);
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

	public static class ObjVarContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(QParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(QParser.Identifier, i);
		}
		public TerminalNode Accessor() { return getToken(QParser.Accessor, 0); }
		public ObjVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterObjVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitObjVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitObjVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjVarContext objVar() throws RecognitionException {
		ObjVarContext _localctx = new ObjVarContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_objVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(599);
			match(Identifier);
			setState(600);
			match(Accessor);
			setState(601);
			match(Identifier);
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

	public static class IndexesContext extends ParserRuleContext {
		public List<TerminalNode> OBracket() { return getTokens(QParser.OBracket); }
		public TerminalNode OBracket(int i) {
			return getToken(QParser.OBracket, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> CBracket() { return getTokens(QParser.CBracket); }
		public TerminalNode CBracket(int i) {
			return getToken(QParser.CBracket, i);
		}
		public IndexesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).enterIndexes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QListener ) ((QListener)listener).exitIndexes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QVisitor ) return ((QVisitor<? extends T>)visitor).visitIndexes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexesContext indexes() throws RecognitionException {
		IndexesContext _localctx = new IndexesContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_indexes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(607); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(603);
					match(OBracket);
					setState(604);
					expression(0);
					setState(605);
					match(CBracket);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(609); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		case 37:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 23);
		case 1:
			return precpred(_ctx, 22);
		case 2:
			return precpred(_ctx, 21);
		case 3:
			return precpred(_ctx, 20);
		case 4:
			return precpred(_ctx, 19);
		case 5:
			return precpred(_ctx, 18);
		case 6:
			return precpred(_ctx, 17);
		case 7:
			return precpred(_ctx, 16);
		case 8:
			return precpred(_ctx, 15);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001H\u0264\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0001\u0000\u0003\u0000T\b\u0000\u0001\u0000\u0003\u0000W\b\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000\\\b\u0000\n\u0000\f\u0000"+
		"_\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0005\u0001f\b\u0001\n\u0001\f\u0001i\t\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001o\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"\u0084\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002\u0097\b\u0002\u0001\u0003\u0001\u0003\u0003\u0003\u009b\b"+
		"\u0003\u0001\u0003\u0003\u0003\u009e\b\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00a6\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004\u00aa\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u00af\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u00b5\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u00c7\b\u0005\u0001\u0005\u0003\u0005\u00ca\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00d0\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u00d7\b\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0005\b\u00e1\b\b\n\b\f\b\u00e4\t\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0005\t\u00ec\b\t\n\t\f\t\u00ef\t\t\u0001\t"+
		"\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0005"+
		"\u000b\u00f9\b\u000b\n\u000b\f\u000b\u00fc\t\u000b\u0001\u000b\u0003\u000b"+
		"\u00ff\b\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0120\b\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u012d\b\u0011\u0001\u0011\u0003\u0011\u0130\b\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0137\b\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0003\u0015\u0147\b\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0003\u0015\u014d\b\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u015b\b\u0016\u0001"+
		"\u0016\u0005\u0016\u015e\b\u0016\n\u0016\f\u0016\u0161\t\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0005\u0019\u0183\b\u0019\n\u0019\f\u0019\u0186\t\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0003\u0019\u018f\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0003"+
		"\u001a\u0194\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0005\u001e\u01b3\b\u001e\n\u001e\f\u001e\u01b6\t\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 "+
		"\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0005"+
		"!\u01cf\b!\n!\f!\u01d2\t!\u0001\"\u0001\"\u0001\"\u0005\"\u01d7\b\"\n"+
		"\"\f\"\u01da\t\"\u0001\"\u0001\"\u0005\"\u01de\b\"\n\"\f\"\u01e1\t\"\u0001"+
		"\"\u0005\"\u01e4\b\"\n\"\f\"\u01e7\t\"\u0001\"\u0001\"\u0001#\u0003#\u01ec"+
		"\b#\u0001#\u0001#\u0001#\u0001#\u0003#\u01f2\b#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001$\u0001$\u0001$\u0005$\u01fb\b$\n$\f$\u01fe\t$\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0003%\u020a\b%\u0001"+
		"%\u0001%\u0003%\u020e\b%\u0001%\u0001%\u0003%\u0212\b%\u0001%\u0001%\u0003"+
		"%\u0216\b%\u0001%\u0001%\u0001%\u0001%\u0003%\u021c\b%\u0001%\u0001%\u0001"+
		"%\u0003%\u0221\b%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0003%\u022d\b%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0005%\u024d\b%\n%\f%\u0250\t%\u0001&\u0001"+
		"&\u0003&\u0254\b&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"(\u0001(\u0001(\u0001(\u0004(\u0260\b(\u000b(\f(\u0261\u0001(\t]\u00e2"+
		"\u00ed\u015f\u0184\u01b4\u01d8\u01df\u01e5\u0001J)\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02468:<>@BDFHJLNP\u0000\u0006\u0002\u0000\u0010\u0010$$\u0001\u0000EF"+
		"\u0001\u000046\u0001\u000023\u0002\u0000,-01\u0001\u0000*+\u0299\u0000"+
		"S\u0001\u0000\u0000\u0000\u0002g\u0001\u0000\u0000\u0000\u0004\u0096\u0001"+
		"\u0000\u0000\u0000\u0006\u009a\u0001\u0000\u0000\u0000\b\u00a2\u0001\u0000"+
		"\u0000\u0000\n\u00c9\u0001\u0000\u0000\u0000\f\u00cf\u0001\u0000\u0000"+
		"\u0000\u000e\u00d1\u0001\u0000\u0000\u0000\u0010\u00da\u0001\u0000\u0000"+
		"\u0000\u0012\u00e7\u0001\u0000\u0000\u0000\u0014\u00f2\u0001\u0000\u0000"+
		"\u0000\u0016\u00f6\u0001\u0000\u0000\u0000\u0018\u0102\u0001\u0000\u0000"+
		"\u0000\u001a\u0109\u0001\u0000\u0000\u0000\u001c\u010f\u0001\u0000\u0000"+
		"\u0000\u001e\u0113\u0001\u0000\u0000\u0000 \u011b\u0001\u0000\u0000\u0000"+
		"\"\u0126\u0001\u0000\u0000\u0000$\u0131\u0001\u0000\u0000\u0000&\u013a"+
		"\u0001\u0000\u0000\u0000(\u0141\u0001\u0000\u0000\u0000*\u0146\u0001\u0000"+
		"\u0000\u0000,\u0153\u0001\u0000\u0000\u0000.\u0164\u0001\u0000\u0000\u0000"+
		"0\u0170\u0001\u0000\u0000\u00002\u018e\u0001\u0000\u0000\u00004\u0190"+
		"\u0001\u0000\u0000\u00006\u019c\u0001\u0000\u0000\u00008\u01a0\u0001\u0000"+
		"\u0000\u0000:\u01a6\u0001\u0000\u0000\u0000<\u01a9\u0001\u0000\u0000\u0000"+
		">\u01ba\u0001\u0000\u0000\u0000@\u01c2\u0001\u0000\u0000\u0000B\u01cb"+
		"\u0001\u0000\u0000\u0000D\u01d3\u0001\u0000\u0000\u0000F\u01eb\u0001\u0000"+
		"\u0000\u0000H\u01f7\u0001\u0000\u0000\u0000J\u022c\u0001\u0000\u0000\u0000"+
		"L\u0251\u0001\u0000\u0000\u0000N\u0257\u0001\u0000\u0000\u0000P\u025f"+
		"\u0001\u0000\u0000\u0000RT\u0003\u0014\n\u0000SR\u0001\u0000\u0000\u0000"+
		"ST\u0001\u0000\u0000\u0000TV\u0001\u0000\u0000\u0000UW\u0003\u0012\t\u0000"+
		"VU\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000W]\u0001\u0000\u0000"+
		"\u0000XY\u0003\f\u0006\u0000YZ\u0005=\u0000\u0000Z\\\u0001\u0000\u0000"+
		"\u0000[X\u0001\u0000\u0000\u0000\\_\u0001\u0000\u0000\u0000]^\u0001\u0000"+
		"\u0000\u0000][\u0001\u0000\u0000\u0000^`\u0001\u0000\u0000\u0000_]\u0001"+
		"\u0000\u0000\u0000`a\u0003\u0002\u0001\u0000ab\u0005\u0000\u0000\u0001"+
		"b\u0001\u0001\u0000\u0000\u0000cf\u0003\u0004\u0002\u0000df\u0003*\u0015"+
		"\u0000ec\u0001\u0000\u0000\u0000ed\u0001\u0000\u0000\u0000fi\u0001\u0000"+
		"\u0000\u0000ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hn\u0001"+
		"\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000jk\u0005\u0019\u0000\u0000"+
		"kl\u0003J%\u0000lm\u0005=\u0000\u0000mo\u0001\u0000\u0000\u0000nj\u0001"+
		"\u0000\u0000\u0000no\u0001\u0000\u0000\u0000o\u0003\u0001\u0000\u0000"+
		"\u0000pq\u0003\n\u0005\u0000qr\u0005=\u0000\u0000r\u0097\u0001\u0000\u0000"+
		"\u0000s\u0097\u0003\u0016\u000b\u0000t\u0097\u0003.\u0017\u0000u\u0097"+
		"\u00030\u0018\u0000v\u0097\u0003>\u001f\u0000w\u0097\u0003<\u001e\u0000"+
		"x\u0097\u0003@ \u0000yz\u0003\u0006\u0003\u0000z{\u0005=\u0000\u0000{"+
		"\u0097\u0001\u0000\u0000\u0000|\u0097\u0003F#\u0000}\u0097\u0003 \u0010"+
		"\u0000~\u007f\u0003&\u0013\u0000\u007f\u0080\u0005=\u0000\u0000\u0080"+
		"\u0097\u0001\u0000\u0000\u0000\u0081\u0083\u0003\u000e\u0007\u0000\u0082"+
		"\u0084\u0005=\u0000\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0083\u0084"+
		"\u0001\u0000\u0000\u0000\u0084\u0097\u0001\u0000\u0000\u0000\u0085\u0086"+
		"\u0003\"\u0011\u0000\u0086\u0087\u0005=\u0000\u0000\u0087\u0097\u0001"+
		"\u0000\u0000\u0000\u0088\u0089\u0003$\u0012\u0000\u0089\u008a\u0005=\u0000"+
		"\u0000\u008a\u0097\u0001\u0000\u0000\u0000\u008b\u0097\u00034\u001a\u0000"+
		"\u008c\u008d\u0003\u001a\r\u0000\u008d\u008e\u0005=\u0000\u0000\u008e"+
		"\u0097\u0001\u0000\u0000\u0000\u008f\u0090\u0003\b\u0004\u0000\u0090\u0091"+
		"\u0005=\u0000\u0000\u0091\u0097\u0001\u0000\u0000\u0000\u0092\u0097\u0003"+
		",\u0016\u0000\u0093\u0094\u0003D\"\u0000\u0094\u0095\u0005=\u0000\u0000"+
		"\u0095\u0097\u0001\u0000\u0000\u0000\u0096p\u0001\u0000\u0000\u0000\u0096"+
		"s\u0001\u0000\u0000\u0000\u0096t\u0001\u0000\u0000\u0000\u0096u\u0001"+
		"\u0000\u0000\u0000\u0096v\u0001\u0000\u0000\u0000\u0096w\u0001\u0000\u0000"+
		"\u0000\u0096x\u0001\u0000\u0000\u0000\u0096y\u0001\u0000\u0000\u0000\u0096"+
		"|\u0001\u0000\u0000\u0000\u0096}\u0001\u0000\u0000\u0000\u0096~\u0001"+
		"\u0000\u0000\u0000\u0096\u0081\u0001\u0000\u0000\u0000\u0096\u0085\u0001"+
		"\u0000\u0000\u0000\u0096\u0088\u0001\u0000\u0000\u0000\u0096\u008b\u0001"+
		"\u0000\u0000\u0000\u0096\u008c\u0001\u0000\u0000\u0000\u0096\u008f\u0001"+
		"\u0000\u0000\u0000\u0096\u0092\u0001\u0000\u0000\u0000\u0096\u0093\u0001"+
		"\u0000\u0000\u0000\u0097\u0005\u0001\u0000\u0000\u0000\u0098\u009b\u0005"+
		"D\u0000\u0000\u0099\u009b\u0003N\'\u0000\u009a\u0098\u0001\u0000\u0000"+
		"\u0000\u009a\u0099\u0001\u0000\u0000\u0000\u009b\u009d\u0001\u0000\u0000"+
		"\u0000\u009c\u009e\u0003P(\u0000\u009d\u009c\u0001\u0000\u0000\u0000\u009d"+
		"\u009e\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f"+
		"\u00a0\u0005>\u0000\u0000\u00a0\u00a1\u0003J%\u0000\u00a1\u0007\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a3\u0007\u0000\u0000\u0000\u00a3\u00a9\u0005"+
		"D\u0000\u0000\u00a4\u00a6\u0003P(\u0000\u00a5\u00a4\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a8\u0005>\u0000\u0000\u00a8\u00aa\u0003J%\u0000\u00a9"+
		"\u00a5\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa"+
		"\t\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005D\u0000\u0000\u00ac\u00ae"+
		"\u0005;\u0000\u0000\u00ad\u00af\u0003H$\u0000\u00ae\u00ad\u0001\u0000"+
		"\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b0\u00ca\u0005<\u0000\u0000\u00b1\u00b2\u0005\u000e\u0000"+
		"\u0000\u00b2\u00b4\u0005;\u0000\u0000\u00b3\u00b5\u0003J%\u0000\u00b4"+
		"\u00b3\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b6\u00ca\u0005<\u0000\u0000\u00b7\u00b8"+
		"\u0005\u0012\u0000\u0000\u00b8\u00b9\u0005;\u0000\u0000\u00b9\u00ba\u0003"+
		"J%\u0000\u00ba\u00bb\u0005<\u0000\u0000\u00bb\u00ca\u0001\u0000\u0000"+
		"\u0000\u00bc\u00bd\u0005\u0014\u0000\u0000\u00bd\u00be\u0005;\u0000\u0000"+
		"\u00be\u00bf\u0003J%\u0000\u00bf\u00c0\u0005<\u0000\u0000\u00c0\u00ca"+
		"\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005D\u0000\u0000\u00c2\u00c3\u0005"+
		"(\u0000\u0000\u00c3\u00c4\u0005D\u0000\u0000\u00c4\u00c6\u0005;\u0000"+
		"\u0000\u00c5\u00c7\u0003H$\u0000\u00c6\u00c5\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c7\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8"+
		"\u00ca\u0005<\u0000\u0000\u00c9\u00ab\u0001\u0000\u0000\u0000\u00c9\u00b1"+
		"\u0001\u0000\u0000\u0000\u00c9\u00b7\u0001\u0000\u0000\u0000\u00c9\u00bc"+
		"\u0001\u0000\u0000\u0000\u00c9\u00c1\u0001\u0000\u0000\u0000\u00ca\u000b"+
		"\u0001\u0000\u0000\u0000\u00cb\u00d0\u00032\u0019\u0000\u00cc\u00d0\u0003"+
		"6\u001b\u0000\u00cd\u00d0\u00038\u001c\u0000\u00ce\u00d0\u0003\u0010\b"+
		"\u0000\u00cf\u00cb\u0001\u0000\u0000\u0000\u00cf\u00cc\u0001\u0000\u0000"+
		"\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00cf\u00ce\u0001\u0000\u0000"+
		"\u0000\u00d0\r\u0001\u0000\u0000\u0000\u00d1\u00d2\u0005D\u0000\u0000"+
		"\u00d2\u00d3\u0005(\u0000\u0000\u00d3\u00d4\u0005D\u0000\u0000\u00d4\u00d6"+
		"\u0005;\u0000\u0000\u00d5\u00d7\u0003H$\u0000\u00d6\u00d5\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000"+
		"\u0000\u0000\u00d8\u00d9\u0005<\u0000\u0000\u00d9\u000f\u0001\u0000\u0000"+
		"\u0000\u00da\u00db\u0005\u0001\u0000\u0000\u00db\u00dc\u0005\u0011\u0000"+
		"\u0000\u00dc\u00dd\u00059\u0000\u0000\u00dd\u00e2\u0005D\u0000\u0000\u00de"+
		"\u00df\u0005\u0002\u0000\u0000\u00df\u00e1\u0005D\u0000\u0000\u00e0\u00de"+
		"\u0001\u0000\u0000\u0000\u00e1\u00e4\u0001\u0000\u0000\u0000\u00e2\u00e3"+
		"\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e3\u00e5"+
		"\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e5\u00e6"+
		"\u0005:\u0000\u0000\u00e6\u0011\u0001\u0000\u0000\u0000\u00e7\u00e8\u0005"+
		"\u0018\u0000\u0000\u00e8\u00ed\u0005D\u0000\u0000\u00e9\u00ea\u0005\u0002"+
		"\u0000\u0000\u00ea\u00ec\u0005D\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000"+
		"\u0000\u00ec\u00ef\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000"+
		"\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ee\u00f0\u0001\u0000\u0000"+
		"\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00f0\u00f1\u0005=\u0000\u0000"+
		"\u00f1\u0013\u0001\u0000\u0000\u0000\u00f2\u00f3\u0005\u0003\u0000\u0000"+
		"\u00f3\u00f4\u0005\u0004\u0000\u0000\u00f4\u00f5\u0005D\u0000\u0000\u00f5"+
		"\u0015\u0001\u0000\u0000\u0000\u00f6\u00fa\u0003\u0018\f\u0000\u00f7\u00f9"+
		"\u0003\u001e\u000f\u0000\u00f8\u00f7\u0001\u0000\u0000\u0000\u00f9\u00fc"+
		"\u0001\u0000\u0000\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fa\u00fb"+
		"\u0001\u0000\u0000\u0000\u00fb\u00fe\u0001\u0000\u0000\u0000\u00fc\u00fa"+
		"\u0001\u0000\u0000\u0000\u00fd\u00ff\u0003(\u0014\u0000\u00fe\u00fd\u0001"+
		"\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\u0100\u0001"+
		"\u0000\u0000\u0000\u0100\u0101\u0005\u001f\u0000\u0000\u0101\u0017\u0001"+
		"\u0000\u0000\u0000\u0102\u0103\u0005\u0016\u0000\u0000\u0103\u0104\u0005"+
		";\u0000\u0000\u0104\u0105\u0003J%\u0000\u0105\u0106\u0005<\u0000\u0000"+
		"\u0106\u0107\u0005A\u0000\u0000\u0107\u0108\u0003\u0002\u0001\u0000\u0108"+
		"\u0019\u0001\u0000\u0000\u0000\u0109\u010a\u0005%\u0000\u0000\u010a\u010b"+
		"\u0005(\u0000\u0000\u010b\u010c\u0005D\u0000\u0000\u010c\u010d\u0005>"+
		"\u0000\u0000\u010d\u010e\u0003J%\u0000\u010e\u001b\u0001\u0000\u0000\u0000"+
		"\u010f\u0110\u0005%\u0000\u0000\u0110\u0111\u0005(\u0000\u0000\u0111\u0112"+
		"\u0005D\u0000\u0000\u0112\u001d\u0001\u0000\u0000\u0000\u0113\u0114\u0005"+
		"\u0017\u0000\u0000\u0114\u0115\u0005\u0016\u0000\u0000\u0115\u0116\u0005"+
		";\u0000\u0000\u0116\u0117\u0003J%\u0000\u0117\u0118\u0005<\u0000\u0000"+
		"\u0118\u0119\u0005A\u0000\u0000\u0119\u011a\u0003\u0002\u0001\u0000\u011a"+
		"\u001f\u0001\u0000\u0000\u0000\u011b\u011c\u0005\u0005\u0000\u0000\u011c"+
		"\u011d\u0005D\u0000\u0000\u011d\u011f\u0005;\u0000\u0000\u011e\u0120\u0003"+
		"H$\u0000\u011f\u011e\u0001\u0000\u0000\u0000\u011f\u0120\u0001\u0000\u0000"+
		"\u0000\u0120\u0121\u0001\u0000\u0000\u0000\u0121\u0122\u0005<\u0000\u0000"+
		"\u0122\u0123\u0005A\u0000\u0000\u0123\u0124\u0003\u0002\u0001\u0000\u0124"+
		"\u0125\u0005\u001f\u0000\u0000\u0125!\u0001\u0000\u0000\u0000\u0126\u0127"+
		"\u0005\u0006\u0000\u0000\u0127\u0128\u0005D\u0000\u0000\u0128\u0129\u0005"+
		"\u0007\u0000\u0000\u0129\u012f\u0005D\u0000\u0000\u012a\u012c\u0005;\u0000"+
		"\u0000\u012b\u012d\u0003H$\u0000\u012c\u012b\u0001\u0000\u0000\u0000\u012c"+
		"\u012d\u0001\u0000\u0000\u0000\u012d\u012e\u0001\u0000\u0000\u0000\u012e"+
		"\u0130\u0005<\u0000\u0000\u012f\u012a\u0001\u0000\u0000\u0000\u012f\u0130"+
		"\u0001\u0000\u0000\u0000\u0130#\u0001\u0000\u0000\u0000\u0131\u0132\u0005"+
		"\b\u0000\u0000\u0132\u0133\u0005(\u0000\u0000\u0133\u0134\u0005D\u0000"+
		"\u0000\u0134\u0136\u0005;\u0000\u0000\u0135\u0137\u0003J%\u0000\u0136"+
		"\u0135\u0001\u0000\u0000\u0000\u0136\u0137\u0001\u0000\u0000\u0000\u0137"+
		"\u0138\u0001\u0000\u0000\u0000\u0138\u0139\u0005<\u0000\u0000\u0139%\u0001"+
		"\u0000\u0000\u0000\u013a\u013b\u0005D\u0000\u0000\u013b\u013c\u0005(\u0000"+
		"\u0000\u013c\u013d\u0005\t\u0000\u0000\u013d\u013e\u0005;\u0000\u0000"+
		"\u013e\u013f\u0003J%\u0000\u013f\u0140\u0005<\u0000\u0000\u0140\'\u0001"+
		"\u0000\u0000\u0000\u0141\u0142\u0005\u0017\u0000\u0000\u0142\u0143\u0005"+
		"A\u0000\u0000\u0143\u0144\u0003\u0002\u0001\u0000\u0144)\u0001\u0000\u0000"+
		"\u0000\u0145\u0147\u0005\u000f\u0000\u0000\u0146\u0145\u0001\u0000\u0000"+
		"\u0000\u0146\u0147\u0001\u0000\u0000\u0000\u0147\u0148\u0001\u0000\u0000"+
		"\u0000\u0148\u0149\u0005\u0015\u0000\u0000\u0149\u014a\u0005D\u0000\u0000"+
		"\u014a\u014c\u0005;\u0000\u0000\u014b\u014d\u0003B!\u0000\u014c\u014b"+
		"\u0001\u0000\u0000\u0000\u014c\u014d\u0001\u0000\u0000\u0000\u014d\u014e"+
		"\u0001\u0000\u0000\u0000\u014e\u014f\u0005<\u0000\u0000\u014f\u0150\u0005"+
		"A\u0000\u0000\u0150\u0151\u0003\u0002\u0001\u0000\u0151\u0152\u0005\u001f"+
		"\u0000\u0000\u0152+\u0001\u0000\u0000\u0000\u0153\u0154\u0005&\u0000\u0000"+
		"\u0154\u0155\u0005\u0015\u0000\u0000\u0155\u0156\u0005D\u0000\u0000\u0156"+
		"\u015a\u00057\u0000\u0000\u0157\u0158\u00059\u0000\u0000\u0158\u0159\u0005"+
		"D\u0000\u0000\u0159\u015b\u0005:\u0000\u0000\u015a\u0157\u0001\u0000\u0000"+
		"\u0000\u015a\u015b\u0001\u0000\u0000\u0000\u015b\u015f\u0001\u0000\u0000"+
		"\u0000\u015c\u015e\u0005F\u0000\u0000\u015d\u015c\u0001\u0000\u0000\u0000"+
		"\u015e\u0161\u0001\u0000\u0000\u0000\u015f\u0160\u0001\u0000\u0000\u0000"+
		"\u015f\u015d\u0001\u0000\u0000\u0000\u0160\u0162\u0001\u0000\u0000\u0000"+
		"\u0161\u015f\u0001\u0000\u0000\u0000\u0162\u0163\u00058\u0000\u0000\u0163"+
		"-\u0001\u0000\u0000\u0000\u0164\u0165\u0005\u001a\u0000\u0000\u0165\u0166"+
		"\u0005;\u0000\u0000\u0166\u0167\u0005D\u0000\u0000\u0167\u0168\u0005>"+
		"\u0000\u0000\u0168\u0169\u0003J%\u0000\u0169\u016a\u0005\u001d\u0000\u0000"+
		"\u016a\u016b\u0003J%\u0000\u016b\u016c\u0005<\u0000\u0000\u016c\u016d"+
		"\u0005A\u0000\u0000\u016d\u016e\u0003\u0002\u0001\u0000\u016e\u016f\u0005"+
		"\u001f\u0000\u0000\u016f/\u0001\u0000\u0000\u0000\u0170\u0171\u0005\u001a"+
		"\u0000\u0000\u0171\u0172\u0005;\u0000\u0000\u0172\u0173\u0005D\u0000\u0000"+
		"\u0173\u0174\u0005 \u0000\u0000\u0174\u0175\u0005\n\u0000\u0000\u0175"+
		"\u0176\u0005;\u0000\u0000\u0176\u0177\u0003J%\u0000\u0177\u0178\u0005"+
		"<\u0000\u0000\u0178\u0179\u0005<\u0000\u0000\u0179\u017a\u0005A\u0000"+
		"\u0000\u017a\u017b\u0003\u0002\u0001\u0000\u017b\u017c\u0005\u001f\u0000"+
		"\u0000\u017c1\u0001\u0000\u0000\u0000\u017d\u017e\u0005\u0001\u0000\u0000"+
		"\u017e\u017f\u0005\u0011\u0000\u0000\u017f\u0184\u0005D\u0000\u0000\u0180"+
		"\u0181\u0005\u0002\u0000\u0000\u0181\u0183\u0005D\u0000\u0000\u0182\u0180"+
		"\u0001\u0000\u0000\u0000\u0183\u0186\u0001\u0000\u0000\u0000\u0184\u0185"+
		"\u0001\u0000\u0000\u0000\u0184\u0182\u0001\u0000\u0000\u0000\u0185\u018f"+
		"\u0001\u0000\u0000\u0000\u0186\u0184\u0001\u0000\u0000\u0000\u0187\u0188"+
		"\u0005\u0001\u0000\u0000\u0188\u0189\u0005\u0011\u0000\u0000\u0189\u018a"+
		"\u00051\u0000\u0000\u018a\u018b\u0005D\u0000\u0000\u018b\u018c\u0005\u0002"+
		"\u0000\u0000\u018c\u018d\u0005D\u0000\u0000\u018d\u018f\u00050\u0000\u0000"+
		"\u018e\u017d\u0001\u0000\u0000\u0000\u018e\u0187\u0001\u0000\u0000\u0000"+
		"\u018f3\u0001\u0000\u0000\u0000\u0190\u0191\u0005\u0015\u0000\u0000\u0191"+
		"\u0193\u0005;\u0000\u0000\u0192\u0194\u0003H$\u0000\u0193\u0192\u0001"+
		"\u0000\u0000\u0000\u0193\u0194\u0001\u0000\u0000\u0000\u0194\u0195\u0001"+
		"\u0000\u0000\u0000\u0195\u0196\u0005<\u0000\u0000\u0196\u0197\u0005A\u0000"+
		"\u0000\u0197\u0198\u00053\u0000\u0000\u0198\u0199\u00050\u0000\u0000\u0199"+
		"\u019a\u0003\u0002\u0001\u0000\u019a\u019b\u0005\u001f\u0000\u0000\u019b"+
		"5\u0001\u0000\u0000\u0000\u019c\u019d\u0005\u0001\u0000\u0000\u019d\u019e"+
		"\u0005\u0011\u0000\u0000\u019e\u019f\u0003J%\u0000\u019f7\u0001\u0000"+
		"\u0000\u0000\u01a0\u01a1\u0005\u0001\u0000\u0000\u01a1\u01a2\u0005\u0011"+
		"\u0000\u0000\u01a2\u01a3\u00059\u0000\u0000\u01a3\u01a4\u00054\u0000\u0000"+
		"\u01a4\u01a5\u0005:\u0000\u0000\u01a59\u0001\u0000\u0000\u0000\u01a6\u01a7"+
		"\u0005\u0003\u0000\u0000\u01a7\u01a8\u0005D\u0000\u0000\u01a8;\u0001\u0000"+
		"\u0000\u0000\u01a9\u01aa\u0005\"\u0000\u0000\u01aa\u01ab\u0005A\u0000"+
		"\u0000\u01ab\u01ac\u0003\u0002\u0001\u0000\u01ac\u01ad\u0005\u000b\u0000"+
		"\u0000\u01ad\u01b4\u0005A\u0000\u0000\u01ae\u01af\u00051\u0000\u0000\u01af"+
		"\u01b0\u0003J%\u0000\u01b0\u01b1\u00050\u0000\u0000\u01b1\u01b3\u0001"+
		"\u0000\u0000\u0000\u01b2\u01ae\u0001\u0000\u0000\u0000\u01b3\u01b6\u0001"+
		"\u0000\u0000\u0000\u01b4\u01b5\u0001\u0000\u0000\u0000\u01b4\u01b2\u0001"+
		"\u0000\u0000\u0000\u01b5\u01b7\u0001\u0000\u0000\u0000\u01b6\u01b4\u0001"+
		"\u0000\u0000\u0000\u01b7\u01b8\u0003\u0002\u0001\u0000\u01b8\u01b9\u0005"+
		"\u001f\u0000\u0000\u01b9=\u0001\u0000\u0000\u0000\u01ba\u01bb\u0005\u001b"+
		"\u0000\u0000\u01bb\u01bc\u0005;\u0000\u0000\u01bc\u01bd\u0003J%\u0000"+
		"\u01bd\u01be\u0005<\u0000\u0000\u01be\u01bf\u0005A\u0000\u0000\u01bf\u01c0"+
		"\u0003\u0002\u0001\u0000\u01c0\u01c1\u0005\u001f\u0000\u0000\u01c1?\u0001"+
		"\u0000\u0000\u0000\u01c2\u01c3\u0005\u0015\u0000\u0000\u01c3\u01c4\u0005"+
		"\f\u0000\u0000\u01c4\u01c5\u0005;\u0000\u0000\u01c5\u01c6\u0005D\u0000"+
		"\u0000\u01c6\u01c7\u0005<\u0000\u0000\u01c7\u01c8\u0005A\u0000\u0000\u01c8"+
		"\u01c9\u0003\u0002\u0001\u0000\u01c9\u01ca\u0005\u001f\u0000\u0000\u01ca"+
		"A\u0001\u0000\u0000\u0000\u01cb\u01d0\u0005D\u0000\u0000\u01cc\u01cd\u0005"+
		"?\u0000\u0000\u01cd\u01cf\u0005D\u0000\u0000\u01ce\u01cc\u0001\u0000\u0000"+
		"\u0000\u01cf\u01d2\u0001\u0000\u0000\u0000\u01d0\u01ce\u0001\u0000\u0000"+
		"\u0000\u01d0\u01d1\u0001\u0000\u0000\u0000\u01d1C\u0001\u0000\u0000\u0000"+
		"\u01d2\u01d0\u0001\u0000\u0000\u0000\u01d3\u01d8\u0005\u001c\u0000\u0000"+
		"\u01d4\u01d5\u0005\u0002\u0000\u0000\u01d5\u01d7\u0005D\u0000\u0000\u01d6"+
		"\u01d4\u0001\u0000\u0000\u0000\u01d7\u01da\u0001\u0000\u0000\u0000\u01d8"+
		"\u01d9\u0001\u0000\u0000\u0000\u01d8\u01d6\u0001\u0000\u0000\u0000\u01d9"+
		"\u01db\u0001\u0000\u0000\u0000\u01da\u01d8\u0001\u0000\u0000\u0000\u01db"+
		"\u01df\u0005;\u0000\u0000\u01dc\u01de\u0007\u0001\u0000\u0000\u01dd\u01dc"+
		"\u0001\u0000\u0000\u0000\u01de\u01e1\u0001\u0000\u0000\u0000\u01df\u01e0"+
		"\u0001\u0000\u0000\u0000\u01df\u01dd\u0001\u0000\u0000\u0000\u01e0\u01e5"+
		"\u0001\u0000\u0000\u0000\u01e1\u01df\u0001\u0000\u0000\u0000\u01e2\u01e4"+
		"\u0005?\u0000\u0000\u01e3\u01e2\u0001\u0000\u0000\u0000\u01e4\u01e7\u0001"+
		"\u0000\u0000\u0000\u01e5\u01e6\u0001\u0000\u0000\u0000\u01e5\u01e3\u0001"+
		"\u0000\u0000\u0000\u01e6\u01e8\u0001\u0000\u0000\u0000\u01e7\u01e5\u0001"+
		"\u0000\u0000\u0000\u01e8\u01e9\u0005<\u0000\u0000\u01e9E\u0001\u0000\u0000"+
		"\u0000\u01ea\u01ec\u0003:\u001d\u0000\u01eb\u01ea\u0001\u0000\u0000\u0000"+
		"\u01eb\u01ec\u0001\u0000\u0000\u0000\u01ec\u01ed\u0001\u0000\u0000\u0000"+
		"\u01ed\u01ee\u0005#\u0000\u0000\u01ee\u01f1\u0005D\u0000\u0000\u01ef\u01f0"+
		"\u0005A\u0000\u0000\u01f0\u01f2\u0005D\u0000\u0000\u01f1\u01ef\u0001\u0000"+
		"\u0000\u0000\u01f1\u01f2\u0001\u0000\u0000\u0000\u01f2\u01f3\u0001\u0000"+
		"\u0000\u0000\u01f3\u01f4\u00057\u0000\u0000\u01f4\u01f5\u0003\u0002\u0001"+
		"\u0000\u01f5\u01f6\u00058\u0000\u0000\u01f6G\u0001\u0000\u0000\u0000\u01f7"+
		"\u01fc\u0003J%\u0000\u01f8\u01f9\u0005?\u0000\u0000\u01f9\u01fb\u0003"+
		"J%\u0000\u01fa\u01f8\u0001\u0000\u0000\u0000\u01fb\u01fe\u0001\u0000\u0000"+
		"\u0000\u01fc\u01fa\u0001\u0000\u0000\u0000\u01fc\u01fd\u0001\u0000\u0000"+
		"\u0000\u01fdI\u0001\u0000\u0000\u0000\u01fe\u01fc\u0001\u0000\u0000\u0000"+
		"\u01ff\u0200\u0006%\uffff\uffff\u0000\u0200\u0201\u00053\u0000\u0000\u0201"+
		"\u022d\u0003J%\u0019\u0202\u0203\u0005/\u0000\u0000\u0203\u022d\u0003"+
		"J%\u0018\u0204\u022d\u0005C\u0000\u0000\u0205\u022d\u0005B\u0000\u0000"+
		"\u0206\u022d\u0005!\u0000\u0000\u0207\u0209\u0003\n\u0005\u0000\u0208"+
		"\u020a\u0003P(\u0000\u0209\u0208\u0001\u0000\u0000\u0000\u0209\u020a\u0001"+
		"\u0000\u0000\u0000\u020a\u022d\u0001\u0000\u0000\u0000\u020b\u020d\u0003"+
		"L&\u0000\u020c\u020e\u0003P(\u0000\u020d\u020c\u0001\u0000\u0000\u0000"+
		"\u020d\u020e\u0001\u0000\u0000\u0000\u020e\u022d\u0001\u0000\u0000\u0000"+
		"\u020f\u0211\u0005D\u0000\u0000\u0210\u0212\u0003P(\u0000\u0211\u0210"+
		"\u0001\u0000\u0000\u0000\u0211\u0212\u0001\u0000\u0000\u0000\u0212\u022d"+
		"\u0001\u0000\u0000\u0000\u0213\u0215\u0005F\u0000\u0000\u0214\u0216\u0003"+
		"P(\u0000\u0215\u0214\u0001\u0000\u0000\u0000\u0215\u0216\u0001\u0000\u0000"+
		"\u0000\u0216\u022d\u0001\u0000\u0000\u0000\u0217\u0218\u0005;\u0000\u0000"+
		"\u0218\u0219\u0003J%\u0000\u0219\u021b\u0005<\u0000\u0000\u021a\u021c"+
		"\u0003P(\u0000\u021b\u021a\u0001\u0000\u0000\u0000\u021b\u021c\u0001\u0000"+
		"\u0000\u0000\u021c\u022d\u0001\u0000\u0000\u0000\u021d\u021e\u0005\u0013"+
		"\u0000\u0000\u021e\u0220\u0005;\u0000\u0000\u021f\u0221\u0005F\u0000\u0000"+
		"\u0220\u021f\u0001\u0000\u0000\u0000\u0220\u0221\u0001\u0000\u0000\u0000"+
		"\u0221\u0222\u0001\u0000\u0000\u0000\u0222\u022d\u0005<\u0000\u0000\u0223"+
		"\u022d\u0003\u001c\u000e\u0000\u0224\u0225\u0005\r\u0000\u0000\u0225\u0226"+
		"\u0005;\u0000\u0000\u0226\u0227\u0003J%\u0000\u0227\u0228\u0005<\u0000"+
		"\u0000\u0228\u022d\u0001\u0000\u0000\u0000\u0229\u022d\u00034\u001a\u0000"+
		"\u022a\u022d\u0003\u001c\u000e\u0000\u022b\u022d\u0003N\'\u0000\u022c"+
		"\u01ff\u0001\u0000\u0000\u0000\u022c\u0202\u0001\u0000\u0000\u0000\u022c"+
		"\u0204\u0001\u0000\u0000\u0000\u022c\u0205\u0001\u0000\u0000\u0000\u022c"+
		"\u0206\u0001\u0000\u0000\u0000\u022c\u0207\u0001\u0000\u0000\u0000\u022c"+
		"\u020b\u0001\u0000\u0000\u0000\u022c\u020f\u0001\u0000\u0000\u0000\u022c"+
		"\u0213\u0001\u0000\u0000\u0000\u022c\u0217\u0001\u0000\u0000\u0000\u022c"+
		"\u021d\u0001\u0000\u0000\u0000\u022c\u0223\u0001\u0000\u0000\u0000\u022c"+
		"\u0224\u0001\u0000\u0000\u0000\u022c\u0229\u0001\u0000\u0000\u0000\u022c"+
		"\u022a\u0001\u0000\u0000\u0000\u022c\u022b\u0001\u0000\u0000\u0000\u022d"+
		"\u024e\u0001\u0000\u0000\u0000\u022e\u022f\n\u0017\u0000\u0000\u022f\u0230"+
		"\u0005.\u0000\u0000\u0230\u024d\u0003J%\u0017\u0231\u0232\n\u0016\u0000"+
		"\u0000\u0232\u0233\u0007\u0002\u0000\u0000\u0233\u024d\u0003J%\u0017\u0234"+
		"\u0235\n\u0015\u0000\u0000\u0235\u0236\u0007\u0003\u0000\u0000\u0236\u024d"+
		"\u0003J%\u0016\u0237\u0238\n\u0014\u0000\u0000\u0238\u0239\u0007\u0004"+
		"\u0000\u0000\u0239\u024d\u0003J%\u0015\u023a\u023b\n\u0013\u0000\u0000"+
		"\u023b\u023c\u0007\u0005\u0000\u0000\u023c\u024d\u0003J%\u0014\u023d\u023e"+
		"\n\u0012\u0000\u0000\u023e\u023f\u0005)\u0000\u0000\u023f\u024d\u0003"+
		"J%\u0013\u0240\u0241\n\u0011\u0000\u0000\u0241\u0242\u0005\'\u0000\u0000"+
		"\u0242\u024d\u0003J%\u0012\u0243\u0244\n\u0010\u0000\u0000\u0244\u0245"+
		"\u0005@\u0000\u0000\u0245\u0246\u0003J%\u0000\u0246\u0247\u0005A\u0000"+
		"\u0000\u0247\u0248\u0003J%\u0011\u0248\u024d\u0001\u0000\u0000\u0000\u0249"+
		"\u024a\n\u000f\u0000\u0000\u024a\u024b\u0005 \u0000\u0000\u024b\u024d"+
		"\u0003J%\u0010\u024c\u022e\u0001\u0000\u0000\u0000\u024c\u0231\u0001\u0000"+
		"\u0000\u0000\u024c\u0234\u0001\u0000\u0000\u0000\u024c\u0237\u0001\u0000"+
		"\u0000\u0000\u024c\u023a\u0001\u0000\u0000\u0000\u024c\u023d\u0001\u0000"+
		"\u0000\u0000\u024c\u0240\u0001\u0000\u0000\u0000\u024c\u0243\u0001\u0000"+
		"\u0000\u0000\u024c\u0249\u0001\u0000\u0000\u0000\u024d\u0250\u0001\u0000"+
		"\u0000\u0000\u024e\u024c\u0001\u0000\u0000\u0000\u024e\u024f\u0001\u0000"+
		"\u0000\u0000\u024fK\u0001\u0000\u0000\u0000\u0250\u024e\u0001\u0000\u0000"+
		"\u0000\u0251\u0253\u00059\u0000\u0000\u0252\u0254\u0003H$\u0000\u0253"+
		"\u0252\u0001\u0000\u0000\u0000\u0253\u0254\u0001\u0000\u0000\u0000\u0254"+
		"\u0255\u0001\u0000\u0000\u0000\u0255\u0256\u0005:\u0000\u0000\u0256M\u0001"+
		"\u0000\u0000\u0000\u0257\u0258\u0005D\u0000\u0000\u0258\u0259\u0005(\u0000"+
		"\u0000\u0259\u025a\u0005D\u0000\u0000\u025aO\u0001\u0000\u0000\u0000\u025b"+
		"\u025c\u00059\u0000\u0000\u025c\u025d\u0003J%\u0000\u025d\u025e\u0005"+
		":\u0000\u0000\u025e\u0260\u0001\u0000\u0000\u0000\u025f\u025b\u0001\u0000"+
		"\u0000\u0000\u0260\u0261\u0001\u0000\u0000\u0000\u0261\u025f\u0001\u0000"+
		"\u0000\u0000\u0261\u0262\u0001\u0000\u0000\u0000\u0262Q\u0001\u0000\u0000"+
		"\u00004SV]egn\u0083\u0096\u009a\u009d\u00a5\u00a9\u00ae\u00b4\u00c6\u00c9"+
		"\u00cf\u00d6\u00e2\u00ed\u00fa\u00fe\u011f\u012c\u012f\u0136\u0146\u014c"+
		"\u015a\u015f\u0184\u018e\u0193\u01b4\u01d0\u01d8\u01df\u01e5\u01eb\u01f1"+
		"\u01fc\u0209\u020d\u0211\u0215\u021b\u0220\u022c\u024c\u024e\u0253\u0261";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}