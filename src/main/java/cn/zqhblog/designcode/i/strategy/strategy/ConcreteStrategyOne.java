package cn.zqhblog.designcode.i.strategy.strategy;

import cn.zqhblog.designcode.i.strategy.Strategy;

/**
 * @author QingHong
 * @description
 * @QQ 2560612959
 * @create 2021/1/4 17:50
 */
public class ConcreteStrategyOne implements Strategy {
    @Override
    public void doSomeThing() {
        System.out.println("do something 1...");
    }
}
