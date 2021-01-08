package com.demo.designcode.m.handler;

/**
 * @author QingHong
 * @description
 * @create 2021/1/4 17:50
 */
public class Request {
    private Level level;

    public void setLevel(Level level) {
        this.level = level;
    }

    /**
     * 请求的等级
     *
     * @return
     */
    public Level getRequestLevel() {
        return this.level;
    }

    @Override
    public String toString() {
        return "level is ." + level;
    }
}
