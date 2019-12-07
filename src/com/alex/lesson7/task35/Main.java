package com.alex.lesson7.task35;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Animal> set1 = createCats();
        System.out.println("---------------------");
        printPets(set1);
        System.out.println("---------------------");
        Set<Animal> set2 = createDogs();
        System.out.println("---------------------");
        printPets(set2);
        System.out.println("---------------------");
        Set<Animal> set3 = join(set1, set2);
        System.out.println("---------------------");
        printPets(set3);
        System.out.println("---------------------");
        Set<Animal> set4 = removeCats(set3);
        System.out.println("---------------------");
        printPets(set4);
        System.out.println("---------------------");
    }


    public static Set<Animal> removeCats(Set<Animal> set) {
        Set<Animal> setClone = Set.copyOf(set);
        setClone.forEach(animal -> {
            if(animal instanceof Cat) set.remove(animal);
        });
        return set;
    }

     public static void printPets(Set<Animal> set) {
        set.forEach(animal -> System.out.println(animal.toString()));
    }

    public static Set<Animal> createCats() {
        Set<Animal> set = new HashSet<>();
        for (int i = 0; i < 4; i++) {
            set.add(new Cat());
        }
        return set;
    }

    public static Set<Animal> createDogs() {
        Set<Animal> set = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            set.add(new Dog());
        }
        return set;
    }

    public static Set<Animal> join(Set<Animal> set1, Set<Animal> set2) {
        set1.addAll(set2);
        return set1;
    }


    public static class Cat extends Animal {
        public Cat() {}

        @Override
        public String toString() {
            return "Cat: " + this.hashCode();
        }
    }

    public static class Dog extends Animal {
        public Dog() {}

        @Override
        public String toString() {
            return "Dog: " + this.hashCode();
        }
    }
}
