package cn.zqhblog.designcode.p.composite;

/**
 * @author QingHong
 * @description 树结构遍历
 * @QQ 2560612959
 * @create 2021/1/4 17:50
 */
public class Client {
    public static void display(AbstractComponent root) {
        for (AbstractComponent c : root.getChildren()) {
            if (c instanceof Leaf) {
                c.doSomething();
            } else {
                display(c);
            }
        }

    }
}
