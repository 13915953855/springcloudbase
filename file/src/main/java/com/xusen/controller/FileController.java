package com.xusen.controller;

import com.xusen.feign.FileFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FileController {

    @Autowired
    private FileFeignService fileFeignService;

    @RequestMapping("/feignInfo")
    public String file(){
        return "这是来自Feign的消息："+fileFeignService.getInfo();
    }
}
