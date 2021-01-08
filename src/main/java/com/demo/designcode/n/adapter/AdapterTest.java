package com.demo.designcode.n.adapter;

import com.demo.designcode.n.adapter.adapter.Adapter;
import com.demo.designcode.n.adapter.target.ConcreteTarget;

/**
 * @author QingHong
 * @description
 * @create 2021/1/4 17:50
 */
public class AdapterTest {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();

        Target target1 = new Adapter();
        target1.request();

        Source target2 = new Adapter();
        target2.doSomething();
    }
}
