package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author wyh
 * @Date 2023/12/27
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @RequestMapping("/helloWorld")
    public String helloWorld() {
        return "123";
    }
}
