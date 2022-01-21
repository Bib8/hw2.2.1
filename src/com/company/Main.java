package com.company;

public class Main {

    public static void main(String[] args) {
        Bicycle bike = new Bicycle("Discovery", 2);
        bike.updateTyre();
        Car car = new Car("Ford", 4);
        car.checkEngine();
        car.updateTyre();
        Truck truck = new Truck("GAZ", 8);
        truck.checkEngine();
        truck.updateTyre();
        truck.checkTrailer();
    }
}
