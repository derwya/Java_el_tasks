package com.alex.lesson9.task40;

public class CountingThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            Counter.nextCounter();
        }
    }
}
