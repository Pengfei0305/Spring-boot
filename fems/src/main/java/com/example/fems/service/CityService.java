package com.example.fems.service;

import com.example.fems.feign.CityClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService {

    private CityClient cityClient;

    @Autowired
    public CityService(CityClient cityClient){
        this.cityClient = cityClient;
    }

    public String feignHello(){
        return cityClient.hello();
    }

}
