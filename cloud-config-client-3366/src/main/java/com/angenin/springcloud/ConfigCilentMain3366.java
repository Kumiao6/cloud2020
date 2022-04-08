package com.angenin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ：m
 * @date ：Created in 2022/4/8 16:28
 */
@SpringBootApplication
@EnableEurekaClient
@RefreshScope
public class ConfigCilentMain3366 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigCilentMain3366.class, args);
    }
}
