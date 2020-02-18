package com.example.fems.controller;


import com.example.fems.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class FemsController {

    private CityService cityService;

    @Autowired
    FemsController(CityService cityService){
        this.cityService = cityService;
    }

    //restful
    @GetMapping("/hello")
    public String hello(){
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject("http://localhost:8081/hello",String.class);
        System.out.println(response);
        return response;
    }

    //feign
    @GetMapping("/feignHello")
    public String feignHello(){
        String response = cityService.feignHello();
        System.out.println(response);
        return response;
    }

}
