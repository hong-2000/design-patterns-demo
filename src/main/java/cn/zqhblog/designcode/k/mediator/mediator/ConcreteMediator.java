package cn.zqhblog.designcode.k.mediator.mediator;

import cn.zqhblog.designcode.k.mediator.AbstractMediator;

/**
 * @author QingHong
 * @description 通用中介者
 * @QQ 2560612959
 * @create 2021/1/4 17:50
 */
public class ConcreteMediator extends AbstractMediator {
    @Override
    public void doSomethingOne() {
        super.colleagueOne.selfMethodOne();
        super.colleagueTwo.selfMethodTwo();
    }

    @Override
    public void doSomethingTwo() {
        super.colleagueOne.selfMethodOne();
        super.colleagueTwo.selfMethodTwo();
    }
}
