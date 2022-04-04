package com.angenin.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author ：m
 * @date ：Created in 2022/4/4 18:42
 */
public interface LoadBalancer {
    //传入具体实例的集合，返回选中的实例
    ServiceInstance instances(List<ServiceInstance> serviceInstance);

}

