package com.demo.designcode.d.proxy;

/**
 * @author hong-2000
 * @description
 * @create 2021/1/4 17:50
 */
class MessageReal implements IMessage {
    @Override
    public void send() {
        System.out.println("消息发送");
    }

}
