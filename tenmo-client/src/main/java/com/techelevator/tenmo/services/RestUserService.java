package com.techelevator.tenmo.services;

import com.techelevator.tenmo.model.User;
import org.springframework.web.client.RestTemplate;


public class RestUserService implements UserService{

    RestTemplate restTemplate = new RestTemplate();

    @Override
    public User getUser(){
        String url = "http://localhost:8080/user";
        return this.restTemplate.getForObject(url, User.class);
    }
}