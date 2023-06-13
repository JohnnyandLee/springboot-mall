package com.johnnylee.springbootmall.dao;

import com.johnnylee.springbootmall.dto.UserRegisterRequest;
import com.johnnylee.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    User getUserByEmail(String email);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}
