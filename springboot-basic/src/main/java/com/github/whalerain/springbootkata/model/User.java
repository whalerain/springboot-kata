package com.github.whalerain.springbootkata.model;

import com.github.whalerain.springbootkata.modelenum.Sex;
import com.github.whalerain.springbootkata.modelenum.UserStatus;
import com.github.whalerain.springbootkata.support.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * 用户实体类
 *
 * @author ZhangXi
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class User extends BaseModel {

    /**
     * 用户ID
     */
    private Integer id;

    /**
     * 登录名称
     */
    private String loginName;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 用户昵称
     */
    private String nickName;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 用户年龄
     */
    private Integer age;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 用户性别
     */
    private Sex sex;

    /**
     * 绑定手机号
     */
    private String mobile;

    /**
     * 绑定邮箱
     */
    private String email;

    /**
     * 账号状态
     */
    private UserStatus status;

}
