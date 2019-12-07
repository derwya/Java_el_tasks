package com.alex.lesson7.task33;

import java.util.Date;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Date> people = new HashMap<>();
        people.put("Ivanov", new Date(1057968000000L));
        people.put("Petrov", new Date(1060646400000L));
        people.put("Sidorov", new Date(1063324800000L));
        people.put("Vasyutin", new Date(1065916800000L));
        people.put("Orlov", new Date(1068595200000L));
        people.put("Popov", new Date(1071187200000L));
        people.put("Pyatochkin", new Date(1055376000000L));
        people.put("Verbitsky", new Date(1052697600000L));
        people.put("Sazhin", new Date(1050105600000L));
        people.put("Aripov", new Date(1047427200000L));
        people.put("FantasiaZakonchilas`", new Date(1045008000000L));

        people.forEach((k, v) -> System.out.println(k + ": " + v));

        System.out.println("__________________________________________________________");
        HashMap<String, Date> peopleClone = (HashMap<String, Date>) people.clone();
        peopleClone.forEach((k, v) -> {
            if(v.getMonth() > 5 && v.getMonth() < 9) people.remove(k);
        });


        people.forEach((k, v) -> System.out.println(k + ": " + v));


    }
}
