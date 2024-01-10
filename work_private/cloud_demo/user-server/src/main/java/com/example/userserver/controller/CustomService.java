package com.example.userserver.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author libiao
 * @date 2024/1/5
 */
@Component
@FeignClient("service-server")
public interface CustomService {

    @RequestMapping(method = RequestMethod.GET, value = "/test")
    String test();
}
