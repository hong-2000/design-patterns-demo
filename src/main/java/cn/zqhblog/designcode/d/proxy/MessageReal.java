package cn.zqhblog.designcode.d.proxy;

/**
 * @author QingHong
 * @description
 * @QQ 2560612959
 * @create 2021/1/4 17:50
 */
class MessageReal implements IMessage {
    @Override
    public void send() {
        System.out.println("消息发送");
    }

}
