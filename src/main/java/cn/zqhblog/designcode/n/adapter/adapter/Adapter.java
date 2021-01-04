package cn.zqhblog.designcode.n.adapter.adapter;

import cn.zqhblog.designcode.n.adapter.Source;
import cn.zqhblog.designcode.n.adapter.Target;

/**
 * @author QingHong
 * @description 适配器角色
 * @QQ 2560612959
 * @create 2021/1/4 17:50
 */
public class Adapter extends Source implements Target {
    @Override
    public void request() {
        super.doSomething();
    }
}