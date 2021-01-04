package cn.zqhblog.designcode.g.builder.builder;

import cn.zqhblog.designcode.g.builder.AbstractBuilder;
import cn.zqhblog.designcode.g.builder.AbstractProduct;
import cn.zqhblog.designcode.g.builder.product.First;

import java.util.ArrayList;

/**
 * @author QingHong
 * @description 产品类
 * @QQ 2560612959
 * @create 2021/1/4 17:50
 */
public class FirstBuilder extends AbstractBuilder {

    private First first = new First();

    @Override
    public void setSequence(ArrayList<Integer> sequence) {
        this.first.setSequence(sequence);
    }

    @Override
    public AbstractProduct getAbstractNumeral() {
        return this.first;
    }
}
