package com.angenin.springcloud.service;

import com.angenin.springcloud.entities.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author ：m
 * @date ：Created in 2022/4/6 15:02
 */
@Component
@FeignClient(value =  "CLOUD-PAYMENT-SERVICE")  //作为feign的接口，找cloud-payment-service
public interface PaymentFeignService {
    //直接复制8001的方法
    @GetMapping("/payment/get/{id}")
    public CommonResult getPaymentByID(@PathVariable("id") Long id);
}
