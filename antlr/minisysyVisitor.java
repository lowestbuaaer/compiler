package antlr;
 
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link minisysyParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface minisysyVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link minisysyParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(minisysyParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link minisysyParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(minisysyParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link minisysyParser#funcdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncdef(minisysyParser.FuncdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link minisysyParser#comunit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComunit(minisysyParser.ComunitContext ctx);
}