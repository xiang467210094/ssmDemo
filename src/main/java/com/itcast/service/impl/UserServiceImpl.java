package com.itcast.service.impl;

import com.itcast.dao.IUserDao;
import com.itcast.model.User;
import com.itcast.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Jie on 2019/6/16.
 */
@Service("userService")
public class UserServiceImpl implements IUserService {
    @Resource
    private IUserDao userDao;
    @Override
    public User findById(long userid) {
        return this.userDao.findById(userid);
    }
}
