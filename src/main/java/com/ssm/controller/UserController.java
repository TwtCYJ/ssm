/**
 * @(#)UserController 2016/3/22
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
package com.ssm.controller;

import com.ssm.model.User;
import com.ssm.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * @author Yingjie Chen
 * @version $$Revision$$
 * @date 2016/3/22
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userSvc;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model) {
        model.addAttribute("username", new User());
        return "login";
    }

    @RequestMapping(value="/login",method= RequestMethod.POST)
    public String login(User user,Model model) throws Exception {
        user=userSvc.checkLogin(user.getUserName(), user.getPassword());
        if(user!=null){
            model.addAttribute(user);
            return "welcome";// 路径 WEB-INF/pages/welcome.jsp
        }
        return "fail";
    }

}
