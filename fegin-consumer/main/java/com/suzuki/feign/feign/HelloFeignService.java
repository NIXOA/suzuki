package com.suzuki.feign.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author yekai
 * @Date 2018/7/19 15:42
 */
@FeignClient(name = "producer", fallback = HelloFeignProviderHystrix.class)
public interface HelloFeignService {

    /**
     * @param name
     * @return
     */
    @GetMapping("/hello/")
    String hello(@RequestParam(value = "name") String name);
}
