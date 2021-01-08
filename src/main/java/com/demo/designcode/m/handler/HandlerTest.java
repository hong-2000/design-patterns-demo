package com.demo.designcode.m.handler;

import com.demo.designcode.m.handler.handler.HandlerOne;
import com.demo.designcode.m.handler.handler.HandlerThree;
import com.demo.designcode.m.handler.handler.HandlerTwo;

/**
 * @author QingHong
 * @description
 * @QQ 2560612959
 * @create 2021/1/4 17:50
 */
public class HandlerTest {
    public static void main(String[] args) {
        AbstractHandler handler1 = new HandlerOne();
        AbstractHandler handler2 = new HandlerTwo();
        AbstractHandler handler3 = new HandlerThree();
        handler1.setNextHandler(handler2);
        handler2.setNextHandler(handler3);
        Request request = new Request();
        request.setLevel(Level.LEVEL_TWO);
        Response response = handler1.handlerMessage(request);
        System.out.println(response.getDealMan() + " " + response.getMsg());

        /**
         * @author hong-2000
         * 效率问题，控制节点数量
         */
    }
}
