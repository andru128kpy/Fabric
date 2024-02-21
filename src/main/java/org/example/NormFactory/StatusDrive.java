package org.example.NormFactory;

import org.example.Transpot.Transport;

public abstract class StatusDrive {
    Transport transport;

    public void printStatus(String product) {
        transport = createTransport();
        transport.drive();
        transport.printProduct(product);
    }

    public abstract Transport createTransport();
}
