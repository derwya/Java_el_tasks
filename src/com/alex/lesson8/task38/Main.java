package com.alex.lesson8.task38;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        ArrayList<String> arrayList = new ArrayList<>();
        while (true) {
            input = reader.readLine();
            if(!input.equals("stop")) arrayList.add(input);
            else break;
        }
        newSort(arrayList).forEach(System.out::println);
    }

    public static ArrayList<String> newSort(ArrayList<String> arrayList) {
        ArrayList<String> strings = new ArrayList<>();
        ArrayList<String> numbers = new ArrayList<>();
        arrayList.forEach(el -> {
            try {
                double aDouble = Double.parseDouble(el);
                numbers.add(Double.toString(aDouble));
            } catch (NumberFormatException e) {
                strings.add(el);
            }
        });
        strings.sort(String::compareTo);
        numbers.sort((integer, anotherInteger) -> -1 * integer.compareTo(anotherInteger));
        ArrayList<String> newArrayList = new ArrayList<>();
        newArrayList.addAll(strings);
        newArrayList.addAll(numbers);
        return newArrayList;
    }
}
