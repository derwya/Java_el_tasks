package com.alex.lesson4.task25;

import java.util.List;

public abstract class Worker {

    protected int workHours;
    protected List<String> tasksList;

    public Worker() {
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        workHours = workHours;
    }

    public List<String> getTasksList() {
        return tasksList;
    }

    public void addTask(String task) {
        tasksList.add(task);
    }

    public void removeTask(String task) {
        tasksList.remove(task);
    }

    public void resetTasksList() {
        tasksList.clear();
    }

    @Override
    abstract public String toString();
}
