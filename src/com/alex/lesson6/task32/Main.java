package com.alex.lesson6.task32;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        MyIntegerLinkedList myIntegerLinkedList = new MyIntegerLinkedList();
        myIntegerLinkedList.add(4);
        myIntegerLinkedList.add(5);
        myIntegerLinkedList.add(6);
        myIntegerLinkedList.add(6);
        myIntegerLinkedList.add(6);
        myIntegerLinkedList.set(3, 5);
        myIntegerLinkedList.remove(0);
        myIntegerLinkedList.printArr();
        System.out.println(myIntegerLinkedList.size());
        myIntegerLinkedList.set(3, 4);
        myIntegerLinkedList.printArr();
        System.out.println(myIntegerLinkedList.get(3));
        System.out.println(myIntegerLinkedList.size());
    }

}
