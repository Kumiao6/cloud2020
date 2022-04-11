package com.angenin.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.angenin.springcloud.entities.CommonResult;
import jdk.nashorn.internal.objects.Global;

/**
 * @author ：m
 * @date ：Created in 2022/4/11 00:49
 */
public class CustomerBlockHandler {
    public static CommonResult handlerException(BlockException exception) {
        return  new CommonResult(444,"按照客户自定义限流测试，Glogal handlerException ---- 1");
    }

    public static CommonResult handlerException2(BlockException exception) {
        return  new CommonResult(444,"按照客户自定义限流测试，Glogal handlerException ---- 2");
    }

}
