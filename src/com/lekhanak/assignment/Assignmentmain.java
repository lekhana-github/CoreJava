package com.lekhanak.assignment;
import com.lekhanak.assignment.employees.Developer;
import com.lekhanak.assignment.employees.Manager;
import com.lekhanak.assignment.utilities.EmployeeUtilities;
public class Assignmentmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create instances of Manager and Developer
        Manager manager = new Manager();
        manager.setName("LEKHANA");
        manager.setEmployeeId(1001);
        manager.setSalary(80000);
        manager.setDepartment("IT");
        manager.setNumberOfDirectReports(5);

        Developer developer = new Developer();
        developer.setName("SANIKA");
        developer.setEmployeeId(1002);
        developer.setSalary(60000);
        developer.setProgrammingLanguage("Java");
        developer.setYearsOfExperience(3);

        // Use the EmployeeUtilities methods
        EmployeeUtilities utilities = new EmployeeUtilities();
        utilities.printEmployeeDetails(manager);
        System.out.println();
        utilities.printEmployeeDetails(developer);
        System.out.println();

   utilities.giveRaise(manager);
   utilities.giveRaise(developer);

        System.out.println("After raise:");
        utilities.printEmployeeDetails(manager);
        System.out.println();
        utilities.printEmployeeDetails(developer);

	}

}
