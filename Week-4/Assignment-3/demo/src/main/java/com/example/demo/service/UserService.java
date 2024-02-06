package com.example.demo.service;

import com.example.demo.dao.UserDao;
import com.example.demo.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    @Autowired
    private UserDao userDao;

    public String signup(UserDto userDto) {
        return userDao.signup(userDto);
    }

    public String signin(UserDto userDto) {
        return userDao.signin(userDto);
    }

}
