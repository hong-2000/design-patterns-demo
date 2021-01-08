package com.demo.designcode.t.state;

/**
 * @author QingHong
 * @description 抽象环境角色
 * @create 2021/1/4 17:50
 */
public abstract class AbstractState {
    /**
     * 定义一个环境角色，提供子类访问
     */
    protected Context context;

    /**
     * 行为一
     */
    public abstract void handleOne();

    /**
     * 行为二
     */
    public abstract void handleTwo();

    public void setContext(Context context) {
        this.context = context;
    }
}
