package com.lgf.service.impl;

import com.lgf.mapper.UsersMapper;
import com.lgf.pojo.Users;
import com.lgf.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: lgf
 * @Date: 2019/10/21
 * @Description: com.lgf.service.impl
 * @version: 1.0
 */
@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersMapper usersMapper;
    @Override
    public void addUser(Users users) {
        this.usersMapper.insertUser(users);
    }
}
