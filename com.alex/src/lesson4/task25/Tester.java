package com.alex.lesson4.task25;

import java.util.Arrays;
import java.util.List;

public final class Tester extends Worker {

    private static int WORK_HOURS = 5;
    private static List<String> TASKS_LIST = Arrays.asList("testing", "bugs finding", "user`s opinion making");

    int workHours = WORK_HOURS;
    List<String> tasksList = TASKS_LIST;

    public Tester() {
    }

    @Override
    public String toString() {
        return ("Tasks list: " + tasksList.toString().replaceAll("[\\[\\]]", "") + ";\nWork hours: " + workHours);
    }

}
