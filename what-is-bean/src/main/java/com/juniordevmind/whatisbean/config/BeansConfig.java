package com.juniordevmind.whatisbean.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.juniordevmind.whatisbean.models.Car;
import com.juniordevmind.whatisbean.models.Person;

@Configuration
public class BeansConfig {

    @Bean
    public Person person() {
        Person person = new Person();
        person.setName("john");
        person.setAge(25);
        person.setCar(new Car("Toyota", 2500));
        return person;
    }

}
