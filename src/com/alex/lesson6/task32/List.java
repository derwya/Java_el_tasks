package com.alex.lesson6.task32;

public interface List<E> {

    void add(E el);

    void set(int index, E el);

    E remove(int index);

    E get(int index);

    void printArr();
}


