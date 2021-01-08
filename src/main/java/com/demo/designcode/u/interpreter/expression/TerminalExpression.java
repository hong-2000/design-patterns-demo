package com.demo.designcode.u.interpreter.expression;

import com.demo.designcode.u.interpreter.Expression;

/**
 * @author QingHong
 * @description 终结符表达式
 * @create 2021/1/4 17:50
 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if (context.contains(data)) {
            return true;
        }
        return false;
    }
}
