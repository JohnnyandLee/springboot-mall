package com.johnnylee.springbootmall.service.impl;

import com.johnnylee.springbootmall.dao.UserDao;
import com.johnnylee.springbootmall.dto.UserRegisterRequest;
import com.johnnylee.springbootmall.model.User;
import com.johnnylee.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }
}
