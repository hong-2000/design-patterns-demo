package com.demo.designcode.k.mediator;

import com.demo.designcode.k.mediator.colleague.ConcreteColleagueOne;
import com.demo.designcode.k.mediator.colleague.ConcreteColleagueTwo;
import com.demo.designcode.k.mediator.mediator.ConcreteMediator;

/**
 * @author hong-2000
 * @description
 * @create 2021/1/4 17:50
 */
public class MediatorTest {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        ConcreteColleagueOne colleagueOne = new ConcreteColleagueOne(mediator);
        ConcreteColleagueTwo colleagueTwo = new ConcreteColleagueTwo(mediator);
        mediator.setColleagueOne(colleagueOne);
        mediator.setColleagueTwo(colleagueTwo);
        colleagueOne.depMethodOne();
        colleagueTwo.depMethodTwo();

        /**
         * @author hong-2000
         * 减少依赖，降低类间的耦合
         * 同事类越多。中介者的逻辑就越复杂
         */
    }
}
