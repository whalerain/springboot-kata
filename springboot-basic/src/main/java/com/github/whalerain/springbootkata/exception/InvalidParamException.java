package com.github.whalerain.springbootkata.exception;

import com.github.whalerain.springbootkata.support.ErrorCode;

/**
 * @author ZhangXi
 */
public class InvalidParamException extends Exception {

    private ErrorCode errorCode;

    public InvalidParamException(String message) {
        super(message);
    }

    public InvalidParamException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidParamException with(ErrorCode errorCode) {
        this.errorCode = errorCode;
        return this;
    }

}
