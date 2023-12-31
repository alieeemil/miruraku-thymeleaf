package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TableController {

    @Autowired
    private UserService userService;

    @GetMapping("/table")
    public String table(Model model) {
        List<User> users = userService.getUsers();

        model.addAttribute("users", users);
        model.addAttribute("startIndex", 0);

        return "table";
    }
}