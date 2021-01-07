package com.demo.designcode.i.strategy.strategy;

import com.demo.designcode.i.strategy.Strategy;

/**
 * @author QingHong
 * @description
 * @QQ 2560612959
 * @create 2021/1/4 17:50
 */
public class ConcreteStrategyTwo implements Strategy {
    @Override
    public void doSomeThing() {
        System.out.println("do something 2...");
    }
}
