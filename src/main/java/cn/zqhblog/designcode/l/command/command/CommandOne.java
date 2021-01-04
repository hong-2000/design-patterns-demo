package cn.zqhblog.designcode.l.command.command;

import cn.zqhblog.designcode.l.command.AbstractCommand;
import cn.zqhblog.designcode.l.command.AbstractReceiver;
import cn.zqhblog.designcode.l.command.receiver.ReceiverOne;

/**
 * @author QingHong
 * @description
 * @QQ 2560612959
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
