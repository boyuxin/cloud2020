package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author boyuxin
 * @description
 * @date 2020/4/12 14:56
 */
@Configuration
public class MySelfRole {

    @Bean
    public IRule myRule(){
        //  随机 
        return new RandomRule();
    }

}
