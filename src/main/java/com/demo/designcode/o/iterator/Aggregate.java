package com.demo.designcode.o.iterator;

/**
 * @author QingHong
 * @description 抽象容器
 * @QQ 2560612959
 * @create 2021/1/4 17:50
 */
public interface Aggregate {
    /**
     * 元素增加
     *
     * @param object
     */
    void add(Object object);

    /**
     * 元素减少
     *
     * @param object
     */
    void remove(Object object);

    /**
     * 由迭代器遍历所有的元素
     *
     * @return
     */
    Iterator iterator();
}
