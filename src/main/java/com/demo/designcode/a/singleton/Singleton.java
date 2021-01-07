package com.demo.designcode.a.singleton;

/**
 * 懒汉式 完整版
 * 双重检查加锁
 * static、private、synchronized、volatile
 */

/**
 * @author hong-2000
 * @description
 * @create 2021/1/4 17:46
 */
class Singleton {
    private static volatile Singleton instance = null;

    private Singleton() {
        System.out.println(Thread.currentThread().getName() + "\tSingleton");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void print() {
        System.out.println("hi! Singleton!");
    }
}
