package com.lekhanak.assignment.employees;

/**
 * The Developer class extends the Employee class and includes additional attributes specific to developers.
 */
public class Developer extends Employees {
    private String programmingLanguage;
    private int yearsOfExperience;

    /**
     * Getter method for the programmingLanguage attribute.
     * @return the programming language of the developer
     */
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    /**
     * Setter method for the programmingLanguage attribute.
     * programmingLanguage the new programming language of the developer
     */
    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    /**
     * Getter method for the yearsOfExperience attribute.
     * @return the years of experience of the developer
     */
    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    /**
     * Setter method for the yearsOfExperience attribute.
     * yearsOfExperience the new years of experience of the developer
     */
    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
}
