package com.github.whalerain.springbootkata.pojo.modelVo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.github.whalerain.springbootkata.model.User;
import com.github.whalerain.springbootkata.model.enums.Sex;
import com.github.whalerain.springbootkata.model.enums.UserStatus;
import com.github.whalerain.springbootkata.validator.GUpd;
import io.swagger.v3.oas.annotations.media.Schema;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 用户VO超类
 * 该类会是其他{@link User}用户VO类的父类
 *
 * @author ZhangXi
 */
@Schema(name = "用户数据")
public class UserVO extends User implements Serializable {

    @Schema(description = "用户ID", example = "1")
    @NotNull(groups = {GUpd.class})
    @Override
    public Integer getId() {
        return super.getId();
    }

    @Schema(description = "登录名称", example = "tester")
    @NotBlank
    @Override
    public String getLoginName() {
        return super.getLoginName();
    }

    @Schema(description = "用户密码", example = "123456")
    @Override
    public String getPassword() {
        return super.getPassword();
    }

    @Schema(description = "用户昵称", example = "flyway")
    @Override
    public String getNickName() {
        return super.getNickName();
    }

    @Schema(description = "真实姓名", example = "王元", format = "必须2~5位中文")
    @Override
    public String getRealName() {
        return super.getRealName();
    }

    @Schema(description = "")
    @Override
    public Integer getAge() {
        return super.getAge();
    }

    @JsonFormat(pattern = "yyyy-MM-dd")
    @Override
    public Date getBirthday() {
        return super.getBirthday();
    }


    @Schema(description = "用户性别", example = "man", allowableValues = {"man", "woman"})
    @Override
    public Sex getSex() {
        return super.getSex();
    }

    @Override
    public String getMobile() {
        return super.getMobile();
    }

    @Override
    public String getEmail() {
        return super.getEmail();
    }

    @Override
    public UserStatus getStatus() {
        return super.getStatus();
    }

    @JsonIgnore
    @Override
    public Boolean getIsDeleted() {
        return super.getIsDeleted();
    }

    @JsonIgnore
    @Override
    public Integer getRowVersion() {
        return super.getRowVersion();
    }

    @JsonIgnore
    @Override
    public void setIsDeleted(Boolean isDeleted) {
        super.setIsDeleted(isDeleted);
    }

    @JsonIgnore
    @Override
    public void setRowVersion(Integer rowVersion) {
        super.setRowVersion(rowVersion);
    }
}
