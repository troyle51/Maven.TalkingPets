package io.zipcoder.polymorphism;

public class Dog extends Pet{

    public Dog(String name, String breed, Integer id, Integer age) {
        super(name, breed, id, age);
    }

    public String speak() {
        return "Bark!";
    }
}
