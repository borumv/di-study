package com.example.distudy.controllers;

import com.example.distudy.services.GreetingService;
import org.springframework.stereotype.Controller;


@Controller
public class ConstructorInjectController {
    GreetingService greetingService;

    public ConstructorInjectController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreating(){
        return greetingService.hello();
    }
}

