package cn.zqhblog.designcode.u.interpreter;

import cn.zqhblog.designcode.u.interpreter.expression.AndExpression;
import cn.zqhblog.designcode.u.interpreter.expression.OrExpression;
import cn.zqhblog.designcode.u.interpreter.expression.TerminalExpression;

/**
 * @author QingHong
 * @description
 * @QQ 2560612959
 * @create 2021/1/4 17:50
 */
public class InterpreterTest {
    /**
     * 规则：Robert 和 John 是男性
     */
    public static Expression getMaleExpression() {
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    /**
     * 规则：Julie 是一个已婚的女性
     *
     * @return
     */
    public static Expression getMarriedWomanExpression() {
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("John is male? " + isMale.interpret("John"));
        System.out.println("Julie is a married women? "
                + isMarriedWoman.interpret("Married Julie"));
    }
}
