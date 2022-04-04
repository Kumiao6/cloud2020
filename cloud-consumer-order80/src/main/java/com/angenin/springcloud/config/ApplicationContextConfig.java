package com.angenin.springcloud.config;

import com.angenin.springcloud.myrule.MySelfRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author ：m
 * @date ：Created in 2022/4/3 14:19
 */
@Configuration
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE", configuration = MySelfRule.class)
public class ApplicationContextConfig {
    //往容器中添加一个RestTemplate
    //RestTemplate提供了多种便捷的远程http访问的方法
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
