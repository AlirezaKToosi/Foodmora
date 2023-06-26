package com.novare.foodmora.utill;

public class Ingredient {
    private String name;
    private String measureType;
    private double amount;

    public Ingredient(String name, String measureType, double amount) {
        this.name = name;
        this.measureType = measureType;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setMeasureType(String measureType) {
        this.measureType = measureType;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeasureType() {
        return measureType;
    }

    public double getAmount() {
        return amount;
    }
}