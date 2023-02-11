package com.example.distudy.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServicePropertyImpl implements GreetingService {
    @Override
    public String hello() {
        return "Hello form Property!";
    }
}
