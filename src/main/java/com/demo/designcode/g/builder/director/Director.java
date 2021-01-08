package com.demo.designcode.g.builder.director;

import com.demo.designcode.g.builder.builder.FirstBuilder;
import com.demo.designcode.g.builder.builder.SecondBuilder;
import com.demo.designcode.g.builder.product.First;
import com.demo.designcode.g.builder.product.Second;

import java.util.ArrayList;

/**
 * @author QingHong
 * @description 导演类
 * @create 2021/1/4 17:50
 */
public class Director {
    private ArrayList<Integer> sequence = new ArrayList<Integer>();
    private FirstBuilder firstBuilder = new FirstBuilder();
    private SecondBuilder secondBuilder = new SecondBuilder();

    public void setSequenceOne() {
        this.sequence.clear();
        this.sequence.add(1);
        this.sequence.add(3);
        this.sequence.add(2);
    }

    public void setSequenceTwo() {
        this.sequence.clear();
        this.sequence.add(2);
        this.sequence.add(1);
        this.sequence.add(3);
    }

    public First setFirstBuilder() {
        this.setSequenceOne();
        this.firstBuilder.setSequence(sequence);
        return (First) this.firstBuilder.getAbstractNumeral();
    }

    public Second setSecondBuilder() {
        this.setSequenceTwo();
        this.secondBuilder.setSequence(sequence);
        return (Second) this.secondBuilder.getAbstractNumeral();
    }
}
