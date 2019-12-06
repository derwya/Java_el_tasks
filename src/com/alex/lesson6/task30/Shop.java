package com.alex.lesson6.task30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;

public class Shop {

    private ArrayList<Product> productList = new ArrayList<>(3);

    private Shop() {
    }


    public Shop(Product product1, Product product2, Product product3) {
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);

    }


    public Shop(Collection ListOfProduct) {
        if (ListOfProduct.size() != 3) throw new IllegalArgumentException("There must be 3 products.");
        productList.addAll(ListOfProduct);
    }

    public void addProduct(String name, int count) {
        productList.get(getIndex(name)).addCount(count);
    }

    public void addProducts(String name1, int count1, String name2, int count2) {
        productList.get(getIndex(name1)).addCount(count1);
        productList.get(getIndex(name2)).addCount(count2);
    }

    public void addProducts(int count1, int count2, int count3) {
        productList.get(0).addCount(count1);
        productList.get(1).addCount(count2);
        productList.get(2).addCount(count3);
    }

    public double buyProduct(String name, int count) {
        Product product = productList.get(getIndex(name));
        product.removeCount(count);
        return product.getPriceForItem() * count;
    }

    public double buyProducts(String name1, int count1, String name2, int count2) {
        Product product1 = productList.get(getIndex(name1));
        product1.removeCount(count1);
        Product product2 = productList.get(getIndex(name2));
        product2.removeCount(count2);
        return product1.getPriceForItem() * count1 + product2.getPriceForItem() * count2;
    }

    public double buyProducts(int count1, int count2, int count3) {
        Product product1 = productList.get(0);
        product1.removeCount(count1);
        Product product2 = productList.get(1);
        product2.removeCount(count2);
        Product product3 = productList.get(2);
        product3.removeCount(count3);
        return product1.getPriceForItem() * count1 + product2.getPriceForItem() * count2 + product3.getPriceForItem() * count3;
    }

    public void addProducts() throws IOException {
        do {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter product index to add or -1 to stop:");
            outputProductsList();
            int index = Integer.parseInt(reader.readLine());
            if (index == -1) break;
            if (index < 0 || index > 2) throw new IllegalArgumentException("Unknown product");
            System.out.println("Enter count to add:");
            int count = Integer.parseInt(reader.readLine());
            Product product = productList.get(index);
            product.addCount(count);
            System.out.println(count + " " + product.getName() + "s was added to shop!");
        } while (true);
    }

    public double buyProducts() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double price = 0.0;
        do {
            System.out.println("Enter product index to add to shopping basket or -1 to stop:");
            outputProductsList();
            int index = Integer.parseInt(reader.readLine());
            if (index == -1) break;
            if (index < 0 || index > 2) throw new IllegalArgumentException("Unknown product");
            System.out.println("Enter count to add to shopping basket:");
            int count = Integer.parseInt(reader.readLine());
            Product product = productList.get(index);
            try {
                product.removeCount(count);
            } catch (Exception e) {
                if (e instanceof IllegalArgumentException)
                    System.out.println(e.toString().replace("java.lang.IllegalArgumentException:", ""));
                else throw e;
            }
            price += product.getPriceForItem() * count;
        } while (true);
        System.out.println("Price is: " + price);
        return price;
    }

    private void outputProductsList() {
        StringBuilder res = new StringBuilder();
        for (Product product : productList) {
            res.append(productList.indexOf(product)).append(" - ").append(product.getName()).append("\n");
        }


        System.out.println(res);
    }

    public String shopInfo() {
        StringBuilder res = new StringBuilder("Shop info:\n");
        for (Product product: productList) {
            res.append(product.getName()).append("s: ").append(product.getCount()).append("\n");
        }
        return res.toString();
    }

    private int getIndex(String name) {
        for (Product product : productList) {
            if (name.equals(product.getName())) return productList.indexOf(product);
        }
        throw new IllegalArgumentException("Cannot find this product");
    }
}
