package com.alex;

public class TaskFive {
    public static void main(String[] args) {
        String products = "Яблоки, бананы, апельсины, сливы";
        String[] fruitsArr = products.replaceAll("((бананы)|(апельсины)),\\s", "").split(",\\s");
        System.out.print("Фрукты:");
        for (String fruit : fruitsArr) {
            System.out.printf(" %s", fruit.toLowerCase());
        }
        System.out.printf("\n%d", fruitsArr.length);
    }
}
