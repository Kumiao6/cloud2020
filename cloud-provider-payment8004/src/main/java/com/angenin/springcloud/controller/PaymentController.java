package com.angenin.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.apache.naming.factory.webservices.ServiceProxy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author ：m
 * @date ：Created in 2022/4/4 11:31
 */
    @Slf4j
    @RestController
    public class PaymentController {

        @Value("${server.port}")        //获取端口号
        private String serverPort;

        @RequestMapping("/payment/zk")
        public String paymentzk(){
            return "springcloud with zookeeper：" + serverPort + "\t" + UUID.randomUUID().toString();
        }

    }
