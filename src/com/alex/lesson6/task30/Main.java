package com.alex.lesson6.task30;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Product product1 = new Product("cat", 10.00, 10);
        Product product2 = new Product("dog", 20.00, 29);
        Product product3 = new Product("parrot", 30.99, 30);

        Shop shop = new Shop(product1, product2, product3);

        System.out.println("-------------------------");

        shop.addProduct("cat", 1000);
        shop.addProducts(1000, 1000, 1000);
        shop.addProducts("cat", 1000, "parrot", 1000);
        System.out.println(shop.buyProduct("cat", 1000));
        System.out.println(shop.buyProducts(1000, 1000, 1000));
        System.out.println(shop.buyProducts("cat", 1000, "parrot", 1000));

        System.out.println("-------------------------");

        shop.addProducts();
        shop.buyProducts();

    }

}
