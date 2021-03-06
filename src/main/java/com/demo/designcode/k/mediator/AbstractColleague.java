package com.demo.designcode.k.mediator;

/**
 * @author QingHong
 * @description 抽象同事类
 * @create 2021/1/4 17:50
 */
public abstract class AbstractColleague {
    protected AbstractMediator mediator;

    public AbstractColleague(AbstractMediator mediator) {
        this.mediator = mediator;
    }
}
