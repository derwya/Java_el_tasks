package com.alex.lesson3;

public class TaskFifteen {
    public static void main(String[] args) {
        Cat tomCat = new Cat("Tom", 58, "grey-and-white");
        Cat butchCat = new Cat("Butch", 60, "black-and-white");
        Mouse taffyMouse = new Mouse("Taffy", 5, "grey");
        Mouse jerryMouse = new Mouse("Jerry", 8, "red");
        Dog spikeDog = new Dog("Spike", "Bulldog", "big");
        Dog tykeDog = new Dog("Tyke", "Bulldog", "small");
    }
}

class Cat {
    private static final String DEFAULT_COLOR = "red";
    private static final int DEFAULT_HEIGHT = 40;
    String name, color = DEFAULT_COLOR;
    int height = DEFAULT_HEIGHT;

    public Cat() {
    }

    ;

    public Cat(String name) {
        this.name = name;
    }

    ;

    public Cat(String name, int height) {
        this(name);
        if (height <= 0) throw new IllegalArgumentException("Height must be a positive number");
        else this.height = height;
    }

    ;

    public Cat(String name, int height, String color) {
        this(name, height);
        this.color = color;
    }

    ;
}

class Dog {
    private static final String DEFAULT_BREED = "homeless";
    private String name, breed = DEFAULT_BREED, size;

    public Dog() {
    }

    ;

    public Dog(String name) {
        this.name = name;
    }

    ;

    public Dog(String name, String breed) {
        this(name);
        this.breed = breed;
    }

    ;

    public Dog(String name, String breed, String size) {
        this(name, breed);
        this.size = size;
    }

    ;
}

class Mouse {
    private static final String DEFAULT_COLOR = "grey";
    private static final int DEFAULT_HEIGHT = 8;
    String name, color = DEFAULT_COLOR;
    int height = DEFAULT_HEIGHT;

    public Mouse() {
    }

    ;

    public Mouse(String name) {
        this.name = name;
    }

    ;

    public Mouse(String name, int height) {
        this(name);
        if (height <= 0) throw new IllegalArgumentException("Height must be a positive number");
        else this.height = height;
    }

    ;

    public Mouse(String name, int height, String color) {
        this(name, height);
        this.color = color;
    }

    ;
}