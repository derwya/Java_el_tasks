package com.alex;

public class TaskEight {
    public static void main(String[] args) {
        Cat cat = new Cat(5, "red", "Vilyamsa 24b");
        System.out.printf("%s, %s, %s, %.2f, %.2f", cat.name, cat.address, cat.color, cat.age, cat.weight);
    }
}

class Cat {
    String name, address, color = "black";
    double age = 6, weight = 4;

    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, double weight, double age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public Cat(String name, double age) {
        this.name = name;
        this.age = age;
    }

    public Cat(double weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public Cat(double weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
    }
}