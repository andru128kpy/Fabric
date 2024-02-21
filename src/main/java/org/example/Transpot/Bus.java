package org.example.Transpot;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Автобус поехал");
    }

    @Override
    public void printProduct(String product) {
        System.out.println("Автобус привез " + product);
    }
}
