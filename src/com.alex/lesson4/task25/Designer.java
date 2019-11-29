package com.alex.lesson4.task25;

import java.util.Arrays;
import java.util.List;

public class Designer extends Worker {
    private static int WORK_HOURS = 7;
    private static List<String> TASKS_LIST = Arrays.asList("models making", "sketching", "animation");

    int workHours = WORK_HOURS;
    List<String> tasksList = TASKS_LIST;

    public Designer() {
    }

    @Override
    public String toString() {
        return ("Tasks list: " + tasksList.toString().replaceAll("[\\[\\]]", "") + ";\nWork hours: " + workHours);
    }
}
