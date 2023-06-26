package com.novare.foodmora.utill;

public class Ingredient {
    private String name;
    private MeasureType measureType;
    ;
    private double amount;

    public Ingredient(String name, MeasureType measureType, double amount) {
        this.name = name;
        this.measureType = measureType;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MeasureType getMeasureType() {
        return measureType;
    }

    public void setMeasureType(MeasureType measureType) {
        this.measureType = measureType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}