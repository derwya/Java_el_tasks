package com.alex.lesson6.task32;

public class MyIntegerLinkedList implements List<Integer> {
    private MyIntegerLinkedList.Node head;
    private MyIntegerLinkedList.Node tail;
    private int size = 0;

    public MyIntegerLinkedList() {
        this.head = new MyIntegerLinkedList.Node(null, null, null);
    }

    @Override
    public void add(Integer el) {
        if(head.el == null) {
            head.el = el;
            tail = head;
        }
        else {
            MyIntegerLinkedList.Node node = new Node(head, el, null);
            head.next = node;
            head = node;
        }
        ++this.size;
    }

    @Override
    public void set(int index, Integer el) {
        MyIntegerLinkedList.Node node = tail;
        for(int i = 0; i < index-1; i++) {
            node = node.next;
        }
        MyIntegerLinkedList.Node prev = node;
        MyIntegerLinkedList.Node next = node.next;
        MyIntegerLinkedList.Node newNode = new Node(prev, el, next);
        prev.next = newNode;
        next.prev = newNode;
        ++this.size;
    }

    @Override
    public Integer remove(int index) {
        if(index == 0) {
            Integer res = tail.el;
            tail = tail.next;
            tail.prev = null;
            --this.size;
            return res;
        } else {
            MyIntegerLinkedList.Node node = tail;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
            node.prev.next = node.next;
            node.next.prev = node.prev;
            --this.size;
            return node.el;
        }
    }

    @Override
    public Integer get(int index) {
        MyIntegerLinkedList.Node node = tail;
        for(int i = 0; i < index; i++) {
            node = node.next;
        }
        return node.el;
    }

    @Override
    public void printArr() {
        StringBuilder res = new StringBuilder("[ ");
        MyIntegerLinkedList.Node node = tail;
        if(node.el == null) System.out.println("null");
        res.append(node.el).append(", ");
        while (node.next != null) {
            res.append(node.next.el).append(", ");
            node = node.next;
        }
        res.replace(res.length()-2, res.length(), " ").append("]");
        System.out.println(res);
    }

    public int size() {
        return this.size;
    }

    private static class Node {
        MyIntegerLinkedList.Node prev;
        MyIntegerLinkedList.Node next;
        Integer el;

        private Node(MyIntegerLinkedList.Node prev, Integer el, MyIntegerLinkedList.Node next) {
            this.prev = prev;
            this.el = el;
            this.next = next;
        }
    }
}
