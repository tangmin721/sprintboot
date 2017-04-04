package com.cachexic.springboot.common.exceptions;

import com.cachexic.springboot.common.exceptions.enums.UserExceptionEnum;

/**
 * @author tangmin
 * @version V1.0
 * @Title: BizException.java
 * @Package com.cachexic.springboot.common.exceptions
 * @Description: 用户模块业务异常类，继承业务异常，包装更多信息，比如code
 * @date 2017-04-04 22:39:40
 */
public class UserException extends BizException{
    /**错误编码*/
    private int code;

    /**
     * 构造方法
     * @param userExceptionEnum
     */
    public UserException(UserExceptionEnum userExceptionEnum){
        super(userExceptionEnum.getCode(),userExceptionEnum.getMsg());
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
