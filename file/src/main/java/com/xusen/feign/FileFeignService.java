package com.xusen.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "eureka-client",fallback = FileFeignServiceFallback.class)
public interface FileFeignService {

    @RequestMapping("/info")
    String getInfo();
}
