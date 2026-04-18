package com.sandip.designpattern.structural;

public class EmployeeFromLDAP {
    private final String empId;
    private final String empName;
    private final String empDesignation;
    private final String empAddress;

    public EmployeeFromLDAP(String empId, String empName, String empDesignation, String empAddress) {
        this.empId = empId;
        this.empName = empName;
        this.empDesignation = empDesignation;
        this.empAddress = empAddress;
    }

    public String getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpDesignation() {
        return empDesignation;
    }

    public String getEmpAddress() {
        return empAddress;
    }
}
