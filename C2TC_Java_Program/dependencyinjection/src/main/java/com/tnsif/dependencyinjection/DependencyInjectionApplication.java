package com.tnsif.dependencyinjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext var = SpringAppliccation.run(DependencyInjection.class, args);
		
		customer c1 =var.getBean(customer1.class);
		c1.show();
		
		customer c2 =var.getBean(customer2.class);
		c2.show();
		
		Customer C3 =var.getBean(Customer3.class);
		C3.show();
		
	}
}