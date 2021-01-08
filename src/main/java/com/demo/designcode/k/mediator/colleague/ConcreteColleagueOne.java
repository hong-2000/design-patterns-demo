package com.demo.designcode.k.mediator.colleague;

import com.demo.designcode.k.mediator.AbstractColleague;
import com.demo.designcode.k.mediator.AbstractMediator;

/**
 * @author QingHong
 * @description 具体同事类
 * @create 2021/1/4 17:50
 */
public class ConcreteColleagueOne extends AbstractColleague {
    /**
     * 通过构造函数传递中介者
     *
     * @param mediator
     */
    public ConcreteColleagueOne(AbstractMediator mediator) {
        super(mediator);
    }

    public void selfMethodOne() {
        System.out.println("同事1 擅长的...");
    }

    public void depMethodOne() {
        /**
         * do something
         * ...
         * 自己不能处理的，交给中介者
         */
        super.mediator.doSomethingOne();
    }
}
