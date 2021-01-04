package cn.zqhblog.designcode.n.adapter;

import cn.zqhblog.designcode.n.adapter.adapter.Adapter;
import cn.zqhblog.designcode.n.adapter.target.ConcreteTarget;

/**
 * @author QingHong
 * @description
 * @QQ 2560612959
 * @create 2021/1/4 17:50
 */
public class AdapterTest {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();

        Target target1 = new Adapter();
        target1.request();

        Source target2 = new Adapter();
        target2.doSomething();
    }
}
