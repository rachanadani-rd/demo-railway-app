package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController; // Correct import

@RestController // Correct spelling
public class HomeController {
    @GetMapping({"/", "/home", "/status"})
    public String getStatus() {
        return "Application is up and running!";
    }
}