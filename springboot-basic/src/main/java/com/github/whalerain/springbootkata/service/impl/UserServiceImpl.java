package com.github.whalerain.springbootkata.service.impl;

import com.github.whalerain.springbootkata.dao.UserDao;
import com.github.whalerain.springbootkata.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author ZhangXi
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;


    public void testDao() {

    }





}
