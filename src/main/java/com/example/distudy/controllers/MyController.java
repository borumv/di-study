package com.example.distudy.controllers;


import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello(){
        System.out.println("Hello!");
        return "That's all";
    }
}
