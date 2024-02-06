package com.example.demo.controller;

import com.example.demo.dto.UserDto;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


//    Use "ResponseEntity" to customize and wrap HTTP response,
//    return it to the client in JSON format
//    Use "Map" to keep data in JSON format


    @PostMapping("/signup")
    public ResponseEntity<Map<String, String>> signup(@RequestBody UserDto userDto){
        String result = userService.signup(userDto);
        return ResponseEntity.ok(Map.of("message", result));
    }

    @PostMapping("/signin")
    public ResponseEntity<Map<String, String>> signin(@RequestBody UserDto userDto) {
        String result = userService.signin(userDto);
        return ResponseEntity.ok(Map.of("message", result));
    }
}
