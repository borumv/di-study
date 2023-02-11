package com.example.distudy.controllers;

import com.example.distudy.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectControllerTest {

    ConstructorInjectController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectController(new GreetingServiceImpl());
    }

    @Test
    void getGreating() {
        System.out.println(controller.getGreating());
    }
}