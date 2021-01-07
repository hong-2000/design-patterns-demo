package com.demo.designcode.d.proxy;

/**
 * @author QingHong
 * @description
 * @QQ 2560612959
 * @create 2021/1/4 17:50
 */
class MessageProxy implements IMessage {
    /**
     * 代理对象，一定是业务接口实例
     */
    private IMessage message;

    public MessageProxy(IMessage message) {
        this.message = message;
    }

    public boolean connect() {
        System.out.println("消息代理——连接");
        return true;
    }

    public void close() {
        System.out.println("消息代理——关闭");
    }

    @Override
    public void send() {
        if (this.connect()) {
            this.message.send();
            this.close();
        }
    }
}
