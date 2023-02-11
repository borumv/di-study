package com.example.distudy;

import com.example.distudy.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ap = SpringApplication.run(Application.class, args);
		MyController myController = (MyController) ap.getBean("myController");
		myController.sayHello();
	}

}
