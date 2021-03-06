package com.angenin.springcloud.controller;

import com.angenin.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author ：m
 * @date ：Created in 2022/4/6 18:03
 */
@Slf4j
@RestController
public class PaymentController {

    @Resource
    PaymentService paymentService;

    @Value("${server.port}")    //spring的@Value注解
    private String ServerPort;

    @GetMapping("/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id) {
        String result = paymentService.paymentInfo_OK(id);
        log.info("******result：" + result);
        return result;
    }

    @GetMapping("/payment/hystrix/timeout/{id}")
    public String paymentInfo_TimeOut(Integer id) {
        String result = paymentService.paymentInfo_TimeOut(id);
        log.info("******result：" + result);
        return result;
    }

    /*    @GetMapping("/payment/circuit/{id}")
        public String paymentCircuitBreaker(@PathVariable("id") Integer id){
            String result = paymentService.paymentCircuitBreaker(id);
            log.info("******result：" + result);
            return result;
        }*/
    @GetMapping("/payment/circuit/{id}")
    public String paymentCircuitBreaker(@PathVariable("id") Integer id) {
        String result = paymentService.paymentCircuitBreaker(id);
        log.info("****result : " + result);
        return result;
    }
}

