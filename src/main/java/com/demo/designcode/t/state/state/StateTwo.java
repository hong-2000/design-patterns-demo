package com.demo.designcode.t.state.state;

import com.demo.designcode.t.state.AbstractState;
import com.demo.designcode.t.state.Context;

/**
 * @author QingHong
 * @description
 * @create 2021/1/4 17:50
 */
public class StateTwo extends AbstractState {
    @Override
    public void handleOne() {
        super.context.setCurrentState(Context.STATE2);
        super.context.handleOne();
    }

    @Override
    public void handleTwo() {
        System.out.println("ok two...");
    }
}
