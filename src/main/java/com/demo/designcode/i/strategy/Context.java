package com.demo.designcode.i.strategy;

/**
 * @author QingHong
 * @description 封装角色
 * @create 2021/1/4 17:50
 */
public class Context {
    private Strategy strategy = null;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 根据 不同的策略 做 不同的事
     */
    public void doAnything() {
        this.strategy.doSomeThing();
    }
}