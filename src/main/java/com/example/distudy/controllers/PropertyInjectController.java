package com.example.distudy.controllers;

import com.example.distudy.services.GreetingService;

public class PropertyInjectController {

    GreetingService greetingService;

    public String getGreating(){
        return greetingService.hello();
    }
}
