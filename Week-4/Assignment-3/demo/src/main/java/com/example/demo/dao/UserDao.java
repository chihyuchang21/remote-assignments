package com.example.demo.dao;

import com.example.demo.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class UserDao {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    //Sign-Up Function
    public String signup(UserDto userDto) {
        String sql = "INSERT INTO user (email, password) VALUES (:signUpEmail, :signUpPassword)";

        Map<String, Object> map = new HashMap<>();
        map.put("signUpEmail", userDto.getSignUpEmail());
        map.put("signUpPassword", userDto.getSignUpPassword());

        namedParameterJdbcTemplate.update(sql, map);
        return "Signup successful!";
    }

    //Sign-In Function
    public String signin(UserDto userDto) {
        String sql = "SELECT COUNT(*) FROM user WHERE email = :signInEmail AND password = :signInPassword";

        Map<String, Object> map = new HashMap<>();
        map.put("signInEmail", userDto.getSignInEmail());
        map.put("signInPassword", userDto.getSignInPassword());

        Integer count = namedParameterJdbcTemplate.queryForObject(sql, map, Integer.class);
        if (count != null && count > 0) {   //account exists
            return "Signin successful!";
        } else {                            //account does not exist
            return "Fail!";
        }
    }
}