package com.ems.interface_;



public interface SecurityOperations {
    void monitorPremises(String location);
    void logAccess(String employeeId, boolean authorized);
}