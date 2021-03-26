package com.shristi.inher;

public class VarDemo {

	public static void main(String[] args) {
	
		VarDemo demo = new VarDemo();
		demo.calcSum("Ram");
		demo.calcSum("Ram",90,80);
		demo.calcSum("Ram",90,80,70,70,10,20,30);
		
	}
	public void calcSum(String name,int...marks) {
		System.out.println(name);
		int sum = 0;
		for(int num:marks)
			sum+=num;
		System.out.println("Sum "+sum);
//		System.out.println("Avg"+sum/marks.length);
	}
	public void calcSum(String name) {
		System.out.println("Have a great day");
	}
}

