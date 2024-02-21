package org.example.Transpot;

public class Car implements Transport {
    @Override
    public void drive() {
        System.out.println("Машина поеха");
    }

    @Override
    public void printProduct(String product) {
        System.out.println("Машина привезал " + product);
    }
}
