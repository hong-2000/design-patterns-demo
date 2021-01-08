package com.demo.designcode.n.adapter.target;

import com.demo.designcode.n.adapter.Target;

/**
 * @author QingHong
 * @description 目标角色的实现类
 * @create 2021/1/4 17:50
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("target...");
    }
}
