package com.unichain.demo;

import com.unichain.demo.dao.mapper.UserMapper;
import com.unichain.demo.entity.User;
import org.junit.Assert;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: TestMapper
 * @description: TODO
 * @author: Chonzi.xiao
 * @create: 2019-04-01 21:23
 **/
public class TestMapper extends BaseTest {

    @Resource
    private UserMapper userMapper;

    @Test
    public void testInsert(){
        User user = new User();
        user.setName("ceshi");
        user.setAge(12);
        user.setEmail("admin@admin.com");
        Assert.assertTrue(userMapper.insert(user)>0);
    }

    @Test
    public void testAll(){
        List<User> users = userMapper.selectAll();
        Assert.assertNotNull(users);
    }
}
