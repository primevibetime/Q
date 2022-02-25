// Generated from /Users/harryharbuck-marlowe/Desktop/Q/src/main/java/core/etc/Q.g4 by ANTLR 4.9.2
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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, Println=21, Render=22, AddComponent=23, 
		Var=24, Import=25, Print=26, Input=27, Assert=28, Def=29, ToInt=30, If=31, 
		Else=32, Return=33, For=34, While=35, To=36, Do=37, End=38, In=39, Null=40, 
		Try=41, Catch=42, Class=43, Or=44, And=45, Equals=46, NEquals=47, GTEquals=48, 
		LTEquals=49, Pow=50, Excl=51, GT=52, LT=53, Add=54, Subtract=55, Multiply=56, 
		Divide=57, Modulus=58, OBrace=59, CBrace=60, OBracket=61, CBracket=62, 
		OParen=63, CParen=64, SColon=65, Assign=66, Comma=67, QMark=68, Colon=69, 
		Bool=70, Number=71, Identifier=72, String=73, Comment=74, JavaTextBlock=75, 
		Space=76;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "Println", "Render", "AddComponent", "Var", 
			"Import", "Print", "Input", "Assert", "Def", "ToInt", "If", "Else", "Return", 
			"For", "While", "To", "Do", "End", "In", "Null", "Try", "Catch", "Class", 
			"Or", "And", "Equals", "NEquals", "GTEquals", "LTEquals", "Pow", "Excl", 
			"GT", "LT", "Add", "Subtract", "Multiply", "Divide", "Modulus", "OBrace", 
			"CBrace", "OBracket", "CBracket", "OParen", "CParen", "SColon", "Assign", 
			"Comma", "QMark", "Colon", "Bool", "Number", "Identifier", "String", 
			"Comment", "JavaTextBlock", "Space", "Int", "Digit"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'@'", "'header'", "'here'", "'const'", "'new'", "'as'", 
			"'List'", "'add'", "'remove'", "'sys'", "'write'", "'verify'", "'noval'", 
			"'range'", "'#'", "'all'", "'onflaw'", "'changeText'", "'fn main()'", 
			"'std:ln'", "'render'", "'addComp'", "'var'", "'import'", "'std:out'", 
			"'std:in'", "'assert'", "'fn'", "'toInt'", "'if'", "'else'", "'return'", 
			"'for'", "'while'", "'to'", "'do'", "'end'", "'in'", "'null'", "'try'", 
			"'catch'", "'class'", "'||'", "'&&'", "'=='", "'!='", "'>='", "'<='", 
			"'^'", "'!'", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'%'", "'{'", 
			"'}'", "'['", "']'", "'('", "')'", "';'", "'='", "','", "'?'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "Println", "Render", 
			"AddComponent", "Var", "Import", "Print", "Input", "Assert", "Def", "ToInt", 
			"If", "Else", "Return", "For", "While", "To", "Do", "End", "In", "Null", 
			"Try", "Catch", "Class", "Or", "And", "Equals", "NEquals", "GTEquals", 
			"LTEquals", "Pow", "Excl", "GT", "LT", "Add", "Subtract", "Multiply", 
			"Divide", "Modulus", "OBrace", "CBrace", "OBracket", "CBracket", "OParen", 
			"CParen", "SColon", "Assign", "Comma", "QMark", "Colon", "Bool", "Number", 
			"Identifier", "String", "Comment", "JavaTextBlock", "Space"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2N\u0225\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3"+
		"#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3"+
		")\3)\3)\3)\3)\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3-\3-\3"+
		"-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\63"+
		"\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;"+
		"\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G"+
		"\3G\3G\3G\3G\3G\3G\3G\3G\5G\u01ca\nG\3H\3H\3H\7H\u01cf\nH\fH\16H\u01d2"+
		"\13H\5H\u01d4\nH\3I\3I\7I\u01d8\nI\fI\16I\u01db\13I\3J\3J\3J\3J\7J\u01e1"+
		"\nJ\fJ\16J\u01e4\13J\3J\3J\3J\3J\3J\7J\u01eb\nJ\fJ\16J\u01ee\13J\3J\5"+
		"J\u01f1\nJ\3K\3K\3K\3K\7K\u01f7\nK\fK\16K\u01fa\13K\3K\3K\3K\3K\7K\u0200"+
		"\nK\fK\16K\u0203\13K\3K\3K\5K\u0207\nK\3K\3K\3L\3L\3L\3L\7L\u020f\nL\f"+
		"L\16L\u0212\13L\3L\3L\3M\3M\3M\3M\3N\3N\7N\u021c\nN\fN\16N\u021f\13N\3"+
		"N\5N\u0222\nN\3O\3O\3\u0201\2P\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61"+
		"a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087"+
		"E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009b"+
		"\2\u009d\2\3\2\f\5\2C\\aac|\6\2\62;C\\aac|\3\2$$\6\2\f\f\17\17$$^^\4\2"+
		"\f\f\17\17\3\2))\6\2\f\f\17\17))^^\5\2\13\f\16\17\"\"\3\2\63;\3\2\62;"+
		"\2\u0232\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2"+
		"\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y"+
		"\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3"+
		"\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2"+
		"\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095"+
		"\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\3\u009f\3\2\2\2\5\u00a1\3\2\2"+
		"\2\7\u00a3\3\2\2\2\t\u00aa\3\2\2\2\13\u00af\3\2\2\2\r\u00b5\3\2\2\2\17"+
		"\u00b9\3\2\2\2\21\u00bc\3\2\2\2\23\u00c1\3\2\2\2\25\u00c5\3\2\2\2\27\u00cc"+
		"\3\2\2\2\31\u00d0\3\2\2\2\33\u00d6\3\2\2\2\35\u00dd\3\2\2\2\37\u00e3\3"+
		"\2\2\2!\u00e9\3\2\2\2#\u00eb\3\2\2\2%\u00ef\3\2\2\2\'\u00f6\3\2\2\2)\u0101"+
		"\3\2\2\2+\u010b\3\2\2\2-\u0112\3\2\2\2/\u0119\3\2\2\2\61\u0121\3\2\2\2"+
		"\63\u0125\3\2\2\2\65\u012c\3\2\2\2\67\u0134\3\2\2\29\u013b\3\2\2\2;\u0142"+
		"\3\2\2\2=\u0145\3\2\2\2?\u014b\3\2\2\2A\u014e\3\2\2\2C\u0153\3\2\2\2E"+
		"\u015a\3\2\2\2G\u015e\3\2\2\2I\u0164\3\2\2\2K\u0167\3\2\2\2M\u016a\3\2"+
		"\2\2O\u016e\3\2\2\2Q\u0171\3\2\2\2S\u0176\3\2\2\2U\u017a\3\2\2\2W\u0180"+
		"\3\2\2\2Y\u0186\3\2\2\2[\u0189\3\2\2\2]\u018c\3\2\2\2_\u018f\3\2\2\2a"+
		"\u0192\3\2\2\2c\u0195\3\2\2\2e\u0198\3\2\2\2g\u019a\3\2\2\2i\u019c\3\2"+
		"\2\2k\u019e\3\2\2\2m\u01a0\3\2\2\2o\u01a2\3\2\2\2q\u01a4\3\2\2\2s\u01a6"+
		"\3\2\2\2u\u01a8\3\2\2\2w\u01aa\3\2\2\2y\u01ac\3\2\2\2{\u01ae\3\2\2\2}"+
		"\u01b0\3\2\2\2\177\u01b2\3\2\2\2\u0081\u01b4\3\2\2\2\u0083\u01b6\3\2\2"+
		"\2\u0085\u01b8\3\2\2\2\u0087\u01ba\3\2\2\2\u0089\u01bc\3\2\2\2\u008b\u01be"+
		"\3\2\2\2\u008d\u01c9\3\2\2\2\u008f\u01cb\3\2\2\2\u0091\u01d5\3\2\2\2\u0093"+
		"\u01f0\3\2\2\2\u0095\u0206\3\2\2\2\u0097\u020a\3\2\2\2\u0099\u0215\3\2"+
		"\2\2\u009b\u0221\3\2\2\2\u009d\u0223\3\2\2\2\u009f\u00a0\7\60\2\2\u00a0"+
		"\4\3\2\2\2\u00a1\u00a2\7B\2\2\u00a2\6\3\2\2\2\u00a3\u00a4\7j\2\2\u00a4"+
		"\u00a5\7g\2\2\u00a5\u00a6\7c\2\2\u00a6\u00a7\7f\2\2\u00a7\u00a8\7g\2\2"+
		"\u00a8\u00a9\7t\2\2\u00a9\b\3\2\2\2\u00aa\u00ab\7j\2\2\u00ab\u00ac\7g"+
		"\2\2\u00ac\u00ad\7t\2\2\u00ad\u00ae\7g\2\2\u00ae\n\3\2\2\2\u00af\u00b0"+
		"\7e\2\2\u00b0\u00b1\7q\2\2\u00b1\u00b2\7p\2\2\u00b2\u00b3\7u\2\2\u00b3"+
		"\u00b4\7v\2\2\u00b4\f\3\2\2\2\u00b5\u00b6\7p\2\2\u00b6\u00b7\7g\2\2\u00b7"+
		"\u00b8\7y\2\2\u00b8\16\3\2\2\2\u00b9\u00ba\7c\2\2\u00ba\u00bb\7u\2\2\u00bb"+
		"\20\3\2\2\2\u00bc\u00bd\7N\2\2\u00bd\u00be\7k\2\2\u00be\u00bf\7u\2\2\u00bf"+
		"\u00c0\7v\2\2\u00c0\22\3\2\2\2\u00c1\u00c2\7c\2\2\u00c2\u00c3\7f\2\2\u00c3"+
		"\u00c4\7f\2\2\u00c4\24\3\2\2\2\u00c5\u00c6\7t\2\2\u00c6\u00c7\7g\2\2\u00c7"+
		"\u00c8\7o\2\2\u00c8\u00c9\7q\2\2\u00c9\u00ca\7x\2\2\u00ca\u00cb\7g\2\2"+
		"\u00cb\26\3\2\2\2\u00cc\u00cd\7u\2\2\u00cd\u00ce\7{\2\2\u00ce\u00cf\7"+
		"u\2\2\u00cf\30\3\2\2\2\u00d0\u00d1\7y\2\2\u00d1\u00d2\7t\2\2\u00d2\u00d3"+
		"\7k\2\2\u00d3\u00d4\7v\2\2\u00d4\u00d5\7g\2\2\u00d5\32\3\2\2\2\u00d6\u00d7"+
		"\7x\2\2\u00d7\u00d8\7g\2\2\u00d8\u00d9\7t\2\2\u00d9\u00da\7k\2\2\u00da"+
		"\u00db\7h\2\2\u00db\u00dc\7{\2\2\u00dc\34\3\2\2\2\u00dd\u00de\7p\2\2\u00de"+
		"\u00df\7q\2\2\u00df\u00e0\7x\2\2\u00e0\u00e1\7c\2\2\u00e1\u00e2\7n\2\2"+
		"\u00e2\36\3\2\2\2\u00e3\u00e4\7t\2\2\u00e4\u00e5\7c\2\2\u00e5\u00e6\7"+
		"p\2\2\u00e6\u00e7\7i\2\2\u00e7\u00e8\7g\2\2\u00e8 \3\2\2\2\u00e9\u00ea"+
		"\7%\2\2\u00ea\"\3\2\2\2\u00eb\u00ec\7c\2\2\u00ec\u00ed\7n\2\2\u00ed\u00ee"+
		"\7n\2\2\u00ee$\3\2\2\2\u00ef\u00f0\7q\2\2\u00f0\u00f1\7p\2\2\u00f1\u00f2"+
		"\7h\2\2\u00f2\u00f3\7n\2\2\u00f3\u00f4\7c\2\2\u00f4\u00f5\7y\2\2\u00f5"+
		"&\3\2\2\2\u00f6\u00f7\7e\2\2\u00f7\u00f8\7j\2\2\u00f8\u00f9\7c\2\2\u00f9"+
		"\u00fa\7p\2\2\u00fa\u00fb\7i\2\2\u00fb\u00fc\7g\2\2\u00fc\u00fd\7V\2\2"+
		"\u00fd\u00fe\7g\2\2\u00fe\u00ff\7z\2\2\u00ff\u0100\7v\2\2\u0100(\3\2\2"+
		"\2\u0101\u0102\7h\2\2\u0102\u0103\7p\2\2\u0103\u0104\7\"\2\2\u0104\u0105"+
		"\7o\2\2\u0105\u0106\7c\2\2\u0106\u0107\7k\2\2\u0107\u0108\7p\2\2\u0108"+
		"\u0109\7*\2\2\u0109\u010a\7+\2\2\u010a*\3\2\2\2\u010b\u010c\7u\2\2\u010c"+
		"\u010d\7v\2\2\u010d\u010e\7f\2\2\u010e\u010f\7<\2\2\u010f\u0110\7n\2\2"+
		"\u0110\u0111\7p\2\2\u0111,\3\2\2\2\u0112\u0113\7t\2\2\u0113\u0114\7g\2"+
		"\2\u0114\u0115\7p\2\2\u0115\u0116\7f\2\2\u0116\u0117\7g\2\2\u0117\u0118"+
		"\7t\2\2\u0118.\3\2\2\2\u0119\u011a\7c\2\2\u011a\u011b\7f\2\2\u011b\u011c"+
		"\7f\2\2\u011c\u011d\7E\2\2\u011d\u011e\7q\2\2\u011e\u011f\7o\2\2\u011f"+
		"\u0120\7r\2\2\u0120\60\3\2\2\2\u0121\u0122\7x\2\2\u0122\u0123\7c\2\2\u0123"+
		"\u0124\7t\2\2\u0124\62\3\2\2\2\u0125\u0126\7k\2\2\u0126\u0127\7o\2\2\u0127"+
		"\u0128\7r\2\2\u0128\u0129\7q\2\2\u0129\u012a\7t\2\2\u012a\u012b\7v\2\2"+
		"\u012b\64\3\2\2\2\u012c\u012d\7u\2\2\u012d\u012e\7v\2\2\u012e\u012f\7"+
		"f\2\2\u012f\u0130\7<\2\2\u0130\u0131\7q\2\2\u0131\u0132\7w\2\2\u0132\u0133"+
		"\7v\2\2\u0133\66\3\2\2\2\u0134\u0135\7u\2\2\u0135\u0136\7v\2\2\u0136\u0137"+
		"\7f\2\2\u0137\u0138\7<\2\2\u0138\u0139\7k\2\2\u0139\u013a\7p\2\2\u013a"+
		"8\3\2\2\2\u013b\u013c\7c\2\2\u013c\u013d\7u\2\2\u013d\u013e\7u\2\2\u013e"+
		"\u013f\7g\2\2\u013f\u0140\7t\2\2\u0140\u0141\7v\2\2\u0141:\3\2\2\2\u0142"+
		"\u0143\7h\2\2\u0143\u0144\7p\2\2\u0144<\3\2\2\2\u0145\u0146\7v\2\2\u0146"+
		"\u0147\7q\2\2\u0147\u0148\7K\2\2\u0148\u0149\7p\2\2\u0149\u014a\7v\2\2"+
		"\u014a>\3\2\2\2\u014b\u014c\7k\2\2\u014c\u014d\7h\2\2\u014d@\3\2\2\2\u014e"+
		"\u014f\7g\2\2\u014f\u0150\7n\2\2\u0150\u0151\7u\2\2\u0151\u0152\7g\2\2"+
		"\u0152B\3\2\2\2\u0153\u0154\7t\2\2\u0154\u0155\7g\2\2\u0155\u0156\7v\2"+
		"\2\u0156\u0157\7w\2\2\u0157\u0158\7t\2\2\u0158\u0159\7p\2\2\u0159D\3\2"+
		"\2\2\u015a\u015b\7h\2\2\u015b\u015c\7q\2\2\u015c\u015d\7t\2\2\u015dF\3"+
		"\2\2\2\u015e\u015f\7y\2\2\u015f\u0160\7j\2\2\u0160\u0161\7k\2\2\u0161"+
		"\u0162\7n\2\2\u0162\u0163\7g\2\2\u0163H\3\2\2\2\u0164\u0165\7v\2\2\u0165"+
		"\u0166\7q\2\2\u0166J\3\2\2\2\u0167\u0168\7f\2\2\u0168\u0169\7q\2\2\u0169"+
		"L\3\2\2\2\u016a\u016b\7g\2\2\u016b\u016c\7p\2\2\u016c\u016d\7f\2\2\u016d"+
		"N\3\2\2\2\u016e\u016f\7k\2\2\u016f\u0170\7p\2\2\u0170P\3\2\2\2\u0171\u0172"+
		"\7p\2\2\u0172\u0173\7w\2\2\u0173\u0174\7n\2\2\u0174\u0175\7n\2\2\u0175"+
		"R\3\2\2\2\u0176\u0177\7v\2\2\u0177\u0178\7t\2\2\u0178\u0179\7{\2\2\u0179"+
		"T\3\2\2\2\u017a\u017b\7e\2\2\u017b\u017c\7c\2\2\u017c\u017d\7v\2\2\u017d"+
		"\u017e\7e\2\2\u017e\u017f\7j\2\2\u017fV\3\2\2\2\u0180\u0181\7e\2\2\u0181"+
		"\u0182\7n\2\2\u0182\u0183\7c\2\2\u0183\u0184\7u\2\2\u0184\u0185\7u\2\2"+
		"\u0185X\3\2\2\2\u0186\u0187\7~\2\2\u0187\u0188\7~\2\2\u0188Z\3\2\2\2\u0189"+
		"\u018a\7(\2\2\u018a\u018b\7(\2\2\u018b\\\3\2\2\2\u018c\u018d\7?\2\2\u018d"+
		"\u018e\7?\2\2\u018e^\3\2\2\2\u018f\u0190\7#\2\2\u0190\u0191\7?\2\2\u0191"+
		"`\3\2\2\2\u0192\u0193\7@\2\2\u0193\u0194\7?\2\2\u0194b\3\2\2\2\u0195\u0196"+
		"\7>\2\2\u0196\u0197\7?\2\2\u0197d\3\2\2\2\u0198\u0199\7`\2\2\u0199f\3"+
		"\2\2\2\u019a\u019b\7#\2\2\u019bh\3\2\2\2\u019c\u019d\7@\2\2\u019dj\3\2"+
		"\2\2\u019e\u019f\7>\2\2\u019fl\3\2\2\2\u01a0\u01a1\7-\2\2\u01a1n\3\2\2"+
		"\2\u01a2\u01a3\7/\2\2\u01a3p\3\2\2\2\u01a4\u01a5\7,\2\2\u01a5r\3\2\2\2"+
		"\u01a6\u01a7\7\61\2\2\u01a7t\3\2\2\2\u01a8\u01a9\7\'\2\2\u01a9v\3\2\2"+
		"\2\u01aa\u01ab\7}\2\2\u01abx\3\2\2\2\u01ac\u01ad\7\177\2\2\u01adz\3\2"+
		"\2\2\u01ae\u01af\7]\2\2\u01af|\3\2\2\2\u01b0\u01b1\7_\2\2\u01b1~\3\2\2"+
		"\2\u01b2\u01b3\7*\2\2\u01b3\u0080\3\2\2\2\u01b4\u01b5\7+\2\2\u01b5\u0082"+
		"\3\2\2\2\u01b6\u01b7\7=\2\2\u01b7\u0084\3\2\2\2\u01b8\u01b9\7?\2\2\u01b9"+
		"\u0086\3\2\2\2\u01ba\u01bb\7.\2\2\u01bb\u0088\3\2\2\2\u01bc\u01bd\7A\2"+
		"\2\u01bd\u008a\3\2\2\2\u01be\u01bf\7<\2\2\u01bf\u008c\3\2\2\2\u01c0\u01c1"+
		"\7v\2\2\u01c1\u01c2\7t\2\2\u01c2\u01c3\7w\2\2\u01c3\u01ca\7g\2\2\u01c4"+
		"\u01c5\7h\2\2\u01c5\u01c6\7c\2\2\u01c6\u01c7\7n\2\2\u01c7\u01c8\7u\2\2"+
		"\u01c8\u01ca\7g\2\2\u01c9\u01c0\3\2\2\2\u01c9\u01c4\3\2\2\2\u01ca\u008e"+
		"\3\2\2\2\u01cb\u01d3\5\u009bN\2\u01cc\u01d0\7\60\2\2\u01cd\u01cf\5\u009d"+
		"O\2\u01ce\u01cd\3\2\2\2\u01cf\u01d2\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d0"+
		"\u01d1\3\2\2\2\u01d1\u01d4\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d3\u01cc\3\2"+
		"\2\2\u01d3\u01d4\3\2\2\2\u01d4\u0090\3\2\2\2\u01d5\u01d9\t\2\2\2\u01d6"+
		"\u01d8\t\3\2\2\u01d7\u01d6\3\2\2\2\u01d8\u01db\3\2\2\2\u01d9\u01d7\3\2"+
		"\2\2\u01d9\u01da\3\2\2\2\u01da\u0092\3\2\2\2\u01db\u01d9\3\2\2\2\u01dc"+
		"\u01e2\t\4\2\2\u01dd\u01e1\n\5\2\2\u01de\u01df\7^\2\2\u01df\u01e1\n\6"+
		"\2\2\u01e0\u01dd\3\2\2\2\u01e0\u01de\3\2\2\2\u01e1\u01e4\3\2\2\2\u01e2"+
		"\u01e0\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e5\3\2\2\2\u01e4\u01e2\3\2"+
		"\2\2\u01e5\u01f1\t\4\2\2\u01e6\u01ec\t\7\2\2\u01e7\u01eb\n\b\2\2\u01e8"+
		"\u01e9\7^\2\2\u01e9\u01eb\n\6\2\2\u01ea\u01e7\3\2\2\2\u01ea\u01e8\3\2"+
		"\2\2\u01eb\u01ee\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed"+
		"\u01ef\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ef\u01f1\t\7\2\2\u01f0\u01dc\3\2"+
		"\2\2\u01f0\u01e6\3\2\2\2\u01f1\u0094\3\2\2\2\u01f2\u01f3\7\61\2\2\u01f3"+
		"\u01f4\7\61\2\2\u01f4\u01f8\3\2\2\2\u01f5\u01f7\n\6\2\2\u01f6\u01f5\3"+
		"\2\2\2\u01f7\u01fa\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9"+
		"\u0207\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fb\u01fc\7\61\2\2\u01fc\u01fd\7"+
		",\2\2\u01fd\u0201\3\2\2\2\u01fe\u0200\13\2\2\2\u01ff\u01fe\3\2\2\2\u0200"+
		"\u0203\3\2\2\2\u0201\u0202\3\2\2\2\u0201\u01ff\3\2\2\2\u0202\u0204\3\2"+
		"\2\2\u0203\u0201\3\2\2\2\u0204\u0205\7,\2\2\u0205\u0207\7\61\2\2\u0206"+
		"\u01f2\3\2\2\2\u0206\u01fb\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u0209\bK"+
		"\2\2\u0209\u0096\3\2\2\2\u020a\u0210\t\4\2\2\u020b\u020f\n\4\2\2\u020c"+
		"\u020d\7^\2\2\u020d\u020f\n\6\2\2\u020e\u020b\3\2\2\2\u020e\u020c\3\2"+
		"\2\2\u020f\u0212\3\2\2\2\u0210\u020e\3\2\2\2\u0210\u0211\3\2\2\2\u0211"+
		"\u0213\3\2\2\2\u0212\u0210\3\2\2\2\u0213\u0214\t\4\2\2\u0214\u0098\3\2"+
		"\2\2\u0215\u0216\t\t\2\2\u0216\u0217\3\2\2\2\u0217\u0218\bM\2\2\u0218"+
		"\u009a\3\2\2\2\u0219\u021d\t\n\2\2\u021a\u021c\5\u009dO\2\u021b\u021a"+
		"\3\2\2\2\u021c\u021f\3\2\2\2\u021d\u021b\3\2\2\2\u021d\u021e\3\2\2\2\u021e"+
		"\u0222\3\2\2\2\u021f\u021d\3\2\2\2\u0220\u0222\7\62\2\2\u0221\u0219\3"+
		"\2\2\2\u0221\u0220\3\2\2\2\u0222\u009c\3\2\2\2\u0223\u0224\t\13\2\2\u0224"+
		"\u009e\3\2\2\2\23\2\u01c9\u01d0\u01d3\u01d9\u01e0\u01e2\u01ea\u01ec\u01f0"+
		"\u01f8\u0201\u0206\u020e\u0210\u021d\u0221\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}