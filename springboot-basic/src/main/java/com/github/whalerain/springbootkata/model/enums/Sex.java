package com.github.whalerain.springbootkata.model.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * 性别枚举类
 *
 * @author ZhangXi
 */
public enum Sex {
    MAN(1, "man", "男性"),
    WOMAN(2, "woman", "女性");

    @EnumValue
    private Integer value;

    @JsonValue
    private String name;

    private String desc;

    Sex(Integer value, String name, String desc) {
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
