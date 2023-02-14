package com.example.distudy.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class GreetingServicePrimary implements GreetingService{
    @Override
    public String hello() {
        return "Hello from primary!";
    }
}
