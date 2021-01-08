package com.demo.designcode.c.factory;

/**
 * @author hong-2000
 * @description
 * @create 2021/1/4 17:50
 */
class Factory {
    private Factory() {
    }//没有产生实例化对象的意义，所以构造方法私有化

    public static IMessage getMessageInstance(String className) {
        /**
         * 此种属于静态工厂设计模式
         * 如果追加一个子类，则工厂类一定要做出修改
         */
//		if("netmessage".equalsIgnoreCase(className)){
//			return new NetMessage();
//		}else if("cloudmessage".equalsIgnoreCase(className)){
//			return new CloudMessage();
//		}
        /**
         * 最好的解决方法就是不使用关键字new来完成
         * 因为关键字new在使用时需要有一个明确的类存在
         * 所以newInstance()方法只需要有一个明确表示类名称的字符串即可应用
         */
        IMessage instance = null;
        try {
            instance = (IMessage) Class.forName(className).getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return instance;
    }

    public static IService getServiceInstance(String className) {
        //...
        return null;
    }
    /**
     * 利用反射机制实现的工厂设计模式，最大的优势在于，对于接口子类的扩充将不再影响到工厂类的定义。
     * 但进一步思考，实际的项目开发过程之中有可能会存在有大量的接口，并且这些接口都可能需要通过工厂类实例化，
     * 所以此时的工厂设计模式不应该只为一个IMessage接口服务，而应该变为为所有接口服务
     */
    /**
     * 获取接口实例化对象
     *
     * @param className 接口的子类
     * @param clazz     描述的是一个接口的类型
     * @return 如果子类存在则返回指定接口实例化对象
     * @author hong-2000
     */
    @SuppressWarnings("unchecked")
    public static <T> T getInstance(String className, Class<T> clazz) {
        T instance = null;
        try {
            instance = (T) Class.forName(className).getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return instance;
    }
    //这样才是可以在开发中使用的基本工厂模式，达到了可重用性
}
