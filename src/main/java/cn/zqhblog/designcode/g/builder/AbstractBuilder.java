package cn.zqhblog.designcode.g.builder;

import java.util.ArrayList;

/**
 * @author QingHong
 * @description 抽象建造者
 * @QQ 2560612959
 * @create 2021/1/4 17:50
 */
public abstract class AbstractBuilder {
    /**
     * 设置需求顺序
     *
     * @param sequence
     */
    public abstract void setSequence(ArrayList<Integer> sequence);

    /**
     * 获取产品
     *
     * @return
     */
    public abstract AbstractProduct getAbstractNumeral();
}
