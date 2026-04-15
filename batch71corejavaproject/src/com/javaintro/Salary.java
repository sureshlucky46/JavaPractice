package com.javaintro;

public class Salary {

	double pf;
	int daily_allowance;
	double net_salary;
	int basic_salary;
	int total_daily_allowance;

	void display() {
		System.out.println("pf ammount:" + pf);
		System.out.println("basic salary:" + basic_salary);
		System.out.println("daily allowance:" + total_daily_allowance);
		System.out.println("net salary:" + net_salary);

	}

	public static void main(String[] args) {

		Salary s1 = new Salary();
		s1.basic_salary = 20000;
		s1.pf = (12.0 / 100.0) * s1.basic_salary;
		s1.daily_allowance = 100;
		s1.total_daily_allowance = s1.daily_allowance * 30;
		s1.net_salary = (s1.basic_salary + s1.total_daily_allowance) - s1.pf;

		s1.display();

	}

}
