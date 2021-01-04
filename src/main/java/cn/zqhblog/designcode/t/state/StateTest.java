package cn.zqhblog.designcode.t.state;

import cn.zqhblog.designcode.t.state.state.StateTwo;

/**
 * @author QingHong
 * @description
 * @QQ 2560612959
 * @create 2021/1/4 17:50
 */
public class StateTest {
    public static void main(String[] args) {
        Context context = new Context();
        context.setCurrentState(new StateTwo());
        context.handleOne();
        context.handleTwo();
    }
}
