package org.example.Factory;

import org.example.Transpot.Car;

public class CarFactory {
    public static Car creteCar(){
        return new Car();
    }
}
