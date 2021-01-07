package com.demo.designcode.a.singleton;

/**
 * 懒汉式
 * getInstance方法体上加synchronized
 */
class Singleton3{
    private static Singleton3 instance = null;
    private Singleton3(){
        System.out.println(Thread.currentThread().getName()+"\tSingleton");
    }
    public static synchronized Singleton3 getInstance(){
        if(instance == null){
            instance = new Singleton3();
        }
        return instance;
    }
    public void print(){
        System.out.println("hi! Singleton!");
    }
}
