package com.github.whalerain.springbootkata.modelenum;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.Data;

/**
 * 数据库查询排序顺序
 *
 * @author ZhangXi
 */
public enum  SortOrder {

    ASC("asc"),
    DESC("desc");

    @EnumValue
    private String enumValue;

    SortOrder(String enumValue) {
        this.enumValue = enumValue;
    }

    public String getEnumValue() {
        return enumValue;
    }
}
