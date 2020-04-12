package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author boyuxin
 * @description
 * @date 2020/4/12 21:48
 */
@Component
public class MyLbImpl implements MyLb {

    private AtomicInteger atomicInteger = new AtomicInteger(0);


    @Override
    public ServiceInstance instanse(List<ServiceInstance> serviceInstances) {
        return null;

    }
}
