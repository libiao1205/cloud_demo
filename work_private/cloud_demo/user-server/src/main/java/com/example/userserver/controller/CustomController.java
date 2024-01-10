package com.example.userserver.controller;

import com.example.userserver.config.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author libiao
 * @date 2024/1/3
 */
@RestController
//@RequestMapping("user")
public class CustomController {

    @Autowired
    private CustomService customService;

    @Autowired
    private Config config;

    @GetMapping("test")
    public String test() {
        System.out.println("user服务=" + config.getName());
        customService.test();
        return "user服务";
    }

}
