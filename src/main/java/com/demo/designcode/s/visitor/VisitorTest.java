package com.demo.designcode.s.visitor;

import com.demo.designcode.s.visitor.visitor.Visitor;

/**
 * @author QingHong
 * @description
 * @QQ 2560612959
 * @create 2021/1/4 17:50
 */
public class VisitorTest {
    public static void main(String[] args) {
        int range = 10;
        for (int i = 0; i < range; i++) {
            AbstractElement element = ObjectStruture.createElement();
            element.accept(new Visitor());
        }
    }
}
