package com.alex.lesson5.task26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        getAnimal(reader.readLine());
    }

    public static Animal getAnimal(String animalName) {
        Animal animal;
        switch (animalName.toLowerCase()) {
            case "cat":
                animal = new Cat();
                break;
            case "dog":
                animal = new Dog();
                break;
            case "duck":
                animal = new Duck();
                break;
            case "tiger":
                animal = new Tiger();
                break;
            default:
                throw new IllegalArgumentException("Unknown animal.");
        }
        if(animal instanceof Runnable) ((Runnable) animal).run();
        if(animal instanceof Climbable) ((Climbable) animal).climb();
        if(animal instanceof Flyable) ((Flyable) animal).fly();
        return animal;
    }
}
