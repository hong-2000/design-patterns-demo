package cn.zqhblog.designcode.g.builder;

import cn.zqhblog.designcode.g.builder.builder.FirstBuilder;
import cn.zqhblog.designcode.g.builder.builder.SecondBuilder;
import cn.zqhblog.designcode.g.builder.director.Director;
import cn.zqhblog.designcode.g.builder.product.First;
import cn.zqhblog.designcode.g.builder.product.Second;

import java.util.ArrayList;

/**
 * @author QingHong
 * @description
 * @QQ 2560612959
 * @create 2021/1/4 17:50
 */
public class BuilderTest {
    public static void main(String[] args) {
        System.out.println("---直接操作实体类---");
        AbstractProduct first = new First();
        ArrayList<Integer> sequence = new ArrayList<Integer>();
        sequence.add(2);
        sequence.add(1);
        sequence.add(3);
        first.setSequence(sequence);
        first.run();

        AbstractProduct second = new Second();
        second.setSequence(sequence);
        second.run();

        /**
         * 比较两者的差别，还可以再抽一次，
         * 不直接访问产品类，构造者来生产产品
         */
        System.out.println("---添加构造者---");
        AbstractBuilder firstBuilder = new FirstBuilder();
        firstBuilder.setSequence(sequence);
        AbstractProduct firstNumeral = firstBuilder.getAbstractNumeral();
        firstNumeral.run();

        SecondBuilder secondBuilder = new SecondBuilder();
        secondBuilder.setSequence(sequence);
        AbstractProduct secondNumeral = secondBuilder.getAbstractNumeral();
        secondNumeral.run();

        /**
         * 再次封装模型，要什么模型直接拿
         */
        System.out.println("---添加导演类---");
        Director director = new Director();
        director.setFirstBuilder().run();
        director.setSecondBuilder().run();

        /**
         * @author zhaoqinghong
         * 1. Product
         * 2. AbstractBuilder
         * 3. ReallyBuilder
         * 4. Director
         * 生产一个复杂的产品可能会有许多种封装的顺序，或者说 同样的零件 通过 不同的封装 生产出 不同的产品。
         */
    }
}
