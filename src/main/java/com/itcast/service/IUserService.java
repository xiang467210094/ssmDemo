package com.itcast.service;

import com.itcast.model.User;

/**
 * Created by Jie on 2019/6/16.
 */
public interface IUserService{
      User findById(long userid);
}
