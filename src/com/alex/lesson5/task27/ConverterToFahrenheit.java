package com.alex.lesson5.task27;

public class ConverterToFahrenheit implements Converter {

    public static double convert(double num) {
        return ((num - 32) * 5/9);
    }
}
