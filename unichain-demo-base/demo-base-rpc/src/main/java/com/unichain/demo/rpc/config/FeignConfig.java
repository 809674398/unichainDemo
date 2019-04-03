package com.unichain.demo.rpc.config;


import feign.Contract;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.support.SpringMvcContract;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @program: FeignConfig
 * @description: TODO
 * @author: Chonzi.xiao
 * @create: 2019-04-01 09:21
 **/
@Configuration
public class FeignConfig {

    @LoadBalanced
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder.build();
    }

    @Bean
    public Contract feignContract(){
        return new SpringMvcContract();
    }
}
