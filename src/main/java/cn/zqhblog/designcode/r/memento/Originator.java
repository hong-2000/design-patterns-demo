package cn.zqhblog.designcode.r.memento;

/**
 * @author QingHong
 * @description 发起人角色
 * @QQ 2560612959
 * @create 2021/1/4 17:50
 */
public class Originator {
    /**
     * 内部状态
     */
    private String state = "";

    public IMemento createMemento() {
        return new Memento(this.state);
    }

    public void restoreMemento(IMemento memento) {
        this.setState(((Memento) memento).getState());
    }

    /**
     * 内置类
     * 缩小备忘录的阅读权限
     */
    private class Memento implements IMemento {
        /**
         * 发起人的内部状态
         */
        private String state = "";

        private Memento(String state) {
            this.state = state;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }
    }


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
