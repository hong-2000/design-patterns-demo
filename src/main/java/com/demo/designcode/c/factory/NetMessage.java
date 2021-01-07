package com.demo.designcode.c.factory;

/**
 * @author QingHong
 * @description
 * @QQ 2560612959
 * @create 2021/1/4 17:50
 */
class NetMessage implements IMessage {
    @Override
    public void send() {
        System.out.println("net消息发送。");
    }
}