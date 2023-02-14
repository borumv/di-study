package com.example.distudy.controllers;

import com.example.distudy.services.GreetingServicePropertyImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectControllerTest {

    PropertyInjectController propertyInjectController;

    @BeforeEach
    void setUp() {
        propertyInjectController = new PropertyInjectController();
        propertyInjectController.greetingService = new GreetingServicePropertyImpl();
    }

    @Test
    void getGreeting() {
        System.out.println(propertyInjectController.getGreating());
    }
}