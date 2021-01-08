package com.demo.designcode.t.state.state;

import com.demo.designcode.t.state.AbstractState;
import com.demo.designcode.t.state.Context;

/**
 * @author QingHong
 * @description
 * @create 2021/1/4 17:50
 */
public class StateOne extends AbstractState {
    @Override
    public void handleOne() {
        System.out.println("ok one...");
    }

    @Override
    public void handleTwo() {
        super.context.setCurrentState(Context.STATE1);
        super.context.handleTwo();
    }
}
