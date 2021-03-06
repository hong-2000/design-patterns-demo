package com.demo.designcode.r.memento;

/**
 * @author QingHong
 * @description
 * @create 2021/1/4 17:50
 */
public class MementoTest {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        originator.setState("x");
        caretaker.setMemento(originator.createMemento());
        originator.setState("y");
        originator.restoreMemento(caretaker.getMemento());
        System.out.println(originator.getState());

    }
}
