package com.example.distudy.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("internalizationService")
@Profile("EN")
public class GreetingServiceInternalizationEn implements GreetingService{
    @Override
    public String hello() {
        return "Hello - EN";
    }
}

