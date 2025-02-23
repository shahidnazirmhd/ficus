package com.phegondev.InventoryManagementSystem.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {
    @Bean
    public WebMvcConfigurer webMvcConfigurer(){
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedMethods("GET", "POST", "PUT", "DELETE") // Allow all HTTP methods
                        .allowedOrigins("http://localhost:8080") // Allow all origins
                        .allowCredentials(true) // Allow credentials like cookies or tokens
                        .allowedHeaders("*") // Allow all headers
                        .exposedHeaders("*"); // Expose all response headers
            }
        };
    }
}
