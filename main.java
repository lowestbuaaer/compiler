import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
public class main {
    public static String filename;
    public static void main(String[] args) {
        try {
            //filename = args[1];
            CharStream inputStream = CharStreams.fromFileName(args[0]);
            minisysyLexer Lexer = new minisysyLexer(inputStream);
            CommonTokenStream tokenStream = new CommonTokenStream(Lexer); // 词法分析获取 token 流
            minisysyParser parser = new minisysyParser(tokenStream);
            parser.addErrorListener(new errorlistener());
            ParseTree tree = parser.funcdef(); // 获取语法树的根节点
            visitor visitor = new visitor();
            visitor.visit(tree);
        } catch (Exception e) {
            //System.out.println(e);
        }
    }

}
