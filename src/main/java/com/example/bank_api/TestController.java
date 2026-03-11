package com.example.bank_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")  // Маппинг на корневой путь
    public String home() {
        return "Hello, Bank API is running!";
    }
}
