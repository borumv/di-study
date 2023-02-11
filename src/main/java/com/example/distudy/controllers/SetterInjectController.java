package com.example.distudy.controllers;

import com.example.distudy.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectController {
    GreetingService greetingService;

    @Qualifier("greetingServiceSetterImpl")
    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String getGreating(){
        return greetingService.hello();
    }
}
