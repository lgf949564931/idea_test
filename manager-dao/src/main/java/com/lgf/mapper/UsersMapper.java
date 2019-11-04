package com.lgf.mapper;

import com.lgf.pojo.Users;

import java.util.List;

/**
 * @Auther: lgf
 * @Date: 2019/10/21
 * @Description: com.lgf.mapper
 * @version: 1.0
 */
public interface UsersMapper {
    void insertUser(Users users);

    List<Users> selectUserAll();
}
