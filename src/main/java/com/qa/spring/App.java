package com.qa.spring;

import com.qa.spring.beans.EmployeeRecord;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.qa.spring.beans.Address;
import com.qa.spring.beans.Employee;


/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // Get employee from context. Constructor injection.
        Employee emp1 = context.getBean("emp1", Employee.class);
        System.out.println(emp1);
        Employee emp2 = context.getBean("emp2", Employee.class);
        System.out.println(emp2);

        // Get address from context. Setter injection.
        Address homeAddress = context.getBean("home-address", Address.class);
        System.out.println(homeAddress);
        Address officeAddress = context.getBean("office-address", Address.class);
        System.out.println(officeAddress);

        System.out.println("-------------------");

        EmployeeRecord record = context.getBean("record", EmployeeRecord.class);
        System.out.println(record.getEmployee().toString());
        System.out.println(record.getAddress().toString());
    }
}
