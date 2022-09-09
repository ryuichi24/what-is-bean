package com.juniordevmind.whatisbean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.juniordevmind.whatisbean.models.Person;

@SpringBootApplication
public class WhatIsBeanApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(WhatIsBeanApplication.class, args);
		Person person1 = context.getBean(Person.class);
		person1.doIntro();
		person1.showOffCar();
	}

}
