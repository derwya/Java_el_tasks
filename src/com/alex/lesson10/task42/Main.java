package com.alex.lesson10.task42;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        random.ints(10, 0, 100).forEach(el -> list.add(el));

        System.out.println(list.toString());
    }
}
