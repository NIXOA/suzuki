package com.suzuki.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author yekai
 * @Date 2018/7/19 15:40
 */
@EnableFeignClients
@SpringBootApplication
public class HelloConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloConsumerApplication.class, args);
    }
}
