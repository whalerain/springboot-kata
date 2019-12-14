package com.github.whalerain.springbootkata.support;

/**
 * Model实体类超类
 * 用于匹配通用数据库字段
 *
 * @author ZhangXi
 */
public class BaseModel {

    /**
     * 数据是否删除的标记
     * 用于不会真正删除数据的数据表
     */
    private Boolean isDeleted;

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }
}
