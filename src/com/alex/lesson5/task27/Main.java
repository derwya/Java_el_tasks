package com.alex.lesson5.task27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        convertCelsius();
    }

    public static void convertCelsius() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter degrees celsius:");
        double num = Double.parseDouble(reader.readLine());
        System.out.println("Enter system to convert:\n1 - fahrenheit\n2 - kelvin");
        int system = Integer.parseInt(reader.readLine());
        System.out.println("Result is:");
        switch (system) {
            case 1:
                System.out.println(ConverterToFahrenheit.convert(num));
            break;

            case 2:
                System.out.println(ConverterToKelvin.convert(num));
                break;
            default:
                throw new IllegalArgumentException("Number must be < 3");
        }
    }
}
