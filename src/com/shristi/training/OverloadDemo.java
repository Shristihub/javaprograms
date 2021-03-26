package com.shristi.training;

class Shape {

	static void calcArea(int x) {
		System.out.println("SQ "+(x*x));
	}
	static void calcArea(int x, int y, int z) {
		System.out.println("SQ "+(x*x));
	}
	void calcArea(double x) {
		System.out.println("Circle "+Math.PI*x*x);
	}
	int calcArea(int length, int breadth) {
		return (length*breadth);
	}
//	double calcArea(int length, double height) {
//		return (0.5*length*height);
//	}
}
public class OverloadDemo{
	public static void main(String[] args) {
		System.out.println("main");
		Shape shape = new Shape();
		shape.calcArea(10);
		shape.calcArea(10.2);
		int rect = shape.calcArea(20,30);
		System.out.println("Rect "+rect);
		double tri = shape.calcArea(20,(int)30.5);
		System.out.println("Tri "+tri);
		 
	}
}