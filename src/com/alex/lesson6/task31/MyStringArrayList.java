package com.alex.lesson6.task31;

public class MyStringArrayList implements List<String> {
    private String[] array;
    private int size = 0;

    public MyStringArrayList() {
        this.array = new String[10];
    }

    @Override
    public void add(String el) {
        if (el == null) throw new IllegalArgumentException("element must be not null");
        if (this.size + 1 >= array.length / 2) grow();
        this.array[size] = el;
        ++this.size;
    }

    @Override
    public void set(int index, String el) {
        if (el == null) throw new IllegalArgumentException("element must be not null");
        if (this.size + 1 >= array.length / 2) grow();
        if (index == this.size) {
            add(el);
        }

        if (index < 0 || index > this.array.length) throw new ArrayIndexOutOfBoundsException();

        String[] arraysClone = this.array.clone();
        this.array = new String[arraysClone.length];
        for (int i = 0, j = 0; i < size; i++, j++) {
            if (i == index) {
                this.array[j] = el;
                j++;
            }
            this.array[j] = arraysClone[i];
        }
        ++this.size;

    }

    @Override
    public String remove(int index) {
        if (index < 0 || index > this.array.length - 1) throw new ArrayIndexOutOfBoundsException();
        String[] arraysClone = this.array.clone();
        this.array = new String[arraysClone.length];
        String res = "";
        for (int i = 0, j = 0; i < arraysClone.length; i++, j++) {
            if (i == index) {
                j--;
                res = arraysClone[i];
                continue;
            }
            this.array[j] = arraysClone[i];
        }
        --this.size;
        return res;
    }


    @Override
    public String get(int index) {
        if (index < 0 || index > this.size) throw new ArrayIndexOutOfBoundsException();
        return this.array[index];
    }

    @Override
    public void printArr() {
        StringBuilder res = new StringBuilder("[ ");
        for (String st : this.array) {
            if (st == null) {
                res.replace(res.length() - 2, res.length(), " ");
                break;
            }
            res.append(st).append(", ");
        }
        res.append("]");
        System.out.println(res);
    }

    private void grow() {
        String[] arraysClone = this.array.clone();
        this.array = new String[(int) (arraysClone.length * 1.5)];
        for (int i = 0; i < size; i++) {
            this.array[i] = arraysClone[i];
        }
    }

    public int size() {
        return this.size;
    }

}
