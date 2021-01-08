package com.demo.designcode.l.command;

import com.demo.designcode.l.command.command.CommandOne;
import com.demo.designcode.l.command.receiver.ReceiverOne;

/**
 * @author QingHong
 * @description
 * @QQ 2560612959
 * @create 2021/1/4 17:50
 */
public class CommandTest {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        ReceiverOne receiverOne = new ReceiverOne();
        CommandOne commandOne = new CommandOne(receiverOne);
        invoker.setCommand(commandOne);
        invoker.action();

        System.out.println("============");
        AbstractCommand command = new CommandOne();
        invoker.setCommand(command);
        invoker.action();

        /**
         * @author hong-2000
         * 结合责任链，实现命令族解析任务
         * 结合模板方法，减少command子类的膨胀问题
         */
    }
}
