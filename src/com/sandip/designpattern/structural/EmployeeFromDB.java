package com.sandip.designpattern.structural;

public class EmployeeFromDB implements Employee {
    private final String id;
    private final String name;
    private final String designation;
    private final String address;

    public EmployeeFromDB(String id, String name, String designation, String address) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.address = address;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDesignation() {
        return this.designation;
    }

    @Override
    public String getAddress() {
        return this.address;
    }
}
