package com.alex;

public class TaskNine {
    public static void main(String[] args) {
        Circle circle = new Circle(3, 4, 5, 10, "red");
        System.out.printf("%.2f, %.2f, %.2f, %.2f, %s", circle.centerX, circle.centerY, circle.radius, circle.width, circle.color);
    }
}

class Circle {
    double centerX, centerY, radius = 1, width = 2;
    String color = "white";
    // public Circle() {}

    public Circle(double centerX, double centerY, double radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    public Circle(double centerX, double centerY, double radius, double width) {
        this(centerX, centerY, radius);
        this.width = width;
    }

    public Circle(double centerX, double centerY, double radius, double width, String color) {
        this(centerX, centerY, radius, width);
        this.color = color;
    }

}