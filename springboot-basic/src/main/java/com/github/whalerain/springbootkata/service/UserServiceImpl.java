package com.github.whalerain.springbootkata.service;

import com.github.whalerain.springbootkata.dao.UserDao;
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
