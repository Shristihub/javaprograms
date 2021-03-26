package com.shristi.inher;

class Product {
	void greetMessage() {
		System.out.println("Welcome to ABC shop");
	}

	public void getDesc() {
		 System.out.println("Product features");
	 }
	 void showDiscountedPrice(int amount) {
		 System.out.println("Discount:"+ amount*2);
	 }
}

class Stationery extends Product{
	public void getDesc(){
		System.out.println("Stationery Items");
	}
	public void showDiscountedPrice(int amount) {
		System.out.println("Discount "+amount);
	}
	
}
class Gadgets extends Product{

	public void getDesc() {
		System.out.println("Gadgets");
	}

	void showDiscountedPrice(int amount) {
		System.out.println("Discount "+amount*3);
	}
	
}
public class OverrideDemo{
	public static void main(String[] args) {
		Product  product = new Gadgets();
		product.getDesc();
		product.showDiscountedPrice(1000);
		
		product=new Stationery();
		product.getDesc();
		product.showDiscountedPrice(2000);
	}
}




