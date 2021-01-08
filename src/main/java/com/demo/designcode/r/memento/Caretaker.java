package com.demo.designcode.r.memento;

/**
 * @author QingHong
 * @description 备忘录管理员角色
 * @create 2021/1/4 17:50
 */
public class Caretaker {
    private IMemento memento;

    public IMemento getMemento() {
        return memento;
    }

    public void setMemento(IMemento memento) {
        this.memento = memento;
    }
}
