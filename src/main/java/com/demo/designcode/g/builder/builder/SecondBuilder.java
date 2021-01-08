package com.demo.designcode.g.builder.builder;

import com.demo.designcode.g.builder.AbstractBuilder;
import com.demo.designcode.g.builder.AbstractProduct;
import com.demo.designcode.g.builder.product.Second;

import java.util.ArrayList;

/**
 * @author QingHong
 * @description 产品类
 * @create 2021/1/4 17:50
 */
public class SecondBuilder extends AbstractBuilder {

    private Second second = new Second();

    @Override
    public void setSequence(ArrayList<Integer> sequence) {
        this.second.setSequence(sequence);
    }

    @Override
    public AbstractProduct getAbstractNumeral() {
        return this.second;
    }
}
