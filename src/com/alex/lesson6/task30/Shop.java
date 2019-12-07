package com.alex.lesson6.task30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Shop {

    private HashMap<String, Product> productMap = new HashMap<>();

    private Shop() {
    }


    public Shop(Product ...products) {
        Arrays.asList(products).forEach(product -> this.productMap.put(product.getName(), product));
    }


    public Shop(Collection<Product> listOfProduct) {
        listOfProduct.forEach(product -> this.productMap.put(product.getName(), product));
    }

    public void addProduct(String name, int count) {
        Product product = this.productMap.get(name);
        if(product != null) product.addCount(count);
        else throw new IllegalArgumentException(String.format("Cannot find product with name '%s'", name));
    }

    public void addProducts(String name1, int count1, String name2, int count2) {
        Product product1 = this.productMap.get(name1);
        if(product1 != null) product1.addCount(count1);
        else throw new IllegalArgumentException(String.format("Cannot find product with name '%s'", name1));
        Product product2 = this.productMap.get(name2);
        if(product2 != null) product2.addCount(count2);
        else throw new IllegalArgumentException(String.format("Cannot find product with name '%s'", name2));

    }

    public void addProducts(String name1, int count1, String name2, int count2, String name3, int count3) {
        Product product1 = this.productMap.get(name1);
        if(product1 != null) product1.addCount(count1);
        else throw new IllegalArgumentException(String.format("Cannot find product with name '%s'", name1));
        Product product2 = this.productMap.get(name2);
        if(product2 != null) product2.addCount(count2);
        else throw new IllegalArgumentException(String.format("Cannot find product with name '%s'", name2));
        Product product3 = this.productMap.get(name3);
        if(product3 != null) product2.addCount(count3);
        else throw new IllegalArgumentException(String.format("Cannot find product with name '%s'", name3));
    }

    public void addProducts(Map<String, Integer> mapOfProducts) {
        mapOfProducts.forEach((k, v) -> {
            Product product = this.productMap.get(k);
            if(product != null) product.addCount(v);
            else throw new IllegalArgumentException(String.format("Cannot find product with name '%s'", k));
        });

    }

    public double buyProduct(String name, int count) {
        Product product = this.productMap.get(name);
        if(product != null) product.removeCount(count);
        else throw new IllegalArgumentException(String.format("Cannot find product with name '%s'", name));
        return product.getPriceForItem() * count;
    }

    public double buyProducts(String name1, int count1, String name2, int count2) {
        Product product1 = this.productMap.get(name1);
        if(product1 != null) product1.removeCount(count1);
        else throw new IllegalArgumentException(String.format("Cannot find product with name '%s'", name1));
        Product product2 = this.productMap.get(name2);
        if(product2 != null) product2.removeCount(count2);
        else throw new IllegalArgumentException(String.format("Cannot find product with name '%s'", name2));
        return product1.getPriceForItem() * count1 + product2.getPriceForItem() * count2;
    }

    public double buyProducts(String name1, int count1, String name2, int count2, String name3, int count3) {
        Product product1 = this.productMap.get(name1);
        if(product1 != null) product1.removeCount(count1);
        else throw new IllegalArgumentException(String.format("Cannot find product with name '%s'", name1));
        Product product2 = this.productMap.get(name2);
        if(product2 != null) product2.removeCount(count2);
        else throw new IllegalArgumentException(String.format("Cannot find product with name '%s'", name2));
        Product product3 = this.productMap.get(name3);
        if(product3 != null) product3.removeCount(count3);
        else throw new IllegalArgumentException(String.format("Cannot find product with name '%s'", name3));
        return product1.getPriceForItem() * count1 + product2.getPriceForItem() * count2 + product3.getPriceForItem() * count3;
    }

    public double buyProducts(Map<String, Integer> mapOfProducts) {
        double price = 0.0;
        for (Map.Entry<String, Integer> entry : mapOfProducts.entrySet()) {
            String k = entry.getKey();
            Integer v = entry.getValue();
            Product product = this.productMap.get(k);
            if (product != null) product.removeCount(v);
            else throw new IllegalArgumentException(String.format("Cannot find product with name '%s'", k));
            price += product.getPriceForItem() * v;
        }
        return price;
    }

    public void addProducts() throws IOException {
        do {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(shopInfo());
            System.out.println("Enter product name to add or -1 to stop:");
            String name = reader.readLine();
            if (name.equals("-1")) break;
            System.out.println("Enter count to add:");
            int count = Integer.parseInt(reader.readLine());
            Product product = this.productMap.get(name);
            if (product == null) {
                System.out.println("Cannot find this product");
                continue;
            }
            product.addCount(count);
            System.out.printf("%d %ss was added to shop!\n\n", count, product.getName());
        } while (true);
    }

    public double buyProducts() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double price = 0.0;
        do {
            System.out.println(shopInfo());
            System.out.println("Enter product index to add to shopping basket or -1 to stop:");
            String name = reader.readLine();
            if (name.equals("-1")) break;
            System.out.println("Enter count to add to shopping basket:");
            int count = Integer.parseInt(reader.readLine());
            Product product = this.productMap.get(name);
            try {
                product.removeCount(count);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            price += product.getPriceForItem() * count;
        } while (true);
        System.out.printf("Price is: %f\n\n", price);
        return price;
    }


    public String shopInfo() {
        StringBuilder res = new StringBuilder("Shop info:\n");
            this.productMap.forEach((k, v) -> res.append(k).append(": ").append(v.getCount()).append("\n"));
        return res.toString();
    }
}
