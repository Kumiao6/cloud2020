package com.angenin.springcloud.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author ：m
 * @date ：Created in 2022/4/2 21:09
 */
@Data   //set/get方法
@AllArgsConstructor //有参构造器
@NoArgsConstructor  //无参构造器
public class Payment implements Serializable {
    private long id;
    private String serial;
}



