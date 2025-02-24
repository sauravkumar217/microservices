package com.i;

public class Test {
    public static void main(String[] args) {
        Car car = new Car("ABC123");
        car.setHoursParked(2); // Parked for 2 hours

        FeeParking feeParking = new FeeParking(10, 5.0); // 10 spots, $5 per hour

        // Test parking operations
        feeParking.parkCar();
        feeParking.getCapacity();

        // Test fee calculation
        double fee = feeParking.calculateFee(car);
        System.out.println("Fee for " + car + ": $" + fee);

        // Test unparking
        feeParking.unparkCar();
        feeParking.getCapacity();
    }
}