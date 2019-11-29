package com.alex.lesson4.task24;

public class Main {
    public static void main(String[] args) {

        ResidentialProperty residentialProperty = new ResidentialProperty(300, 100, 10);

        RetailProperty retailProperty = new RetailProperty(300, 100, 110);

        RetailProperty retailProperty2 = new RetailProperty(300, 100, 50);

        IndustrialProperty industrialProperty = new IndustrialProperty(300, 100);

        System.out.printf("Residential property`s taxes: %.2f UAH\n", residentialProperty.taxCalculation());

        System.out.printf("1. Retail property`s taxes: %.2f UAH\n", retailProperty.taxCalculation());

        System.out.printf("2. Retail property`s taxes: %.2f UAH\n", retailProperty2.taxCalculation());

        System.out.printf("Industrial property taxes: %.2f UAH\n", industrialProperty.taxCalculation());

    }
}
