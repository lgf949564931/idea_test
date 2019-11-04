package com.lgf.test;

import com.lgf.mapper.UsersMapper;
import com.lgf.pojo.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Auther: lgf
 * @Date: 2019/10/21
 * @Description: com.lgf.test
 * @version: 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")
public class ManagerTest {
    @Autowired
    private UsersMapper usersMapper;
    @Test
    public void insertUserTest(){
        Users users = new Users();
        users.setUserage(20);
        users.setUsername("admin");
        this.usersMapper.insertUser(users);

    }
}
