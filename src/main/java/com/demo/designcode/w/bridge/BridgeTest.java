package com.demo.designcode.w.bridge;

import com.demo.designcode.w.bridge.implementor.ImplementorOne;

/**
 * @author hong-2000
 * @description
 * @create 2021/1/4 17:50
 */
public class BridgeTest {
    public static void main(String[] args) {
        Implementor implementor = new ImplementorOne();
        Abstraction abstraction = new RefinedAbstraction(implementor);
        abstraction.request();

        /**
         * @author hong-2000
         * 解决继承的缺点而提出的设计模式
         */
    }
}
