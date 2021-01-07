package com.demo.designcode.i.strategy;

/**
 * @author zhaoqinghong
 * @date 2020/12/2 16:36
 * 策略枚举
 */
public enum Calculator {
    /**
     * 加减
     */
    ADD('+') {
        @Override
        public int exec(int a, int b) {
            return a + b;
        }
    },
    SUB('-') {
        @Override
        public int exec(int a, int b) {
            return a - b;
        }
    };
    char value = ' ';

    /**
     * 定义成员值类型
     *
     * @param value
     */
    Calculator(char value) {
        this.value = value;
    }

    public char getValue() {
        return this.value;
    }

    public abstract int exec(int a, int b);
}
