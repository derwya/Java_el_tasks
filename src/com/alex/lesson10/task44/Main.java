package com.alex.lesson10.task44;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<String, String> reverse = str -> {
            String[] strings = str.split("");
            String[] newStr = new String[strings.length];
            for (int i = 0; i < strings.length; i++) {
                newStr[strings.length-i-1] = strings[i];
            }
            StringBuilder res = new StringBuilder();
            for(String s: newStr) {
                res.append(s);
            }

            return res.toString();
        };

        System.out.println(reverse.apply("Привет"));
    }
}
