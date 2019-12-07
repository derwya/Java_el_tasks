package com.alex.lesson6.task30;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        Product product1 = new Product("cat", 10.00, 10);
        Product product2 = new Product("dog", 20.00, 29);
        Product product3 = new Product("parrot", 30.99, 30);

        Shop shop = new Shop(product1, product2, product3);

        System.out.println("-------------------------");

        shop.addProduct("cat", 1000);
        shop.addProducts("cat", 1000, "dog", 1000, "parrot", 1000);
        shop.addProducts("cat", 1000, "parrot", 1000);

        System.out.println(shop.shopInfo());

        System.out.println("-------------------------");
        Map<String, Integer> productsMapToAdd = new HashMap<>();
        productsMapToAdd.put("dog", 10000);
        productsMapToAdd.put("parrot", 1000);
        productsMapToAdd.put("cat", 1000);

        shop.addProducts(productsMapToAdd);
        System.out.println(shop.shopInfo());

        Map<String, Integer> productsMapToBuy = new HashMap<>();
        productsMapToBuy.put("dog", 100);
        productsMapToBuy.put("parrot", 100);
        productsMapToBuy.put("cat", 100);

        System.out.printf("Price is: %f\n\n", shop.buyProducts(productsMapToBuy));

        System.out.println(shop.shopInfo());

        System.out.println("-------------------------");

        shop.addProducts();


        System.out.println("-------------------------");


        System.out.println(shop.buyProduct("cat", 1000));
        System.out.println(shop.buyProducts("cat", 1000, "dog", 1000, "parrot", 1000));
        System.out.println(shop.buyProducts("cat", 30, "parrot", 30));

        System.out.println("-------------------------");

        shop.addProducts();
        shop.buyProducts();

    }

}
