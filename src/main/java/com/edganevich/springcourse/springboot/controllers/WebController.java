package com.edganevich.springcourse.springboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/work")
public class WebController {

    @GetMapping
    public String getReg() {
        return "login";
    }
}
