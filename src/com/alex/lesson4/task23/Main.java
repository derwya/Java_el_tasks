package com.alex.lesson4.task23;

public class Main {
    public static void main(String[] args) {

        Plane plane = new Plane(100, 300, 3, "Boing-737", "Standard");

        System.out.println("________________________");

        System.out.println(plane.getPilotsCount());
        plane.addPilots(2);
        System.out.println(plane.getPilotsCount());
        plane.startMoving();
        System.out.println(plane.isMoving());
        System.out.println(plane.flyingHeight());
        plane.stopMoving();
        System.out.println(plane.flyingHeight());

        System.out.println("________________________");

        Train train = new Train(10, 194, 150, "night-express");
        System.out.println(train.getWagonsWithPassengers().toString());
        train.startMoving();
        train.stopMoving();
        System.out.println(train.isMoving());
        System.out.println(train.getWagonsWithPassengers().size());

        System.out.println("________________________");
    }
}
