package com.i;

public class FeeParking implements ParkingOperations, CapacityOperations, FeeOperations {
    private int emptySpots;
    private final int totalCapacity;
    private double feePerHour;

    public FeeParking(int totalCapacity, double feePerHour) {
        this.totalCapacity = totalCapacity;
        this.emptySpots = totalCapacity;
        this.feePerHour = feePerHour;
    }

    @Override
    public void parkCar() {
        if (emptySpots > 0) {
            emptySpots--;
            System.out.println("Car parked. Empty spots remaining: " + emptySpots);
        } else {
            System.out.println("Parking lot is full!");
        }
    }

    @Override
    public void unparkCar() {
        if (emptySpots < totalCapacity) {
            emptySpots++;
            System.out.println("Car unparked. Empty spots: " + emptySpots);
        } else {
            System.out.println("No cars to unpark!");
        }
    }

    @Override
    public void getCapacity() {
        System.out.println("Total capacity: " + totalCapacity + ", Empty spots: " + emptySpots);
    }

    @Override
    public double calculateFee(Car car) {
        if (car != null) {
            return car.getHoursParked() * feePerHour;
        }
        return 0.0;
    }
}