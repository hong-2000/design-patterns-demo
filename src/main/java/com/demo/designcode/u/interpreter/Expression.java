package com.demo.designcode.u.interpreter;

/**
 * @author QingHong
 * @description 抽象表达式
 * @QQ 2560612959
 * @create 2021/1/4 17:50
 */
public interface Expression {
    /**
     * 每一个表达式必须有一个解析任务
     *
     * @param context
     * @return
     */
    boolean interpret(String context);
}
