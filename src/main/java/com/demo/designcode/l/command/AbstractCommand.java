package com.demo.designcode.l.command;

/**
 * @author QingHong
 * @description 抽象命令者
 * @QQ 2560612959
 * @create 2021/1/4 17:50
 */
public abstract class AbstractCommand {
    protected final AbstractReceiver receiver;

    protected AbstractCommand(AbstractReceiver receiver) {
        this.receiver = receiver;
    }

    /**
     * 每个命令类都必须有一个执行命令的方法
     */
    public abstract void execute();
}
