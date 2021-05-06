package com.designpatterns.builder;

import com.designpatterns.builder.buliders.CarBuilder;
import com.designpatterns.builder.directors.Director;
import com.designpatterns.builder.products.Car;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        director.buildSedan(carBuilder);

        Car mySedanCAR = carBuilder.getCarObject();
        System.out.println("mySedanCAR = " + mySedanCAR.toString());
    }
}
