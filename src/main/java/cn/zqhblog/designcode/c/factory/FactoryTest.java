package cn.zqhblog.designcode.c.factory;

/**
 * @author QingHong
 * @description
 * @QQ 2560612959
 * @create 2021/1/4 17:50
 */
public class FactoryTest {
    public static void main(String[] args) throws Exception {
        /**
         * 为什么要提供有一个反射的实例化？那么到底是使用关键字new还是使用反射呢？
         * 如果直接实例化则一定会有耦合问题
         * 在实际开发之中，接口的主要作用是为不同的层提供有一个操作的标准
         * 所以使用工厂设计模式
         */
        System.out.println("\t-----静态工厂-----");
        IMessage message = Factory.getMessageInstance("cn.zqhblog.designcode.c.factory.NetMessage");
        message.send();
        /**
         * 以上属于静态工厂类的调用
         * 而动态工厂类采用了泛型
         */
        System.out.println("\t-----动态工厂-----");
        IMessage message2 = Factory.getInstance("cn.zqhblog.designcode.c.factory.NetMessage", IMessage.class);
        message2.send();
        IMessage message3 = Factory.getInstance("cn.zqhblog.designcode.c.factory.CloudMessage", IMessage.class);
        message3.send();
        IService service = Factory.getInstance("cn.zqhblog.designcode.c.factory.HouseServiceImpl", IService.class);
        service.service();
    }
}

