package com.demo.designcode.w.bridge;

/**
 * @author QingHong
 * @description
 * @QQ 2560612959
 * @create 2021/1/4 17:50
 */
public class RefinedAbstraction extends Abstraction {
    /**
     * 覆写构造函数
     *
     * @param implementor
     */
    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void request() {
        super.request();
        super.getImplementor().doAnything();
    }
}
