// Generated from /Users/harryharbuck-marlowe/Desktop/xxl/src/main/java/xxl/XXLang/etc/Q.g4 by ANTLR 4.9.2
package QParserAndLexer.lang;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class QLexer extends Lexer {
    public static final int
            T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, T__8 = 9,
            T__9 = 10, T__10 = 11, T__11 = 12, T__12 = 13, T__13 = 14, Println = 15, Component = 16,
            Render = 17, AddComponent = 18, New = 19, Window = 20, Var = 21, AddWSText = 22, Import = 23,
            Print = 24, Input = 25, Assert = 26, Wait = 27, Size = 28, Def = 29, ToInt = 30, Create = 31,
            WebServer = 32, If = 33, Else = 34, Return = 35, For = 36, While = 37, To = 38, Do = 39,
            End = 40, In = 41, Null = 42, Try = 43, Catch = 44, Class = 45, CreateClass = 46, Or = 47,
            And = 48, Equals = 49, NEquals = 50, GTEquals = 51, LTEquals = 52, Pow = 53, Excl = 54,
            GT = 55, LT = 56, Add = 57, Subtract = 58, Multiply = 59, Divide = 60, Modulus = 61,
            OBrace = 62, CBrace = 63, OBracket = 64, CBracket = 65, OParen = 66, CParen = 67,
            SColon = 68, Assign = 69, Comma = 70, QMark = 71, Colon = 72, Bool = 73, Number = 74,
            Identifier = 75, String = 76, Comment = 77, Space = 78;
    public static final String[] ruleNames = makeRuleNames();
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2P\u0278\b\1\4\2\t" +
                    "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13" +
                    "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
                    "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4" +
                    ",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t" +
                    "\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t=" +
                    "\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I" +
                    "\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\3\2\3\2\3\3\3\3\3" +
                    "\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5" +
                    "\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3" +
                    "\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13" +
                    "\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13" +
                    "\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r" +
                    "\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16" +
                    "\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20" +
                    "\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22" +
                    "\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24" +
                    "\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26" +
                    "\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27" +
                    "\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30" +
                    "\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32" +
                    "\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34" +
                    "\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37" +
                    "\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"" +
                    "\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3" +
                    "&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3+\3+\3+\3+\3+\3,\3" +
                    ",\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3" +
                    "/\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63" +
                    "\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3" +
                    ";\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3" +
                    "F\3G\3G\3H\3H\3I\3I\3J\3J\3J\3J\3J\3J\3J\3J\3J\5J\u0228\nJ\3K\3K\3K\7" +
                    "K\u022d\nK\fK\16K\u0230\13K\5K\u0232\nK\3L\3L\7L\u0236\nL\fL\16L\u0239" +
                    "\13L\3M\3M\3M\3M\7M\u023f\nM\fM\16M\u0242\13M\3M\3M\3M\3M\3M\7M\u0249" +
                    "\nM\fM\16M\u024c\13M\3M\5M\u024f\nM\3N\3N\3N\3N\7N\u0255\nN\fN\16N\u0258" +
                    "\13N\3N\3N\3N\3N\7N\u025e\nN\fN\16N\u0261\13N\3N\3N\5N\u0265\nN\3N\3N" +
                    "\3O\3O\3O\3O\3P\3P\7P\u026f\nP\fP\16P\u0272\13P\3P\5P\u0275\nP\3Q\3Q\3" +
                    "\u025f\2R\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33" +
                    "\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67" +
                    "\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65" +
                    "i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008b" +
                    "G\u008dH\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009dP\u009f" +
                    "\2\u00a1\2\3\2\f\5\2C\\aac|\6\2\62;C\\aac|\3\2$$\6\2\f\f\17\17$$^^\4\2" +
                    "\f\f\17\17\3\2))\6\2\f\f\17\17))^^\5\2\13\f\16\17\"\"\3\2\63;\3\2\62;" +
                    "\2\u0283\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2" +
                    "\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27" +
                    "\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2" +
                    "\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2" +
                    "\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2" +
                    "\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2" +
                    "\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S" +
                    "\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2" +
                    "\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2" +
                    "\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y" +
                    "\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3" +
                    "\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2" +
                    "\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095" +
                    "\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2" +
                    "\2\3\u00a3\3\2\2\2\5\u00a5\3\2\2\2\7\u00b2\3\2\2\2\t\u00b7\3\2\2\2\13" +
                    "\u00c0\3\2\2\2\r\u00c2\3\2\2\2\17\u00c9\3\2\2\2\21\u00d0\3\2\2\2\23\u00d9" +
                    "\3\2\2\2\25\u00db\3\2\2\2\27\u00ec\3\2\2\2\31\u00f3\3\2\2\2\33\u0101\3" +
                    "\2\2\2\35\u010d\3\2\2\2\37\u0112\3\2\2\2!\u0119\3\2\2\2#\u0123\3\2\2\2" +
                    "%\u012a\3\2\2\2\'\u0132\3\2\2\2)\u0136\3\2\2\2+\u0141\3\2\2\2-\u0145\3" +
                    "\2\2\2/\u015a\3\2\2\2\61\u0161\3\2\2\2\63\u0169\3\2\2\2\65\u016f\3\2\2" +
                    "\2\67\u0176\3\2\2\29\u017b\3\2\2\2;\u0180\3\2\2\2=\u0185\3\2\2\2?\u018b" +
                    "\3\2\2\2A\u0192\3\2\2\2C\u019c\3\2\2\2E\u019f\3\2\2\2G\u01a4\3\2\2\2I" +
                    "\u01ab\3\2\2\2K\u01af\3\2\2\2M\u01b5\3\2\2\2O\u01b8\3\2\2\2Q\u01bb\3\2" +
                    "\2\2S\u01c0\3\2\2\2U\u01c3\3\2\2\2W\u01c8\3\2\2\2Y\u01cc\3\2\2\2[\u01d2" +
                    "\3\2\2\2]\u01d8\3\2\2\2_\u01e4\3\2\2\2a\u01e7\3\2\2\2c\u01ea\3\2\2\2e" +
                    "\u01ed\3\2\2\2g\u01f0\3\2\2\2i\u01f3\3\2\2\2k\u01f6\3\2\2\2m\u01f8\3\2" +
                    "\2\2o\u01fa\3\2\2\2q\u01fc\3\2\2\2s\u01fe\3\2\2\2u\u0200\3\2\2\2w\u0202" +
                    "\3\2\2\2y\u0204\3\2\2\2{\u0206\3\2\2\2}\u0208\3\2\2\2\177\u020a\3\2\2" +
                    "\2\u0081\u020c\3\2\2\2\u0083\u020e\3\2\2\2\u0085\u0210\3\2\2\2\u0087\u0212" +
                    "\3\2\2\2\u0089\u0214\3\2\2\2\u008b\u0216\3\2\2\2\u008d\u0218\3\2\2\2\u008f" +
                    "\u021a\3\2\2\2\u0091\u021c\3\2\2\2\u0093\u0227\3\2\2\2\u0095\u0229\3\2" +
                    "\2\2\u0097\u0233\3\2\2\2\u0099\u024e\3\2\2\2\u009b\u0264\3\2\2\2\u009d" +
                    "\u0268\3\2\2\2\u009f\u0274\3\2\2\2\u00a1\u0276\3\2\2\2\u00a3\u00a4\7&" +
                    "\2\2\u00a4\4\3\2\2\2\u00a5\u00a6\7x\2\2\u00a6\u00a7\7q\2\2\u00a7\u00a8" +
                    "\7k\2\2\u00a8\u00a9\7f\2\2\u00a9\u00aa\7\"\2\2\u00aa\u00ab\7f\2\2\u00ab" +
                    "\u00ac\7g\2\2\u00ac\u00ad\7h\2\2\u00ad\u00ae\7c\2\2\u00ae\u00af\7w\2\2" +
                    "\u00af\u00b0\7n\2\2\u00b0\u00b1\7v\2\2\u00b1\6\3\2\2\2\u00b2\u00b3\7H" +
                    "\2\2\u00b3\u00b4\7k\2\2\u00b4\u00b5\7n\2\2\u00b5\u00b6\7g\2\2\u00b6\b" +
                    "\3\2\2\2\u00b7\u00b8\7p\2\2\u00b8\u00b9\7g\2\2\u00b9\u00ba\7y\2\2\u00ba" +
                    "\u00bb\7\"\2\2\u00bb\u00bc\7H\2\2\u00bc\u00bd\7k\2\2\u00bd\u00be\7n\2" +
                    "\2\u00be\u00bf\7g\2\2\u00bf\n\3\2\2\2\u00c0\u00c1\7\60\2\2\u00c1\f\3\2" +
                    "\2\2\u00c2\u00c3\7c\2\2\u00c3\u00c4\7r\2\2\u00c4\u00c5\7r\2\2\u00c5\u00c6" +
                    "\7g\2\2\u00c6\u00c7\7p\2\2\u00c7\u00c8\7f\2\2\u00c8\16\3\2\2\2\u00c9\u00ca" +
                    "\7x\2\2\u00ca\u00cb\7g\2\2\u00cb\u00cc\7t\2\2\u00cc\u00cd\7k\2\2\u00cd" +
                    "\u00ce\7h\2\2\u00ce\u00cf\7{\2\2\u00cf\20\3\2\2\2\u00d0\u00d1\7\60\2\2" +
                    "\u00d1\u00d2\7f\2\2\u00d2\u00d3\7g\2\2\u00d3\u00d4\7h\2\2\u00d4\u00d5" +
                    "\7c\2\2\u00d5\u00d6\7w\2\2\u00d6\u00d7\7n\2\2\u00d7\u00d8\7v\2\2\u00d8" +
                    "\22\3\2\2\2\u00d9\u00da\7%\2\2\u00da\24\3\2\2\2\u00db\u00dc\7e\2\2\u00dc" +
                    "\u00dd\7t\2\2\u00dd\u00de\7g\2\2\u00de\u00df\7c\2\2\u00df\u00e0\7v\2\2" +
                    "\u00e0\u00e1\7g\2\2\u00e1\u00e2\7\"\2\2\u00e2\u00e3\7Y\2\2\u00e3\u00e4" +
                    "\7g\2\2\u00e4\u00e5\7d\2\2\u00e5\u00e6\7U\2\2\u00e6\u00e7\7g\2\2\u00e7" +
                    "\u00e8\7t\2\2\u00e8\u00e9\7x\2\2\u00e9\u00ea\7g\2\2\u00ea\u00eb\7t\2\2" +
                    "\u00eb\26\3\2\2\2\u00ec\u00ed\7Y\2\2\u00ed\u00ee\7k\2\2\u00ee\u00ef\7" +
                    "p\2\2\u00ef\u00f0\7f\2\2\u00f0\u00f1\7q\2\2\u00f1\u00f2\7y\2\2\u00f2\30" +
                    "\3\2\2\2\u00f3\u00f4\7p\2\2\u00f4\u00f5\7g\2\2\u00f5\u00f6\7y\2\2\u00f6" +
                    "\u00f7\7\"\2\2\u00f7\u00f8\7E\2\2\u00f8\u00f9\7q\2\2\u00f9\u00fa\7o\2" +
                    "\2\u00fa\u00fb\7r\2\2\u00fb\u00fc\7q\2\2\u00fc\u00fd\7p\2\2\u00fd\u00fe" +
                    "\7g\2\2\u00fe\u00ff\7p\2\2\u00ff\u0100\7v\2\2\u0100\32\3\2\2\2\u0101\u0102" +
                    "\7x\2\2\u0102\u0103\7q\2\2\u0103\u0104\7k\2\2\u0104\u0105\7f\2\2\u0105" +
                    "\u0106\7\"\2\2\u0106\u0107\7o\2\2\u0107\u0108\7c\2\2\u0108\u0109\7k\2" +
                    "\2\u0109\u010a\7p\2\2\u010a\u010b\7*\2\2\u010b\u010c\7+\2\2\u010c\34\3" +
                    "\2\2\2\u010d\u010e\7g\2\2\u010e\u010f\7p\2\2\u010f\u0110\7f\2\2\u0110" +
                    "\u0111\7e\2\2\u0111\36\3\2\2\2\u0112\u0113\7u\2\2\u0113\u0114\7v\2\2\u0114" +
                    "\u0115\7f\2\2\u0115\u0116\7<\2\2\u0116\u0117\7n\2\2\u0117\u0118\7p\2\2" +
                    "\u0118 \3\2\2\2\u0119\u011a\7E\2\2\u011a\u011b\7q\2\2\u011b\u011c\7o\2" +
                    "\2\u011c\u011d\7r\2\2\u011d\u011e\7q\2\2\u011e\u011f\7p\2\2\u011f\u0120" +
                    "\7g\2\2\u0120\u0121\7p\2\2\u0121\u0122\7v\2\2\u0122\"\3\2\2\2\u0123\u0124" +
                    "\7t\2\2\u0124\u0125\7g\2\2\u0125\u0126\7p\2\2\u0126\u0127\7f\2\2\u0127" +
                    "\u0128\7g\2\2\u0128\u0129\7t\2\2\u0129$\3\2\2\2\u012a\u012b\7c\2\2\u012b" +
                    "\u012c\7f\2\2\u012c\u012d\7f\2\2\u012d\u012e\7E\2\2\u012e\u012f\7q\2\2" +
                    "\u012f\u0130\7o\2\2\u0130\u0131\7r\2\2\u0131&\3\2\2\2\u0132\u0133\7p\2" +
                    "\2\u0133\u0134\7g\2\2\u0134\u0135\7y\2\2\u0135(\3\2\2\2\u0136\u0137\7" +
                    "p\2\2\u0137\u0138\7g\2\2\u0138\u0139\7y\2\2\u0139\u013a\7\"\2\2\u013a" +
                    "\u013b\7Y\2\2\u013b\u013c\7k\2\2\u013c\u013d\7p\2\2\u013d\u013e\7f\2\2" +
                    "\u013e\u013f\7q\2\2\u013f\u0140\7y\2\2\u0140*\3\2\2\2\u0141\u0142\7x\2" +
                    "\2\u0142\u0143\7c\2\2\u0143\u0144\7t\2\2\u0144,\3\2\2\2\u0145\u0146\7" +
                    "Y\2\2\u0146\u0147\7g\2\2\u0147\u0148\7d\2\2\u0148\u0149\7U\2\2\u0149\u014a" +
                    "\7g\2\2\u014a\u014b\7t\2\2\u014b\u014c\7x\2\2\u014c\u014d\7g\2\2\u014d" +
                    "\u014e\7t\2\2\u014e\u014f\7\60\2\2\u014f\u0150\7e\2\2\u0150\u0151\7j\2" +
                    "\2\u0151\u0152\7c\2\2\u0152\u0153\7p\2\2\u0153\u0154\7i\2\2\u0154\u0155" +
                    "\7g\2\2\u0155\u0156\7V\2\2\u0156\u0157\7g\2\2\u0157\u0158\7z\2\2\u0158" +
                    "\u0159\7v\2\2\u0159.\3\2\2\2\u015a\u015b\7k\2\2\u015b\u015c\7o\2\2\u015c" +
                    "\u015d\7r\2\2\u015d\u015e\7q\2\2\u015e\u015f\7t\2\2\u015f\u0160\7v\2\2" +
                    "\u0160\60\3\2\2\2\u0161\u0162\7u\2\2\u0162\u0163\7v\2\2\u0163\u0164\7" +
                    "f\2\2\u0164\u0165\7<\2\2\u0165\u0166\7q\2\2\u0166\u0167\7w\2\2\u0167\u0168" +
                    "\7v\2\2\u0168\62\3\2\2\2\u0169\u016a\7k\2\2\u016a\u016b\7p\2\2\u016b\u016c" +
                    "\7r\2\2\u016c\u016d\7w\2\2\u016d\u016e\7v\2\2\u016e\64\3\2\2\2\u016f\u0170" +
                    "\7c\2\2\u0170\u0171\7u\2\2\u0171\u0172\7u\2\2\u0172\u0173\7g\2\2\u0173" +
                    "\u0174\7t\2\2\u0174\u0175\7v\2\2\u0175\66\3\2\2\2\u0176\u0177\7y\2\2\u0177" +
                    "\u0178\7c\2\2\u0178\u0179\7k\2\2\u0179\u017a\7v\2\2\u017a8\3\2\2\2\u017b" +
                    "\u017c\7u\2\2\u017c\u017d\7k\2\2\u017d\u017e\7|\2\2\u017e\u017f\7g\2\2" +
                    "\u017f:\3\2\2\2\u0180\u0181\7h\2\2\u0181\u0182\7w\2\2\u0182\u0183\7p\2" +
                    "\2\u0183\u0184\7e\2\2\u0184<\3\2\2\2\u0185\u0186\7v\2\2\u0186\u0187\7" +
                    "q\2\2\u0187\u0188\7K\2\2\u0188\u0189\7p\2\2\u0189\u018a\7v\2\2\u018a>" +
                    "\3\2\2\2\u018b\u018c\7e\2\2\u018c\u018d\7t\2\2\u018d\u018e\7g\2\2\u018e" +
                    "\u018f\7c\2\2\u018f\u0190\7v\2\2\u0190\u0191\7g\2\2\u0191@\3\2\2\2\u0192" +
                    "\u0193\7Y\2\2\u0193\u0194\7g\2\2\u0194\u0195\7d\2\2\u0195\u0196\7U\2\2" +
                    "\u0196\u0197\7g\2\2\u0197\u0198\7t\2\2\u0198\u0199\7x\2\2\u0199\u019a" +
                    "\7g\2\2\u019a\u019b\7t\2\2\u019bB\3\2\2\2\u019c\u019d\7k\2\2\u019d\u019e" +
                    "\7h\2\2\u019eD\3\2\2\2\u019f\u01a0\7g\2\2\u01a0\u01a1\7n\2\2\u01a1\u01a2" +
                    "\7u\2\2\u01a2\u01a3\7g\2\2\u01a3F\3\2\2\2\u01a4\u01a5\7t\2\2\u01a5\u01a6" +
                    "\7g\2\2\u01a6\u01a7\7v\2\2\u01a7\u01a8\7w\2\2\u01a8\u01a9\7t\2\2\u01a9" +
                    "\u01aa\7p\2\2\u01aaH\3\2\2\2\u01ab\u01ac\7h\2\2\u01ac\u01ad\7q\2\2\u01ad" +
                    "\u01ae\7t\2\2\u01aeJ\3\2\2\2\u01af\u01b0\7y\2\2\u01b0\u01b1\7j\2\2\u01b1" +
                    "\u01b2\7k\2\2\u01b2\u01b3\7n\2\2\u01b3\u01b4\7g\2\2\u01b4L\3\2\2\2\u01b5" +
                    "\u01b6\7v\2\2\u01b6\u01b7\7q\2\2\u01b7N\3\2\2\2\u01b8\u01b9\7f\2\2\u01b9" +
                    "\u01ba\7q\2\2\u01baP\3\2\2\2\u01bb\u01bc\7g\2\2\u01bc\u01bd\7p\2\2\u01bd" +
                    "\u01be\7f\2\2\u01be\u01bf\7h\2\2\u01bfR\3\2\2\2\u01c0\u01c1\7k\2\2\u01c1" +
                    "\u01c2\7p\2\2\u01c2T\3\2\2\2\u01c3\u01c4\7p\2\2\u01c4\u01c5\7w\2\2\u01c5" +
                    "\u01c6\7n\2\2\u01c6\u01c7\7n\2\2\u01c7V\3\2\2\2\u01c8\u01c9\7v\2\2\u01c9" +
                    "\u01ca\7t\2\2\u01ca\u01cb\7{\2\2\u01cbX\3\2\2\2\u01cc\u01cd\7e\2\2\u01cd" +
                    "\u01ce\7c\2\2\u01ce\u01cf\7v\2\2\u01cf\u01d0\7e\2\2\u01d0\u01d1\7j\2\2" +
                    "\u01d1Z\3\2\2\2\u01d2\u01d3\7e\2\2\u01d3\u01d4\7n\2\2\u01d4\u01d5\7c\2" +
                    "\2\u01d5\u01d6\7u\2\2\u01d6\u01d7\7u\2\2\u01d7\\\3\2\2\2\u01d8\u01d9\7" +
                    "e\2\2\u01d9\u01da\7t\2\2\u01da\u01db\7g\2\2\u01db\u01dc\7c\2\2\u01dc\u01dd" +
                    "\7v\2\2\u01dd\u01de\7g\2\2\u01de\u01df\7E\2\2\u01df\u01e0\7n\2\2\u01e0" +
                    "\u01e1\7c\2\2\u01e1\u01e2\7u\2\2\u01e2\u01e3\7u\2\2\u01e3^\3\2\2\2\u01e4" +
                    "\u01e5\7~\2\2\u01e5\u01e6\7~\2\2\u01e6`\3\2\2\2\u01e7\u01e8\7(\2\2\u01e8" +
                    "\u01e9\7(\2\2\u01e9b\3\2\2\2\u01ea\u01eb\7?\2\2\u01eb\u01ec\7?\2\2\u01ec" +
                    "d\3\2\2\2\u01ed\u01ee\7#\2\2\u01ee\u01ef\7?\2\2\u01eff\3\2\2\2\u01f0\u01f1" +
                    "\7@\2\2\u01f1\u01f2\7?\2\2\u01f2h\3\2\2\2\u01f3\u01f4\7>\2\2\u01f4\u01f5" +
                    "\7?\2\2\u01f5j\3\2\2\2\u01f6\u01f7\7`\2\2\u01f7l\3\2\2\2\u01f8\u01f9\7" +
                    "#\2\2\u01f9n\3\2\2\2\u01fa\u01fb\7@\2\2\u01fbp\3\2\2\2\u01fc\u01fd\7>" +
                    "\2\2\u01fdr\3\2\2\2\u01fe\u01ff\7-\2\2\u01fft\3\2\2\2\u0200\u0201\7/\2" +
                    "\2\u0201v\3\2\2\2\u0202\u0203\7,\2\2\u0203x\3\2\2\2\u0204\u0205\7\61\2" +
                    "\2\u0205z\3\2\2\2\u0206\u0207\7\'\2\2\u0207|\3\2\2\2\u0208\u0209\7}\2" +
                    "\2\u0209~\3\2\2\2\u020a\u020b\7\177\2\2\u020b\u0080\3\2\2\2\u020c\u020d" +
                    "\7]\2\2\u020d\u0082\3\2\2\2\u020e\u020f\7_\2\2\u020f\u0084\3\2\2\2\u0210" +
                    "\u0211\7*\2\2\u0211\u0086\3\2\2\2\u0212\u0213\7+\2\2\u0213\u0088\3\2\2" +
                    "\2\u0214\u0215\7=\2\2\u0215\u008a\3\2\2\2\u0216\u0217\7?\2\2\u0217\u008c" +
                    "\3\2\2\2\u0218\u0219\7.\2\2\u0219\u008e\3\2\2\2\u021a\u021b\7A\2\2\u021b" +
                    "\u0090\3\2\2\2\u021c\u021d\7<\2\2\u021d\u0092\3\2\2\2\u021e\u021f\7v\2" +
                    "\2\u021f\u0220\7t\2\2\u0220\u0221\7w\2\2\u0221\u0228\7g\2\2\u0222\u0223" +
                    "\7h\2\2\u0223\u0224\7c\2\2\u0224\u0225\7n\2\2\u0225\u0226\7u\2\2\u0226" +
                    "\u0228\7g\2\2\u0227\u021e\3\2\2\2\u0227\u0222\3\2\2\2\u0228\u0094\3\2" +
                    "\2\2\u0229\u0231\5\u009fP\2\u022a\u022e\7\60\2\2\u022b\u022d\5\u00a1Q" +
                    "\2\u022c\u022b\3\2\2\2\u022d\u0230\3\2\2\2\u022e\u022c\3\2\2\2\u022e\u022f" +
                    "\3\2\2\2\u022f\u0232\3\2\2\2\u0230\u022e\3\2\2\2\u0231\u022a\3\2\2\2\u0231" +
                    "\u0232\3\2\2\2\u0232\u0096\3\2\2\2\u0233\u0237\t\2\2\2\u0234\u0236\t\3" +
                    "\2\2\u0235\u0234\3\2\2\2\u0236\u0239\3\2\2\2\u0237\u0235\3\2\2\2\u0237" +
                    "\u0238\3\2\2\2\u0238\u0098\3\2\2\2\u0239\u0237\3\2\2\2\u023a\u0240\t\4" +
                    "\2\2\u023b\u023f\n\5\2\2\u023c\u023d\7^\2\2\u023d\u023f\n\6\2\2\u023e" +
                    "\u023b\3\2\2\2\u023e\u023c\3\2\2\2\u023f\u0242\3\2\2\2\u0240\u023e\3\2" +
                    "\2\2\u0240\u0241\3\2\2\2\u0241\u0243\3\2\2\2\u0242\u0240\3\2\2\2\u0243" +
                    "\u024f\t\4\2\2\u0244\u024a\t\7\2\2\u0245\u0249\n\b\2\2\u0246\u0247\7^" +
                    "\2\2\u0247\u0249\n\6\2\2\u0248\u0245\3\2\2\2\u0248\u0246\3\2\2\2\u0249" +
                    "\u024c\3\2\2\2\u024a\u0248\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u024d\3\2" +
                    "\2\2\u024c\u024a\3\2\2\2\u024d\u024f\t\7\2\2\u024e\u023a\3\2\2\2\u024e" +
                    "\u0244\3\2\2\2\u024f\u009a\3\2\2\2\u0250\u0251\7\61\2\2\u0251\u0252\7" +
                    "\61\2\2\u0252\u0256\3\2\2\2\u0253\u0255\n\6\2\2\u0254\u0253\3\2\2\2\u0255" +
                    "\u0258\3\2\2\2\u0256\u0254\3\2\2\2\u0256\u0257\3\2\2\2\u0257\u0265\3\2" +
                    "\2\2\u0258\u0256\3\2\2\2\u0259\u025a\7\61\2\2\u025a\u025b\7,\2\2\u025b" +
                    "\u025f\3\2\2\2\u025c\u025e\13\2\2\2\u025d\u025c\3\2\2\2\u025e\u0261\3" +
                    "\2\2\2\u025f\u0260\3\2\2\2\u025f\u025d\3\2\2\2\u0260\u0262\3\2\2\2\u0261" +
                    "\u025f\3\2\2\2\u0262\u0263\7,\2\2\u0263\u0265\7\61\2\2\u0264\u0250\3\2" +
                    "\2\2\u0264\u0259\3\2\2\2\u0265\u0266\3\2\2\2\u0266\u0267\bN\2\2\u0267" +
                    "\u009c\3\2\2\2\u0268\u0269\t\t\2\2\u0269\u026a\3\2\2\2\u026a\u026b\bO" +
                    "\2\2\u026b\u009e\3\2\2\2\u026c\u0270\t\n\2\2\u026d\u026f\5\u00a1Q\2\u026e" +
                    "\u026d\3\2\2\2\u026f\u0272\3\2\2\2\u0270\u026e\3\2\2\2\u0270\u0271\3\2" +
                    "\2\2\u0271\u0275\3\2\2\2\u0272\u0270\3\2\2\2\u0273\u0275\7\62\2\2\u0274" +
                    "\u026c\3\2\2\2\u0274\u0273\3\2\2\2\u0275\u00a0\3\2\2\2\u0276\u0277\t\13" +
                    "\2\2\u0277\u00a2\3\2\2\2\21\2\u0227\u022e\u0231\u0237\u023e\u0240\u0248" +
                    "\u024a\u024e\u0256\u025f\u0264\u0270\u0274\3\b\2\2";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    private static final String[] _LITERAL_NAMES = makeLiteralNames();
    private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);
    public static String[] channelNames = {
            "DEFAULT_TOKEN_CHANNEL", "HIDDEN"
    };
    public static String[] modeNames = {
            "DEFAULT_MODE"
    };

    static {
        RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION);
    }

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

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }

    public QLexer(CharStream input) {
        super(input);
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    private static String[] makeRuleNames() {
        return new String[]{
                "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8",
                "T__9", "T__10", "T__11", "T__12", "T__13", "Println", "Component", "Render",
                "AddComponent", "New", "Window", "Var", "AddWSText", "Import", "Print",
                "Input", "Assert", "Wait", "Size", "Def", "ToInt", "Create", "WebServer",
                "If", "Else", "Return", "For", "While", "To", "Do", "End", "In", "Null",
                "Try", "Catch", "Class", "CreateClass", "Or", "And", "Equals", "NEquals",
                "GTEquals", "LTEquals", "Pow", "Excl", "GT", "LT", "Add", "Subtract",
                "Multiply", "Divide", "Modulus", "OBrace", "CBrace", "OBracket", "CBracket",
                "OParen", "CParen", "SColon", "Assign", "Comma", "QMark", "Colon", "Bool",
                "Number", "Identifier", "String", "Comment", "Space", "Int", "Digit"
        };
    }

    private static String[] makeLiteralNames() {
        return new String[]{
                null, "'$'", "'void default'", "'File'", "'new File'", "'.'", "'append'",
                "'verify'", "'.default'", "'#'", "'create WebServer'", "'Window'", "'new Component'",
                "'void main()'", "'endc'", "'std:ln'", "'Component'", "'render'", "'addComp'",
                "'new'", "'new Window'", "'var'", "'WebServer.changeText'", "'import'",
                "'std:out'", "'input'", "'assert'", "'wait'", "'size'", "'func'", "'toInt'",
                "'create'", "'WebServer'", "'if'", "'else'", "'return'", "'for'", "'while'",
                "'to'", "'do'", "'endf'", "'in'", "'null'", "'try'", "'catch'", "'class'",
                "'createClass'", "'||'", "'&&'", "'=='", "'!='", "'>='", "'<='", "'^'",
                "'!'", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'%'", "'{'", "'}'",
                "'['", "']'", "'('", "')'", "';'", "'='", "','", "'?'", "':'"
        };
    }

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, null, "Println", "Component", "Render", "AddComponent", "New",
                "Window", "Var", "AddWSText", "Import", "Print", "Input", "Assert", "Wait",
                "Size", "Def", "ToInt", "Create", "WebServer", "If", "Else", "Return",
                "For", "While", "To", "Do", "End", "In", "Null", "Try", "Catch", "Class",
                "CreateClass", "Or", "And", "Equals", "NEquals", "GTEquals", "LTEquals",
                "Pow", "Excl", "GT", "LT", "Add", "Subtract", "Multiply", "Divide", "Modulus",
                "OBrace", "CBrace", "OBracket", "CBracket", "OParen", "CParen", "SColon",
                "Assign", "Comma", "QMark", "Colon", "Bool", "Number", "Identifier",
                "String", "Comment", "Space"
        };
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
    public String getGrammarFileName() {
        return "Q.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public String[] getChannelNames() {
        return channelNames;
    }

    @Override
    public String[] getModeNames() {
        return modeNames;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }
}