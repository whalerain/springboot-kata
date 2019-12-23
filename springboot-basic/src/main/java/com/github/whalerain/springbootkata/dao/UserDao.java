package com.github.whalerain.springbootkata.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.whalerain.springbootkata.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author ZhangXi
 */
@Mapper
public interface UserDao extends BaseMapper<User> {

    @Select("select * from user where id = #{id}")
    User getOneById(@Param("id") Integer userId);

}
