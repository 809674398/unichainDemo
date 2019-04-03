package com.unichain.demo.biz.impl;

import com.unichain.demo.biz.UserBiz;
import com.unichain.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: UserBizImpl
 * @description: TODO
 * @author: Chonzi.xiao
 * @create: 2019-04-03 15:51
 **/
@Service
public class UserBizImpl implements UserBiz {

    @Autowired
    private UserService userService;

}
