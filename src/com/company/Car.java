package com.company;

public class Car extends Transport implements TransportInterface{

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public String getModelName() {
        return super.getModelName();
    }

    @Override
    public void setModelName(String modelName) {
        super.setModelName(modelName);
    }

    @Override
    public int getWheelsCount() {
        return super.getWheelsCount();
    }

    @Override
    public void setWheelsCount(int wheelsCount) {
        super.setWheelsCount(wheelsCount);
    }

    @Override
    public void checkTrailer() {
        super.checkTrailer();
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
