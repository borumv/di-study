package com.example.distudy.controllers;

import com.example.distudy.services.GreetingServicePropertyImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectControllerTest {

    ConstructorInjectController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectController(new GreetingServicePropertyImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreating());
    }
}