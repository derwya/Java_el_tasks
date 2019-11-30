package com.alex;

import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String email;
        while (true) {
            System.out.println("Enter email:");
            email = scanner.next().toLowerCase();
            if (email.equals("stop")) break;
            if (email.matches("\\A[a-z0-9]+@[a-z]+\\.[a-z]+\\z")) System.out.println("\nEmail exists\n");
            else System.out.println("\nEmail does not exist\n");
        }
    }
}
