package io.zipcoder.polymorphism;
import java.util.*;

public class MainApplication {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, how many pets do you have?");
        int numOfPets = input.nextInt();

        System.out.println("What kind of pet is it?");
        String petType = input.next();

        System.out.println("What are your pet's names?");
        String petName = input.next();

        System.out.println("You have " + numOfPets + " pet. " + "Your pet is a " + petType + ". " + "Hello, " + petName + "!");
    }


}
