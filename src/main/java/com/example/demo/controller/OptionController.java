package com.example.demo.controller;

import com.example.demo.service.DepartmentService;
import com.example.demo.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class OptionController {

    @Autowired
    private DepartmentService departmentService;

    @Autowired
    private PositionService positionService;

    @GetMapping("/option")
    public String option(Model model) {
        Map<String, String> departments = departmentService.getDepartments();
        Map<String, String> positions = positionService.getPositions();

        List<String> actives = new ArrayList<>();
        actives.add("10");
        actives.add("20");

        model.addAttribute("departments", departments);
        model.addAttribute("positions", positions);
        model.addAttribute("active", "100");
        model.addAttribute("actives", actives);

        return "option";
    }
}