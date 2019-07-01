package com.wjf.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication(scanBasePackages = {"com.wjf"})
@EnableEurekaClient
@EnableDiscoveryClient
@ComponentScan(basePackages = "com.wjf")
@EnableFeignClients(basePackages = {"com.wjf"})
public class UserModuleApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserModuleApplication.class, args);
    }

}
