package com.fathyman;

import com.fathyman.domain.User;
import com.fathyman.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author fathyman
 * @description
 * @date 2019/4/25
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MySpringbootApplication.class)
public class UserTest {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void findAll(){
        List<User> users = userMapper.findAll();
        System.out.println(users);
    }
}
