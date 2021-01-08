package com.demo.designcode.j.observer.subject;

import com.demo.designcode.j.observer.AbstractSubject;

/**
 * @author QingHong
 * @description 具体被观察者
 * @create 2021/1/4 17:50
 */
public class ConcreteSubject extends AbstractSubject {
    public void doSomething() {
        /**
         * do something
         */
        System.out.println("被观察者 放了一个屁...");
        super.notifyObservers();
    }
}
