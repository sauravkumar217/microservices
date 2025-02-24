package com.i;

public interface ParkingLot extends ParkingOperations, CapacityOperations, FeeOperations, PaymentOperations {
    // This is the full interface, but clients can implement only the required parts
}