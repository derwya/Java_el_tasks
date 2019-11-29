package com.alex.lesson5.task26;

public class Duck extends Animal implements Flyable {

    @Override
    public void fly() {
        System.out.println("Duck is flying...");
    }

}
