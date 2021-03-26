package com.shristi.inher;

public class AbsDemo {

	public static void main(String[] args) {
//
//		Bank bank  = new Branch1();
////		bank.carLoan();
////		bank.eduLoan();
////		bank.houseLoan();
////		bank.admin();
////		
////		Branch1 branch1 = (Branch1) bank;
////		branch1.payInterest();
//		
//		bank  = new SubBranch();
//		bank.carLoan();
//		bank.eduLoan();
//		bank.houseLoan();
//		bank.admin();
//		
//		Branch2 branch2 = (Branch2) bank; // Branch2 branch2 = new SubBranch()
//		branch2.checkDeposit();
//		
//		SubBranch sub = (SubBranch) bank; // SubBranch branch2 = new SubBranch()
//		sub.checkPay();
		
		Bank bank = new Branch1();
		Bank.admin();
		Branch1.admin();
		
		
	}

}
















