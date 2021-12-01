// Generated from minisysy.g4 by ANTLR 4.9.2
        //�?种action,定义生成的词法语法解析文件的头，当使用java的时候，生成的类�?要包名，可以在这里统�?定义
 package antlr;
 
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link minisysyParser}.
 */
public interface minisysyListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link minisysyParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(minisysyParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link minisysyParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(minisysyParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link minisysyParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(minisysyParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link minisysyParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(minisysyParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link minisysyParser#funcdef}.
	 * @param ctx the parse tree
	 */
	void enterFuncdef(minisysyParser.FuncdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link minisysyParser#funcdef}.
	 * @param ctx the parse tree
	 */
	void exitFuncdef(minisysyParser.FuncdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link minisysyParser#comunit}.
	 * @param ctx the parse tree
	 */
	void enterComunit(minisysyParser.ComunitContext ctx);
	/**
	 * Exit a parse tree produced by {@link minisysyParser#comunit}.
	 * @param ctx the parse tree
	 */
	void exitComunit(minisysyParser.ComunitContext ctx);
}