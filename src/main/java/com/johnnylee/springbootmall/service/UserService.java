package com.johnnylee.springbootmall.service;

import com.johnnylee.springbootmall.dto.UserLoginRequest;
import com.johnnylee.springbootmall.dto.UserRegisterRequest;
import com.johnnylee.springbootmall.model.User;

public interface UserService {

    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);

    User login(UserLoginRequest userLoginRequest);

}
