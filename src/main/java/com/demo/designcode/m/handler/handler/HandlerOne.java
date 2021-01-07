package com.demo.designcode.m.handler.handler;

import com.demo.designcode.m.handler.AbstractHandler;
import com.demo.designcode.m.handler.Level;
import com.demo.designcode.m.handler.Request;
import com.demo.designcode.m.handler.Response;

/**
 * @author QingHong
 * @description
 * @QQ 2560612959
 * @create 2021/1/4 17:50
 */
public class HandlerOne extends AbstractHandler {
    @Override
    protected Level getHandlerLevel() {
        return Level.LEVEL_ONE;
    }

    @Override
    protected Response echo(Request request) {
        return new Response(request.toString(), "one");
    }

}
