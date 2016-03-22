/**
 * @(#)UserService 2016/3/22
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
package com.ssm.service;

import com.ssm.model.User;

/**
 * @author Yingjie Chen
 * @date 2016/3/22
 * @version $$Revision$$
 */
public interface UserService {

    User getUserById(int id);

    // 通过用户名及密码核查用户登录
    User checkLogin(String username, String password);
}  
