package com.alex;

import java.util.Locale;

public class TaskThree {
    public static void main(String[] args) {
        if (args.length != 3) throw new Error("There must be 3 arguments");
        if (!args[0].matches("\\A[0-9]+(.[0.9]+)?\\z") || !args[2].matches("\\A[0-9]+(.[0.9]+)?\\z"))
            throw new Error("First and third arguments must be numbers");
        double firstArg = Double.parseDouble(args[0]);
        double secondArg = Double.parseDouble(args[2]);
        double result;
        switch (args[1]) {
            case "+":
                result = firstArg + secondArg;
                break;
            case "-":
                result = firstArg - secondArg;
                break;
            case "/":
                result = firstArg / secondArg;
                break;
            case "*":
                result = firstArg * secondArg;
                break;
            case "%":
                result = firstArg % secondArg;
                break;
            default:
                throw new Error("Can`t understand operation");
        }
        System.out.printf(Locale.FRENCH, "%.2f %s %.2f = %.2f", firstArg, args[1], secondArg, result);
    }
}
