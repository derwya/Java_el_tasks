package com.alex.lesson5.task26;

public class Tiger extends Animal implements Climbable, Runnable {
    @Override
    public void climb() {
        System.out.println("Tiger is climbing...");
    }

    @Override
    public void run() {
        System.out.println("Tiger is running...");
    }
}
