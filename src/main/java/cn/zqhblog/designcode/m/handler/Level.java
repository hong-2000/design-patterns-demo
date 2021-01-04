package cn.zqhblog.designcode.m.handler;

/**
 * @author QingHong
 * @description
 * @QQ 2560612959
 * @create 2021/1/4 17:50
 */
public enum Level {
    /**
     * 定义一个请求和处理的等级
     */
    LEVEL_ONE(1),
    LEVEL_TWO(2),
    LEVEL_THREE(3),
    LEVEL_STR("x"),
    LEVEL_INT_STR(1, "x");

    private int level;

    Level(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    private String string;

    Level(String string) {
        this.string = string;
    }

    Level(int level, String string) {
        this.string = string;
        this.level = level;
    }
}
