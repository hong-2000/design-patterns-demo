package com.demo.designcode.l.command.command;

import com.demo.designcode.l.command.AbstractCommand;
import com.demo.designcode.l.command.AbstractReceiver;
import com.demo.designcode.l.command.receiver.ReceiverOne;

/**
 * @author QingHong
 * @description
 * @create 2021/1/4 17:50
 */
public class CommandOne extends AbstractCommand {

    /**
     * 声明自己的默认接收者
     */
    public CommandOne() {
        super(new ReceiverOne());
    }

    /**
     * 设置新的接收者
     *
     * @param receiver
     */
    public CommandOne(AbstractReceiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        this.receiver.doSomething();
    }
}
