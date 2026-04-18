package com.sandip.designpattern.structural.adapter;

import java.util.List;

public class OwnAdapter {

    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService();
        List<Employee> allEmployeeList = employeeService.getAllEmployeeList();
        System.out.println(allEmployeeList);

    }
}
