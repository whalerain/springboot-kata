package com.github.whalerain.springbootkata.constant;

import com.github.whalerain.springbootkata.support.StringGetter;

/**
 * API响应状态枚举
 *
 * @author ZhangXi
 */
public enum ResponseStatus implements StringGetter {

    SUCCESS("SUCCESS"),
    FAILURE("FAILURE"),
    UNAUTHORIZED("UNAUTHORIZED"),
    DENIED("DENIED");

    private String enumValue;

    ResponseStatus(String enumValue) {
        this.enumValue = enumValue;
    }

    @Override
    public String takeValue() {
        return this.enumValue;
    }
}
