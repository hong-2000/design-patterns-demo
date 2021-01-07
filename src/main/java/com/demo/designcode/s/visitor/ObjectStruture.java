package com.demo.designcode.s.visitor;

import com.demo.designcode.s.visitor.element.ConcreteElementOne;
import com.demo.designcode.s.visitor.element.ConcreteElementTwo;

import java.util.Random;

/**
 * @author QingHong
 * @description 结构对象
 * @QQ 2560612959
 * @create 2021/1/4 17:50
 */
public class ObjectStruture {
    /**
     * 模拟工厂
     *
     * @return
     */
    public static AbstractElement createElement() {
        Random random = new Random();
        int bound = 100;
        int index = 50;
        if (random.nextInt(bound) > index) {
            return new ConcreteElementOne();
        } else {
            return new ConcreteElementTwo();
        }
    }
}
