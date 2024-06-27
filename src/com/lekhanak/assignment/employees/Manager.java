package com.lekhanak.assignment.employees;
/**
 * The Manager class extends the Employee class and includes additional attributes specific to managers.
 */
public class Manager extends Employees {
    private String department;
    private int numberOfDirectReports;

    /**
     * Getter method for the department attribute.
     * @return the department of the manager
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Setter method for the department attribute.
     * @param department the new department of the manager
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * Getter method for the numberOfDirectReports attribute.
     * @return the number of direct reports of the manager
     */
    public int getNumberOfDirectReports() {
        return numberOfDirectReports;
    }

    /**
     * Setter method for the numberOfDirectReports attribute.
     * @param numberOfDirectReports the new number of direct reports of the manager
     */
    public void setNumberOfDirectReports(int numberOfDirectReports) {
        this.numberOfDirectReports = numberOfDirectReports;
    }
}
