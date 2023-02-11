package com.example.distudy.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceSetterImpl implements GreetingService {

    @Override
    public String hello() {
        return "Hello form Setter!";
    }
}
