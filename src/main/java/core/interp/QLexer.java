// Generated from /Users/harryharbuck-marlowe/Downloads/Q/src/main/java/core/etc/Q.g4 by ANTLR 4.9.2
package core.interp;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class QLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, Println=14, Async=15, Var=16, Import=17, 
		Print=18, Input=19, Assert=20, Def=21, If=22, Else=23, Package=24, Return=25, 
		For=26, While=27, To=28, Do=29, End=30, In=31, Null=32, Try=33, Class=34, 
		Const=35, Self=36, Native=37, Or=38, Accessor=39, And=40, Equals=41, NEquals=42, 
		GTEquals=43, LTEquals=44, Pow=45, Excl=46, GT=47, LT=48, Add=49, Subtract=50, 
		Multiply=51, Divide=52, Modulus=53, OBrace=54, CBrace=55, OBracket=56, 
		CBracket=57, OParen=58, CParen=59, SColon=60, Assign=61, Comma=62, QMark=63, 
		Colon=64, Bool=65, Number=66, Identifier=67, String=68, Comment=69, Space=70;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "Println", "Async", "Var", "Import", 
			"Print", "Input", "Assert", "Def", "If", "Else", "Package", "Return", 
			"For", "While", "To", "Do", "End", "In", "Null", "Try", "Class", "Const", 
			"Self", "Native", "Or", "Accessor", "And", "Equals", "NEquals", "GTEquals", 
			"LTEquals", "Pow", "Excl", "GT", "LT", "Add", "Subtract", "Multiply", 
			"Divide", "Modulus", "OBrace", "CBrace", "OBracket", "CBracket", "OParen", 
			"CParen", "SColon", "Assign", "Comma", "QMark", "Colon", "Bool", "Number", 
			"Identifier", "String", "Comment", "Space", "Int", "Digit", "ESC", "UNICODE", 
			"HEX"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'@'", "'header'", "'cn'", "'new'", "'as'", "'sys'", "'i3v8wm08wxpudwty0'", 
			"'range'", "'#'", "'except'", "'main'", "'3YCMPJ8W8VVTUA48TIHR8K332PYKTXOKVDFG'", 
			null, "'async'", "'var'", "'import'", null, null, "'assert'", "'fn'", 
			"'if'", "'else'", "'namespace'", "'return'", "'for'", "'while'", "'to'", 
			"'do'", "'end'", "'in'", "'null'", "'try'", "'class'", "'const'", "'self'", 
			"'native'", "'||'", "'::'", "'&&'", "'=='", "'!='", "'>='", "'<='", "'^'", 
			"'!'", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'%'", "'{'", "'}'", 
			"'['", "']'", "'('", "')'", "';'", "'='", "','", "'?'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "Println", "Async", "Var", "Import", "Print", "Input", "Assert", 
			"Def", "If", "Else", "Package", "Return", "For", "While", "To", "Do", 
			"End", "In", "Null", "Try", "Class", "Const", "Self", "Native", "Or", 
			"Accessor", "And", "Equals", "NEquals", "GTEquals", "LTEquals", "Pow", 
			"Excl", "GT", "LT", "Add", "Subtract", "Multiply", "Divide", "Modulus", 
			"OBrace", "CBrace", "OBracket", "CBracket", "OParen", "CParen", "SColon", 
			"Assign", "Comma", "QMark", "Colon", "Bool", "Number", "Identifier", 
			"String", "Comment", "Space"
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


	public QLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Q.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2H\u0253\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3!\3"+
		"!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3"+
		"%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3"+
		"+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3"+
		"\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;"+
		"\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3B\3B\3B\3B\3B\3B\3B\5B"+
		"\u01e9\nB\3C\3C\3C\7C\u01ee\nC\fC\16C\u01f1\13C\5C\u01f3\nC\3D\3D\7D\u01f7"+
		"\nD\fD\16D\u01fa\13D\3E\3E\3E\6E\u01ff\nE\rE\16E\u0200\3E\3E\3E\3E\6E"+
		"\u0207\nE\rE\16E\u0208\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\7E\u0215\nE\fE\16"+
		"E\u0218\13E\3E\3E\3E\5E\u021d\nE\3F\3F\3F\3F\7F\u0223\nF\fF\16F\u0226"+
		"\13F\3F\3F\3F\3F\7F\u022c\nF\fF\16F\u022f\13F\3F\3F\5F\u0233\nF\3F\3F"+
		"\3G\3G\3G\3G\3H\3H\7H\u023d\nH\fH\16H\u0240\13H\3H\5H\u0243\nH\3I\3I\3"+
		"J\3J\3J\5J\u024a\nJ\3K\3K\3K\3K\3K\3K\3L\3L\4\u0216\u022d\2M\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w"+
		"=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008f\2"+
		"\u0091\2\u0093\2\u0095\2\u0097\2\3\2\f\5\2C\\aac|\6\2\62;C\\aac|\6\2\f"+
		"\f\17\17$$^^\5\2\f\f\17\17^^\4\2\f\f\17\17\5\2\13\f\16\17\"\"\3\2\63;"+
		"\3\2\62;\t\2$$^^ddhhppttvv\5\2\62;CHch\2\u0261\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2"+
		"\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y"+
		"\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2"+
		"\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2"+
		"\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177"+
		"\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2"+
		"\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\3\u0099\3\2\2\2\5\u009b"+
		"\3\2\2\2\7\u009d\3\2\2\2\t\u00a4\3\2\2\2\13\u00a7\3\2\2\2\r\u00ab\3\2"+
		"\2\2\17\u00ae\3\2\2\2\21\u00b2\3\2\2\2\23\u00c4\3\2\2\2\25\u00ca\3\2\2"+
		"\2\27\u00cc\3\2\2\2\31\u00d3\3\2\2\2\33\u00d8\3\2\2\2\35\u00fd\3\2\2\2"+
		"\37\u0115\3\2\2\2!\u011b\3\2\2\2#\u011f\3\2\2\2%\u0126\3\2\2\2\'\u013e"+
		"\3\2\2\2)\u0147\3\2\2\2+\u014e\3\2\2\2-\u0151\3\2\2\2/\u0154\3\2\2\2\61"+
		"\u0159\3\2\2\2\63\u0163\3\2\2\2\65\u016a\3\2\2\2\67\u016e\3\2\2\29\u0174"+
		"\3\2\2\2;\u0177\3\2\2\2=\u017a\3\2\2\2?\u017e\3\2\2\2A\u0181\3\2\2\2C"+
		"\u0186\3\2\2\2E\u018a\3\2\2\2G\u0190\3\2\2\2I\u0196\3\2\2\2K\u019b\3\2"+
		"\2\2M\u01a2\3\2\2\2O\u01a5\3\2\2\2Q\u01a8\3\2\2\2S\u01ab\3\2\2\2U\u01ae"+
		"\3\2\2\2W\u01b1\3\2\2\2Y\u01b4\3\2\2\2[\u01b7\3\2\2\2]\u01b9\3\2\2\2_"+
		"\u01bb\3\2\2\2a\u01bd\3\2\2\2c\u01bf\3\2\2\2e\u01c1\3\2\2\2g\u01c3\3\2"+
		"\2\2i\u01c5\3\2\2\2k\u01c7\3\2\2\2m\u01c9\3\2\2\2o\u01cb\3\2\2\2q\u01cd"+
		"\3\2\2\2s\u01cf\3\2\2\2u\u01d1\3\2\2\2w\u01d3\3\2\2\2y\u01d5\3\2\2\2{"+
		"\u01d7\3\2\2\2}\u01d9\3\2\2\2\177\u01db\3\2\2\2\u0081\u01dd\3\2\2\2\u0083"+
		"\u01e8\3\2\2\2\u0085\u01ea\3\2\2\2\u0087\u01f4\3\2\2\2\u0089\u021c\3\2"+
		"\2\2\u008b\u0232\3\2\2\2\u008d\u0236\3\2\2\2\u008f\u0242\3\2\2\2\u0091"+
		"\u0244\3\2\2\2\u0093\u0246\3\2\2\2\u0095\u024b\3\2\2\2\u0097\u0251\3\2"+
		"\2\2\u0099\u009a\7\60\2\2\u009a\4\3\2\2\2\u009b\u009c\7B\2\2\u009c\6\3"+
		"\2\2\2\u009d\u009e\7j\2\2\u009e\u009f\7g\2\2\u009f\u00a0\7c\2\2\u00a0"+
		"\u00a1\7f\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3\7t\2\2\u00a3\b\3\2\2\2\u00a4"+
		"\u00a5\7e\2\2\u00a5\u00a6\7p\2\2\u00a6\n\3\2\2\2\u00a7\u00a8\7p\2\2\u00a8"+
		"\u00a9\7g\2\2\u00a9\u00aa\7y\2\2\u00aa\f\3\2\2\2\u00ab\u00ac\7c\2\2\u00ac"+
		"\u00ad\7u\2\2\u00ad\16\3\2\2\2\u00ae\u00af\7u\2\2\u00af\u00b0\7{\2\2\u00b0"+
		"\u00b1\7u\2\2\u00b1\20\3\2\2\2\u00b2\u00b3\7k\2\2\u00b3\u00b4\7\65\2\2"+
		"\u00b4\u00b5\7x\2\2\u00b5\u00b6\7:\2\2\u00b6\u00b7\7y\2\2\u00b7\u00b8"+
		"\7o\2\2\u00b8\u00b9\7\62\2\2\u00b9\u00ba\7:\2\2\u00ba\u00bb\7y\2\2\u00bb"+
		"\u00bc\7z\2\2\u00bc\u00bd\7r\2\2\u00bd\u00be\7w\2\2\u00be\u00bf\7f\2\2"+
		"\u00bf\u00c0\7y\2\2\u00c0\u00c1\7v\2\2\u00c1\u00c2\7{\2\2\u00c2\u00c3"+
		"\7\62\2\2\u00c3\22\3\2\2\2\u00c4\u00c5\7t\2\2\u00c5\u00c6\7c\2\2\u00c6"+
		"\u00c7\7p\2\2\u00c7\u00c8\7i\2\2\u00c8\u00c9\7g\2\2\u00c9\24\3\2\2\2\u00ca"+
		"\u00cb\7%\2\2\u00cb\26\3\2\2\2\u00cc\u00cd\7g\2\2\u00cd\u00ce\7z\2\2\u00ce"+
		"\u00cf\7e\2\2\u00cf\u00d0\7g\2\2\u00d0\u00d1\7r\2\2\u00d1\u00d2\7v\2\2"+
		"\u00d2\30\3\2\2\2\u00d3\u00d4\7o\2\2\u00d4\u00d5\7c\2\2\u00d5\u00d6\7"+
		"k\2\2\u00d6\u00d7\7p\2\2\u00d7\32\3\2\2\2\u00d8\u00d9\7\65\2\2\u00d9\u00da"+
		"\7[\2\2\u00da\u00db\7E\2\2\u00db\u00dc\7O\2\2\u00dc\u00dd\7R\2\2\u00dd"+
		"\u00de\7L\2\2\u00de\u00df\7:\2\2\u00df\u00e0\7Y\2\2\u00e0\u00e1\7:\2\2"+
		"\u00e1\u00e2\7X\2\2\u00e2\u00e3\7X\2\2\u00e3\u00e4\7V\2\2\u00e4\u00e5"+
		"\7W\2\2\u00e5\u00e6\7C\2\2\u00e6\u00e7\7\66\2\2\u00e7\u00e8\7:\2\2\u00e8"+
		"\u00e9\7V\2\2\u00e9\u00ea\7K\2\2\u00ea\u00eb\7J\2\2\u00eb\u00ec\7T\2\2"+
		"\u00ec\u00ed\7:\2\2\u00ed\u00ee\7M\2\2\u00ee\u00ef\7\65\2\2\u00ef\u00f0"+
		"\7\65\2\2\u00f0\u00f1\7\64\2\2\u00f1\u00f2\7R\2\2\u00f2\u00f3\7[\2\2\u00f3"+
		"\u00f4\7M\2\2\u00f4\u00f5\7V\2\2\u00f5\u00f6\7Z\2\2\u00f6\u00f7\7Q\2\2"+
		"\u00f7\u00f8\7M\2\2\u00f8\u00f9\7X\2\2\u00f9\u00fa\7F\2\2\u00fa\u00fb"+
		"\7H\2\2\u00fb\u00fc\7I\2\2\u00fc\34\3\2\2\2\u00fd\u00fe\7u\2\2\u00fe\u00ff"+
		"\7v\2\2\u00ff\u0100\7f\2\2\u0100\u0101\3\2\2\2\u0101\u0102\5O(\2\u0102"+
		"\u0103\7S\2\2\u0103\u0104\7C\2\2\u0104\u0105\7X\2\2\u0105\u0106\7D\2\2"+
		"\u0106\u0107\7:\2\2\u0107\u0108\7M\2\2\u0108\u0109\7K\2\2\u0109\u010a"+
		"\79\2\2\u010a\u010b\7\64\2\2\u010b\u010c\7L\2\2\u010c\u010d\78\2\2\u010d"+
		"\u010e\7\67\2\2\u010e\u010f\7;\2\2\u010f\u0110\7\63\2\2\u0110\u0111\7"+
		";\2\2\u0111\u0112\7[\2\2\u0112\u0113\7N\2\2\u0113\u0114\7E\2\2\u0114\36"+
		"\3\2\2\2\u0115\u0116\7c\2\2\u0116\u0117\7u\2\2\u0117\u0118\7{\2\2\u0118"+
		"\u0119\7p\2\2\u0119\u011a\7e\2\2\u011a \3\2\2\2\u011b\u011c\7x\2\2\u011c"+
		"\u011d\7c\2\2\u011d\u011e\7t\2\2\u011e\"\3\2\2\2\u011f\u0120\7k\2\2\u0120"+
		"\u0121\7o\2\2\u0121\u0122\7r\2\2\u0122\u0123\7q\2\2\u0123\u0124\7t\2\2"+
		"\u0124\u0125\7v\2\2\u0125$\3\2\2\2\u0126\u0127\7u\2\2\u0127\u0128\7v\2"+
		"\2\u0128\u0129\7f\2\2\u0129\u012a\3\2\2\2\u012a\u012b\5O(\2\u012b\u012c"+
		"\7C\2\2\u012c\u012d\7Z\2\2\u012d\u012e\79\2\2\u012e\u012f\7O\2\2\u012f"+
		"\u0130\7T\2\2\u0130\u0131\7U\2\2\u0131\u0132\7W\2\2\u0132\u0133\7Z\2\2"+
		"\u0133\u0134\7S\2\2\u0134\u0135\78\2\2\u0135\u0136\7\63\2\2\u0136\u0137"+
		"\7I\2\2\u0137\u0138\7:\2\2\u0138\u0139\7F\2\2\u0139\u013a\7Z\2\2\u013a"+
		"\u013b\7K\2\2\u013b\u013c\7\\\2\2\u013c\u013d\7Y\2\2\u013d&\3\2\2\2\u013e"+
		"\u013f\7u\2\2\u013f\u0140\7v\2\2\u0140\u0141\7f\2\2\u0141\u0142\3\2\2"+
		"\2\u0142\u0143\5O(\2\u0143\u0144\7e\2\2\u0144\u0145\7k\2\2\u0145\u0146"+
		"\7p\2\2\u0146(\3\2\2\2\u0147\u0148\7c\2\2\u0148\u0149\7u\2\2\u0149\u014a"+
		"\7u\2\2\u014a\u014b\7g\2\2\u014b\u014c\7t\2\2\u014c\u014d\7v\2\2\u014d"+
		"*\3\2\2\2\u014e\u014f\7h\2\2\u014f\u0150\7p\2\2\u0150,\3\2\2\2\u0151\u0152"+
		"\7k\2\2\u0152\u0153\7h\2\2\u0153.\3\2\2\2\u0154\u0155\7g\2\2\u0155\u0156"+
		"\7n\2\2\u0156\u0157\7u\2\2\u0157\u0158\7g\2\2\u0158\60\3\2\2\2\u0159\u015a"+
		"\7p\2\2\u015a\u015b\7c\2\2\u015b\u015c\7o\2\2\u015c\u015d\7g\2\2\u015d"+
		"\u015e\7u\2\2\u015e\u015f\7r\2\2\u015f\u0160\7c\2\2\u0160\u0161\7e\2\2"+
		"\u0161\u0162\7g\2\2\u0162\62\3\2\2\2\u0163\u0164\7t\2\2\u0164\u0165\7"+
		"g\2\2\u0165\u0166\7v\2\2\u0166\u0167\7w\2\2\u0167\u0168\7t\2\2\u0168\u0169"+
		"\7p\2\2\u0169\64\3\2\2\2\u016a\u016b\7h\2\2\u016b\u016c\7q\2\2\u016c\u016d"+
		"\7t\2\2\u016d\66\3\2\2\2\u016e\u016f\7y\2\2\u016f\u0170\7j\2\2\u0170\u0171"+
		"\7k\2\2\u0171\u0172\7n\2\2\u0172\u0173\7g\2\2\u01738\3\2\2\2\u0174\u0175"+
		"\7v\2\2\u0175\u0176\7q\2\2\u0176:\3\2\2\2\u0177\u0178\7f\2\2\u0178\u0179"+
		"\7q\2\2\u0179<\3\2\2\2\u017a\u017b\7g\2\2\u017b\u017c\7p\2\2\u017c\u017d"+
		"\7f\2\2\u017d>\3\2\2\2\u017e\u017f\7k\2\2\u017f\u0180\7p\2\2\u0180@\3"+
		"\2\2\2\u0181\u0182\7p\2\2\u0182\u0183\7w\2\2\u0183\u0184\7n\2\2\u0184"+
		"\u0185\7n\2\2\u0185B\3\2\2\2\u0186\u0187\7v\2\2\u0187\u0188\7t\2\2\u0188"+
		"\u0189\7{\2\2\u0189D\3\2\2\2\u018a\u018b\7e\2\2\u018b\u018c\7n\2\2\u018c"+
		"\u018d\7c\2\2\u018d\u018e\7u\2\2\u018e\u018f\7u\2\2\u018fF\3\2\2\2\u0190"+
		"\u0191\7e\2\2\u0191\u0192\7q\2\2\u0192\u0193\7p\2\2\u0193\u0194\7u\2\2"+
		"\u0194\u0195\7v\2\2\u0195H\3\2\2\2\u0196\u0197\7u\2\2\u0197\u0198\7g\2"+
		"\2\u0198\u0199\7n\2\2\u0199\u019a\7h\2\2\u019aJ\3\2\2\2\u019b\u019c\7"+
		"p\2\2\u019c\u019d\7c\2\2\u019d\u019e\7v\2\2\u019e\u019f\7k\2\2\u019f\u01a0"+
		"\7x\2\2\u01a0\u01a1\7g\2\2\u01a1L\3\2\2\2\u01a2\u01a3\7~\2\2\u01a3\u01a4"+
		"\7~\2\2\u01a4N\3\2\2\2\u01a5\u01a6\7<\2\2\u01a6\u01a7\7<\2\2\u01a7P\3"+
		"\2\2\2\u01a8\u01a9\7(\2\2\u01a9\u01aa\7(\2\2\u01aaR\3\2\2\2\u01ab\u01ac"+
		"\7?\2\2\u01ac\u01ad\7?\2\2\u01adT\3\2\2\2\u01ae\u01af\7#\2\2\u01af\u01b0"+
		"\7?\2\2\u01b0V\3\2\2\2\u01b1\u01b2\7@\2\2\u01b2\u01b3\7?\2\2\u01b3X\3"+
		"\2\2\2\u01b4\u01b5\7>\2\2\u01b5\u01b6\7?\2\2\u01b6Z\3\2\2\2\u01b7\u01b8"+
		"\7`\2\2\u01b8\\\3\2\2\2\u01b9\u01ba\7#\2\2\u01ba^\3\2\2\2\u01bb\u01bc"+
		"\7@\2\2\u01bc`\3\2\2\2\u01bd\u01be\7>\2\2\u01beb\3\2\2\2\u01bf\u01c0\7"+
		"-\2\2\u01c0d\3\2\2\2\u01c1\u01c2\7/\2\2\u01c2f\3\2\2\2\u01c3\u01c4\7,"+
		"\2\2\u01c4h\3\2\2\2\u01c5\u01c6\7\61\2\2\u01c6j\3\2\2\2\u01c7\u01c8\7"+
		"\'\2\2\u01c8l\3\2\2\2\u01c9\u01ca\7}\2\2\u01can\3\2\2\2\u01cb\u01cc\7"+
		"\177\2\2\u01ccp\3\2\2\2\u01cd\u01ce\7]\2\2\u01cer\3\2\2\2\u01cf\u01d0"+
		"\7_\2\2\u01d0t\3\2\2\2\u01d1\u01d2\7*\2\2\u01d2v\3\2\2\2\u01d3\u01d4\7"+
		"+\2\2\u01d4x\3\2\2\2\u01d5\u01d6\7=\2\2\u01d6z\3\2\2\2\u01d7\u01d8\7?"+
		"\2\2\u01d8|\3\2\2\2\u01d9\u01da\7.\2\2\u01da~\3\2\2\2\u01db\u01dc\7A\2"+
		"\2\u01dc\u0080\3\2\2\2\u01dd\u01de\7<\2\2\u01de\u0082\3\2\2\2\u01df\u01e0"+
		"\7v\2\2\u01e0\u01e1\7t\2\2\u01e1\u01e2\7w\2\2\u01e2\u01e9\7g\2\2\u01e3"+
		"\u01e4\7h\2\2\u01e4\u01e5\7c\2\2\u01e5\u01e6\7n\2\2\u01e6\u01e7\7u\2\2"+
		"\u01e7\u01e9\7g\2\2\u01e8\u01df\3\2\2\2\u01e8\u01e3\3\2\2\2\u01e9\u0084"+
		"\3\2\2\2\u01ea\u01f2\5\u008fH\2\u01eb\u01ef\7\60\2\2\u01ec\u01ee\5\u0091"+
		"I\2\u01ed\u01ec\3\2\2\2\u01ee\u01f1\3\2\2\2\u01ef\u01ed\3\2\2\2\u01ef"+
		"\u01f0\3\2\2\2\u01f0\u01f3\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f2\u01eb\3\2"+
		"\2\2\u01f2\u01f3\3\2\2\2\u01f3\u0086\3\2\2\2\u01f4\u01f8\t\2\2\2\u01f5"+
		"\u01f7\t\3\2\2\u01f6\u01f5\3\2\2\2\u01f7\u01fa\3\2\2\2\u01f8\u01f6\3\2"+
		"\2\2\u01f8\u01f9\3\2\2\2\u01f9\u0088\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fb"+
		"\u01fe\7$\2\2\u01fc\u01ff\5\u0093J\2\u01fd\u01ff\n\4\2\2\u01fe\u01fc\3"+
		"\2\2\2\u01fe\u01fd\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u01fe\3\2\2\2\u0200"+
		"\u0201\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u021d\7$\2\2\u0203\u0206\7)\2"+
		"\2\u0204\u0207\5\u0093J\2\u0205\u0207\n\5\2\2\u0206\u0204\3\2\2\2\u0206"+
		"\u0205\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u0206\3\2\2\2\u0208\u0209\3\2"+
		"\2\2\u0209\u020a\3\2\2\2\u020a\u021d\7)\2\2\u020b\u020c\7$\2\2\u020c\u020d"+
		"\7$\2\2\u020d\u020e\7$\2\2\u020e\u0216\3\2\2\2\u020f\u0215\13\2\2\2\u0210"+
		"\u0215\5\u0093J\2\u0211\u0215\n\5\2\2\u0212\u0213\7^\2\2\u0213\u0215\7"+
		"p\2\2\u0214\u020f\3\2\2\2\u0214\u0210\3\2\2\2\u0214\u0211\3\2\2\2\u0214"+
		"\u0212\3\2\2\2\u0215\u0218\3\2\2\2\u0216\u0217\3\2\2\2\u0216\u0214\3\2"+
		"\2\2\u0217\u0219\3\2\2\2\u0218\u0216\3\2\2\2\u0219\u021a\7$\2\2\u021a"+
		"\u021b\7$\2\2\u021b\u021d\7$\2\2\u021c\u01fb\3\2\2\2\u021c\u0203\3\2\2"+
		"\2\u021c\u020b\3\2\2\2\u021d\u008a\3\2\2\2\u021e\u021f\7\61\2\2\u021f"+
		"\u0220\7\61\2\2\u0220\u0224\3\2\2\2\u0221\u0223\n\6\2\2\u0222\u0221\3"+
		"\2\2\2\u0223\u0226\3\2\2\2\u0224\u0222\3\2\2\2\u0224\u0225\3\2\2\2\u0225"+
		"\u0233\3\2\2\2\u0226\u0224\3\2\2\2\u0227\u0228\7\61\2\2\u0228\u0229\7"+
		",\2\2\u0229\u022d\3\2\2\2\u022a\u022c\13\2\2\2\u022b\u022a\3\2\2\2\u022c"+
		"\u022f\3\2\2\2\u022d\u022e\3\2\2\2\u022d\u022b\3\2\2\2\u022e\u0230\3\2"+
		"\2\2\u022f\u022d\3\2\2\2\u0230\u0231\7,\2\2\u0231\u0233\7\61\2\2\u0232"+
		"\u021e\3\2\2\2\u0232\u0227\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u0235\bF"+
		"\2\2\u0235\u008c\3\2\2\2\u0236\u0237\t\7\2\2\u0237\u0238\3\2\2\2\u0238"+
		"\u0239\bG\2\2\u0239\u008e\3\2\2\2\u023a\u023e\t\b\2\2\u023b\u023d\5\u0091"+
		"I\2\u023c\u023b\3\2\2\2\u023d\u0240\3\2\2\2\u023e\u023c\3\2\2\2\u023e"+
		"\u023f\3\2\2\2\u023f\u0243\3\2\2\2\u0240\u023e\3\2\2\2\u0241\u0243\7\62"+
		"\2\2\u0242\u023a\3\2\2\2\u0242\u0241\3\2\2\2\u0243\u0090\3\2\2\2\u0244"+
		"\u0245\t\t\2\2\u0245\u0092\3\2\2\2\u0246\u0249\7^\2\2\u0247\u024a\t\n"+
		"\2\2\u0248\u024a\5\u0095K\2\u0249\u0247\3\2\2\2\u0249\u0248\3\2\2\2\u024a"+
		"\u0094\3\2\2\2\u024b\u024c\7w\2\2\u024c\u024d\5\u0097L\2\u024d\u024e\5"+
		"\u0097L\2\u024e\u024f\5\u0097L\2\u024f\u0250\5\u0097L\2\u0250\u0096\3"+
		"\2\2\2\u0251\u0252\t\13\2\2\u0252\u0098\3\2\2\2\24\2\u01e8\u01ef\u01f2"+
		"\u01f8\u01fe\u0200\u0206\u0208\u0214\u0216\u021c\u0224\u022d\u0232\u023e"+
		"\u0242\u0249\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}