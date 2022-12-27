package com.ranaëlle;
/**
 * Dealership class
 */

import java.util.Arrays;

public class CarDealership {
    private String name;
    private int maxCar;
    private Car[] cars;

    private int count = 0;

    private int index = 0;

    public CarDealership(String name, int maxCar) {
        this.name = name;
        this.maxCar = maxCar;
        this.cars = new Car[maxCar];
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxCar() {
        return maxCar;
    }

    public void setMaxCar(int maxCar) {
        this.maxCar = maxCar;
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }
    //count cars in the dealership
    public int countCars(){
        if(cars[index] != null){
            count++;
        }
        index++;
        return count;
    }

    // add Cars to the dealership
    public void addCars(Car car){
        if(index < maxCar){
            cars[index] = car;
            countCars();
        }
    }

    //find car by manufacturer
    public Car findCarByManufacturer(String manufacturerName){
        Car carFound = new Car();
        for(int i = 0; i < cars.length; i++){
            if( cars[i].getManufacturerName() == manufacturerName){
                carFound = cars[i];
                break;
            }

        }
        return carFound;
    }
}
