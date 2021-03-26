package com.shristi.training;

public class Employee {
	String name;
	int empId;
	double salary;
	
	
	public Employee(String name,int empId, double salary) {
		this.name = name;
		this.empId = empId;
		this.salary = salary;
	}
	public void getDetails() {
			System.out.println("Name: "+name);
			System.out.println("empid: "+empId);
			System.out.println("Salary: "+salary);
	}
	public String greetMessage(String msg) {
		return msg+name;
	}
	
	
	
}
