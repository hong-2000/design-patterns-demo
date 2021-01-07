package com.demo.designcode.d.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author QingHong
 * @description
 * @QQ 2560612959
 * @create 2021/1/4 17:50
 */
class ProxyHandler implements InvocationHandler {
    /**
     * 保存真实业务对象
     */
    private Object target;

    /**
     * 进行真实业务对象与代理业务对象之间的绑定处理
     *
     * @param target 真实业务对象
     * @return Proxy生成的代理业务对象
     */
    public Object bind(Object target) {
        this.target = target;
        /**
         * 对于动态对象的创建是由JVM底层完成的，此时主要依靠的时java.lang.reflect.Proxy程序类，只提供有一个核心方法：
         * 代理对象：public static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces,
         InvocationHandler h) throws IllegalArgumentException
         * 		ClassLoader loader：获取当前真实主体类的ClassLoader；
         * 		Class<?>[] interfaces：代理是围绕接口进行的，所以一定要获取真实主题类的接口信息；
         * 		InvocationHandler h：代理处理的方法。
         */
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    public boolean connect() {
        System.out.println("消息代理——连接");
        return true;
    }

    public void close() {
        System.out.println("消息代理——关闭");
    }

    /**
     * public interface InvocationHandler
     * 代理方法调用，代理主题类里面执行的方法最终都是此方法
     *
     * @param proxy  要代理的对象
     * @param method 要执行的接口方法名称
     * @param args   传递的参数
     * @return 某一个方法的返回值
     * @throws Throwable 方法调用时出现的错误继续向上抛出
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("执行方法:\t" + method);
        Object returnData = null;
        if (this.connect()) {
            returnData = method.invoke(this.target, args);
            this.close();
        }
        return returnData;
    }
}
