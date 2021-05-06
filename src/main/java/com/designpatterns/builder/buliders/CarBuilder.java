package com.designpatterns.builder.buliders;

import com.designpatterns.builder.components.CarEngine;
import com.designpatterns.builder.components.CarType;
import com.designpatterns.builder.products.Car;


public class CarBuilder implements Builder{

    private CarType carType;
    private CarEngine carEngine;
    private int carSeats;

    @Override
    public CarBuilder setCarType(CarType carType) {
        this.carType = carType;
        return this;
    }

    @Override
    public CarBuilder setCarEngineType(CarEngine carEngine) {
        this.carEngine = carEngine;
        return this;
    }

    @Override
    public CarBuilder setCarSeats(int numOfSeats) {
        this.carSeats = numOfSeats;
        return this;
    }

    public Car getCarObject() {
        return new Car(carSeats, carType, carEngine);
    }

}
