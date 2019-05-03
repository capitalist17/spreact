package com.atech.spreact.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Welcome to react development (Project Structure for ReactFE SpringPE)";
    }

}
