package com.ranaëlle;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        CarDealership dealership = new CarDealership("Kiko Cars", 50);
        Car car1 = new Car("Ford", 27000, EngineType.ELECTRIC);
        dealership.addCars(car1);
        Car car2 = new Car("Honda", 30000, EngineType.ELECTRIC);
        dealership.addCars(car2);
        Car car3 = new Car("Ford", 18000, EngineType.HYBRID);
        dealership.addCars(car3);
        Car car4 = new Car("Toyota", 17500, EngineType.PETROL);
        dealership.addCars(car4);
        Car car5 = new Car("Honda", 60000, EngineType.PETROL);
        dealership.addCars(car5);
        Car car6 = new Car("Toyota", 15000, EngineType.HYBRID);
        dealership.addCars(car6);
        Car car7 = new Car("Chevrolet", 27000, EngineType.ELECTRIC);
        dealership.addCars(car7);
        Car car8 = new Car("Chevrolet", 25000, EngineType.ELECTRIC);
        dealership.addCars(car8);
        Car car9 = new Car("Ford", 30000, EngineType.ELECTRIC);
        dealership.addCars(car9);
        System.out.println(dealership.countCars());


        Car findManufacturer =  dealership.findCarByManufacturer("Toyota");
        System.out.println(findManufacturer);











    }
}