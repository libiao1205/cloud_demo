package com.example.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author libiao
 * @date 2024/1/3
 */
@RestController
//@RequestMapping("service")
public class CustomController {

    @GetMapping("test")
    public String test() {
        System.out.println("service服务");
        return "service服务";
    }

}
