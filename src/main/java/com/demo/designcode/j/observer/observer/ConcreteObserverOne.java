package com.demo.designcode.j.observer.observer;

import com.demo.designcode.j.observer.Observer;

/**
 * @author QingHong
 * @description 具体观察者
 * @create 2021/1/4 17:50
 */
public class ConcreteObserverOne implements Observer {
    @Override
    public void update() {
        System.out.println("1号 收到并回了一个屁...");
    }
}
