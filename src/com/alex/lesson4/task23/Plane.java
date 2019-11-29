package com.alex.lesson4.task23;

public class Plane extends Transport {

    protected int pilotsCount = 0;

    public String wingsModel;

    public int getPilotsCount() {
        return pilotsCount;
    }

    public void addPilots(int pilotsCount) {
        this.pilotsCount += pilotsCount;
    }

    public int flyingHeight() {
        return moving ? 15000 : 0;
    }

    protected Plane() {
    }

    public Plane(int passengersCount) {
        super(passengersCount);
    }

    public Plane(int passengersCount, int speed) {
        super(passengersCount, speed);
    }

    public Plane(int passengersCount, int speed, int pilotsCount) {
        super(passengersCount, speed);
        this.pilotsCount = pilotsCount;
    }

    public Plane(int passengersCount, int speed, int pilotsCount, String model) {
        super(passengersCount, speed, model);
        this.pilotsCount = pilotsCount;
    }

    public Plane(int passengersCount, int speed, int pilotsCount, String model, String wingsModel) {
        this(passengersCount, speed, pilotsCount, model);
        this.wingsModel = wingsModel;
    }

    @Override
    public void startMoving() {
        if (pilotsCount >= 2) super.startMoving();
        else System.out.println("There must be 2 or more pilots in plane");
    }
}
