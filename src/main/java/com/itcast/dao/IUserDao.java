package com.itcast.dao;

import com.itcast.model.User;

/**
 * Created by Jie on 2019/6/16.
 */
public interface IUserDao {
    User findById(long userid);
}
