// Generated from Hello.g4 by ANTLR 4.4
 package grammar; 
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HelloLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Bool=1, Int=2, Float=3, IF=4, ELSE=5, AND=6, OR=7, WS=8, TRUE=9, FALSE=10, 
		ID=11;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'"
	};
	public static final String[] ruleNames = {
		"Bool", "Int", "Float", "IF", "ELSE", "AND", "OR", "WS", "TRUE", "FALSE", 
		"ID"
	};


	public HelloLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Hello.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\rf\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\5\2\34\n\2\3\3\6\3\37\n\3\r\3\16\3 \3\4\3\4\3\4\6"+
		"\4&\n\4\r\4\16\4\'\3\4\3\4\5\4,\n\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\t\6\t=\n\t\r\t\16\t>\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nO\n\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13`\n\13\3\f\6\fc\n\f"+
		"\r\f\16\fd\2\2\r\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\3"+
		"\2\5\3\2\62;\5\2\13\f\17\17\"\"\3\2c|o\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\3\33\3\2\2\2\5\36\3\2\2\2\7+\3\2"+
		"\2\2\t-\3\2\2\2\13\60\3\2\2\2\r\65\3\2\2\2\178\3\2\2\2\21<\3\2\2\2\23"+
		"N\3\2\2\2\25_\3\2\2\2\27b\3\2\2\2\31\34\5\23\n\2\32\34\5\25\13\2\33\31"+
		"\3\2\2\2\33\32\3\2\2\2\34\4\3\2\2\2\35\37\t\2\2\2\36\35\3\2\2\2\37 \3"+
		"\2\2\2 \36\3\2\2\2 !\3\2\2\2!\6\3\2\2\2\"#\5\5\3\2#%\7\60\2\2$&\5\5\3"+
		"\2%$\3\2\2\2&\'\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(,\3\2\2\2)*\7\60\2\2*,\5"+
		"\5\3\2+\"\3\2\2\2+)\3\2\2\2,\b\3\2\2\2-.\7k\2\2./\7h\2\2/\n\3\2\2\2\60"+
		"\61\7g\2\2\61\62\7n\2\2\62\63\7u\2\2\63\64\7g\2\2\64\f\3\2\2\2\65\66\7"+
		"(\2\2\66\67\7(\2\2\67\16\3\2\2\289\7~\2\29:\7~\2\2:\20\3\2\2\2;=\t\3\2"+
		"\2<;\3\2\2\2=>\3\2\2\2><\3\2\2\2>?\3\2\2\2?@\3\2\2\2@A\b\t\2\2A\22\3\2"+
		"\2\2BC\7V\2\2CD\7t\2\2DE\7w\2\2EO\7g\2\2FG\7v\2\2GH\7t\2\2HI\7w\2\2IO"+
		"\7g\2\2JK\7V\2\2KL\7T\2\2LM\7W\2\2MO\7G\2\2NB\3\2\2\2NF\3\2\2\2NJ\3\2"+
		"\2\2O\24\3\2\2\2PQ\7H\2\2QR\7c\2\2RS\7n\2\2ST\7u\2\2T`\7g\2\2UV\7h\2\2"+
		"VW\7c\2\2WX\7n\2\2XY\7u\2\2Y`\7g\2\2Z[\7H\2\2[\\\7C\2\2\\]\7N\2\2]^\7"+
		"U\2\2^`\7G\2\2_P\3\2\2\2_U\3\2\2\2_Z\3\2\2\2`\26\3\2\2\2ac\t\4\2\2ba\3"+
		"\2\2\2cd\3\2\2\2db\3\2\2\2de\3\2\2\2e\30\3\2\2\2\13\2\33 \'+>N_d\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}