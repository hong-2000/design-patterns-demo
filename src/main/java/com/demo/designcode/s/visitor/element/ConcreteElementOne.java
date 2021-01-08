package com.demo.designcode.s.visitor.element;

import com.demo.designcode.s.visitor.AbstractElement;
import com.demo.designcode.s.visitor.IVisitor;

/**
 * @author QingHong
 * @description 具体元素
 * @create 2021/1/4 17:50
 */
public class ConcreteElementOne extends AbstractElement {
    @Override
    public void doSomething() {
        System.out.println("one...");
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
