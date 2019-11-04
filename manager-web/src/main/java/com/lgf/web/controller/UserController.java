package com.lgf.web.controller;

import com.lgf.pojo.Users;
import com.lgf.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: lgf
 * @Date: 2019/10/21
 * @Description: com.lgf.web.controller
 * @version: 1.0
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UsersService usersService;
    @RequestMapping("/addUser")
    public String addUser(Users users){
        this.usersService.addUser(users);
        return "ok";
    }
}
