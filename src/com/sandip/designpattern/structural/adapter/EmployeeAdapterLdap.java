package com.sandip.designpattern.structural.adapter;

public record EmployeeAdapterLdap(EmployeeFromLDAP employeeFromLDAP) implements Employee {
    @Override
    public String getId() {
        return employeeFromLDAP.empId();
    }

    @Override
    public String getName() {
        return employeeFromLDAP.empName();
    }

    @Override
    public String getDesignation() {
        return employeeFromLDAP.empDesignation();
    }

    @Override
    public String getAddress() {
        return employeeFromLDAP.empAddress();
    }
}
