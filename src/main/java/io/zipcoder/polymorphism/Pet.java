package io.zipcoder.polymorphism;

public class Pet {
    private String name;
    private String breed;
    private int age;
    private int id;

    public Pet(String name, String breed, Integer id, Integer age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.id = id;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getBreed() { return breed; }

    public void setBreed(String breed) { this.breed = breed; }

    public Integer getAge() { return age; }
    public Integer getId() { return id; }



}


