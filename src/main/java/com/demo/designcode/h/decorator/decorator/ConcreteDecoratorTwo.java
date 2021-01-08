package com.demo.designcode.h.decorator.decorator;

import com.demo.designcode.h.decorator.AbstractComponent;
import com.demo.designcode.h.decorator.AbstractDecorator;

/**
 * @author QingHong
 * @description 具体装饰者
 * @create 2021/1/4 17:50
 */
public class ConcreteDecoratorTwo extends AbstractDecorator {

    public ConcreteDecoratorTwo(AbstractComponent abstractComponent) {
        super(abstractComponent);
    }

    private void method() {
        System.out.println("修饰的方法 2...");
    }

    @Override
    public void operate() {
        this.method();
        super.operate();
        this.method();
    }
}
