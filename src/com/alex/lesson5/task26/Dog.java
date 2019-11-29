package com.alex.lesson5.task26;

public class Dog extends Animal implements Runnable {

    @Override
    public void run() {
        System.out.println("Dog is running...");
    }
}
