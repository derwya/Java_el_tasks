package com.alex.lesson9.task41;

import java.util.concurrent.Callable;

public class MyCallableTwo implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int result = 1;
        for(int i = 0; i < 1000; i++) {
            result++;
            Thread.sleep(10);
        }
        return result;
    }

}
