package com.demo.designcode.f.template;

import lombok.extern.slf4j.Slf4j;

/**
 * @author QingHong
 * @description 模板方法
 * @create 2021/1/4 17:50
 */
@Slf4j
public class TemplateFather {

    public void oneMethod() {
        log.info("oneMethod...");
        System.out.println("oneMethod...");
    }

    public void twoMethod() {
        log.info("twoMethod...");
        System.out.println("twoMethod...");
    }

    public void threeMethod() {
        log.info("threeMethod...");
        System.out.println("threeMethod...");
    }

    public void run() {
        this.oneMethod();
        if (this.isTwo()) {
            this.twoMethod();
        }
        this.threeMethod();
    }

    /**
     * 钩子方法，依赖子类的实现，缺省
     *
     * @return
     */
    public boolean isTwo() {
        return true;
    }
}
