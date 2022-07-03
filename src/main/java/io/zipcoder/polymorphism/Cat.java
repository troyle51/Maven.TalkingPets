package io.zipcoder.polymorphism;

public class Cat extends Pet{

    public Cat(String name, String breed, Integer id, Integer age) {
        super(name, breed, id, age);
    }

    public String speak() {
        return "Meow!";
    }
}
