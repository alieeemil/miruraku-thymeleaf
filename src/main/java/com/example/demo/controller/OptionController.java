package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class OptionController {

    @GetMapping("/option")
    public String option(Model model) {
        List<String> actives = new ArrayList<>();
        actives.add("manager");
        actives.add("general");

        model.addAttribute("active", "admin");
        model.addAttribute("actives", actives);

        return "option";
    }
}