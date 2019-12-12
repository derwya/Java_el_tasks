package com.alex.lesson8.task37;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            copy();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void copy() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter path to file:");
        String pathToFile = reader.readLine();
        if (pathToFile.equals("exit")) return;
        try (FileInputStream fileInputStream = new FileInputStream(pathToFile)) {
            System.out.println("Enter path to copy:");
            String newPathToFile = reader.readLine();
            FileOutputStream fileOutputStream = createNewFileOutputStream(newPathToFile);
            if(fileOutputStream == null) copy();
            else fileOutputStream.write(fileInputStream.readAllBytes());
        } catch (IOException e) {
            System.out.println("File does not exist.");
            copy();
        }
    }

    public static FileOutputStream createNewFileOutputStream(String path) {
        try {
            File file = new File(path);
            return new FileOutputStream(file);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

}