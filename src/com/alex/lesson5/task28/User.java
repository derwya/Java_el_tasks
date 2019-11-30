package com.alex.lesson5.task28;

public class User {
    private String name, country, city;
    private int age;

    private User() {}

    public User(String name, int age, String country, String city) {
        this.name = name;
        this.country = country;
        this.city = city;
        this.age = age;
    }

    @Override
    public String toString() {
        return "name: " + name + ",\n" + "age: " + age + ",\n" + "country: " + country + ",\n" + "city/town: " + city;
    }
}
