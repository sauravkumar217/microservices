package com.i;

public class Car {
    private String licensePlate;
    private int hoursParked; // For fee calculation

    public Car(String licensePlate) {
        this.licensePlate = licensePlate;
        this.hoursParked = 0;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public int getHoursParked() {
        return hoursParked;
    }

    public void setHoursParked(int hoursParked) {
        this.hoursParked = hoursParked;
    }

    @Override
    public String toString() {
        return "Car{licensePlate='" + licensePlate + "', hoursParked=" + hoursParked + "}";
    }
}