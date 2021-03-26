package com.shristi.training;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
	
		System.out.println("enter details");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println(name);
		int id = sc.nextInt();
		System.out.println(id);
		sc.nextLine();
		String city = sc.nextLine();
		System.out.println(city);
		double sal = sc.nextDouble();
		System.out.println(sal);
		System.out.println("completed");
		sc.close();
		
		
	
	
	}

}
