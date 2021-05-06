package com.designpatterns.builder.buliders;

import com.designpatterns.builder.components.CarEngine;
import com.designpatterns.builder.components.CarType;

public interface Builder {

    public CarBuilder setCarType(CarType carType);
    public CarBuilder setCarEngineType(CarEngine carEngine);
    public CarBuilder setCarSeats(int numOfSeats);

}
