package com.lekhanak.assignment.utilities;
import com.lekhanak.assignment.employees.Employees;
import com.lekhanak.assignment.employees.Manager;
import com.lekhanak.assignment.employees.Developer;

/**
 * The EmployeeUtilities class provides methods to perform operations on employee objects.
 * The access modifiers are used to control the visibility of the methods.
 */
public class EmployeeUtilities {
	/**
     * Prints the details of an employee.
     * employee the employee object
     */
    public void printEmployeeDetails(Employees employee) {
        System.out.println("Name: " + employee.getName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Salary: " + employee.getSalary());
    }

    /**
     * Gives a 10% raise to the salary of an employee.
     * employee the employee object
     */
    public void giveRaise(Employees employee) {
        double newSalary = employee.getSalary() * 1.1;
        employee.setSalary(newSalary);
    }

    /**
     * Prints the details of a manager.
     * manager the manager object
     */
    private void printManagerDetails(Manager manager) {
        printEmployeeDetails(manager);
        System.out.println("Department: " + manager.getDepartment());
        System.out.println("Number of Direct Reports: " + manager.getNumberOfDirectReports());
    }

    /**
     * Prints the details of a developer.
     * @param developer the developer object
     */
    void printDeveloperDetails(Developer developer) {
        printEmployeeDetails(developer);
        System.out.println("Programming Language: " + developer.getProgrammingLanguage());
        System.out.println("Years of Experience: " + developer.getYearsOfExperience());
    }

}
