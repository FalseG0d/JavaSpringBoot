package com.example.FirstProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstProjectApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(FirstProjectApplication.class, args);

		Alien a = (Alien) context.getBean(Alien.class);

//		a.setAId(2);
//		a.setAName("Umang");
//		a.setATech("Python");
//		a.setLaptop(context.getBean(Laptop.class));
//
//		System.out.println(a.getAId() + a.getAName() + a.getATech() + a.getLaptop());

		a.show();
	}

}
