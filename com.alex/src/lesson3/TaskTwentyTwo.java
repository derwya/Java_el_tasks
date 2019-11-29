package com.alex.lesson3;

public class TaskTwentyTwo {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        bicycle.ride();
        bicycle.seat.up();
        bicycle.seat.down();
        bicycle.steeringWheel.left();
        bicycle.steeringWheel.right();
    }
}

class Bicycle {
    int weight;
    String model;
    SteeringWheel steeringWheel;
    Seat seat;

    public Bicycle() {
        steeringWheel = new SteeringWheel();
        seat = new Seat();
    }

    public Bicycle(int weight) {
        this();
        this.weight = weight;
    }

    public Bicycle(int weight, String model) {
        this(weight);
        this.model = model;
    }

    public void ride() {
        System.out.println("Вужух, велосипед едет!");
    }

    public class SteeringWheel {
        public void left() {
            System.out.println("Вы повернули налево!");
        }

        public void right() {
            System.out.println("Вы повернули направо!");
        }
    }

    public class Seat {
        public void up() {
            System.out.println("Вы подняли кресло выше.");
        }

        public void down() {
            System.out.println("Вы опустили кресло.");
        }
    }
}
