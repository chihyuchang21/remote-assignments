package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyNameController {

    @GetMapping("/myName")
    public String myName(@CookieValue(value = "userName", defaultValue = "") String userName, Model model) {
        model.addAttribute("userName", userName);
        model.addAttribute("hasUserNameCookie", !userName.isEmpty());
        return "myName";
    }
}
