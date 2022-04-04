package com.angenin.springcloud.server;


import com.angenin.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

/**
 * @author ：m
 * @date ：Created in 2022/4/2 21:13
 */
@Service
public interface PaymentService {

    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);

}




