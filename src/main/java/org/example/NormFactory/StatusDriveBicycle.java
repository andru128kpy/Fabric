package org.example.NormFactory;

import org.example.Transpot.Bicycle;
import org.example.Transpot.Transport;

public class StatusDriveBicycle extends StatusDrive {
    @Override
    public Transport createTransport() {
        return new Bicycle();
    }
}
