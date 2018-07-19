package com.suzuki.feign.controller;

import com.suzuki.feign.feign.HelloFeignService;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Author yekai
 * @Date 2018/7/19 15:40
 */
@CommonsLog
@RequestMapping("/hello")
@RestController
public class HelloController {

    @Autowired
    HelloFeignService helloRemote;

    @GetMapping("/{name}")
    public String index(@PathVariable("name") String name)  {
        log.info("the name is " + name);
        return helloRemote.hello(name) + "\n" + new Date().toString();
    }

}