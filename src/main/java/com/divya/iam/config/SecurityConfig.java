package com.divya.iam.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class SecurityConfig {

    public void configureSecurity() {
        System.out.println("Spring Security Configuration Loaded");
    }
}
