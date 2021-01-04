package cn.zqhblog.designcode.l.command.command;

import cn.zqhblog.designcode.l.command.AbstractCommand;
import cn.zqhblog.designcode.l.command.AbstractReceiver;
import cn.zqhblog.designcode.l.command.receiver.ReceiverTwo;

/**
 * @author QingHong
 * @description
 * @QQ 2560612959
 * @create 2021/1/4 17:50
 */
public class CommandTwo extends AbstractCommand {

    /**
     * 声明自己的默认接收者
     */
    public CommandTwo() {
        super(new ReceiverTwo());
    }

    /**
     * 设置新的接收者
     *
     * @param receiver
     */
    public CommandTwo(AbstractReceiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        this.receiver.doSomething();
    }
}
