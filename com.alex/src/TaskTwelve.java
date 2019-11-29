package com.alex;


public class TaskTwelve {
    public static void main(String[] args) {
        Cat2 cat = new Cat2("Vasya");
        Cat2 cat1 = new Cat2("Vasya", 10);
        Cat2 cat2 = new Cat2("Vasya", 10, 5);
        Cat2 cat3 = new Cat2(5, "blue");
        Cat2 cat4 = new Cat2(5, "blue", "Vilyamsa 24b");
        Cat2 cat5 = new Cat2("Zhora");
        System.out.print(Cat2.catCount);
    }
}

class Cat2 {
    String name, address, color = "black";
    double age = 6, weight = 4;
    public static int catCount = 0;

    public Cat2(String name) {
        this.name = name;
        catCount++;
    }

    public Cat2(String name, double age) {
        this(name);
        this.age = age;
    }

    public Cat2(String name, double weight, double age) {
        this(name, age);
        this.weight = weight;
    }

    public Cat2(double weight, String color) {
        this.weight = weight;
        this.color = color;
        catCount++;
    }

    public Cat2(double weight, String color, String address) {
        this(weight, color);
        this.address = address;
    }

    public void finalize() throws Throwable {
        System.out.println("Object was destroyed");
        catCount--;
        super.finalize();
    }
}