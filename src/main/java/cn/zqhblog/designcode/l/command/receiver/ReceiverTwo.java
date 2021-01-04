package cn.zqhblog.designcode.l.command.receiver;

import cn.zqhblog.designcode.l.command.AbstractReceiver;

/**
 * @author QingHong
 * @description
 * @QQ 2560612959
 * @create 2021/1/4 17:50
 */
public class ReceiverTwo extends AbstractReceiver {
    @Override
    public void doSomething() {
        System.out.println("同事2 要做的事情...");
    }
}
