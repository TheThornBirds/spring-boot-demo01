package com.feit.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 25679 on 2018/9/5.
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello spring-你好";
    }

}
