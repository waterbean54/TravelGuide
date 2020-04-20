package com.travel.guide.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardController {

    @RequestMapping("/hello")
    public String home(){
        return "hello";
    }
}
