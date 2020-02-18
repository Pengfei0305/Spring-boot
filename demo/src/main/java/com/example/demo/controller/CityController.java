package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityController {

    @GetMapping("/hello")
    public String test(){
        return "hello";
    }

    @GetMapping("/feignHello")
    public String feignHello(){
        return "hello";
    }

}
