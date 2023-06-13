package com.johnnylee.springbootmall.dao;

import com.johnnylee.springbootmall.dto.UserRegisterRequest;
import com.johnnylee.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}
