package com.example.MyWebApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyWebAppApplication {

	public static void main(String[] args) {

		SpringApplication.run(MyWebAppApplication.class, args);

		System.out.println("Home");
	}

}
