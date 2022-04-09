package com.angenin.springcloud.server.impl;

import com.angenin.springcloud.Dao.PaymentDao;
import com.angenin.springcloud.entities.Payment;
import com.angenin.springcloud.server.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author ：m
 * @date ：Created in 2022/4/2 21:14
 */
@Service
public class PaymentServiceIpml implements PaymentService {

    @Resource   //@Autowired也可以
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id){
        return paymentDao.getPaymentById(id);
    }

}




