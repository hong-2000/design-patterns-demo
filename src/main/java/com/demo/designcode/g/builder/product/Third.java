package com.demo.designcode.g.builder.product;

import com.demo.designcode.g.builder.AbstractProduct;

/**
 * @author QingHong
 * @description
 * @QQ 2560612959
 * @create 2021/1/4 17:50
 */
public class Third extends AbstractProduct {
    private static final String FIRST = "third";

    @Override
    protected void first() {
        System.out.println(FIRST + "...first...");
    }

    @Override
    protected void second() {
        System.out.println(FIRST + "...second...");
    }

    @Override
    protected void third() {
        System.out.println(FIRST + "...third...");
    }
}