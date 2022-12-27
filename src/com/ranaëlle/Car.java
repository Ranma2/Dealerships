package com.ranaëlle;

/**
 * Car class
 */

public class Car {
    private String manufacturerName;
    private int price;
    private EngineType engineType;

    public Car(String manufacturerName, int price, EngineType engineType) {
        this.manufacturerName = manufacturerName;
        this.price = price;
        this.engineType = engineType;
    }
    public Car(){

    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturerName='" + manufacturerName + '\'' +
                ", price=" + price +
                ", engineType=" + engineType +
                '}';
    }
}
