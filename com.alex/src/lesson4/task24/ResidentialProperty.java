package com.alex.lesson4.task24;

public class ResidentialProperty extends Property {

    private double subsidiesPercent;

    public ResidentialProperty() {
    }

    public ResidentialProperty(double square) {
        super(square);
    }

    public ResidentialProperty(double square, double taxK) {
        super(square, taxK);
    }

    public ResidentialProperty(double square, double taxK, double subsidiesPercent) {
        super(square, taxK);
        this.subsidiesPercent = subsidiesPercent;
    }

    public double getSubsidiesPercent() {
        return subsidiesPercent;
    }

    public void setSubsidiesPercent(double subsidiesPercent) {
        this.subsidiesPercent = subsidiesPercent;
    }

    public double taxCalculation() {
        if (subsidiesPercent < 0) throw new IllegalArgumentException();
        return super.taxCalculation() * (1 - subsidiesPercent / 100);
    }
}
