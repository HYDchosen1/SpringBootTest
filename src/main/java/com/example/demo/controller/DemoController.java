package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huyd
 * @date 2019/4/2
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping("/hello")
    public String helloWorld(){
        return "hello world";
    }

}
