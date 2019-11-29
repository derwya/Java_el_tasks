package com.alex.lesson3;

public class TaskSixteen {
    public static void main(String[] args) {
        System.out.println(Util.getDistance(13, 3, 1, 8));
    }
}

class Util {
    public static double getDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
    }
}