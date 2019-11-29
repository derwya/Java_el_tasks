package com.alex;

public class TaskEleven {
    public static void main(String[] args) {
        for (long i = 0; i < 1000000000; i++) {
            Cat cat = new Cat(i + "");
            //System.out.println(cat.name);
        }
    }
}

class Cat1 {
    String name, address, color = "black";
    double age = 6, weight = 4;

    public Cat1(String name) {
        this.name = name;
    }

    public Cat1(String name, double weight, double age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public Cat1(String name, double age) {
        this.name = name;
        this.age = age;
    }

    public Cat1(double weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public Cat1(double weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
    }

    public void finalize() throws Throwable {
        System.out.println("Object was destroyed");
        super.finalize();
    }
}