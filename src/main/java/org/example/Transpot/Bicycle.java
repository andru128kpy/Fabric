package org.example.Transpot;

public class Bicycle implements Transport {
    @Override
    public void drive() {
        System.out.println("Велосипед поехал");
    }

    @Override
    public void printProduct(String product) {
        System.out.println("Велосипед привёз " + product);
    }
}
