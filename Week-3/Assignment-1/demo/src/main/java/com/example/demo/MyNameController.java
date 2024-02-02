package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyNameController {

@RequestMapping(value = "/myName", method = {RequestMethod.GET, RequestMethod.POST})
    public String myName(@CookieValue(value = "userName", defaultValue = "") String userName, Model model) {
        model.addAttribute("userName", userName);
        //If userName != empty means Cookie exist
        model.addAttribute("hasUserNameCookie", !userName.isEmpty());
        //.html
        return "myName.html";
    }
}
