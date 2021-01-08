package com.demo.designcode.m.handler;

/**
 * @author QingHong
 * @description
 * @create 2021/1/4 17:50
 */
public class Response {
    /**
     * 处理者返回的数据
     */
    private String msg;
    private String dealMan;

    public Response(String msg, String dealMan) {
        this.msg = msg;
        this.dealMan = dealMan;
    }

    public String getMsg() {
        return msg;
    }

    public String getDealMan() {
        return dealMan;
    }
}
