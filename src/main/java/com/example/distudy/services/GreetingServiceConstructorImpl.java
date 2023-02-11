package com.example.distudy.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceConstructorImpl implements GreetingService{
    @Override
    public String hello() {
        return "Hello form Constructor!";
    }
}
