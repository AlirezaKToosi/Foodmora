package com.novare.foodmora.utill;

public enum MeasureType {
    QUANTITY("Quantity (pc)"),
    LITERS("Liters (l)"),
    KILOGRAM("Kilogram (kg)");

    private final String displayName;

    MeasureType(String displayName) {
        this.displayName = displayName;
    }

}
