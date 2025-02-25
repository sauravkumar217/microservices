package com.ems.service;

import com.ems.interface_.SecurityOperations;

import com.ems.model.SecurityGuard;

public class SecurityService implements SecurityOperations {
    @Override
    public void monitorPremises(String location) {
        SecurityGuard guard = getCurrentGuard();
        if (guard != null) {
            guard.monitorPremises(location);
        }
    }

    @Override
    public void logAccess(String employeeId, boolean authorized) {
        SecurityGuard guard = getCurrentGuard();
        if (guard != null) {
            guard.logAccess(employeeId, authorized);
        }
    }

    private SecurityGuard getCurrentGuard() {
        // Simulate fetching a security guard (for demo purposes)
        return new SecurityGuard("SG001", "Charlie Brown", 50000);
    }
}