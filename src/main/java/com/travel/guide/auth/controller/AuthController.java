package com.travel.guide.auth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class AuthController {

    @GetMapping("/home")
    public String home(){
        return "board/home";
    }


}
