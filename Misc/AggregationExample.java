package Misc;

class Employee {
    String name;

    Employee (String name) {
        this.name = name;
    }

    void displayEmployee() {
        System.out.println("Employee Name: " + name);
    }
}

// Department class (Aggregation)
class Department {
    String departmentName;
    Employee employee; // Aggregation
    Department (String departmentName, Employee employee) {
        this.departmentName = departmentName;
        this.employee = employee;
    }

    void displayDepartment() {
        System.out.println("Department: " + departmentName);
        employee.displayEmployee();
    }
}

//Main class
public class AggregationExample {
    public static void main(String[] args) {
        // Employee obj exists independently
        Employee emp = new Employee("Bizesh");

        //Department has employee object
        Department dept = new Department("IT", emp);

        dept.displayDepartment();

        //EMployee can still exist without Department
        System.out.println("Employee still exists independently.");
        emp.displayEmployee();
    }
}