package com.alex.lesson4.task24;

public abstract class Property {

    protected double square, taxK;

    public Property() {
    }

    ;

    public Property(double square) {
        this.square = square;
    }

    public Property(double square, double taxK) {
        this(square);
        this.taxK = taxK;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public double getTaxK() {
        return taxK;
    }

    public void setTaxK(double taxK) {
        this.taxK = taxK;
    }

    public double taxCalculation() {
        if (taxK < 0 || square < 0) throw new IllegalArgumentException();
        return square * taxK;
    }
}
