package com.shristi.inher;

import java.util.Scanner;
abstract class InEmployee {
	String name;
	int empId;

	public InEmployee() {
		super();
	}

	public InEmployee(String name, int empId) {
		super();
		this.name = name;
		this.empId = empId;
	}

	void getDetails() {
		System.out.println(name + " " + empId);
	}

	abstract void calcBonus(int amount);
}

class InManager extends InEmployee {
	int salary;

	public InManager(String name, int empId, int salary) {
		super(name, empId);
		this.salary = salary;
	}

	void greetMessage() {
		System.out.println("Have a great day");
	}

	public void calcBonus(int amount) {
		System.out.println("Manager Bonus " + amount * 2);
	}

}

class InDeveloper extends InEmployee {
	String[] hobbies;

	public InDeveloper(String name, int empId, String[] hobbies) {
		super(name, empId);
		this.hobbies = hobbies;
	}

	void calcBonus(int amount) {
		System.out.println("Dev Bonus " + amount);
	}

	void showHobbies() {
		for (String hobby : hobbies) {
			System.out.println(hobby);
		}
	}
}

public class InherDemo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter m or d");
		String choice = sc.next();
		InEmployee emp = null;

		if (choice.equals("m")) {
			emp = new InManager("Ram", 10, 9000);
			emp.calcBonus(1000);
			emp.getDetails();
			InManager manager = (InManager)emp;
			manager.greetMessage();
					
		} else if (choice.equals("d")) {
			emp = new InDeveloper("Rohan", 11, new String[] { "sports", "music" });
			emp.calcBonus(1000);
			emp.getDetails();
			InDeveloper dev = (InDeveloper)emp;
			dev.showHobbies();
		} else {
			System.out.println("wrong input");
		}
		sc.close();
	}

}
