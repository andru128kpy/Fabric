package org.example.Factory;

import org.example.Transpot.Transport;

public class TransportFactory {
    public static Transport createTransport(String type) {
        return switch (type) {
            case "Car" -> CarFactory.creteCar();
            case "Bicycle" -> BicycleFactory.createBicicl();
            case "Bus" -> BusFactory.createBus();
            default -> throw new IllegalArgumentException("Unexpected value");
        };
    }
}
