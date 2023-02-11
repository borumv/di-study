package com.example.distudy;

import com.example.distudy.controllers.ConstructorInjectController;
import com.example.distudy.controllers.MyController;
import com.example.distudy.controllers.PropertyInjectController;
import com.example.distudy.controllers.SetterInjectController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ap = SpringApplication.run(Application.class, args);
		MyController myController = (MyController) ap.getBean("myController");
		myController.sayHello();

		PropertyInjectController propertyInjectController = (PropertyInjectController) ap.getBean("propertyInjectController");
		System.out.println("----Property Inject");
		System.out.println(propertyInjectController.getGreating());

		SetterInjectController setterInjectController = (SetterInjectController) ap.getBean("setterInjectController");
		System.out.println("----Setter Inject");
		System.out.println(setterInjectController.getGreating());

		ConstructorInjectController constructorInjectController = (ConstructorInjectController) ap.getBean("constructorInjectController");
		System.out.println("----Constructor Inject");
		System.out.println(propertyInjectController.getGreating());
	}

}
