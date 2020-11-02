package com.company.sessionone;

import java.util.UUID;

public class Car {

    private UUID vinNumber;
    private String color;
    private String model;

    public Car(UUID vinNumber, String color, String model) {
        this.vinNumber = vinNumber;
        this.color = color;
        this.model = model;
    }

    public UUID getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(UUID vinNumber) {
        this.vinNumber = vinNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return String.format("Vin Number: " + vinNumber + " | " + "Color: " + color + " | " + "Model: " + model + "  ########  ");
    }
}
