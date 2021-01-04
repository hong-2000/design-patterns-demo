package cn.zqhblog.designcode.j.observer;

import cn.zqhblog.designcode.j.observer.observer.ConcreteObserverOne;
import cn.zqhblog.designcode.j.observer.observer.ConcreteObserverTwo;
import cn.zqhblog.designcode.j.observer.subject.ConcreteSubject;

/**
 * @author QingHong
 * @description
 * @QQ 2560612959
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
