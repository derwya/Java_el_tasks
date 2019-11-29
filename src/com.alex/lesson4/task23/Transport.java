package com.alex.lesson4.task23;

public class Transport {
    int speed, passengersCount;
    String model;
    protected boolean moving = false;

    public Transport() {
    }

    public Transport(int passengersCount) {
        this.passengersCount = passengersCount;
    }

    public Transport(int passengersCount, int speed) {
        this(passengersCount);
        this.speed = speed;
    }

    public Transport(int passengersCount, int speed, String model) {
        this(passengersCount, speed);
        this.model = model;
    }

    public boolean isMoving() {
        return moving;
    }

    public void startMoving() {
        System.out.println("Start moving");
        this.moving = true;
    }

    ;

    public void stopMoving() {
        System.out.println("Stop moving");
        this.moving = false;
    }
}
