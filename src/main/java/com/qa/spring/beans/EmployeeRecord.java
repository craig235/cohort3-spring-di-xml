package com.qa.spring.beans;

import java.util.List;

public class EmployeeRecord {
    private Employee employee;
    private List<Address> addressList;

    public EmployeeRecord(Employee employee, List<Address> addressList) {
        System.out.println("EmployeeRecord constructor invoked..");
        this.employee = employee;
        this.addressList = addressList;
    }

    public Employee getEmployee() {
        return employee;
    }

    public List<Address> getAddress() {
        return addressList;
    }
}
