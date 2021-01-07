package com.demo.designcode.s.visitor.visitor;

import com.demo.designcode.s.visitor.IVisitor;
import com.demo.designcode.s.visitor.element.ConcreteElementOne;
import com.demo.designcode.s.visitor.element.ConcreteElementTwo;

/**
 * @author QingHong
 * @description 具体访问者
 * @QQ 2560612959
 * @create 2021/1/4 17:50
 */
public class Visitor implements IVisitor {
    @Override
    public void visit(ConcreteElementOne element) {
        element.doSomething();
    }

    @Override
    public void visit(ConcreteElementTwo element) {
        element.doSomething();
    }
}
