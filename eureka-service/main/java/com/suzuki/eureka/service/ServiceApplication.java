package com.suzuki.eureka.service;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author yekai
 * @Date 2018/7/11 13:24
 */
@EnableEurekaServer
@SpringBootApplication
public class ServiceApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ServiceApplication.class).web(true).run(args);
    }
}
