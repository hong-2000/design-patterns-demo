package com.demo.designcode.j.observer;

import com.demo.designcode.j.observer.observer.ConcreteObserverOne;
import com.demo.designcode.j.observer.observer.ConcreteObserverTwo;
import com.demo.designcode.j.observer.subject.ConcreteSubject;

/**
 * @author QingHong
 * @description
 * @create 2021/1/4 17:50
 */
public class ObserverTest {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        Observer observer = new ConcreteObserverOne();
        subject.addObserver(observer);
        subject.addObserver(new ConcreteObserverTwo());
        subject.doSomething();
    }
}
