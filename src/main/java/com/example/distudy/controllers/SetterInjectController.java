package com.example.distudy.controllers;

import com.example.distudy.services.GreetingService;

public class SetterInjectController {
    GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String getGreating(){
        return greetingService.hello();
    }
}
