package com.alex.lesson10.task43;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            cars.add(new Car(Car.BODY_TYPE[random.nextInt(Car.BODY_TYPE.length-1)], Car.BRANDS[random.nextInt(Car.BRANDS.length-1)],  1000 + random.nextInt(10000)));
        }

        Predicate<Car> isBodySedanAndWeightTwoThousand = car -> car.getBody().equals("Sedan") && car.getWeight() >= 2000;
        ArrayList<Car> sedans = new ArrayList<>();
        cars.forEach(car -> {
            if(isBodySedanAndWeightTwoThousand.test(car)) sedans.add(car);
        });

        System.out.println(sedans);
   }
}
