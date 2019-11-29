//package com.alex.lesson3;
//
//import java.util.Objects;
//
//public class TaskFourteen {
//    public static void main(String[] args) {
//        Dog dog = new Dog();
//        Dog dog2 = new Dog("Rex", 8, "Red", "Corgi");
//
//        System.out.println(dog2.getAge());
//
//        System.out.println(dog2.getBreed());
//        dog2.setBreed("Shepherd dog");
//        System.out.println(dog2.getBreed());
//
//        System.out.println(dog.equals(dog2));
//
//        System.out.println(dog2.toString());
//    }
//}
//
//class Dog {
//    private String name,
//            breed = "homeless",
//            color = "grey";
//    private int age = 6;
//
//    public Dog() {}
//
//    public Dog(String name) {
//        this.name = name;
//    }
//
//    public Dog(String name, int age) {
//        this(name);
//        if (age <= 0) throw new IllegalArgumentException("Age must be a positive number");
//        else this.age = age;
//    }
//
//    public Dog(String name, int age, String color) {
//        this(name, age);
//        this.color = color;
//    }
//
//    public Dog(String name, int age, String color, String breed) {
//        this(name, age, color);
//        this.breed = breed;
//    }
//
//    public int getAge() {
//        return this.age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getName() {
//        return this.name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getBreed() {
//        return this.breed;
//    }
//
//    public void setBreed(String breed) {
//        this.breed = breed;
//    }
//
//    public String getColor() {
//        return this.name;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    @Override
//    public boolean equals(Object object) {
//        if (this == object) return true;
//        if (object == null || getClass() != object.getClass()) return false;
//        Dog dog = (Dog) object;
//        return age == dog.age &&
//                Objects.equals(name, dog.name) &&
//                Objects.equals(breed, dog.breed) &&
//                Objects.equals(color, dog.color);
//    }
//
//    @Override
//    public String toString() {
//        return "Dog {\n" +
//                "\tname: '" + name + "',\n" +
//                "\tbreed: '" + breed + "\',\n" +
//                "\tcolor: '" + color + "\',\n" +
//                "\tage: " + age +
//                "\n}";
//    }
//}