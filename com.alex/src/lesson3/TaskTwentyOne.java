package com.alex.lesson3;

public class TaskTwentyOne {
    public static void main(String[] args) {
        Godzilla godzilla = new Godzilla(100);
        godzilla.feedGodzilla(20);
        godzilla.feedGodzilla(38);
        godzilla.feedGodzilla(100);
    }
}

class Godzilla {
    private double defaultStomachSize;
    private double stomachSize;

    protected Godzilla() {
    }

    public Godzilla(double defaultStomachSize) {
        this.defaultStomachSize = defaultStomachSize;
        this.stomachSize = this.defaultStomachSize;
    }

    public void feedGodzilla(double mealSize) {
        double completely = 0;
        double maxMealSize = defaultStomachSize * 0.9 - (defaultStomachSize - stomachSize);
        double restMeal;
        if (mealSize > maxMealSize) {
            stomachSize -= maxMealSize;
            restMeal = mealSize - maxMealSize;
            System.out.printf("Rest meal size: %.2f\n", restMeal);
        } else {
            stomachSize -= mealSize;
        }
        completely = (defaultStomachSize - stomachSize) / defaultStomachSize * 100;
        System.out.printf("Stomach is %.2f full...\n", completely);
        if (completely == 90) System.out.println("Godzilla is fed up!");
    }
}