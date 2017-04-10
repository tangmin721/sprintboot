package com.cachexic.springboot.common.exceptions.valid;

import org.assertj.core.util.Lists;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.util.List;

/**
 * @author tangmin
 * @version V1.0
 * @Title: ValidErrorUtils.java
 * @Package com.cachexic.springboot.common.exceptions.valid
 * @Description: 处理@valid错误信息
 * @date 2017-04-08 17:37:17
 */
public class ValidErrorUtils {

    public static List<ValidErrorInfo> changgeValidError(BindingResult bindingResult){

        List<ValidErrorInfo> errorInfos = Lists.newArrayList();

        List<FieldError> fieldErrors = bindingResult.getFieldErrors();
        for (FieldError fieldError : fieldErrors) {
            ValidErrorInfo validErrorInfo = new ValidErrorInfo();
            validErrorInfo.setField(fieldError.getField());
            validErrorInfo.setErrMsg(fieldError.getDefaultMessage());
            errorInfos.add(validErrorInfo);
        }
        return errorInfos;

    }
}
