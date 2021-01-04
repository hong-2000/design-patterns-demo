package cn.zqhblog.designcode.v.flyweight;

import cn.zqhblog.designcode.v.flyweight.flyweight.FlyweightOne;
import cn.zqhblog.designcode.v.flyweight.flyweight.FlyweightTwo;

import java.util.HashMap;
import java.util.Random;

/**
 * @author QingHong
 * @description
 * @QQ 2560612959
 * @create 2021/1/4 17:50
 */
public class FlyweightFactory {
    /**
     * 定义一个池容器
     */
    private static HashMap<String, AbstractFlyweight> pool = new HashMap<String, AbstractFlyweight>();

    /**
     * 享元工厂
     *
     * @param extrinsic
     * @return
     */
    public static AbstractFlyweight getFlyweight(String extrinsic) {
        AbstractFlyweight flyweight = null;
        if (pool.containsKey(extrinsic)) {
            flyweight = pool.get(extrinsic);
        } else {
            int index = 2;
            if ((new Random()).nextInt(index) % index == 0) {
                flyweight = new FlyweightOne(extrinsic);
            } else {
                flyweight = new FlyweightTwo(extrinsic);
            }
            pool.put(extrinsic, flyweight);
        }
        return flyweight;
    }
}
