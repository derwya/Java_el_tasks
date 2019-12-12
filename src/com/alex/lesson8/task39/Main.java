package com.alex.lesson8.task39;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            Date date = new SimpleDateFormat("dd/MM/yyyy").parse(reader.readLine());
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM dd, yyyy");
            System.out.println(simpleDateFormat.format(date).toUpperCase());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
