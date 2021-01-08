package com.demo.designcode.o.iterator;

/**
 * @author QingHong
 * @description 抽象迭代器
 * @create 2021/1/4 17:50
 */
public interface Iterator {
    /**
     * 遍历到下一个元素
     *
     * @return
     */
    Object next();

    /**
     * 是否已经遍历到尾部
     *
     * @return
     */
    boolean hasNext();

    /**
     * 删除当前指向的元素
     *
     * @return
     */
    boolean remove();
}
