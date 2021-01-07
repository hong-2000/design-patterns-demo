package com.demo.designcode.d.proxy;

import net.sf.cglib.proxy.Enhancer;

/**
 * @author QingHong
 * @description
 * @QQ 2560612959
 * @create 2021/1/4 17:50
 */
public class ProxyTest {
    public static void main(String[] args) {
//静态代理设计模式
        System.out.println("-----静态代理设计模式-----");
        /**
         * 核心是有真实业务实现类与代理业务实现类，并且代理类要完成比真实业务更多的处理操作。
         * 传统代理模式的弊端：需要首先定义出核心接口的组成。
         */
        IMessage message = new MessageProxy(new MessageReal());
        message.send();
        /**
         * 客户端的接口与具体的子类产生了耦合问题，最好再引入工厂设计模式进行代理对象的获取。
         * 静态代理设计的特点在于：一个代理类只为一个接口服务
         */
//动态代理设计模式
        System.out.println("-----动态代理设计模式-----");
        /**
         * 不管是动态代理还是静态代理都一定要接收真实业务实现子类对象；
         * 由于动态代理类不再与某一个具体接口进行捆绑，所以应该可以动态获取类的接口信息。
         */
        message = (IMessage) new ProxyHandler().bind(new MessageReal());
        message.send();
        /**
         * 观察系统中提供的Proxy.newProxyInstance()方法会方法该方法会使用大量的底层机制来进行代理对象的动态创建，
         * 所有的代理类是符合所有向相关功能需求的操作功能类，它不再代表具体的接口，这样在处理的时候就必须依赖于类加载器于接口进行代理对象的伪造。
         */

//CGLIB实现代理设计模式
        System.out.println("-----CGLIB实现代理设计模式-----");
        /**
         * 有一部分开发者就认为不应该强迫性的基于接口来实现代理设计，
         * 开发者设计了CGLIB开发包，可以实现基于类的代理设计模式。
         * 1.CGLIB是一个第三方的程序包，导包
         * 2.编写程序类，该类不实现任何接口。
         * 3.利用CGLIB编写代理类，但是这个代理类需要做一个明确，此时相当于使用类的形式实现了代理设计的处理，
         * 		所以该代理设计需要通过CGLIB来生成代理对象。
         * 4.此时如果要想创建代理类对象，则就必须进行一系列的CGLIB处理。
         */
        //真实主题对象
        Message realObject = new Message();
        //负责代理操作的程序类
        Enhancer enhancer = new Enhancer();
        //假定一个父类
        enhancer.setSuperclass(realObject.getClass());
        //设置代理类
        enhancer.setCallback(new CglibProxy(realObject));
        //创建代理对象
        Message proxyObject = (Message) enhancer.create();
        proxyObject.send();
        //但从正常的设计角度来讲，强烈建议还是基于接口的设计会比较合理。
    }
}

