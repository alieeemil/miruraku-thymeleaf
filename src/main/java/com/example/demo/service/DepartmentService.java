package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class DepartmentService {

    public Map<String, String> getDepartments() {
        Map<String, String> departments = new LinkedHashMap<>();
        departments.put("100", "管理部");
        departments.put("200", "人事部");
        departments.put("300", "営業部");
        departments.put("800", "情報システム部");

        return departments;
    }
}