package cn.zqhblog.designcode.l.command;

/**
 * @author QingHong
 * @description 抽象中介者
 * @QQ 2560612959
 * @create 2021/1/4 17:50
 */
public abstract class AbstractReceiver {
    /**
     * 定义每个接受者必须都必须完成的任务
     */
    public abstract void doSomething();
}
