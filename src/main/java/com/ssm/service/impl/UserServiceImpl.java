/**
 * @(#)UserServiceImpl 2016/3/22
 * <p>
 * Copyright 2000-2016 by RenWoYou Corporation.
 * <p>
 * All rights reserved.
 * <p>
 * This software is the confidential and proprietary information of
 * RenWoYou Corporation ("Confidential Information").  You
 * shall not disclose such Confidential Information and shall use
 * it only in accordance with the terms of the license agreement
 * you entered into with RenWoYou.
 */
package com.ssm.service.impl;

import com.ssm.dao.UserMapper;
import com.ssm.model.User;
import com.ssm.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Yingjie Chen
 * @date 2016/3/22
 * @version $$Revision$$
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    public User getUserById(int id) {
        return this.userMapper.selectByPrimaryKey(id);
    }

    /* 登陆验证 */
    public User checkLogin(String username, String password) {
        //根据用户名实例化用户对象
        User user = userMapper.selectByUserName(username);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }
}