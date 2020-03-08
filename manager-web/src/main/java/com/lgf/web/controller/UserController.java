package com.lgf.web.controller;

import com.lgf.pojo.Users;
import com.lgf.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
    @RequestMapping(value="/doGet/{userid}",method= RequestMethod.GET)
    public String doGet(@PathVariable Integer userid){
    System.out.println("doGet.........."+userid);
    return "ok";
    }
    @RequestMapping(value="/doPost",method = RequestMethod.POST)
    public String doPost(Users users){
        System.out.println("doPost..........");
        System.out.println(users);
        return "ok";

    }
    @RequestMapping(value="/doDelete",method = RequestMethod.DELETE)
    public String doDelete(Integer userid){
        System.out.println("doDelete.........."+userid);
        return "ok";

    }
    @RequestMapping(value="/doPut",method = RequestMethod.PUT)
    public String doPut(){
        System.out.println("doPut..........");
        return "ok";

    }
}
