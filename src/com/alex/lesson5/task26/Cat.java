package com.alex.lesson5.task26;

public class Cat extends Animal implements Climbable, Runnable {
    @Override
    public void climb() {
        System.out.println("Cat is climbing...");
    }

    @Override
    public void run() {
        System.out.println("Cat is running...");
    }
}
