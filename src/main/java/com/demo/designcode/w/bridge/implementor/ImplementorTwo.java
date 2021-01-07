package com.demo.designcode.w.bridge.implementor;

import com.demo.designcode.w.bridge.Implementor;

/**
 * @author QingHong
 * @description
 * @QQ 2560612959
 * @create 2021/1/4 17:50
 */
public class ImplementorTwo implements Implementor {
    @Override
    public void doSomething() {
        System.out.println(this.getClass().getName());
    }

    @Override
    public void doAnything() {
        System.out.println(this.getClass().getName());
    }
}
