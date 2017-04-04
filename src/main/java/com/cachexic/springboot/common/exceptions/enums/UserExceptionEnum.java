package com.cachexic.springboot.common.exceptions.enums;

/**
 * @author tangmin
 * @version V1.0
 * @Title: UserExceptionEnum.java
 * @Package com.cachexic.springboot.common.exceptions.enums
 * @Description: 用户模块的异常定义
 * @date 2017-04-04 22:54:18
 */
public enum UserExceptionEnum{
    UNKONW(-1,"未知异常"),
    USER_NOT_EXIT(10,"用户不存在"),
    USER_FOBBIT(11,"用户已被禁用");

    private int code;
    private String msg;

    /**
     * 构造方法
     * @param code
     * @param msg
     */
    UserExceptionEnum(int code,String msg){
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
