package com.alex;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(factorial(scanner.nextInt()));
    }

    private static int factorial(int num) {
        if (num == 1 || num == 0) return 1;
        num *= factorial(--num);
        return num;
    }
}
