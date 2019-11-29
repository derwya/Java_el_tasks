package com.alex.lesson4.task25;

import java.util.Arrays;
import java.util.List;

public final class Developer extends Worker {
    private static int WORK_HOURS = 8;
    private static List<String> TASKS_LIST = Arrays.asList("programming", "converting caffeine to code", "understanding customer assignment");

    int workHours = WORK_HOURS;
    List<String> tasksList = TASKS_LIST;

    public Developer() {
    }

    @Override
    public String toString() {
        return ("Tasks list: " + tasksList.toString().replaceAll("[\\[\\]]", "") + ";\nWork hours: " + workHours);
    }

}
