package com.github.whalerain.springbootkata.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.whalerain.springbootkata.config.CacheConfiguration;
import com.github.whalerain.springbootkata.dao.UserDao;
import com.github.whalerain.springbootkata.model.User;
import com.github.whalerain.springbootkata.modelenum.UserStatus;
import com.github.whalerain.springbootkata.pojo.modelvo.UserVO;
import com.github.whalerain.springbootkata.service.UserService;
import com.github.whalerain.springbootkata.support.PagedData;
import com.github.whalerain.springbootkata.support.sub.OrderParams;
import com.github.whalerain.springbootkata.support.sub.PagedParams;
import com.github.whalerain.springbootkata.support.sub.QueryParams;
import com.github.whalerain.springbootkata.tool.PojoTools;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 用户Service接口实现类
 *
 * @author ZhangXi
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Cacheable(value = CacheConfiguration.USER_CACHE, key = "#id")
    @Override
    public UserVO getAvailableUser(int id) {
        User model = userDao.selectById(id);
        if(null == model) {
            //todo 最好处理方式是抛出异常
            return null;
        }
        UserVO vo = new UserVO();
        PojoTools.copyModelToVo(model, vo);
        return vo;
    }

    @Override
    public PagedData<UserVO> queryPagedUsers(PagedParams pagedParams, QueryParams queryParams, OrderParams orderParams) {
        IPage<User> page = new Page<>(pagedParams.getPageNum(), pagedParams.getPageSize());
        page = userDao.selectPage(page, null);
        return null;
    }

    @Override
    public UserVO addUser(User user) {
        return null;
    }

    @CachePut(value = CacheConfiguration.USER_CACHE, key = "#user.id")
    @Override
    public UserVO updateUser(User user) {
        //todo 一系列比对校验处理
        userDao.updateById(user);
        UserVO vo = new UserVO();
        PojoTools.copyModelToVo(user, vo);
        return vo;
    }

    @CacheEvict(value = CacheConfiguration.USER_CACHE, key = "#id", beforeInvocation = true)
    @Override
    public void deleteUser(int id) {
        userDao.deleteById(id);
    }

    @CacheEvict(value = CacheConfiguration.USER_CACHE, key = "#id", beforeInvocation = true)
    @Override
    public void enableUser(int id) {
        User user = userDao.selectById(id);
        user.setStatus(UserStatus.NORMAL);
        userDao.updateById(user);
    }

    @CacheEvict(value = CacheConfiguration.USER_CACHE, key = "#id", beforeInvocation = true)
    @Override
    public void disableUser(int id) {
        User user = userDao.selectById(id);
        user.setStatus(UserStatus.DISABLED);
        userDao.updateById(user);
    }
}
