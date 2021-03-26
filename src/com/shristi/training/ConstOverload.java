package com.shristi.training;

class User{
	String name;
	String city;
	int userId;
	
	public User() {
		
		System.out.println("User Details");
	}

	public User(String name) {
		this();
		System.out.println("One param");
		this.name = name;
	}

	public User(String name, int userId) {
		this(name);
		System.out.println("Two param");
		this.userId = userId;
	}

	// this()
	public User(String name, String city, int userId) {
		this(name,userId);
		System.out.println("three param");
		this.city = city;
	}

	void getDetails() {
		if(name!=null)
			System.out.println("Name: "+name);
		if(userId>0)
			System.out.println("UserId: "+userId);
		if(city!=null)
			System.out.println("City: "+city);
	}
}

public class ConstOverload {

	public static void main(String[] args) {
		User user1 = new User("Helen");
		User user2 = new User("Rohan",10);
		User user3 = new User("Alex","Bangalore",20);
//		user1.getDetails();
//		user2.getDetails();
//		user3.getDetails();
		

	}

}
