package com.alex.lesson4.task24;

public class RetailProperty extends Property {

    private double salesRevenueUAH;

    public RetailProperty() {
    }

    public RetailProperty(double square) {
        super(square);
    }

    public RetailProperty(double square, double taxK) {
        super(square, taxK);
    }

    public RetailProperty(double square, double taxK, double salesRevenueUAH) {
        super(square, taxK);
        this.salesRevenueUAH = salesRevenueUAH;
    }

    public double getSalesRevenueUAH() {
        return salesRevenueUAH;
    }

    public void setSalesRevenueUAH(double salesRevenueUAH) {
        this.salesRevenueUAH = salesRevenueUAH;
    }

    public double taxCalculation() {
        if (salesRevenueUAH < 0) throw new IllegalArgumentException();
        return (salesRevenueUAH >= 100) ? super.taxCalculation() : 0;
    }
}
