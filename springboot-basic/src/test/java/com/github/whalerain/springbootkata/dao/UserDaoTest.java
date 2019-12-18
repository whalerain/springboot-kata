package com.github.whalerain.springbootkata.dao;

import com.github.whalerain.springbootkata.base.BaseTest;
import com.github.whalerain.springbootkata.model.User;
import org.junit.jupiter.api.Test;

import javax.annotation.Resource;

/**
 * @author ZhangXi
 */
public class UserDaoTest extends BaseTest {

    @Resource
    private UserDao userDao;

    @Test
    public void testSelect() {
        User user = userDao.selectById(1);

    }


}
