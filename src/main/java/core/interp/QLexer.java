// Generated from C:/Users/Bosque/Documents/GitHub/Q/src/main/java/core/etc\Q.g4 by ANTLR 4.9.2
package core.interp;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "cast"})
public class QLexer extends Lexer {
    public static final int
            T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, T__8 = 9,
            T__9 = 10, T__10 = 11, T__11 = 12, T__12 = 13, Println = 14, Async = 15, Var = 16, Import = 17,
            Print = 18, Input = 19, Assert = 20, Def = 21, If = 22, Else = 23, Package = 24, Return = 25,
            For = 26, While = 27, To = 28, Do = 29, End = 30, In = 31, Null = 32, Try = 33, Class = 34,
            Const = 35, Self = 36, Native = 37, Or = 38, Accessor = 39, And = 40, Equals = 41, NEquals = 42,
            GTEquals = 43, LTEquals = 44, Pow = 45, Excl = 46, GT = 47, LT = 48, Add = 49, Subtract = 50,
            Multiply = 51, Divide = 52, Modulus = 53, OBrace = 54, CBrace = 55, OBracket = 56,
            CBracket = 57, OParen = 58, CParen = 59, SColon = 60, Assign = 61, Comma = 62, QMark = 63,
            Colon = 64, Bool = 65, Number = 66, Identifier = 67, String = 68, Comment = 69, Space = 70;
    public static final String[] ruleNames = makeRuleNames();
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2H\u0247\b\1\4\2\t" +
                    "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13" +
                    "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
                    "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4" +
                    ",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t" +
                    "\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t=" +
                    "\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I" +
                    "\tI\4J\tJ\4K\tK\4L\tL\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5" +
                    "\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3" +
                    "\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3" +
                    "\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3" +
                    "\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3" +
                    "\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3" +
                    "\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3" +
                    "\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3" +
                    "\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3" +
                    "\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3" +
                    "\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3" +
                    "\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3" +
                    "\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3" +
                    "\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3" +
                    "\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3" +
                    "\37\3\37\3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$" +
                    "\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3(\3(" +
                    "\3(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3/\3/\3\60\3\60" +
                    "\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67" +
                    "\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3B" +
                    "\3B\3B\3B\3B\3B\3B\5B\u01dd\nB\3C\3C\3C\7C\u01e2\nC\fC\16C\u01e5\13C\5" +
                    "C\u01e7\nC\3D\3D\7D\u01eb\nD\fD\16D\u01ee\13D\3E\3E\3E\6E\u01f3\nE\rE" +
                    "\16E\u01f4\3E\3E\3E\3E\6E\u01fb\nE\rE\16E\u01fc\3E\3E\3E\3E\3E\3E\3E\3" +
                    "E\3E\3E\7E\u0209\nE\fE\16E\u020c\13E\3E\3E\3E\5E\u0211\nE\3F\3F\3F\3F" +
                    "\7F\u0217\nF\fF\16F\u021a\13F\3F\3F\3F\3F\7F\u0220\nF\fF\16F\u0223\13" +
                    "F\3F\3F\5F\u0227\nF\3F\3F\3G\3G\3G\3G\3H\3H\7H\u0231\nH\fH\16H\u0234\13" +
                    "H\3H\5H\u0237\nH\3I\3I\3J\3J\3J\5J\u023e\nJ\3K\3K\3K\3K\3K\3K\3L\3L\4" +
                    "\u020a\u0221\2M\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31" +
                    "\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65" +
                    "\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64" +
                    "g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089" +
                    "F\u008bG\u008dH\u008f\2\u0091\2\u0093\2\u0095\2\u0097\2\3\2\f\5\2C\\a" +
                    "ac|\6\2\62;C\\aac|\6\2\f\f\17\17$$^^\5\2\f\f\17\17^^\4\2\f\f\17\17\5\2" +
                    "\13\f\16\17\"\"\3\2\63;\3\2\62;\t\2$$^^ddhhppttvv\5\2\62;CHch\2\u0255" +
                    "\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2" +
                    "\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2" +
                    "\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2" +
                    "\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2" +
                    "\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3" +
                    "\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2" +
                    "\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2" +
                    "U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3" +
                    "\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2" +
                    "\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2" +
                    "{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085" +
                    "\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2" +
                    "\2\3\u0099\3\2\2\2\5\u009b\3\2\2\2\7\u009d\3\2\2\2\t\u00a4\3\2\2\2\13" +
                    "\u00a7\3\2\2\2\r\u00ab\3\2\2\2\17\u00ae\3\2\2\2\21\u00b2\3\2\2\2\23\u00b8" +
                    "\3\2\2\2\25\u00be\3\2\2\2\27\u00c0\3\2\2\2\31\u00c7\3\2\2\2\33\u00cc\3" +
                    "\2\2\2\35\u00f1\3\2\2\2\37\u0109\3\2\2\2!\u010f\3\2\2\2#\u0113\3\2\2\2" +
                    "%\u011a\3\2\2\2\'\u0132\3\2\2\2)\u013b\3\2\2\2+\u0142\3\2\2\2-\u0145\3" +
                    "\2\2\2/\u0148\3\2\2\2\61\u014d\3\2\2\2\63\u0157\3\2\2\2\65\u015e\3\2\2" +
                    "\2\67\u0162\3\2\2\29\u0168\3\2\2\2;\u016b\3\2\2\2=\u016e\3\2\2\2?\u0172" +
                    "\3\2\2\2A\u0175\3\2\2\2C\u017a\3\2\2\2E\u017e\3\2\2\2G\u0184\3\2\2\2I" +
                    "\u018a\3\2\2\2K\u018f\3\2\2\2M\u0196\3\2\2\2O\u0199\3\2\2\2Q\u019c\3\2" +
                    "\2\2S\u019f\3\2\2\2U\u01a2\3\2\2\2W\u01a5\3\2\2\2Y\u01a8\3\2\2\2[\u01ab" +
                    "\3\2\2\2]\u01ad\3\2\2\2_\u01af\3\2\2\2a\u01b1\3\2\2\2c\u01b3\3\2\2\2e" +
                    "\u01b5\3\2\2\2g\u01b7\3\2\2\2i\u01b9\3\2\2\2k\u01bb\3\2\2\2m\u01bd\3\2" +
                    "\2\2o\u01bf\3\2\2\2q\u01c1\3\2\2\2s\u01c3\3\2\2\2u\u01c5\3\2\2\2w\u01c7" +
                    "\3\2\2\2y\u01c9\3\2\2\2{\u01cb\3\2\2\2}\u01cd\3\2\2\2\177\u01cf\3\2\2" +
                    "\2\u0081\u01d1\3\2\2\2\u0083\u01dc\3\2\2\2\u0085\u01de\3\2\2\2\u0087\u01e8" +
                    "\3\2\2\2\u0089\u0210\3\2\2\2\u008b\u0226\3\2\2\2\u008d\u022a\3\2\2\2\u008f" +
                    "\u0236\3\2\2\2\u0091\u0238\3\2\2\2\u0093\u023a\3\2\2\2\u0095\u023f\3\2" +
                    "\2\2\u0097\u0245\3\2\2\2\u0099\u009a\7\60\2\2\u009a\4\3\2\2\2\u009b\u009c" +
                    "\7B\2\2\u009c\6\3\2\2\2\u009d\u009e\7j\2\2\u009e\u009f\7g\2\2\u009f\u00a0" +
                    "\7c\2\2\u00a0\u00a1\7f\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3\7t\2\2\u00a3" +
                    "\b\3\2\2\2\u00a4\u00a5\7e\2\2\u00a5\u00a6\7p\2\2\u00a6\n\3\2\2\2\u00a7" +
                    "\u00a8\7p\2\2\u00a8\u00a9\7g\2\2\u00a9\u00aa\7y\2\2\u00aa\f\3\2\2\2\u00ab" +
                    "\u00ac\7c\2\2\u00ac\u00ad\7u\2\2\u00ad\16\3\2\2\2\u00ae\u00af\7u\2\2\u00af" +
                    "\u00b0\7{\2\2\u00b0\u00b1\7u\2\2\u00b1\20\3\2\2\2\u00b2\u00b3\7y\2\2\u00b3" +
                    "\u00b4\7t\2\2\u00b4\u00b5\7k\2\2\u00b5\u00b6\7v\2\2\u00b6\u00b7\7g\2\2" +
                    "\u00b7\22\3\2\2\2\u00b8\u00b9\7t\2\2\u00b9\u00ba\7c\2\2\u00ba\u00bb\7" +
                    "p\2\2\u00bb\u00bc\7i\2\2\u00bc\u00bd\7g\2\2\u00bd\24\3\2\2\2\u00be\u00bf" +
                    "\7%\2\2\u00bf\26\3\2\2\2\u00c0\u00c1\7g\2\2\u00c1\u00c2\7z\2\2\u00c2\u00c3" +
                    "\7e\2\2\u00c3\u00c4\7g\2\2\u00c4\u00c5\7r\2\2\u00c5\u00c6\7v\2\2\u00c6" +
                    "\30\3\2\2\2\u00c7\u00c8\7o\2\2\u00c8\u00c9\7c\2\2\u00c9\u00ca\7k\2\2\u00ca" +
                    "\u00cb\7p\2\2\u00cb\32\3\2\2\2\u00cc\u00cd\7\65\2\2\u00cd\u00ce\7[\2\2" +
                    "\u00ce\u00cf\7E\2\2\u00cf\u00d0\7O\2\2\u00d0\u00d1\7R\2\2\u00d1\u00d2" +
                    "\7L\2\2\u00d2\u00d3\7:\2\2\u00d3\u00d4\7Y\2\2\u00d4\u00d5\7:\2\2\u00d5" +
                    "\u00d6\7X\2\2\u00d6\u00d7\7X\2\2\u00d7\u00d8\7V\2\2\u00d8\u00d9\7W\2\2" +
                    "\u00d9\u00da\7C\2\2\u00da\u00db\7\66\2\2\u00db\u00dc\7:\2\2\u00dc\u00dd" +
                    "\7V\2\2\u00dd\u00de\7K\2\2\u00de\u00df\7J\2\2\u00df\u00e0\7T\2\2\u00e0" +
                    "\u00e1\7:\2\2\u00e1\u00e2\7M\2\2\u00e2\u00e3\7\65\2\2\u00e3\u00e4\7\65" +
                    "\2\2\u00e4\u00e5\7\64\2\2\u00e5\u00e6\7R\2\2\u00e6\u00e7\7[\2\2\u00e7" +
                    "\u00e8\7M\2\2\u00e8\u00e9\7V\2\2\u00e9\u00ea\7Z\2\2\u00ea\u00eb\7Q\2\2" +
                    "\u00eb\u00ec\7M\2\2\u00ec\u00ed\7X\2\2\u00ed\u00ee\7F\2\2\u00ee\u00ef" +
                    "\7H\2\2\u00ef\u00f0\7I\2\2\u00f0\34\3\2\2\2\u00f1\u00f2\7u\2\2\u00f2\u00f3" +
                    "\7v\2\2\u00f3\u00f4\7f\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\5O(\2\u00f6" +
                    "\u00f7\7S\2\2\u00f7\u00f8\7C\2\2\u00f8\u00f9\7X\2\2\u00f9\u00fa\7D\2\2" +
                    "\u00fa\u00fb\7:\2\2\u00fb\u00fc\7M\2\2\u00fc\u00fd\7K\2\2\u00fd\u00fe" +
                    "\79\2\2\u00fe\u00ff\7\64\2\2\u00ff\u0100\7L\2\2\u0100\u0101\78\2\2\u0101" +
                    "\u0102\7\67\2\2\u0102\u0103\7;\2\2\u0103\u0104\7\63\2\2\u0104\u0105\7" +
                    ";\2\2\u0105\u0106\7[\2\2\u0106\u0107\7N\2\2\u0107\u0108\7E\2\2\u0108\36" +
                    "\3\2\2\2\u0109\u010a\7c\2\2\u010a\u010b\7u\2\2\u010b\u010c\7{\2\2\u010c" +
                    "\u010d\7p\2\2\u010d\u010e\7e\2\2\u010e \3\2\2\2\u010f\u0110\7x\2\2\u0110" +
                    "\u0111\7c\2\2\u0111\u0112\7t\2\2\u0112\"\3\2\2\2\u0113\u0114\7k\2\2\u0114" +
                    "\u0115\7o\2\2\u0115\u0116\7r\2\2\u0116\u0117\7q\2\2\u0117\u0118\7t\2\2" +
                    "\u0118\u0119\7v\2\2\u0119$\3\2\2\2\u011a\u011b\7u\2\2\u011b\u011c\7v\2" +
                    "\2\u011c\u011d\7f\2\2\u011d\u011e\3\2\2\2\u011e\u011f\5O(\2\u011f\u0120" +
                    "\7C\2\2\u0120\u0121\7Z\2\2\u0121\u0122\79\2\2\u0122\u0123\7O\2\2\u0123" +
                    "\u0124\7T\2\2\u0124\u0125\7U\2\2\u0125\u0126\7W\2\2\u0126\u0127\7Z\2\2" +
                    "\u0127\u0128\7S\2\2\u0128\u0129\78\2\2\u0129\u012a\7\63\2\2\u012a\u012b" +
                    "\7I\2\2\u012b\u012c\7:\2\2\u012c\u012d\7F\2\2\u012d\u012e\7Z\2\2\u012e" +
                    "\u012f\7K\2\2\u012f\u0130\7\\\2\2\u0130\u0131\7Y\2\2\u0131&\3\2\2\2\u0132" +
                    "\u0133\7u\2\2\u0133\u0134\7v\2\2\u0134\u0135\7f\2\2\u0135\u0136\3\2\2" +
                    "\2\u0136\u0137\5O(\2\u0137\u0138\7e\2\2\u0138\u0139\7k\2\2\u0139\u013a" +
                    "\7p\2\2\u013a(\3\2\2\2\u013b\u013c\7c\2\2\u013c\u013d\7u\2\2\u013d\u013e" +
                    "\7u\2\2\u013e\u013f\7g\2\2\u013f\u0140\7t\2\2\u0140\u0141\7v\2\2\u0141" +
                    "*\3\2\2\2\u0142\u0143\7h\2\2\u0143\u0144\7p\2\2\u0144,\3\2\2\2\u0145\u0146" +
                    "\7k\2\2\u0146\u0147\7h\2\2\u0147.\3\2\2\2\u0148\u0149\7g\2\2\u0149\u014a" +
                    "\7n\2\2\u014a\u014b\7u\2\2\u014b\u014c\7g\2\2\u014c\60\3\2\2\2\u014d\u014e" +
                    "\7p\2\2\u014e\u014f\7c\2\2\u014f\u0150\7o\2\2\u0150\u0151\7g\2\2\u0151" +
                    "\u0152\7u\2\2\u0152\u0153\7r\2\2\u0153\u0154\7c\2\2\u0154\u0155\7e\2\2" +
                    "\u0155\u0156\7g\2\2\u0156\62\3\2\2\2\u0157\u0158\7t\2\2\u0158\u0159\7" +
                    "g\2\2\u0159\u015a\7v\2\2\u015a\u015b\7w\2\2\u015b\u015c\7t\2\2\u015c\u015d" +
                    "\7p\2\2\u015d\64\3\2\2\2\u015e\u015f\7h\2\2\u015f\u0160\7q\2\2\u0160\u0161" +
                    "\7t\2\2\u0161\66\3\2\2\2\u0162\u0163\7y\2\2\u0163\u0164\7j\2\2\u0164\u0165" +
                    "\7k\2\2\u0165\u0166\7n\2\2\u0166\u0167\7g\2\2\u01678\3\2\2\2\u0168\u0169" +
                    "\7v\2\2\u0169\u016a\7q\2\2\u016a:\3\2\2\2\u016b\u016c\7f\2\2\u016c\u016d" +
                    "\7q\2\2\u016d<\3\2\2\2\u016e\u016f\7g\2\2\u016f\u0170\7p\2\2\u0170\u0171" +
                    "\7f\2\2\u0171>\3\2\2\2\u0172\u0173\7k\2\2\u0173\u0174\7p\2\2\u0174@\3" +
                    "\2\2\2\u0175\u0176\7p\2\2\u0176\u0177\7w\2\2\u0177\u0178\7n\2\2\u0178" +
                    "\u0179\7n\2\2\u0179B\3\2\2\2\u017a\u017b\7v\2\2\u017b\u017c\7t\2\2\u017c" +
                    "\u017d\7{\2\2\u017dD\3\2\2\2\u017e\u017f\7e\2\2\u017f\u0180\7n\2\2\u0180" +
                    "\u0181\7c\2\2\u0181\u0182\7u\2\2\u0182\u0183\7u\2\2\u0183F\3\2\2\2\u0184" +
                    "\u0185\7e\2\2\u0185\u0186\7q\2\2\u0186\u0187\7p\2\2\u0187\u0188\7u\2\2" +
                    "\u0188\u0189\7v\2\2\u0189H\3\2\2\2\u018a\u018b\7u\2\2\u018b\u018c\7g\2" +
                    "\2\u018c\u018d\7n\2\2\u018d\u018e\7h\2\2\u018eJ\3\2\2\2\u018f\u0190\7" +
                    "p\2\2\u0190\u0191\7c\2\2\u0191\u0192\7v\2\2\u0192\u0193\7k\2\2\u0193\u0194" +
                    "\7x\2\2\u0194\u0195\7g\2\2\u0195L\3\2\2\2\u0196\u0197\7~\2\2\u0197\u0198" +
                    "\7~\2\2\u0198N\3\2\2\2\u0199\u019a\7<\2\2\u019a\u019b\7<\2\2\u019bP\3" +
                    "\2\2\2\u019c\u019d\7(\2\2\u019d\u019e\7(\2\2\u019eR\3\2\2\2\u019f\u01a0" +
                    "\7?\2\2\u01a0\u01a1\7?\2\2\u01a1T\3\2\2\2\u01a2\u01a3\7#\2\2\u01a3\u01a4" +
                    "\7?\2\2\u01a4V\3\2\2\2\u01a5\u01a6\7@\2\2\u01a6\u01a7\7?\2\2\u01a7X\3" +
                    "\2\2\2\u01a8\u01a9\7>\2\2\u01a9\u01aa\7?\2\2\u01aaZ\3\2\2\2\u01ab\u01ac" +
                    "\7`\2\2\u01ac\\\3\2\2\2\u01ad\u01ae\7#\2\2\u01ae^\3\2\2\2\u01af\u01b0" +
                    "\7@\2\2\u01b0`\3\2\2\2\u01b1\u01b2\7>\2\2\u01b2b\3\2\2\2\u01b3\u01b4\7" +
                    "-\2\2\u01b4d\3\2\2\2\u01b5\u01b6\7/\2\2\u01b6f\3\2\2\2\u01b7\u01b8\7," +
                    "\2\2\u01b8h\3\2\2\2\u01b9\u01ba\7\61\2\2\u01baj\3\2\2\2\u01bb\u01bc\7" +
                    "\'\2\2\u01bcl\3\2\2\2\u01bd\u01be\7}\2\2\u01ben\3\2\2\2\u01bf\u01c0\7" +
                    "\177\2\2\u01c0p\3\2\2\2\u01c1\u01c2\7]\2\2\u01c2r\3\2\2\2\u01c3\u01c4" +
                    "\7_\2\2\u01c4t\3\2\2\2\u01c5\u01c6\7*\2\2\u01c6v\3\2\2\2\u01c7\u01c8\7" +
                    "+\2\2\u01c8x\3\2\2\2\u01c9\u01ca\7=\2\2\u01caz\3\2\2\2\u01cb\u01cc\7?" +
                    "\2\2\u01cc|\3\2\2\2\u01cd\u01ce\7.\2\2\u01ce~\3\2\2\2\u01cf\u01d0\7A\2" +
                    "\2\u01d0\u0080\3\2\2\2\u01d1\u01d2\7<\2\2\u01d2\u0082\3\2\2\2\u01d3\u01d4" +
                    "\7v\2\2\u01d4\u01d5\7t\2\2\u01d5\u01d6\7w\2\2\u01d6\u01dd\7g\2\2\u01d7" +
                    "\u01d8\7h\2\2\u01d8\u01d9\7c\2\2\u01d9\u01da\7n\2\2\u01da\u01db\7u\2\2" +
                    "\u01db\u01dd\7g\2\2\u01dc\u01d3\3\2\2\2\u01dc\u01d7\3\2\2\2\u01dd\u0084" +
                    "\3\2\2\2\u01de\u01e6\5\u008fH\2\u01df\u01e3\7\60\2\2\u01e0\u01e2\5\u0091" +
                    "I\2\u01e1\u01e0\3\2\2\2\u01e2\u01e5\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e3" +
                    "\u01e4\3\2\2\2\u01e4\u01e7\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e6\u01df\3\2" +
                    "\2\2\u01e6\u01e7\3\2\2\2\u01e7\u0086\3\2\2\2\u01e8\u01ec\t\2\2\2\u01e9" +
                    "\u01eb\t\3\2\2\u01ea\u01e9\3\2\2\2\u01eb\u01ee\3\2\2\2\u01ec\u01ea\3\2" +
                    "\2\2\u01ec\u01ed\3\2\2\2\u01ed\u0088\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ef" +
                    "\u01f2\7$\2\2\u01f0\u01f3\5\u0093J\2\u01f1\u01f3\n\4\2\2\u01f2\u01f0\3" +
                    "\2\2\2\u01f2\u01f1\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f4" +
                    "\u01f5\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u0211\7$\2\2\u01f7\u01fa\7)\2" +
                    "\2\u01f8\u01fb\5\u0093J\2\u01f9\u01fb\n\5\2\2\u01fa\u01f8\3\2\2\2\u01fa" +
                    "\u01f9\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fc\u01fd\3\2" +
                    "\2\2\u01fd\u01fe\3\2\2\2\u01fe\u0211\7)\2\2\u01ff\u0200\7$\2\2\u0200\u0201" +
                    "\7$\2\2\u0201\u0202\7$\2\2\u0202\u020a\3\2\2\2\u0203\u0209\13\2\2\2\u0204" +
                    "\u0209\5\u0093J\2\u0205\u0209\n\5\2\2\u0206\u0207\7^\2\2\u0207\u0209\7" +
                    "p\2\2\u0208\u0203\3\2\2\2\u0208\u0204\3\2\2\2\u0208\u0205\3\2\2\2\u0208" +
                    "\u0206\3\2\2\2\u0209\u020c\3\2\2\2\u020a\u020b\3\2\2\2\u020a\u0208\3\2" +
                    "\2\2\u020b\u020d\3\2\2\2\u020c\u020a\3\2\2\2\u020d\u020e\7$\2\2\u020e" +
                    "\u020f\7$\2\2\u020f\u0211\7$\2\2\u0210\u01ef\3\2\2\2\u0210\u01f7\3\2\2" +
                    "\2\u0210\u01ff\3\2\2\2\u0211\u008a\3\2\2\2\u0212\u0213\7\61\2\2\u0213" +
                    "\u0214\7\61\2\2\u0214\u0218\3\2\2\2\u0215\u0217\n\6\2\2\u0216\u0215\3" +
                    "\2\2\2\u0217\u021a\3\2\2\2\u0218\u0216\3\2\2\2\u0218\u0219\3\2\2\2\u0219" +
                    "\u0227\3\2\2\2\u021a\u0218\3\2\2\2\u021b\u021c\7\61\2\2\u021c\u021d\7" +
                    ",\2\2\u021d\u0221\3\2\2\2\u021e\u0220\13\2\2\2\u021f\u021e\3\2\2\2\u0220" +
                    "\u0223\3\2\2\2\u0221\u0222\3\2\2\2\u0221\u021f\3\2\2\2\u0222\u0224\3\2" +
                    "\2\2\u0223\u0221\3\2\2\2\u0224\u0225\7,\2\2\u0225\u0227\7\61\2\2\u0226" +
                    "\u0212\3\2\2\2\u0226\u021b\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u0229\bF" +
                    "\2\2\u0229\u008c\3\2\2\2\u022a\u022b\t\7\2\2\u022b\u022c\3\2\2\2\u022c" +
                    "\u022d\bG\2\2\u022d\u008e\3\2\2\2\u022e\u0232\t\b\2\2\u022f\u0231\5\u0091" +
                    "I\2\u0230\u022f\3\2\2\2\u0231\u0234\3\2\2\2\u0232\u0230\3\2\2\2\u0232" +
                    "\u0233\3\2\2\2\u0233\u0237\3\2\2\2\u0234\u0232\3\2\2\2\u0235\u0237\7\62" +
                    "\2\2\u0236\u022e\3\2\2\2\u0236\u0235\3\2\2\2\u0237\u0090\3\2\2\2\u0238" +
                    "\u0239\t\t\2\2\u0239\u0092\3\2\2\2\u023a\u023d\7^\2\2\u023b\u023e\t\n" +
                    "\2\2\u023c\u023e\5\u0095K\2\u023d\u023b\3\2\2\2\u023d\u023c\3\2\2\2\u023e" +
                    "\u0094\3\2\2\2\u023f\u0240\7w\2\2\u0240\u0241\5\u0097L\2\u0241\u0242\5" +
                    "\u0097L\2\u0242\u0243\5\u0097L\2\u0243\u0244\5\u0097L\2\u0244\u0096\3" +
                    "\2\2\2\u0245\u0246\t\13\2\2\u0246\u0098\3\2\2\2\24\2\u01dc\u01e3\u01e6" +
                    "\u01ec\u01f2\u01f4\u01fa\u01fc\u0208\u020a\u0210\u0218\u0221\u0226\u0232" +
                    "\u0236\u023d\3\b\2\2";
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

    private static String[] makeLiteralNames() {
        return new String[]{
                null, "'.'", "'@'", "'header'", "'cn'", "'new'", "'as'", "'sys'", "'write'",
                "'range'", "'#'", "'except'", "'main'", "'3YCMPJ8W8VVTUA48TIHR8K332PYKTXOKVDFG'",
                null, "'async'", "'var'", "'import'", null, null, "'assert'", "'fn'",
                "'if'", "'else'", "'namespace'", "'return'", "'for'", "'while'", "'to'",
                "'do'", "'end'", "'in'", "'null'", "'try'", "'class'", "'const'", "'self'",
                "'native'", "'||'", "'::'", "'&&'", "'=='", "'!='", "'>='", "'<='", "'^'",
                "'!'", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'%'", "'{'", "'}'",
                "'['", "']'", "'('", "')'", "';'", "'='", "','", "'?'", "':'"
        };
    }

    private static String[] makeSymbolicNames() {
        return new String[]{
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