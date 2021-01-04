package cn.zqhblog.designcode.t.state.state;

import cn.zqhblog.designcode.t.state.AbstractState;
import cn.zqhblog.designcode.t.state.Context;

/**
 * @author QingHong
 * @description
 * @QQ 2560612959
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
