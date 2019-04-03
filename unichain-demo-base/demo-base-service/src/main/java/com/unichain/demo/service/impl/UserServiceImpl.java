package com.unichain.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.unichain.demo.dao.mapper.UserMapper;
import com.unichain.demo.entity.User;
import com.unichain.demo.service.UserService;
import com.unichain.demo.service.support.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @program: UserServiceImpl
 * @description: TODO
 * @author: Chonzi.xiao
 * @create: 2019-04-02 11:34
 **/
@Service
public class UserServiceImpl extends BaseServiceImpl<UserMapper, User> implements UserService {


    @Override
    public User selectUser(User user) {
        return this.getOne(new QueryWrapper<User>().lambda().eq(User::getName, user.getName()));
    }
}
