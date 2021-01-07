package com.demo.designcode.v.flyweight;

/**
 * @author QingHong
 * @description
 * @QQ 2560612959
 * @create 2021/1/4 17:50
 */
public class FlyweightTest {
    public static void main(String[] args) {
        AbstractFlyweight flyweight = FlyweightFactory.getFlyweight("a");
        flyweight.operate();
        System.out.println(flyweight.getExtrinsic() + "\n");

        AbstractFlyweight flyweight1 = FlyweightFactory.getFlyweight("a");
        flyweight1.operate();
        System.out.println(flyweight1.getExtrinsic() + "\n");

        AbstractFlyweight flyweight2 = FlyweightFactory.getFlyweight("b");
        flyweight2.operate();
        System.out.println(flyweight2.getExtrinsic() + "\n");
    }
}
