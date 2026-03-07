package com.platform.config;

import com.platform.service.MathService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {


    @Bean
    public MathService mathService()
    {
        return new MathService();
    }

    @Bean
    public String appName()
    {
        return "this is the Knowlwedge app";
    }



}
