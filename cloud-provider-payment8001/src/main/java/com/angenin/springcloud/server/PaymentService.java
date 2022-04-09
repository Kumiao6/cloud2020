package com.angenin.springcloud.server;

import com.angenin.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author ：m
 * @date ：Created in 2022/4/2 21:13
 */
public interface PaymentService {

    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);

}





