package com.lekhanak.assignment02;
class Student {
    Student() {
        System.out.println("Student object is created");
    }
}

class Commission {
    String Name;
    String Address;
    String Phone;
    double Sales_amount;

    void acceptDetails(String name, String address, String phone, double sales_amount) {
        Name = name;
        Address = address;
        Phone = phone;
        Sales_amount = sales_amount;
    }

    double calculateCommission() {
        if (Sales_amount >= 100000) {
            return 0.1 * Sales_amount;
        } else if (Sales_amount >= 50000 && Sales_amount < 100000) {
            return 0.05 * Sales_amount;
        } else if (Sales_amount >= 30000 && Sales_amount < 50000) {
            return 0.03 * Sales_amount;
        } else {
            return 0;
        }
    }
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();

        Commission salesEmployee = new Commission();
        salesEmployee.acceptDetails("John Doe", "123 Main St, Anytown USA", "555-1234", 75000);
        double commission = salesEmployee.calculateCommission();
        System.out.println("Commission: $" + commission);
    }

	}


