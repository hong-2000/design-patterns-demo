package cn.zqhblog.designcode.g.builder;

import java.util.ArrayList;

/**
 * @author QingHong
 * @description 产品类
 * @QQ 2560612959
 * @create 2021/1/4 17:50
 */
public abstract class AbstractProduct {
    private ArrayList<Integer> sequence = new ArrayList<Integer>();

    /**
     * 1
     */
    protected abstract void first();

    /**
     * 2
     */
    protected abstract void second();

    /**
     * 3
     */
    protected abstract void third();

    /**
     * 模板方法之中的钩子函数
     */
    public void run() {
        for (int i = 0; i < this.sequence.size(); i++) {
            switch (this.sequence.get(i)) {
                case 1:
                    this.first();
                    break;
                case 2:
                    this.second();
                    break;
                case 3:
                    this.third();
                    break;
                default:
                    break;
            }
        }
    }

    public void setSequence(ArrayList<Integer> sequence) {
        this.sequence = sequence;
    }
}
