package com.demo.designcode.j.observer.observer;

import com.demo.designcode.j.observer.Observer;

/**
 * @author QingHong
 * @description
 * @QQ 2560612959
 * @create 2021/1/4 17:50
 */
public class ConcreteObserverTwo implements Observer {
    @Override
    public void update() {
        System.out.println("2号 收到并昏厥了过去...");
    }
}
