package com.example.distudy.controllers;

import com.example.distudy.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectControllerTest {

    PropertyInjectController propertyInjectController;

    @BeforeEach
    void setUp() {
        propertyInjectController = new PropertyInjectController();
        propertyInjectController.greetingService = new GreetingServiceImpl();
    }

    @Test
    void getGreating() {
        System.out.println(propertyInjectController.getGreating());
    }
}