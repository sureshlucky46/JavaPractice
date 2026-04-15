package com.javaintro;

public class Bank {
	
	int accountnumber;
	String  name;
	int balance;
	static int count=101;
	
	{
		accountnumber=count++;
	}
	
	
	void display() {
	System.out.println("accountnumber:"+accountnumber);
	System.out.println("name:"+name);
	System.out.println("balance:"+balance); 
	}


	public static void main(String[] args) {
		
		Bank a1 = new Bank();
		a1.name="suresh lucky";
		a1.balance=50000;
		
		Bank a2 = new Bank();
		a2.name="rahul";
		a2.balance=40000;
		
		Bank a3 = new Bank();
		a3.name="jaanu";
		a3.balance=60000;
		 
		a1.display();
		a2.display();
		a3.display();
		
	

	}

}
