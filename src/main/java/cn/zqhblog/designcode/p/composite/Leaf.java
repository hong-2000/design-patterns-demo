package cn.zqhblog.designcode.p.composite;

import java.util.ArrayList;

/**
 * @author QingHong
 * @description 树叶节点
 * @QQ 2560612959
 * @create 2021/1/4 17:50
 */
public class Leaf extends AbstractComponent {
    @Deprecated
    @Override
    public void add(AbstractComponent component) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    @Override
    public void remove(AbstractComponent component) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    @Override
    public ArrayList<AbstractComponent> getChildren() {
        throw new UnsupportedOperationException();
    }
}
