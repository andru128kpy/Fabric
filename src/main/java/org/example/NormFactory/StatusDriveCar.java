package org.example.NormFactory;

import org.example.Transpot.Car;
import org.example.Transpot.Transport;

public class StatusDriveCar extends StatusDrive {
    @Override
    public Transport createTransport() {
        return new Car();
    }
}
