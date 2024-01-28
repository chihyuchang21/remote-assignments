package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import static java.lang.Integer.parseInt;

@Controller
public class HelloController {
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/data")
    @ResponseBody
    public String showData(@RequestParam(required = false, defaultValue = "0") String number) {
        try {
            int intValue = parseInt(number);

            if (intValue <= 0) {
                // Case: Non-positive integer or invalid integer
                return "result";
            } else {
                // Case: Valid positive integer
                int sumResult = sum(intValue);
                // Other logic for handling non-null and positive number parameter
                return String.valueOf(sumResult);
            }
        } catch (NumberFormatException e) {
            // Case: Wrong Parameter (non-integer value)
            return "parameter";
        }
    }

    private int sum(int n) {
        return n * (n + 1) / 2;
    }
}
//Comments:
//I used Thymeleaf Template engine in this assignment.

