package com.xusen.feign;

import org.springframework.stereotype.Service;

@Service
public class FileFeignServiceFallback implements FileFeignService {
    @Override
    public String getInfo() {
        return "网络繁忙，请稍后再试";
    }
}
