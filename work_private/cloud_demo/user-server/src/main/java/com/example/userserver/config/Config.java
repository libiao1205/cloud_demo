package com.example.userserver.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * @author libiao
 * @date 2024/1/10
 */
@Component
@RefreshScope
public class Config {
    @Value("${sys.name}")
    private String name;

    public String getName() {
        return this.name;
    }
}
