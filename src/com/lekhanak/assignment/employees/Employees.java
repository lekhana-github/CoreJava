package com.lekhanak.assignment.employees;
/**
 * The Employee class represents a basic employee with private attributes.
 * Appropriate access modifiers are used to control the visibility of the class members.
 */
public class Employees {
	    private String name;
	    private int employeeId;
	    private double salary;

	    /**
	     * Getter method for the name attribute.
	     * @return the name of the employee
	     */
	    public String getName() {
	        return name;
	    }

	    /**
	     * Setter method for the name attribute.
	     * @param name the new name of the employee
	     */
	    public void setName(String name) {
	        this.name = name;
	    }

	    /**
	     * Getter method for the employeeId attribute.
	     * @return the employee ID
	     */
	    public int getEmployeeId() {
	        return employeeId;
	    }

	    /**
	     * Setter method for the employeeId attribute.
	     * @param employeeId the new employee ID
	     */
	    public void setEmployeeId(int employeeId) {
	        this.employeeId = employeeId;
	    }

	    /**
	     * Getter method for the salary attribute.
	     * @return the salary of the employee
	     */
	    public double getSalary() {
	        return salary;
	    }

	    /**
	     * Setter method for the salary attribute.
	     * @param salary the new salary of the employee
	     */
	    public void setSalary(double salary) {
	        this.salary = salary;
	    }
	
	
}
