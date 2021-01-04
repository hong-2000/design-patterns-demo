package cn.zqhblog.designcode.j.observer;

import java.util.ArrayList;

/**
 * @author QingHong
 * @description 被观察者
 * @QQ 2560612959
 * @create 2021/1/4 17:50
 */
public abstract class AbstractSubject {
    private ArrayList<Observer> observerArrayList = new ArrayList<Observer>();

    public void addObserver(Observer observer) {
        this.observerArrayList.add(observer);
    }

    public void delObserver(Observer observer) {
        this.observerArrayList.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer :
                this.observerArrayList) {
            observer.update();
        }
    }
}
