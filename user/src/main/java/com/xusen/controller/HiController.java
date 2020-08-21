package com.xusen.controller;

import com.xusen.service.UserRibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @Autowired
    private UserRibbonService userRibbonService;

    @GetMapping("/hi")
    public String hi(){
        return userRibbonService.getInfo();
    }
}
