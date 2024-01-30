package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import static java.lang.Integer.parseInt;

@Controller
public class EntryController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/data")
    //ResponseBody: return value(Without it, thymeleaf will return html file)
    @ResponseBody
    public String showData(@RequestParam(required = false) String number) {
        try {
            //First: parse String to Int
            int intValue = parseInt(number);

            if (intValue <= 0) {
                // Case: Non-positive integer or no integer (0)
                return "Lack of Parameter";
            } else {
                // Case: Valid positive integer
                int sumResult = calculateSum(intValue);
                return String.valueOf(sumResult);
            }
        } catch (NumberFormatException e) {
            // Case: Wrong Parameter (non-integer value)
            return "parameter";
        }
    }

    @GetMapping("/sum.html")
    public String sum(){
        return "sum.html";
    }


    private int calculateSum(int n) {
        return n * (n + 1) / 2;
    }
}

