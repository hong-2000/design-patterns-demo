package com.demo.designcode.f.template;

/**
 * @author QingHong
 * @description
 * @create 2021/1/4 17:50
 */
public class TemplateTest {
    public static void main(String[] args) {
        TemplateOldSon templateOldSon = new TemplateOldSon();
        TemplateYoungSon templateYoungSon = new TemplateYoungSon();

        templateOldSon.run();
        System.out.println();
        templateYoungSon.run();
    }
}
