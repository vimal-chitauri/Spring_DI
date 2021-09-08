package com.example.propertyinjection.aref;

public class Car {
    private String name;
    private Vehicle vehicle;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", vehicle=" + vehicle +
                '}';
    }
}
