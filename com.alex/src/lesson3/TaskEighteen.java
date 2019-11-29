package com.alex.lesson3;

public class TaskEighteen {
    public static void main(String[] args) {
        String s1 = StringHelper.multiply("One");
        String s2 = StringHelper.multiply("Two", 10);
        System.out.printf("One: \"%s\", \nTwo: \"%s\"", s1, s2);
    }
}

class StringHelper {
    public static String multiply(String s) {
        return String.valueOf(s).repeat(5);
    }

    public static String multiply(String s, int count) {
        return String.valueOf(s).repeat(count);
    }
}