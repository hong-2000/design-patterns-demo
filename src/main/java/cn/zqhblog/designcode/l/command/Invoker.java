package cn.zqhblog.designcode.l.command;

/**
 * @author QingHong
 * @description 调用者
 * @QQ 2560612959
 * @create 2021/1/4 17:50
 */
public class Invoker {
    private AbstractCommand command;

    /**
     * 执行命令
     */
    public void action() {
        this.command.execute();
    }

    public void setCommand(AbstractCommand command) {
        this.command = command;
    }
}
