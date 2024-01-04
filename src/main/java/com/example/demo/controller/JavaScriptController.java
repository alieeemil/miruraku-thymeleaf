package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JavaScriptController {

  @GetMapping("/javascript")
  public String javascript(Model model) {
    model.addAttribute("text", "Hello from JavaScript inline");

    return "javascript";
  }
}