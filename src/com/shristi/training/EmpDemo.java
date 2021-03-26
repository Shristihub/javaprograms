package com.shristi.training;

public class EmpDemo {

	public static void main(String[] args) {
		Employee employee = new Employee("Ram",10,2000);
		employee.getDetails();
		String message = employee.greetMessage("Have a great day");
		System.out.println(message);
		System.out.println();
		Employee employee1 = new Employee("Tom",20,3000);
		employee1.getDetails();
		System.out.println(employee1.greetMessage("Have a great day"));
		
	}

}
