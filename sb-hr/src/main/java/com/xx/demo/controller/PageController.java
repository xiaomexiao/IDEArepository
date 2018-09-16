package com.xx.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("menu")
public class PageController {

    @RequestMapping("index")
    public String index() {
        return "index";
    }

    @RequestMapping("iframe")
    public String iframe() {
        return "iframe";
    }
}
