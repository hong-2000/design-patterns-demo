package com.demo.designcode.l.command.receiver;

import com.demo.designcode.l.command.AbstractReceiver;

/**
 * @author QingHong
 * @description 接收者
 * @QQ 2560612959
 * @create 2021/1/4 17:50
 */
public class ReceiverOne extends AbstractReceiver {
    @Override
    public void doSomething() {
        System.out.println("同事1 要做的事情...");
    }
}
