package com.demo.designcode.a.singleton;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.*;

/**
 * @author QingHong
 * @description
 * @QQ 2560612959
 * @create 2021/1/4 17:50
 */
public class SingletonTest {
    public static void main(String[] args) throws Exception {
        /**
         * 单例设计的核心本质在于：
         * 类内部的构造方法私有化，在类的内部产生实例化对象之后通过static方法获取实例化对象进行类中的结构调用。
         * 单例设计模式有两类：懒汉式、饿汉式。这次主要讨论懒汉式。
         */
        Singleton1 singleton = Singleton1.getInstance();
        singleton.print();
        System.out.println();

        // 以上为单线程，下面使用多线程看看
        int limit = 3;
        for (int i = 0; i < limit; i++) {
//          Lambda,JDK1.8, 不要显示创建线程，请使用线程池
            new Thread(new Runnable() {
                @Override
                public void run() {
                    Singleton.getInstance().print();
                }
            }).start();
        }
        System.out.println();

        // 手动创建线程池，效果会更好哦。
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
        for (int i = 0; i < limit; i++) {
            fixedThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    Singleton.getInstance().print();
                }
            });
        }
        System.out.println();

        // 运用google.guava手动创建线程
        ThreadFactory threadFactory = new ThreadFactoryBuilder().setNameFormat("thread-zqh=%d").build();
        ExecutorService threadPoolExecutor = new ThreadPoolExecutor(3,
                10, 180L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>(), threadFactory);
        for (int i = 0; i < limit; i++) {
            threadPoolExecutor.execute(new Runnable() {
                @Override
                public void run() {
                    Singleton.getInstance().print();
                }
            });
        }
    }

}

/**
 * 1.运行结果：
 * Thread-2	Singleton
 * Thread-0	Singleton
 * hi! Singleton!
 * Thread-1	Singleton
 * hi! Singleton!
 * hi! Singleton!
 * 而单例设计的最大特点是在整体的运行过程之中只允许产生一个实例化对象
 * 问题造成的关键在于代码本身出现了不同步的情况，需要进行同步处理，synchronized关键字
 * <p>
 * 2.运行结果：
 * Thread-0	Singleton
 * hi! Singleton!
 * hi! Singleton!
 * hi! Singleton!
 * 这样同步的代价就是效率会低。
 * 因为整体代码里面实际上只有一部分需要进行同步，就是instance对象的实例化处理部分
 * <p>
 * 3.运行结果：
 * Thread-0	Singleton
 * hi! Singleton!
 * Thread-2	Singleton
 * hi! Singleton!
 * Thread-1	Singleton
 * hi! Singleton!
 * 还是不行，因为会有多个线程通过第一个判断
 * <p>
 * 4.运行结果：
 * Thread-0	Singleton
 * hi! Singleton!
 * hi! Singleton!
 * hi! Singleton!
 * 对象被实例化的时候，应该立刻与主内存中的数据对象进行同步，而不应该存副本。
 * 所以最好在加个volatile关键字 (可见性)
 * <p>
 * 面试题：请编写单例设计模式
 * 1.直接编写一个饿汉式的单例设计模式，并且实现构造方法私有化；
 * 2.在Java中哪里使用到单例设计模式了?Runtime类、Spring框架；
 * 3.懒汉式单例设计模式的问题？
 */

/**
 * 2.运行结果：
 * Thread-0	Singleton
 * hi! Singleton!
 * hi! Singleton!
 * hi! Singleton!
 * 这样同步的代价就是效率会低。
 * 因为整体代码里面实际上只有一部分需要进行同步，就是instance对象的实例化处理部分
 */

/**
 * 3.运行结果：
 * Thread-0	Singleton
 * hi! Singleton!
 * Thread-2	Singleton
 * hi! Singleton!
 * Thread-1	Singleton
 * hi! Singleton!
 * 还是不行，因为会有多个线程通过第一个判断
 */

/**
 * 4.运行结果：
 * Thread-0	Singleton
 * hi! Singleton!
 * hi! Singleton!
 * hi! Singleton!
 * 对象被实例化的时候，应该立刻与主内存中的数据对象进行同步，而不应该存副本。
 * 所以最好在加个volatile关键字 (可见性)
 */

/**
 * 面试题：请编写单例设计模式
 * 1.直接编写一个饿汉式的单例设计模式，并且实现构造方法私有化；
 * 2.在Java中哪里使用到单例设计模式了?Runtime类、Spring框架；
 * 3.懒汉式单例设计模式的问题？
 */

