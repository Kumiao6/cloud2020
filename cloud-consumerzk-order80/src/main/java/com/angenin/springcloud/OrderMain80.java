package com.angenin.springcloud;

import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ：m
 * @date ：Created in 2022/4/4 14:25
 */
@EnableDiscoveryClient	//该注解用于向使用consul或者Zookeeper作为注册中心时注册服务
@SpringBootApplication
public class OrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class, args);

    }
}
