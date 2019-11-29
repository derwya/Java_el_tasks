package com.alex.lesson4.task25;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            workerInformation();
        }
    }

    public static void workerInformation() {
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextLine().toLowerCase()) {
            case "designer":
                System.out.println(new Designer().toString());
                break;
            case "developer":
                System.out.println(new Developer().toString());
                break;
            case "manager":
                System.out.println(new Manager().toString());
                break;
            case "tester":
                System.out.println(new Tester().toString());
                break;
            case "system administrator":
                System.out.println(new SystemAdministrator().toString());
                break;
            default:
                System.out.println("Cannot find this employee's position");
        }
    }
}
