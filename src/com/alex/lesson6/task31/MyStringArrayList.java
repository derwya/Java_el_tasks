package com.alex.lesson6.task31;

public class MyStringArrayList implements List<String> {
    private String[] array;

    public MyStringArrayList() {
        this.array = new String[1];
    }

    @Override
    public void add(String el) {
        grow();
        this.array[array.length-2] = el;
    }

    @Override
    public void set(int index, String el) {
        if(index == this.array.length) {
            add(el);
        }

        if(index < 0 || index > this.array.length) throw new ArrayIndexOutOfBoundsException();

        String[] arraysClone = this.array.clone();
        this.array = new String[this.array.length + 1];
        for(int i = 0, j = 0; i < arraysClone.length; i++, j++) {
            if(i == index) {
                this.array[j] = el;
                j++;
            }
            this.array[j] = arraysClone[i];
        }
    }

    @Override
    public String remove(int index) {
        if(index < 0 || index > this.array.length-1) throw new ArrayIndexOutOfBoundsException();
        String[] arraysClone = this.array.clone();
        this.array = new String[this.array.length-1];
        String res = "";
        for(int i = 0, j = 0; i < arraysClone.length; i++, j++) {
            if(i == index) {
                j--;
                res = arraysClone[i];
                continue;
            }
            this.array[j] = arraysClone[i];
        }
        return res;
    }


    @Override
    public String get(int index) {
        if(index < 0 || index > this.array.length-1) throw new ArrayIndexOutOfBoundsException();
        return this.array[index];
    }

    @Override
    public void printArr() {
        StringBuilder res = new StringBuilder("[ ");
        for(String st : this.array) {
            if (st == null) {
                res.replace(res.length()-2, res.length(), " ");
                break;
            }
            res.append(st).append(", ");
        }
        res.append("]");
        System.out.println(res);
    }

    private void grow() {
        String[] arraysClone = this.array.clone();
        this.array = new String[this.array.length + 1];
        for(int i = 0; i < arraysClone.length; i++) {
            this.array[i] = arraysClone[i];
        }
    }

    public int size() {
        return this.array.length-1;
    }

}
