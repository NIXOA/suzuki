package com.suzuki.feign.feign;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author yekai
 * @Date 2018/7/19 15:41
 */
@Component
public class HelloFeignProviderHystrix implements HelloFeignService {

    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "Hello World!";
    }

}
