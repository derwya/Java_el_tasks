package com.alex.lesson7.task34;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String city, surname;
        HashMap<String, String> cities = new HashMap<>();

        while (true) {
            System.out.println("Enter your city to start or empty string to stop:");
            city = reader.readLine();
            if(city.equals("")) break;
            System.out.println("Enter your surname:");
            surname = reader.readLine();
            cities.put(city, surname);
        }

        while (true) {
            System.out.println("Enter your city to search or empty string to stop:");
            city = reader.readLine();
            if(city.equals("")) break;
            String res = cities.get(city);
            if(res == null) System.out.println("Cannot find this city");
            else System.out.println(res);
        }
    }
}
