package com.szhtwl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Index {

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("name", "你好");
        return "login";
    }
}
