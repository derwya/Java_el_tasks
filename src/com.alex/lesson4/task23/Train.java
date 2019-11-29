package com.alex.lesson4.task23;

import java.util.ArrayList;

public class Train extends Transport {
    public Train() {
    }

    int wagonsCount;
    private ArrayList<Integer> wagonsWithPassengers = new ArrayList<>();

    public Train(int wagonsCount) {
        this.wagonsCount = wagonsCount;
    }

    public ArrayList<Integer> getWagonsWithPassengers() {
        return wagonsWithPassengers;
    }

    public Train(int wagonsCount, int passengersCount) {
        super(passengersCount);
        if (passengersCount / 20 > wagonsCount) throw new IllegalArgumentException("Too many passengers");
        this.wagonsCount = wagonsCount;
        wagonsFilling(wagonsCount, passengersCount);
    }

    public Train(int wagonsCount, int passengersCount, int speed) {
        super(passengersCount, speed);
        if (passengersCount / 20 > wagonsCount) throw new IllegalArgumentException("Too many passengers");
        this.wagonsCount = wagonsCount;
        wagonsFilling(wagonsCount, passengersCount);
    }

    public Train(int wagonsCount, int passengersCount, int speed, String model) {
        super(passengersCount, speed, model);
        if (passengersCount / 20 > wagonsCount) throw new IllegalArgumentException("Too many passengers");
        this.wagonsCount = wagonsCount;
        wagonsFilling(wagonsCount, passengersCount);
    }


    private void wagonsFilling(int wagonsCount, int passengersCount) {
        for (int i = 0; i < passengersCount / 20; i++) {
            wagonsWithPassengers.add(20);
        }
        wagonsWithPassengers.add(passengersCount % 20);
        for (int l = 0; l < wagonsWithPassengers.size() - wagonsCount; l++) {
            wagonsWithPassengers.add(0);
        }
    }
}
