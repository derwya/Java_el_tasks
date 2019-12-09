package com.alex.lesson6.task31;


public class Main {
    public static void main(String[] args) {
        MyStringArrayList myStringArrayList = new MyStringArrayList();
        System.out.println("------------------------------");
        myStringArrayList.add("some");
        myStringArrayList.add("words");
        myStringArrayList.add("for2");
        System.out.println(myStringArrayList.size());
        System.out.println("------------------------------");
        myStringArrayList.add("test");
        myStringArrayList.printArr();
        System.out.println(myStringArrayList.get(3));
        System.out.println(myStringArrayList.get(2));
        System.out.println("------------------------------");
        myStringArrayList.set(2, "for1");
        myStringArrayList.printArr();
        System.out.println(myStringArrayList.size());
        System.out.println("------------------------------");
        myStringArrayList.remove(2);
        myStringArrayList.printArr();
        System.out.println(myStringArrayList.size());
        System.out.println("------------------------------");
        myStringArrayList.add("words");
        myStringArrayList.add("words");
        myStringArrayList.add("words");
        myStringArrayList.add("words");
        myStringArrayList.add("words");
        myStringArrayList.add("words");
        myStringArrayList.add("words");
        myStringArrayList.set(5, "some text");
        myStringArrayList.printArr();
        System.out.println(myStringArrayList.size());
        System.out.println("------------------------------");

    }
}
