package com.demo.designcode.h.decorator;

import com.demo.designcode.h.decorator.component.ConcreteComponent;
import com.demo.designcode.h.decorator.decorator.ConcreteDecoratorOne;
import com.demo.designcode.h.decorator.decorator.ConcreteDecoratorTwo;

/**
 * @author QingHong
 * @description
 * @QQ 2560612959
 * @create 2021/1/4 17:50
 */
public class DecoratorTest {
    public static void main(String[] args) {
        AbstractComponent component = new ConcreteComponent();
        component = new ConcreteDecoratorOne(component);
        component = new ConcreteDecoratorTwo(component);
        component.operate();

        /**
         * @author hong-2000
         * 1. Component
         * 2. ConcreteComponent
         * 3. Decorator
         * 4. ConcreteDecorator
         * 是继承的有利扩充，不要进行多层装饰，否则像剥洋葱一样。
         */
    }
}
