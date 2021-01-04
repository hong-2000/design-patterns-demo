package cn.zqhblog.designcode.m.handler;

/**
 * @author QingHong
 * @description
 * @QQ 2560612959
 * @create 2021/1/4 17:50
 */
public abstract class AbstractHandler {
    private AbstractHandler nextHandler;

    public final Response handlerMessage(Request request) {
        Response response = null;
        if (this.getHandlerLevel().equals(request.getRequestLevel())) {
            response = this.echo(request);
        } else {
            if (this.nextHandler != null) {
                response = this.nextHandler.handlerMessage(request);
            } else {

            }
        }
        return response;
    }

    /**
     * 处理级别
     *
     * @return
     */
    protected abstract Level getHandlerLevel();

    /**
     * 处理任务
     *
     * @param request
     * @return
     */
    protected abstract Response echo(Request request);

    public void setNextHandler(AbstractHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
