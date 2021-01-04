package cn.zqhblog.designcode.g.builder.product;

import cn.zqhblog.designcode.g.builder.AbstractProduct;

/**
 * @author QingHong
 * @description
 * @QQ 2560612959
 * @create 2021/1/4 17:50
 */
public class First extends AbstractProduct {

    private static final String FIRST = "first";

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
