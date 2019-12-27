package com.alex.lesson10.task43;

public class Car {
    public static String[] BODY_TYPE =  {"City car", "Supermini", "Hatchbacks", "Mini-MPV", "MPV", "Sedan", "Estate", "Coupe", "Crossover","SUV", "SUV-Coupe", "4x4", "Cabriolet", "Roadster", "Grand Tourer"};
    public static String[] BRANDS = {"Toyota", "Kia", "Hyundai", "Honda", "Lexus", "BMW", "Mercedes-Benz", "Opel", "Lamborghini", "Tesla"};

    private String body, brand;

    public String getBody() {
        return body;
    }

    public String getBrand() {
        return brand;
    }

    public int getWeight() {
        return weight;
    }

    private int weight;

    public Car() {

    }

    public Car(String body) {
        this.body = body;
    }

    public Car(String body, int weight) {
        this.body = body;
        this.weight = weight;
    }

    public Car(String body, String brand, int weight) {
        this.body = body;
        this.brand = brand;
        this.weight = weight;
    }


    @Override
    public String toString() {
        return "Car {" +
                "body:'" + body + '\'' +
                ", brand:'" + brand + '\'' +
                ", weight:" + weight +
                "}\n";
    }

}
