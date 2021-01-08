package com.demo.designcode.v.flyweight;

/**
 * @author QingHong
 * @description 抽象享元角色
 * @create 2021/1/4 17:50
 */
public abstract class AbstractFlyweight {
    /**
     * 内部状态
     */
    private String intrinsic;
    /**
     * 外部状态
     */
    protected final String extrinsic;

    public AbstractFlyweight(String extrinsic) {
        this.extrinsic = extrinsic;
        System.out.println("abstractFlyweight...");
    }

    /**
     * 定义业务操作
     */
    public abstract void operate();

    public String getIntrinsic() {
        return intrinsic;
    }

    public void setIntrinsic(String intrinsic) {
        this.intrinsic = intrinsic;
    }

    public String getExtrinsic() {
        return extrinsic;
    }
}
