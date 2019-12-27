package com.alex.lesson10.task45;


public class Main {
    public static void main(String[] args) {
        Format<Object> format = el -> System.out.println("Строка элемента: " + el.toString());
        testFormat(format, 100);
        testFormat(format, "qwerty");
        testFormat(format, 22.01);
        testFormat(format, new String[]{"test", "test", "test"});

    }

    public static <T> void testFormat(Format<Object> format, T el) {
        format.format(el);
    }
}
