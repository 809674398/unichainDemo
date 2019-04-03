package com.unichain.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Hello world!
 *
 */
@EnableFeignClients(basePackages = "com.unichain.demo.controller.web.feign")
@EnableEurekaClient
@SpringBootApplication
public class DemoApplication {
    public static void main( String[] args )
    {
        SpringApplication.run(DemoApplication.class, args);
    }
}
