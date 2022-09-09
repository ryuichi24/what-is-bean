package com.juniordevmind.whatisbean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.juniordevmind.whatisbean.models.Person;

@SpringBootApplication
public class WhatIsBeanApplication {

	public static void main(String[] args) {
		// SpringApplication.run(WhatIsBeanApplication.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Person person1 = context.getBean(Person.class);
		person1.doIntro();
		person1.showOffCar();
	}

}
