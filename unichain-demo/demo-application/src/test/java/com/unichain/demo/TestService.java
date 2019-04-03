package com.unichain.demo;

import com.unichain.demo.entity.User;
import com.unichain.demo.service.UserService;
import org.junit.Assert;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * @program: TestService
 * @description: TODO
 * @author: Chonzi.xiao
 * @create: 2019-04-02 11:40
 **/
public class TestService extends BaseTest {

    @Resource
    private UserService userService;

    @Test
    public void queryUser(){
        User user = new User();
        user.setName("ceshi");
        User result = userService.selectUser(user);
        Assert.assertNotNull(result);
    }
}
