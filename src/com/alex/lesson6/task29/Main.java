package com.alex.lesson6.task29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Cat> catsList = new ArrayList<>();
        while (true) {
            System.out.println("Enter cat`s name to add new cat or empty string to stop:");
            String name = reader.readLine();
            if(name.equals("")) break;
            System.out.println("Enter cat`s color:");
            String color = reader.readLine();
            System.out.println("Enter cat`s age:");
            int age = Integer.parseInt(reader.readLine());
            if(age < 0) throw new IllegalArgumentException("Age cannot be a negative number.");
            System.out.println("Enter cat`s weight:");
            double weight = Double.parseDouble(reader.readLine());
            if(weight < 0) throw new IllegalArgumentException("Weight cannot be a negative number.");
            Cat cat = new Cat(name, color, age, weight);
            catsList.add(cat);
        }

        catsList.forEach((cat -> System.out.println(cat.toString())));
    }
}
