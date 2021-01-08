package com.demo.designcode.m.handler.handler;

import com.demo.designcode.m.handler.AbstractHandler;
import com.demo.designcode.m.handler.Level;
import com.demo.designcode.m.handler.Request;
import com.demo.designcode.m.handler.Response;

/**
 * @author QingHong
 * @description
 * @create 2021/1/4 17:50
 */
public class HandlerTwo extends AbstractHandler {
    @Override
    protected Level getHandlerLevel() {
        return Level.LEVEL_TWO;
    }

    @Override
    protected Response echo(Request request) {
        return new Response(request.toString(), "two");
    }

}
