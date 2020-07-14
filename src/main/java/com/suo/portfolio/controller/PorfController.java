package com.suo.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PorfController {

    @GetMapping
    public String index(){
        return "index";
        }
}
