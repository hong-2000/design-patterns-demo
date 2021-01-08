package com.demo.designcode.d.proxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author hong-2000
 * @description
 * @create 2021/1/4 17:50
 */
class CglibProxy implements MethodInterceptor {//拦截器配置
    /**
     * 保存真实主题对象
     */
    private Object target;

    public CglibProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        Object returnData = null;
        if (this.connect()) {
            returnData = method.invoke(this.target, args);
            this.close();
        }
        return returnData;
    }

    public boolean connect() {
        System.out.println("CGLIB消息代理——连接");
        return true;
    }

    public void close() {
        System.out.println("CGLIB消息代理——关闭");
    }
}
