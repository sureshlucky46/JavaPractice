package com.languagemethods;

//with return type + No arguments 
public class TestMethodsDemo6 {

	static double getEmpSalInfo() {
		double sal = 50000.00;
		return sal;
	}

	static double getBonus() {
		double bonus = 4000.00;
		return bonus;

	}

	public static void main(String[] args) {

		double salary = getEmpSalInfo();
		double bonus = getBonus();

		System.out.println("Total Salary is : " + (salary + bonus));

	}

}