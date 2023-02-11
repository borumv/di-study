package com.example.distudy.controllers;

import com.example.distudy.services.GreetingService;

public class ConstructorInjectController {
    GreetingService greetingService;

    public ConstructorInjectController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreating(){
        return greetingService.hello();
    }
}

