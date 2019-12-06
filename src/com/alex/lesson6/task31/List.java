package com.alex.lesson6.task31;

public interface List<E> {
    void add();
    void set(int index, E el);
    void remove(int index);
    E get(int index);
}
