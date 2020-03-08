package com.example.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @CrossOrigin(origins = "*")
    @GetMapping(value = "/health")
    public String health() {
        return "up";
    }
}