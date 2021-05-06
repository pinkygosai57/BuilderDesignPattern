package com.designpatterns.builder.directors;

import com.designpatterns.builder.buliders.Builder;
import com.designpatterns.builder.components.CarEngine;
import com.designpatterns.builder.components.CarType;

public class Director {

    public void buildSUV(Builder builder){
        builder.setCarType(CarType.SUV);
        builder.setCarEngineType(new CarEngine("flat", "monolithic", "flat"));
        builder.setCarSeats(4);
    }

    public void buildSedan(Builder builder)
    {
        builder.setCarType(CarType.SEDAN);
        builder.setCarEngineType(new CarEngine("dome", "assembled", "roller"));
        builder.setCarSeats(2);
    }


}

