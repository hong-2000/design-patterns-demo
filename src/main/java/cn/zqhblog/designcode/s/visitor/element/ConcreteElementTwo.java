package cn.zqhblog.designcode.s.visitor.element;

import cn.zqhblog.designcode.s.visitor.AbstractElement;
import cn.zqhblog.designcode.s.visitor.IVisitor;

/**
 * @author QingHong
 * @description 具体元素
 * @QQ 2560612959
 * @create 2021/1/4 17:50
 */
public class ConcreteElementTwo extends AbstractElement {
    @Override
    public void doSomething() {
        System.out.println("two...");
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
