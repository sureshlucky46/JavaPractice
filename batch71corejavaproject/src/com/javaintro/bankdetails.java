package com.javaintro;

public class bankdetails {
	String accountholdername;
	int balance;
	static String branch;
	static String bankname;

	public static void main(String[] args) {
		branch="karimnagar";
		bankname="hdfc bank";
		
		System.out.println("customer1 account details");
		bankdetails a1 = new bankdetails();
		a1.accountholdername="suresh lucky";
		a1.balance=50000;
		System.out.println("accountholdername:"+ a1.accountholdername);
		System.out.println("balance:"+a1.balance);
		System.out.println("branch:"+ branch);
		System.out.println("bankname:"+bankname);
		
		System.out.println("customer1 account details");
		bankdetails a2 = new bankdetails();
		a2.accountholdername="jaanu";
		a2.balance=80000;
		System.out.println("accountholdername:"+ a2.accountholdername);
		System.out.println("balance:"+a2.balance);
		System.out.println("branch:"+ branch);
		System.out.println("bankname:"+bankname);
	}

}
