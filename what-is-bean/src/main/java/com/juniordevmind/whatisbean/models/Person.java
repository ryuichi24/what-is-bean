package com.juniordevmind.whatisbean.models;

public class Person {
    private String name;
    private int age;
    private Car car;

    public void doIntro() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old. It is very nice to see you.");
    }

    public void showOffCar() {
        System.out.println("I have a very nice car named " + this.car.getName() + " and it even costs " + this.car.getPrice() + ".");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
