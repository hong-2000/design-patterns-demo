package com.demo.designcode.p.composite;

import java.util.ArrayList;

/**
 * @author QingHong
 * @description 抽象构建
 * @QQ 2560612959
 * @create 2021/1/4 17:50
 */
public abstract class AbstractComponent {
    public void doSomething() {

    }

    /**
     * 增加一个叶子构建或树枝构建
     *
     * @param component
     */
    public abstract void add(AbstractComponent component);

    /**
     * 移除一个叶子构建或树枝构建
     *
     * @param component
     */
    public abstract void remove(AbstractComponent component);

    /**
     * 获取
     *
     * @return
     */
    public abstract ArrayList<AbstractComponent> getChildren();
}
