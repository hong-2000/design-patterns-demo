package com.demo.designcode.h.decorator;

/**
 * @author QingHong
 * @description 抽象装饰者
 * @create 2021/1/4 17:50
 */
public abstract class AbstractDecorator extends AbstractComponent {

    private AbstractComponent abstractComponent = null;

    public AbstractDecorator(AbstractComponent abstractComponent) {
        this.abstractComponent = abstractComponent;
    }

    /**
     * 委托给被修饰者执行
     * 如果只有一个修饰者，也可以直接进行具体修饰
     */
    @Override
    public void operate() {
        this.abstractComponent.operate();
    }
}
