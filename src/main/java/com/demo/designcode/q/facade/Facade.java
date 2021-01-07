package com.demo.designcode.q.facade;

/**
 * @author QingHong
 * @description 门面对象
 * @QQ 2560612959
 * @create 2021/1/4 17:50
 */
public class Facade {
    private ClassA a = new ClassA();
    private ClassB b = new ClassB();

    public void methodA() {
        this.a.doSomethingA();
    }

    public void methodB() {
        this.b.doSomethingB();
    }

    /**
     * @author zhaoqinghong
     * 最大的缺点是不符合开闭原则
     */
}
