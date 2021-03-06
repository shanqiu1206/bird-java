package com.bird.web.sso.exception;

import com.bird.core.HttpCode;
import com.bird.core.exception.AbstractException;

/**
 * 定义用户身份过期异常类
 * @author liuxx
 */
public class UnAuthorizedException extends AbstractException {
    public UnAuthorizedException(String message) {
        super(message);
    }

    @Override
    public Integer getCode() {
        return HttpCode.UNAUTHORIZED.value();
    }
}
