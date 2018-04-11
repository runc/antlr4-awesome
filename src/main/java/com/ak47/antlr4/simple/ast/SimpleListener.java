// Generated from /Users/runc/code/dtstack/antlr4-awesome/src/main/antlr4/com/ak47/antlr4/simple/Simple.g4 by ANTLR 4.7
package com.ak47.antlr4.simple.ast;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleParser}.
 */
public interface SimpleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleParser#calc}.
	 * @param ctx the parse tree
	 */
	void enterCalc(SimpleParser.CalcContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#calc}.
	 * @param ctx the parse tree
	 */
	void exitCalc(SimpleParser.CalcContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SimpleParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SimpleParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(SimpleParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(SimpleParser.NumberContext ctx);
}