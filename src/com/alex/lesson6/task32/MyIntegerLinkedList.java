package com.alex.lesson6.task32;

public class MyIntegerLinkedList implements List<Integer> {
    private MyIntegerLinkedList.Node head;
    private MyIntegerLinkedList.Node tail;

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
    }

    @Override
    public Integer remove(int index) {
        if(index == 0) {
            Integer res = tail.el;
            tail = tail.next;
            tail.prev = null;
            return res;
        } else {
            MyIntegerLinkedList.Node node = tail;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
            node.prev.next = node.next;
            node.next.prev = node.prev;
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
        StringBuilder res = new StringBuilder("] ");
        MyIntegerLinkedList.Node node = head;
        if(node.el == null) System.out.println("null");
        res.append(node.el).append(" ,");
        while (node.prev != null) {
            res.append(node.prev.el).append(" ,");
            node = node.prev;
        }
        res.replace(res.length()-2, res.length(), " ").append("[");
        res.reverse();
        System.out.println(res);
    }

    public int size() {
        MyIntegerLinkedList.Node node = head;
        int i = 0;
        while (node != null) {
            node = node.prev;
            i++;
        }
        return i;
    }

    private static class Node {
        MyIntegerLinkedList.Node prev = null;
        MyIntegerLinkedList.Node next = null;
        Integer el = null;

        private Node(MyIntegerLinkedList.Node prev, Integer el, MyIntegerLinkedList.Node next) {
            this.prev = prev;
            this.el = el;
            this.next = next;
        }
    }
}
