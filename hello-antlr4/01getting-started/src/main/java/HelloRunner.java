import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class HelloRunner {
    public static void main(final String[] args) throws Exception {

        final CharStream input = CharStreams.fromStream(System.in);
        //        final ANTLRInputStream input = new ANTLRInputStream(System.in);

        final HelloLexer lexer = new HelloLexer(input);

        final CommonTokenStream tokens = new CommonTokenStream(lexer);

        final HelloParser parser = new HelloParser(tokens);
        final ParseTree tree = parser.r(); // begin parsing at rule 'r'
        System.out.println(tree.toStringTree(parser)); // print LISP-style tree
    }
}
