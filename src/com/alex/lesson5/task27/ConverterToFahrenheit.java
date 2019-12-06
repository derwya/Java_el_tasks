package com.alex.lesson5.task27;

public class ConverterToFahrenheit implements Converter {

    public double convert(double num) {
        return ((num * 9/5) + 32);
    }
}
