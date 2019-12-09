package com.alex.lesson8.task36;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Method main beginning");
        methodOne();
        System.out.println(Arrays.toString(Thread.currentThread().getStackTrace()));
        System.out.println("Method main ending");
    }

    public static void methodOne() {
        System.out.println("Method one beginning");
        methodTwo();
        System.out.println(Arrays.toString(Thread.currentThread().getStackTrace()));
        System.out.println("Method one ending");
    }

    public static void methodTwo() {
        System.out.println("Method two beginning");
        methodThree();
        System.out.println(Arrays.toString(Thread.currentThread().getStackTrace()));
        System.out.println("Method two ending");
    }

    public static void methodThree() {
        System.out.println("Method three beginning");
        methodFour();
        System.out.println(Arrays.toString(Thread.currentThread().getStackTrace()));
        System.out.println("Method three ending");
    }

    public static void methodFour() {
        System.out.println("Method four beginning");
        methodFive();
        System.out.println(Arrays.toString(Thread.currentThread().getStackTrace()));
        System.out.println("Method four ending");
    }

    public static void methodFive() {
        System.out.println("Method five beginning");
        System.out.println(Arrays.toString(Thread.currentThread().getStackTrace()));
        System.out.println("Method five ending");
    }
}
