package com.example.distudy.controllers;

import com.example.distudy.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;

@Controller
public class InternalizationController {

    GreetingService greetingService;

    public InternalizationController(@Qualifier("internalizationService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreating(){
        return greetingService.hello();
    }
}
