package com.github.whalerain.springbootkata.model.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 *
 *
 * @author ZhangXi
 */
public enum UserStatus {
    NORMAL(0, "normal", "正常");

    @EnumValue
    private Integer value;

    @JsonValue
    private String name;

    private String desc;

    UserStatus(Integer value, String name, String desc) {
        this.value = value;
        this.name = name;
        this.desc = desc;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
