package com.atguigu.springcloud;

import com.atguigu.myrule.MySelfRole;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author boyuxin
 * @description
 * @date 2020/4/9 22:44
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "cloud-provider-service" , configuration = MySelfRole.class)
public class OrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class, args);
    }
}
