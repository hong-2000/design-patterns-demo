package cn.zqhblog.designcode.n.adapter.target;

import cn.zqhblog.designcode.n.adapter.Target;

/**
 * @author QingHong
 * @description 目标角色的实现类
 * @QQ 2560612959
 * @create 2021/1/4 17:50
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("target...");
    }
}
