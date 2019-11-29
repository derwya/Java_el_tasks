package com.alex;

import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your text:");
        String text = scanner.nextLine();
        String newText = text.replaceAll("[0-9]", "*");
        System.out.println(newText);
    }
}
