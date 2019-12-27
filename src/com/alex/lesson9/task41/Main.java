package com.alex.lesson9.task41;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        MyCallableOne task1 = new MyCallableOne();
        MyCallableTwo task2 = new MyCallableTwo();
        Future<Integer> future = executor.submit(task1);
        Future<Integer> future1 = executor.submit(task2);
        while(!future.isDone()) {
            System.out.println("Ещё не готово...");
            Thread.sleep(3000);
        }
        System.out.println(future.get());
        List<Callable<Integer>> tasks = new ArrayList<>();
        for(int i = 0; i < 3; i++) {
            tasks.add(new MyCallableOne());
        }


        List<Future<Integer>> futures = executor.invokeAll(tasks);

        System.out.println(future1.get());
    }

}
