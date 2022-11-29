package com.course.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/home")
    public String loadHome(Model model) {
        model.addAttribute("name", "thymeleaf");
        return "Home";
    }

}
