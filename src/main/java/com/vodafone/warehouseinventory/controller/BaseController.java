package com.vodafone.warehouseinventory.controller;

import com.vodafone.warehouseinventory.service.RestClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/the-shop")
public class BaseController {

    @Autowired
    private RestClientService service;

    @GetMapping("/configuration")
    public ResponseEntity<Integer> configure() {

        String uri = "http://localhost:8081/device-configuration-service/configure";
        RestTemplate restTemplate = new RestTemplate();
        Integer temperature = restTemplate.getForObject(uri, Integer.class);
        return new ResponseEntity<>(temperature, HttpStatus.OK);
    }

}
