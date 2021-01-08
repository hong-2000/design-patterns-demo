package com.demo.designcode.i.strategy;

import com.demo.designcode.i.strategy.strategy.ConcreteStrategyOne;

/**
 * @author QingHong
 * @description
 * @QQ 2560612959
 * @create 2021/1/4 17:50
 */
public class StrategyTest {
    public static void main(String[] args) {
        // 策略接口
        Strategy strategy = new ConcreteStrategyOne();
        Context context = new Context(strategy);
        context.doAnything();

        // 策略枚举
        String str = "1+2";
        String[] split = str.split("(\\+)?-?");
        System.out.println(Calculator.ADD.exec(Integer.parseInt(split[0]), Integer.parseInt(split[split.length - 1])));

        /**
         * @author hong-2000
         * 所有的策略都需要暴露，复用小 类数量多
         * 需要配合其他模式，产生混合模式，策略数4个以上用混合，工厂方法，代理，享元
         */
    }
}
