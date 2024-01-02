package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class PositionService {

    public Map<String, String> getPositions() {
        Map<String, String> positions = new LinkedHashMap<>();
        positions.put("10", "部長");
        positions.put("20", "一般社員");
        positions.put("30", "派遣社員");

        return positions;
    }
}