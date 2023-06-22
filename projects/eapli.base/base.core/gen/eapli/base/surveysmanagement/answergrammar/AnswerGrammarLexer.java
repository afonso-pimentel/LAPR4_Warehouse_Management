// Generated from D:/LAPR4_REPO/projects/eapli.base/base.core/src/main/java/eapli/base/surveysmanagement/answergrammar\AnswerGrammar.g4 by ANTLR 4.10.1
package eapli.base.surveysmanagement.answergrammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AnswerGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, POSITIVE_NUMERIC=5, CARDINAL=6, INPUT_SEP=7, 
		SCALING_SEP=8, SCALING_OP=9, DOT=10, DOT_COMMA=11, COMMA=12, SEPARATOR=13, 
		NEWLINE=14, WS=15, APOSTROPHE=16, EQUAL=17, SPECIAL=18, HIFEN=19, SCALE_VALUE=20, 
		FREE_TEXT=21, ZERO=22, NUMERIC=23, WORD=24, NAME=25, UPPERCASE_WORD=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "POSITIVE_NUMERIC", "CARDINAL", "INPUT_SEP", 
			"SCALING_SEP", "SCALING_OP", "DOT", "DOT_COMMA", "COMMA", "SEPARATOR", 
			"NEWLINE", "WS", "APOSTROPHE", "EQUAL", "SPECIAL", "HIFEN", "SCALE_VALUE", 
			"FREE_TEXT", "ZERO", "NUMERIC", "WORD", "NAME", "UPPERCASE_WORD"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'('", "')'", null, "'#'", "'%in%'", "'%s%'", "'%so%'", 
			"'.'", "';'", "','", "'::'", "'\\n'", null, "'''", "'='", null, "'-'", 
			null, null, "'0'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "POSITIVE_NUMERIC", "CARDINAL", "INPUT_SEP", 
			"SCALING_SEP", "SCALING_OP", "DOT", "DOT_COMMA", "COMMA", "SEPARATOR", 
			"NEWLINE", "WS", "APOSTROPHE", "EQUAL", "SPECIAL", "HIFEN", "SCALE_VALUE", 
			"FREE_TEXT", "ZERO", "NUMERIC", "WORD", "NAME", "UPPERCASE_WORD"
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


	public AnswerGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AnswerGrammar.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 24:
			NAME_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void NAME_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u0000\u001a\u00da\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0004\u0004A\b\u0004\u000b\u0004"+
		"\f\u0004B\u0003\u0004E\b\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0004"+
		"\u000ei\b\u000e\u000b\u000e\f\u000ej\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u00ac\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0004\u0014\u00b8\b\u0014\u000b\u0014\f\u0014\u00b9\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0004\u0016\u00c2"+
		"\b\u0016\u000b\u0016\f\u0016\u00c3\u0004\u0016\u00c6\b\u0016\u000b\u0016"+
		"\f\u0016\u00c7\u0001\u0017\u0004\u0017\u00cb\b\u0017\u000b\u0017\f\u0017"+
		"\u00cc\u0001\u0018\u0001\u0018\u0001\u0018\u0004\u0018\u00d2\b\u0018\u000b"+
		"\u0018\f\u0018\u00d3\u0001\u0019\u0004\u0019\u00d7\b\u0019\u000b\u0019"+
		"\f\u0019\u00d8\u0000\u0000\u001a\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013"+
		"\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a\u0001\u0000\u0005\u0001"+
		"\u000019\u0001\u000009\b\u0000!!$$&&*+<>@@^^||\u0001\u0000az\u0001\u0000"+
		"AZ\u00f0\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000"+
		"\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000"+
		"!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001"+
		"\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000"+
		"\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000"+
		"\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003"+
		"\u0001\u0000\u0000\u0000\u00015\u0001\u0000\u0000\u0000\u00037\u0001\u0000"+
		"\u0000\u0000\u00059\u0001\u0000\u0000\u0000\u0007;\u0001\u0000\u0000\u0000"+
		"\tD\u0001\u0000\u0000\u0000\u000bF\u0001\u0000\u0000\u0000\rH\u0001\u0000"+
		"\u0000\u0000\u000fM\u0001\u0000\u0000\u0000\u0011Q\u0001\u0000\u0000\u0000"+
		"\u0013V\u0001\u0000\u0000\u0000\u0015Z\u0001\u0000\u0000\u0000\u0017^"+
		"\u0001\u0000\u0000\u0000\u0019`\u0001\u0000\u0000\u0000\u001bc\u0001\u0000"+
		"\u0000\u0000\u001dh\u0001\u0000\u0000\u0000\u001fn\u0001\u0000\u0000\u0000"+
		"!r\u0001\u0000\u0000\u0000#t\u0001\u0000\u0000\u0000%v\u0001\u0000\u0000"+
		"\u0000\'\u00ab\u0001\u0000\u0000\u0000)\u00b7\u0001\u0000\u0000\u0000"+
		"+\u00bb\u0001\u0000\u0000\u0000-\u00c5\u0001\u0000\u0000\u0000/\u00ca"+
		"\u0001\u0000\u0000\u00001\u00ce\u0001\u0000\u0000\u00003\u00d6\u0001\u0000"+
		"\u0000\u000056\u0005{\u0000\u00006\u0002\u0001\u0000\u0000\u000078\u0005"+
		"}\u0000\u00008\u0004\u0001\u0000\u0000\u00009:\u0005(\u0000\u0000:\u0006"+
		"\u0001\u0000\u0000\u0000;<\u0005)\u0000\u0000<\b\u0001\u0000\u0000\u0000"+
		"=E\u0007\u0000\u0000\u0000>@\u0007\u0000\u0000\u0000?A\u0007\u0001\u0000"+
		"\u0000@?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000B@\u0001\u0000"+
		"\u0000\u0000BC\u0001\u0000\u0000\u0000CE\u0001\u0000\u0000\u0000D=\u0001"+
		"\u0000\u0000\u0000D>\u0001\u0000\u0000\u0000E\n\u0001\u0000\u0000\u0000"+
		"FG\u0005#\u0000\u0000G\f\u0001\u0000\u0000\u0000HI\u0005%\u0000\u0000"+
		"IJ\u0005i\u0000\u0000JK\u0005n\u0000\u0000KL\u0005%\u0000\u0000L\u000e"+
		"\u0001\u0000\u0000\u0000MN\u0005%\u0000\u0000NO\u0005s\u0000\u0000OP\u0005"+
		"%\u0000\u0000P\u0010\u0001\u0000\u0000\u0000QR\u0005%\u0000\u0000RS\u0005"+
		"s\u0000\u0000ST\u0005o\u0000\u0000TU\u0005%\u0000\u0000U\u0012\u0001\u0000"+
		"\u0000\u0000VW\u0005.\u0000\u0000WX\u0001\u0000\u0000\u0000XY\u0006\t"+
		"\u0000\u0000Y\u0014\u0001\u0000\u0000\u0000Z[\u0005;\u0000\u0000[\\\u0001"+
		"\u0000\u0000\u0000\\]\u0006\n\u0000\u0000]\u0016\u0001\u0000\u0000\u0000"+
		"^_\u0005,\u0000\u0000_\u0018\u0001\u0000\u0000\u0000`a\u0005:\u0000\u0000"+
		"ab\u0005:\u0000\u0000b\u001a\u0001\u0000\u0000\u0000cd\u0005\n\u0000\u0000"+
		"de\u0001\u0000\u0000\u0000ef\u0006\r\u0000\u0000f\u001c\u0001\u0000\u0000"+
		"\u0000gi\u0005 \u0000\u0000hg\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000"+
		"\u0000jh\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000kl\u0001\u0000"+
		"\u0000\u0000lm\u0006\u000e\u0000\u0000m\u001e\u0001\u0000\u0000\u0000"+
		"no\u0005\'\u0000\u0000op\u0001\u0000\u0000\u0000pq\u0006\u000f\u0000\u0000"+
		"q \u0001\u0000\u0000\u0000rs\u0005=\u0000\u0000s\"\u0001\u0000\u0000\u0000"+
		"tu\u0007\u0002\u0000\u0000u$\u0001\u0000\u0000\u0000vw\u0005-\u0000\u0000"+
		"w&\u0001\u0000\u0000\u0000xy\u0005S\u0000\u0000yz\u0005t\u0000\u0000z"+
		"{\u0005r\u0000\u0000{|\u0005o\u0000\u0000|}\u0005n\u0000\u0000}~\u0005"+
		"g\u0000\u0000~\u007f\u0005l\u0000\u0000\u007f\u0080\u0005y\u0000\u0000"+
		"\u0080\u0081\u0005 \u0000\u0000\u0081\u0082\u0005A\u0000\u0000\u0082\u0083"+
		"\u0005g\u0000\u0000\u0083\u0084\u0005r\u0000\u0000\u0084\u0085\u0005e"+
		"\u0000\u0000\u0085\u00ac\u0005e\u0000\u0000\u0086\u0087\u0005A\u0000\u0000"+
		"\u0087\u0088\u0005g\u0000\u0000\u0088\u0089\u0005r\u0000\u0000\u0089\u008a"+
		"\u0005e\u0000\u0000\u008a\u00ac\u0005e\u0000\u0000\u008b\u008c\u0005N"+
		"\u0000\u0000\u008c\u008d\u0005e\u0000\u0000\u008d\u008e\u0005u\u0000\u0000"+
		"\u008e\u008f\u0005t\u0000\u0000\u008f\u0090\u0005r\u0000\u0000\u0090\u0091"+
		"\u0005a\u0000\u0000\u0091\u00ac\u0005l\u0000\u0000\u0092\u0093\u0005D"+
		"\u0000\u0000\u0093\u0094\u0005i\u0000\u0000\u0094\u0095\u0005s\u0000\u0000"+
		"\u0095\u0096\u0005a\u0000\u0000\u0096\u0097\u0005g\u0000\u0000\u0097\u0098"+
		"\u0005r\u0000\u0000\u0098\u0099\u0005e\u0000\u0000\u0099\u00ac\u0005e"+
		"\u0000\u0000\u009a\u009b\u0005S\u0000\u0000\u009b\u009c\u0005t\u0000\u0000"+
		"\u009c\u009d\u0005r\u0000\u0000\u009d\u009e\u0005o\u0000\u0000\u009e\u009f"+
		"\u0005n\u0000\u0000\u009f\u00a0\u0005g\u0000\u0000\u00a0\u00a1\u0005l"+
		"\u0000\u0000\u00a1\u00a2\u0005y\u0000\u0000\u00a2\u00a3\u0005 \u0000\u0000"+
		"\u00a3\u00a4\u0005D\u0000\u0000\u00a4\u00a5\u0005i\u0000\u0000\u00a5\u00a6"+
		"\u0005s\u0000\u0000\u00a6\u00a7\u0005a\u0000\u0000\u00a7\u00a8\u0005g"+
		"\u0000\u0000\u00a8\u00a9\u0005r\u0000\u0000\u00a9\u00aa\u0005e\u0000\u0000"+
		"\u00aa\u00ac\u0005e\u0000\u0000\u00abx\u0001\u0000\u0000\u0000\u00ab\u0086"+
		"\u0001\u0000\u0000\u0000\u00ab\u008b\u0001\u0000\u0000\u0000\u00ab\u0092"+
		"\u0001\u0000\u0000\u0000\u00ab\u009a\u0001\u0000\u0000\u0000\u00ac(\u0001"+
		"\u0000\u0000\u0000\u00ad\u00b8\u0003/\u0017\u0000\u00ae\u00b8\u00033\u0019"+
		"\u0000\u00af\u00b8\u00031\u0018\u0000\u00b0\u00b8\u0003\t\u0004\u0000"+
		"\u00b1\u00b8\u0003+\u0015\u0000\u00b2\u00b8\u0003\u001d\u000e\u0000\u00b3"+
		"\u00b8\u0003#\u0011\u0000\u00b4\u00b8\u0003\u001f\u000f\u0000\u00b5\u00b8"+
		"\u0003\u0017\u000b\u0000\u00b6\u00b8\u0003%\u0012\u0000\u00b7\u00ad\u0001"+
		"\u0000\u0000\u0000\u00b7\u00ae\u0001\u0000\u0000\u0000\u00b7\u00af\u0001"+
		"\u0000\u0000\u0000\u00b7\u00b0\u0001\u0000\u0000\u0000\u00b7\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b7\u00b2\u0001\u0000\u0000\u0000\u00b7\u00b3\u0001"+
		"\u0000\u0000\u0000\u00b7\u00b4\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001"+
		"\u0000\u0000\u0000\u00b7\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001"+
		"\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001"+
		"\u0000\u0000\u0000\u00ba*\u0001\u0000\u0000\u0000\u00bb\u00bc\u00050\u0000"+
		"\u0000\u00bc,\u0001\u0000\u0000\u0000\u00bd\u00be\u00050\u0000\u0000\u00be"+
		"\u00c6\u0007\u0000\u0000\u0000\u00bf\u00c1\u0007\u0000\u0000\u0000\u00c0"+
		"\u00c2\u0007\u0001\u0000\u0000\u00c1\u00c0\u0001\u0000\u0000\u0000\u00c2"+
		"\u00c3\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c3"+
		"\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c6\u0001\u0000\u0000\u0000\u00c5"+
		"\u00bd\u0001\u0000\u0000\u0000\u00c5\u00bf\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c7\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c7"+
		"\u00c8\u0001\u0000\u0000\u0000\u00c8.\u0001\u0000\u0000\u0000\u00c9\u00cb"+
		"\u0007\u0003\u0000\u0000\u00ca\u00c9\u0001\u0000\u0000\u0000\u00cb\u00cc"+
		"\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cd"+
		"\u0001\u0000\u0000\u0000\u00cd0\u0001\u0000\u0000\u0000\u00ce\u00cf\u0007"+
		"\u0004\u0000\u0000\u00cf\u00d1\u0006\u0018\u0001\u0000\u00d0\u00d2\u0007"+
		"\u0003\u0000\u0000\u00d1\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001"+
		"\u0000\u0000\u0000\u00d42\u0001\u0000\u0000\u0000\u00d5\u00d7\u0007\u0004"+
		"\u0000\u0000\u00d6\u00d5\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000"+
		"\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000"+
		"\u0000\u0000\u00d94\u0001\u0000\u0000\u0000\r\u0000BDj\u00ab\u00b7\u00b9"+
		"\u00c3\u00c5\u00c7\u00cc\u00d3\u00d8\u0002\u0006\u0000\u0000\u0001\u0018"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}