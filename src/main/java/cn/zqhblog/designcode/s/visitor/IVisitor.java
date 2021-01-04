package cn.zqhblog.designcode.s.visitor;

import cn.zqhblog.designcode.s.visitor.element.ConcreteElementOne;
import cn.zqhblog.designcode.s.visitor.element.ConcreteElementTwo;

/**
 * @author QingHong
 * @description 抽象访问者
 * @QQ 2560612959
 * @create 2021/1/4 17:50
 */
public interface IVisitor {

    /**
     * 可以访问哪些对象
     *
     * @param element
     */
    void visit(ConcreteElementOne element);

    /**
     * 可以访问哪些对象
     *
     * @param element
     */
    void visit(ConcreteElementTwo element);
}
