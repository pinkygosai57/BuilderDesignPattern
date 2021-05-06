package com.designpatterns.builder.products;


import com.designpatterns.builder.components.CarEngine;
import com.designpatterns.builder.components.CarType;

public class Car {

    private final int carSeats;
    private final CarType carType;
    private final CarEngine carEngine;


    public Car(int carSeats, CarType carType, CarEngine carEngine) {
        this.carSeats = carSeats;
        this.carType = carType;
        this.carEngine = carEngine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carSeats=" + carSeats +
                ", carType=" + carType +
                ", carEngine=" + carEngine +
                '}';
    }
}
