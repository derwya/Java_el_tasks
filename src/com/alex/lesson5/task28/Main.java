package com.alex.lesson5.task28;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Choose kind of action:\n 1 - read user`s info\n 2 - write user information");
        int act = Integer.parseInt(reader.readLine());
        switch (act){
            case 1:
                System.out.println("Enter user name:");
                String username = reader.readLine();
                try {
                    FileInputStream fileInputStream = new FileInputStream("/home/alex/database/" + username +  ".txt");
                    System.out.println(new String(fileInputStream.readAllBytes()));
                } catch (Exception error) {
                    if (error instanceof FileNotFoundException) {
                        System.out.println("Cannot find this user.");
                    } else throw error;
                }
                break;
            case 2:
                System.out.println("Enter user name:");
                String username2 = reader.readLine();
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream("/home/alex/database" + username2 + ".txt");
                    fileOutputStream.write(getNewUser(username2).getBytes());
                } catch (Exception error) {
                    if(error instanceof FileNotFoundException) {
                        File file = new File("/home/alex/" + username2 + ".txt");
                        FileOutputStream fileOutputStream = new FileOutputStream("/home/alex/" + username2 + ".txt");
                        fileOutputStream.write(getNewUser(username2).getBytes());
                    }
                }

                break;
            default:
                throw new IllegalArgumentException("Number must be < 3");
        }

    }

    private static String getNewUser(String username) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter user`s age:");
        int age = Integer.parseInt(reader.readLine());
        System.out.println("Enter user`s country:");
        String country = reader.readLine();
        System.out.println("Enter user`s city/town:");
        String city = reader.readLine();
        return "name: " + username + ",\n" + "age: " + age + ",\n" + "country: " + country + ",\n" + "city/town: " + city;
    }
}
