package com.suzuki.client.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author yekai
 * @Date 2018/7/12 19:06
 */
@RestController
public class HelloController {
    private final Logger logger=LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "hello",method = RequestMethod.GET)
    public String index(){
        logger.info(String.valueOf(client.getServices()));
        return "helloWorld";
    }

}
