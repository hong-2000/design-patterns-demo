package com.demo.designcode.k.mediator;

import com.demo.designcode.k.mediator.colleague.ConcreteColleagueOne;
import com.demo.designcode.k.mediator.colleague.ConcreteColleagueTwo;

/**
 * @author QingHong
 * @description 通用抽象中介者
 * @QQ 2560612959
 * @create 2021/1/4 17:50
 */
public abstract class AbstractMediator {
    protected ConcreteColleagueOne colleagueOne;
    protected ConcreteColleagueTwo colleagueTwo;

    /**
     * 业务逻辑
     */
    public abstract void doSomethingOne();

    /**
     * 业务逻辑
     */
    public abstract void doSomethingTwo();

    public ConcreteColleagueOne getColleagueOne() {
        return colleagueOne;
    }

    public void setColleagueOne(ConcreteColleagueOne colleagueOne) {
        this.colleagueOne = colleagueOne;
    }

    public ConcreteColleagueTwo getColleagueTwo() {
        return colleagueTwo;
    }

    public void setColleagueTwo(ConcreteColleagueTwo colleagueTwo) {
        this.colleagueTwo = colleagueTwo;
    }
}
