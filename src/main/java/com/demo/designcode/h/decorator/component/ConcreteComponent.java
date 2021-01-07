package com.demo.designcode.h.decorator.component;

import com.demo.designcode.h.decorator.AbstractComponent;

/**
 * @author QingHong
 * @description 具体构件
 * @QQ 2560612959
 * @create 2021/1/4 17:50
 */
public class ConcreteComponent extends AbstractComponent {
    @Override
    public void operate() {
        System.out.println("do Something...");
    }
}
