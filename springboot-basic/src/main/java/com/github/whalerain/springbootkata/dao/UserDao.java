package com.github.whalerain.springbootkata.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.whalerain.springbootkata.model.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author ZhangXi
 */
@Mapper
public interface UserDao extends BaseMapper<User> {
}
