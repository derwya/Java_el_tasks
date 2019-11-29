//package com.alex.lesson3;
//
//public class TaskThirteen {
//    public static void main(String[] args) {
//        Cat cat1 = new Cat();
//        Cat cat2 = new Cat(5, 5, 10);
//
//        System.out.println(cat1.fight(cat2));
//        System.out.println(cat2.fight(cat1));
//
//        //---------------------------------------
//        Cat cat2Clone = new Cat(5, 5, 10);
//        System.out.println(cat2.fight(cat2Clone));
//        System.out.println(cat2Clone.fight(cat2));
//        //---------------------------------------
//        //Кто первый напал, тот и выиграл
//    }
//}
//
//
//
//class Cat {
//    int weight = 4,
//            age = 8,
//            strength = 5;
//
//    public Cat() {}
//
//    public Cat(int age) {
//        if (age <= 0) throw new IllegalArgumentException("Age must be a positive number");
//        else this.age = age;
//    }
//    public Cat(int age, int weight) {
//        this(age);
//        if (weight <= 0) throw new IllegalArgumentException("Weight must be a positive number");
//        else this.weight = weight;
//    }
//    public Cat(int age, int weight, int strength) {
//        this(age, weight);
//        if (strength <= 0) throw new IllegalArgumentException("Strength must be a positive number");
//        else this.strength = strength;
//    }
//
//    public boolean fight(Cat cat) {
//        int thisCatScores = this.age + this.weight/2 * this.strength;
//        int anotherCatScores = cat.age + cat.weight/2 * cat.strength;
//        if (thisCatScores < anotherCatScores) return false;
//        else return true;
//    }
//
//}