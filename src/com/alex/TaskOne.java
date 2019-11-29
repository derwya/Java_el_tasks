package com.alex;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        output(scanner.nextInt());
    }

    private static void output(int num) {
        System.out.println(num);
        if (num != 1) output(--num);
    }
}
