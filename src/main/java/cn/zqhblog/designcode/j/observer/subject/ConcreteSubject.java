package cn.zqhblog.designcode.j.observer.subject;

import cn.zqhblog.designcode.j.observer.AbstractSubject;

/**
 * @author QingHong
 * @description 具体被观察者
 * @QQ 2560612959
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
