package com.alex;

public class TaskSeven {
    public static void main(String[] args) {
        Friend friend1 = new Friend("John");
        System.out.printf("%s\n", friend1.name);
        Friend friend2 = new Friend("John", 16);
        System.out.printf("%s, %d\n", friend2.name, friend2.age);
        Friend friend3 = new Friend("John", 16, "male");
        System.out.printf("%s, %d, %s\n", friend3.name, friend3.age, friend3.gender);
    }
}

class Friend {
    String name, gender;
    int age;
    // public Friend() {}

    public Friend(String name) {
        this.name = name;
    }

    public Friend(String name, int age) {
        this(name);
        this.age = age;
    }

    public Friend(String name, int age, String gender) {
        this(name, age);
        if (!gender.equals("male") && !gender.equals("female")) throw new IllegalArgumentException("Unknown gender");
        else this.gender = gender;
    }
}