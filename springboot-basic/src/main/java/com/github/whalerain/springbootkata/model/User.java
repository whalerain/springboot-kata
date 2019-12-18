package com.github.whalerain.springbootkata.model;

import com.github.whalerain.springbootkata.support.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

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
     * 用户昵称
     */
    private String userName;

    /**
     * 用户密码
     */
    private String password;

//    /**
//     * 真实姓名
//     */
//    private String realName;
//
//    /**
//     * 用户年龄
//     */
//    private Integer age;
//
//    /**
//     * 绑定手机号
//     */
//    private String mobile;
//
//    /**
//     * 绑定邮箱
//     */
//    private String email;

    /**
     * 账号状态
     */
    private Integer status;

}
