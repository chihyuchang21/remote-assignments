package com.example.demo;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TrackNameController {

@RequestMapping(value = "/trackName", method = {RequestMethod.GET, RequestMethod.POST})

public String trackName(@RequestParam String name, HttpServletResponse response) {
        // Set the user's name in cookies
        Cookie cookie = new Cookie("userName", name);
        response.addCookie(cookie);

        // Redirect to /myName
        return "redirect:/myName";
    }
}