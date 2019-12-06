package com.alex.lesson6.task30;

public class Product {

    private String name;
    private double priceForItem;
    private int count = 0;

    private Product() {}

    public Product(String name, double priceForItem) {
        this.name = name;
        this.priceForItem = priceForItem;
    }

    public Product(String name, double priceForItem, int count) {
        this.name = name;
        this.priceForItem = priceForItem;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public double getPriceForItem() {
        return priceForItem;
    }

    public void setPriceForItem(double priceForItem) {
        this.priceForItem = priceForItem;
    }

    public int getCount() {
        return count;
    }

    public void addCount(int count) {
        this.count += count;
    }

    public void removeCount(int count) {
        if(this.count < count) throw new IllegalArgumentException("We don`t have enough items to sell! We have only " + this.count + " items");
        this.count -= count;
    }
}

