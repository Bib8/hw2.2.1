package com.company;

public class Main {

    public static void main(String[] args) {
        Bicycle bike = new Bicycle("Discovery", 2);
        Car car = new Car("Ford", 4);
        Truck truck = new Truck("GAZ", 8);

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.check(null, bike, null);
        serviceStation.check(car, null, null);
        serviceStation.check(null, null, truck);

    }
}
