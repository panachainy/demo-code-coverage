package com.example.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogicController {

    @CrossOrigin(origins = "*")
    @GetMapping(value = "/exampleData/{data}")
    public String exampleData(@PathVariable String data) {

        if (data.equals("1")) {
            return "example 1";
        } else if (data.equals("2")) {
            return "example 2";
        } else if (data.equals("3")) {
            return "example 3";
        } else if (data.equals("4")) {
            return "example 4";
        } else if (data.equals("5")) {
            return "example 5";
        } else {
            return "example";
        }
    }
}