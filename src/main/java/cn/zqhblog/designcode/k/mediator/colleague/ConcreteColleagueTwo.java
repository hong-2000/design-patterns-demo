package cn.zqhblog.designcode.k.mediator.colleague;

import cn.zqhblog.designcode.k.mediator.AbstractColleague;
import cn.zqhblog.designcode.k.mediator.AbstractMediator;

/**
 * @author QingHong
 * @description
 * @QQ 2560612959
 * @create 2021/1/4 17:50
 */
public class ConcreteColleagueTwo extends AbstractColleague {
    /**
     * 通过构造函数传递中介者
     *
     * @param mediator
     */
    public ConcreteColleagueTwo(AbstractMediator mediator) {
        super(mediator);
    }

    public void selfMethodTwo() {
        System.out.println("同事2 擅长的...");
    }

    public void depMethodTwo() {
        /**
         * do something
         * ...
         * 自己不能处理的，交给中介者
         */
        super.mediator.doSomethingTwo();
    }
}
