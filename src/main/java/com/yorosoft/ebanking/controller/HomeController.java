package com.yorosoft.ebanking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "redirect:/login";
    }


    @GetMapping("/index")
    public String index() {
        return "login";
    }


    @GetMapping("/login")
    public String login() {
        return "login";
    }

}
