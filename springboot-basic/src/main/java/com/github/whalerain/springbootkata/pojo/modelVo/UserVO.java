package com.github.whalerain.springbootkata.pojo.modelVo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.github.whalerain.springbootkata.model.User;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.*;

/**
 * 用户VO超类
 * 该类会是其他{@link User}用户VO类的父类
 *
 * @author ZhangXi
 */
public class UserVO extends User {


    @Override
    public Integer getId() {
        return super.getId();
    }

    @NotBlank
    @Override
    public String getLoginName() {
        return super.getLoginName();
    }

    @NotBlank
    @Override
    public String getUserName() {
        return super.getUserName();
    }

    @NotBlank
    @Override
    public String getPassword() {
        return super.getPassword();
    }

    @Override
    public String getRealName() {
        return super.getRealName();
    }

    @Digits(integer = 3, fraction = 0)
    @Override
    public Integer getAge() {
        return super.getAge();
    }

    @Override
    public String getMobile() {
        return super.getMobile();
    }

    @Email
    @Override
    public String getEmail() {
        return super.getEmail();
    }

    @Digits(integer = 1, fraction = 0)
    @Range(min = 0, max = 2)
    @Override
    public Integer getStatus() {
        return super.getStatus();
    }

    @JsonIgnore
    @Override
    public Boolean getDeleted() {
        return super.getDeleted();
    }

    @JsonIgnore
    @Override
    public void setDeleted(Boolean deleted) {
        super.setDeleted(deleted);
    }
}
