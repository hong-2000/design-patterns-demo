package com.demo.designcode.s.visitor;

/**
 * @author QingHong
 * @description 抽象元素
 * @create 2021/1/4 17:50
 */
public abstract class AbstractElement {
    /**
     * 定义业务逻辑
     */
    public abstract void doSomething();

    /**
     * 允许谁来访问
     *
     * @param visitor
     */
    public abstract void accept(IVisitor visitor);
}
