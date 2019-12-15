package com.alex.lesson9.task40;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
    private static AtomicInteger counter = new AtomicInteger(0);

    public static int getCounter() {
        return counter.get();
    }

    public static void nextCounter() {
         counter.incrementAndGet();
    }
}
