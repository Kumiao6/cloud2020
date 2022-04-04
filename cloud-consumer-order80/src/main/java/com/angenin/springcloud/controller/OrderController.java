package com.angenin.springcloud.controller;

import com.angenin.springcloud.entities.CommonResult;
import com.angenin.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import sun.jvm.hotspot.gc_implementation.parallelScavenge.PSYoungGen;

import javax.annotation.Resource;

/**
 * @author ：m
 * @date ：Created in 2022/4/3 14:22
 */
@RestController
@Slf4j
public class OrderController {

    //        public static final String PAYMENT_URL = "http://localhost:8002";
    public static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";


    @Resource
    @LoadBalanced
    private RestTemplate restTemplate;

    //因为浏览器只支持get请求，为了方便这里就用get
    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment) {
        log.info("********插入的数据：" + payment);
        //postForObject分别有三个参数：请求地址，请求参数，返回的对象类型
        return restTemplate.postForObject(PAYMENT_URL + "/payment/create", payment, CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id) {
        log.info("********查询的id：" + id);
        //getForObject两个参数：请求地址，返回的对象类型
        return restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);

    }


    @GetMapping("/consumer/payment/getEntity/{id}")
    public CommonResult<Payment> getPayment2(@PathVariable("id") Long id){
        log.info("********查询的id：" + id);
        //getForObject两个参数：请求地址，返回的对象类型
//        return restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);
        ResponseEntity<CommonResult> entity = restTemplate.getForEntity(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);

        //getStatusCode获取状态码，is2xxSuccessful如果是状态码是2xx
        if(entity.getStatusCode().is2xxSuccessful()){
            //返回body
            return entity.getBody();
        }else{
            return new CommonResult<>(444, "操作失败");
        }
    }


}


