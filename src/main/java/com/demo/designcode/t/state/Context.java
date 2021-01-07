package com.demo.designcode.t.state;

import com.demo.designcode.t.state.state.StateOne;
import com.demo.designcode.t.state.state.StateTwo;

/**
 * @author QingHong
 * @description 具体环境角色
 * @QQ 2560612959
 * @create 2021/1/4 17:50
 */
public class Context {
    public final static AbstractState STATE1 = new StateOne();
    public final static AbstractState STATE2 = new StateTwo();

    private AbstractState currentState;

    public AbstractState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(AbstractState currentState) {
        this.currentState = currentState;
        //切换状态
        this.currentState.setContext(this);
    }

    /**
     * 行为委托
     */
    public void handleOne() {
        this.currentState.handleOne();
    }

    public void handleTwo() {
        this.currentState.handleTwo();
    }
}
