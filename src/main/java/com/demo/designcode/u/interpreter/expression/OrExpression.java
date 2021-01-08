package com.demo.designcode.u.interpreter.expression;

import com.demo.designcode.u.interpreter.Expression;

/**
 * @author QingHong
 * @description ||表达式
 * @create 2021/1/4 17:50
 */
public class OrExpression implements Expression {

    private Expression expr1 = null;
    private Expression expr2 = null;

    public OrExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(String context) {
        return expr1.interpret(context) || expr2.interpret(context);
    }
}
