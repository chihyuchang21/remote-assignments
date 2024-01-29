package com.example.demo;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TrackNameController {

    @PostMapping("/trackName")
    public String trackName(@RequestParam String name, HttpServletResponse response) {
        // Set the user's name in cookies
        Cookie cookie = new Cookie("userName", name);
        cookie.setMaxAge(7 * 24 * 60 * 60); // Cookie expiration time in seconds (e.g., 7 days)
        response.addCookie(cookie);

        // Redirect to /myName
        return "redirect:/myName";
    }
}