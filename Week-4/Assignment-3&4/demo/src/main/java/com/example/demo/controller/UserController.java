package com.example.demo;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @RequestMapping("/signup")
    public String singup(@RequestBody UserDto userDto){

    }

    @RequestMapping("/signin")
    public String signin(@RequestBody UserDto userDto){

    }
}
