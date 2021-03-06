package com.angenin.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：m
 * @date ：Created in 2022/4/8 11:49
 */
@RestController
@RefreshScope
public class ConfigClientController {

    @Value("${config.info}")    //spring的@Value注解
    private String configInfo;

    @GetMapping("/configInfo")
    public String getConfigInfo(){
        return configInfo;
    }

}
