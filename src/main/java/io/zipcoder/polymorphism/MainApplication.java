package io.zipcoder.polymorphism;
import java.util.*;

public class MainApplication {
    public static Scanner input = new Scanner(System.in);
    public static Integer numOfPets;
    public List<Pet> petList;
    Pet pet = new Pet();
    public static void main(String[] args) {
        start();
    }

    public static void start() {
        Pet pet = new Pet();
        pet.getNumOfPetsPrompt();
        pet.getPetTypePrompt();
        //pet.askPetName();
        pet.outputPet();
    }
//    public void getNumOfPets(){
//        System.out.println("Hello, how many pets do you have?");
//        numOfPets = input.nextInt();
//        pet.setNumOfPets(numOfPets);
//    }
//
//    public void getPetType(){
//        String type = "";
//        for(int i = numOfPets; i > 0; i--){
//            System.out.println("What kind of pet is it? (Please enter Dog, Cat, or Bird)");
//            type = input.nextLine();
//            if(type.equalsIgnoreCase("dog") || type.equalsIgnoreCase("cat") || type.equalsIgnoreCase("bird")){
//                pet.setPetType(type);
//            }
//        }
//    }




}
