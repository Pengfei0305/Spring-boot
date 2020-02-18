package com.example.fems.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

//FOR LOCAL DEV
@FeignClient(value = "city-crud", url="http://localhost:8081/")

//@FeignClient(name = "${clients.authors.name}")
public interface CityClient {

    @GetMapping("/hello")
        String hello();

}
