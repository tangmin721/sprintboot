package com.cachexic.springboot.common.exceptions;

import com.cachexic.springboot.common.exceptions.enums.BizExceptionEnum;
import com.cachexic.springboot.common.exceptions.enums.UserBizExceptionEnum;

/**
 * @author tangmin
 * @version V1.0
 * @Title: BizException.java
 * @Package com.cachexic.springboot.common.exceptions
 * @Description: 业务异常类，包装更多信息，比如code
 *                  一定要继承RuntimeException。因为spring事务只有RuntimeException才会回滚
 * @date 2017-04-04 22:39:40
 */
public class BizException extends RuntimeException{
    /**错误编码*/
    private int code;

    /**
     * 构造方法
     * @param bizExceptionEnum
     */
    public BizException(BizExceptionEnum bizExceptionEnum){
        super(bizExceptionEnum.getMsg());
        this.code = bizExceptionEnum.getCode();
    }

    /**
     * 构造方法
     * @param code
     * @param msg
     */
    public BizException(int code,String msg){
        super(msg);
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public static void main(String[] args) {
        String msgFormat = "%s:你是谁?%s回答:%s?";
        String[] sts = new String[]{"aaa","bbb","啥"};
        String format = String.format(msgFormat, sts);
        System.out.println(format);

        new BizException(BizExceptionEnum.SERVER_STOP);
        new UserBizException(UserBizExceptionEnum.USER_NOT_EXIT);
    }
}
