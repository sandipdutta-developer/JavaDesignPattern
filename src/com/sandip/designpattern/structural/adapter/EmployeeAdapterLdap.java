package com.sandip.designpattern.structural.adapter;

public class EmployeeAdapterLdap implements Employee {

    private EmployeeFromLDAP employeeFromLDAP;

    public EmployeeAdapterLdap(EmployeeFromLDAP employeeFromLDAP) {
        this.employeeFromLDAP = employeeFromLDAP;
    }

    @Override
    public String getId() {
        return employeeFromLDAP.getEmpId();
    }

    @Override
    public String getName() {
        return employeeFromLDAP.getEmpName();
    }

    @Override
    public String getDesignation() {
        return employeeFromLDAP.getEmpDesignation();
    }

    @Override
    public String getAddress() {
        return employeeFromLDAP.getEmpDesignation();
    }
}
