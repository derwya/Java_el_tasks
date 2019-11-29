package com.alex.lesson3;

import java.util.Scanner;

public class TaskSeventeen {
    public static void main(String[] args) {

        System.out.println("String: ");
        String string = ConsoleReader.readString();
        System.out.println(string);

        System.out.println("Integer: ");
        int num = ConsoleReader.readInt();
        System.out.println(num);

        System.out.println("Double: ");
        double num2 = ConsoleReader.readDouble();
        System.out.println(num2);

        System.out.println("\"Enter\": ");
        ConsoleReader.readLn();
    }
}

class ConsoleReader {
    public static String readString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static int readInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static double readDouble() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public static void readLn() {
        readString();
    }
}