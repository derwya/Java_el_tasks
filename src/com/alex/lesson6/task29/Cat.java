package com.alex.lesson6.task29;

public class Cat {
    private String name, color;
    private int age;
    private double weight;

    public Cat() {}

    public Cat(String name, String color, int age, double weight) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Cat " + name + " {\n" +
                "name: '" + name + "',\n" +
                "color: '" + color + "',\n" +
                "age: " + age +",\n" +
                "weight: " + weight + "\n" +
                '}';
    }
}
