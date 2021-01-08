package com.demo.designcode.l.command.receiver;

import com.demo.designcode.l.command.AbstractReceiver;

/**
 * @author QingHong
 * @description
 * @create 2021/1/4 17:50
 */
public class ReceiverTwo extends AbstractReceiver {
    @Override
    public void doSomething() {
        System.out.println("同事2 要做的事情...");
    }
}
