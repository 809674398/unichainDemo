package com.unichain.demo.service;

import com.unichain.demo.entity.User;
import com.unichain.demo.service.support.BaseService;

public interface UserService extends BaseService<User> {

    User selectUser(User user);
}
