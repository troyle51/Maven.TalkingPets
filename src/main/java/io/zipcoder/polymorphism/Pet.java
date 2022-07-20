package io.zipcoder.polymorphism;

import java.util.*;

public class Pet {
    private String name;
    private String petType;
    private int age;
    private int id;
    private List<String> petList = new ArrayList<String>();
    private List<String> petKind = new ArrayList<String>();
    //private Map<String, String> petList = new HashMap<String, String>();
    private int numOfPets;
    public Scanner input = new Scanner(System.in);

    public Pet(){

    }

    public Pet(String name) {
        this.name = name;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getPetType() { return petType; }
    public void setPetType(String petType) { this.petType = petType; }
    public Integer getAge() { return age; }
    public Integer getId() { return id; }
    public Integer getNumOfPets() { return numOfPets; }
    public void setNumOfPets(Integer numOfPets) { this.numOfPets = numOfPets; }


    public String petSpeaks(String speak){
        if(speak.equalsIgnoreCase("dog")){
            Dog dog = new Dog(getName());
            speak = dog.speak();
        }
        if(speak.equalsIgnoreCase("cat")){
            Cat cat = new Cat(getName());
            speak = cat.speak();
        }
        if(speak.equalsIgnoreCase("bird")){
            Bird bird = new Bird(getName());
            speak = bird.speak();
        }
        return speak;
    }
    public void getNumOfPetsPrompt(){
        System.out.println("Hello, how many pets do you have?");
        numOfPets = input.nextInt();
        setNumOfPets(numOfPets);
    }

    public void getPetTypePrompt(){
        String type = "";
        for(int i = 0; i < numOfPets; i++){
            System.out.println("What kind of pet is it? (Please enter Dog, Cat, or Bird)");
            type = input.next();
            if(type.equalsIgnoreCase("dog") || type.equalsIgnoreCase("cat") || type.equalsIgnoreCase("bird")){
                setPetType(type);
                askPetName();
                petList.add(getName());
                petKind.add(getPetType());
            }
        }
    }

    public void askPetName(){
        System.out.println("What is your " + petType + " name?");
        setName(input.next());
    }

    public void outputPet(){
        System.out.println("You have " + numOfPets + " of Pet(s)");
        for(int i = 0; i < numOfPets; i++){
            System.out.println(petKind.get(i) + " named: " + petList.get(i));
            String speak = petKind.get(i);
            System.out.println( petList.get(i) + " speaks: " + petSpeaks(speak));
        }
//        System.out.println("You have " + numOfPets + " of Pet(s)");
//        System.out.println("Pet: " + petType);
//        System.out.println(petType + " name is: " + getName());
//        System.out.println(getName() + " speaks: " + petSpeaks());
    }


}


