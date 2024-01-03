package com.example.demo.controller;

import com.example.demo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class DropdownsController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/dropdowns")
    public String dropdowns(Model model) {
        Map<String, String> departments = departmentService.getDepartments();

        List<String> actives = new ArrayList<>();
        actives.add("200");
        actives.add("800");

        model.addAttribute("departments", departments);
        model.addAttribute("active", "200");
        model.addAttribute("actives", actives);

        return "dropdowns";
    }
}