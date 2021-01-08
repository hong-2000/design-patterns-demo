package com.demo.designcode.w.bridge;

/**
 * @author QingHong
 * @create 2021/1/4 17:50
 */
public abstract class Abstraction {
    private Implementor implementor;

    /**
     * 约束子类必须实现该构造函数
     *
     * @param implementor
     */
    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public void request() {
        this.implementor.doSomething();
    }

    public Implementor getImplementor() {
        return implementor;
    }
}
