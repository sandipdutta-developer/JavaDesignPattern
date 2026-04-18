package com.sandip.designpattern.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

    public List<Employee> getAllEmployeeList() {
        List<Employee> employeeList = new ArrayList<>();
        Employee employeeFromDB = new EmployeeFromDB("123", "Sandip", "Software Developer", "India");
        employeeList.add(employeeFromDB);

        EmployeeFromLDAP employeeFromLDAP = new EmployeeFromLDAP("124", "Sandeep", "Software Analyst", "India");
        Employee employeeAdapterLdap = new EmployeeAdapterLdap(employeeFromLDAP);
        return employeeList;
    }
}
