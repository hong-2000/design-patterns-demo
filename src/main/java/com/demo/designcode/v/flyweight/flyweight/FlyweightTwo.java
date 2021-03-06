package com.demo.designcode.v.flyweight.flyweight;

import com.demo.designcode.v.flyweight.AbstractFlyweight;

/**
 * @author QingHong
 * @description 具体享元角色
 * @create 2021/1/4 17:50
 */
public class FlyweightTwo extends AbstractFlyweight {
    public FlyweightTwo(String extrinsic) {
        super(extrinsic);
    }

    @Override
    public void operate() {
        System.out.println(this.getClass().getName() + " two...");
    }
}
