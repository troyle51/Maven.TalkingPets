package io.zipcoder.polymorphism;

public class Bird extends Pet{

    public Bird(String name, String breed, Integer id, Integer age) {
        super(name, breed, id, age);
    }
    public String speak(){
        return "Chirp!";
    }
}
