package com.example.test.dry.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试controller
 */
@RestController
public class TestController {

    @GetMapping("/test/springBoot")
    public String testSpringBoot() {
        return "Hello,SpringBoot";
    }
}
