package com.juniordevmind.whatisbean.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juniordevmind.whatisbean.models.Person;
import com.juniordevmind.whatisbean.utils.GreetingUtil;

@RestController
public class PersonController {

    @Autowired
    private Person _person;

    @Autowired
    private GreetingUtil _greetingUtil;
    
    @GetMapping("/try")
    public String tryAutowired() {
        _person.doIntro();
        _person.showOffCar();
        return "tried!";
    }

    @GetMapping("/greet")
    public String greet() {
        return _greetingUtil.greet();
    }
}
