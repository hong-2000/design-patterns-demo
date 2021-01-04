package cn.zqhblog.designcode.m.handler.handler;

import cn.zqhblog.designcode.m.handler.AbstractHandler;
import cn.zqhblog.designcode.m.handler.Level;
import cn.zqhblog.designcode.m.handler.Request;
import cn.zqhblog.designcode.m.handler.Response;

/**
 * @author QingHong
 * @description
 * @QQ 2560612959
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
