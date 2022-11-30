package com.course.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController {

    @GetMapping("/home")
    public String loadHome(Model model) {
        model.addAttribute("name", "thymeleaf");
        return "Home";
    }

    @GetMapping("/elvis")

    public String elvisExample(Model model) {
        model.addAttribute("isAdmin", false);
        return "elvis";
    }

    @GetMapping("/each")
    public String eachExample(Model model) {
        List<String> stringList= List.of("first", "second" , "third");
        model.addAttribute("list", stringList);
        return "each";
    }

}
