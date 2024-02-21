package org.example;


import org.example.NormFactory.StatusDrive;
import org.example.NormFactory.StatusDriveBicycle;
import org.example.NormFactory.StatusDriveBus;
import org.example.NormFactory.StatusDriveCar;

public class Main {
    private static StatusDrive status;

    public static void main(String[] args) {
        choiceFactory("Car");
        check();


    }

    static public void choiceFactory(String tape) {
        switch (tape) {
            case "Car" -> status = new StatusDriveCar();
            case "Bus" -> status = new StatusDriveBus();
            case "Bicycle" -> status = new StatusDriveBicycle();
            default -> throw new IllegalStateException("Unexpected value: " + tape);
        }
    }

    static public void check() {
        status.printStatus("Сигореты");
    }
}