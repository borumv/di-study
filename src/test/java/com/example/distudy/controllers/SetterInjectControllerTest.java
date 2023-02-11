package com.example.distudy.controllers;

import com.example.distudy.services.GreetingServicePropertyImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectControllerTest {

    SetterInjectController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectController();
        controller.setGreetingService(new GreetingServicePropertyImpl());
    }
    @Test
    void setGreetingService() {
        System.out.println(controller.getGreating());
    }
}