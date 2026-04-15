package com.languagemethods;

//SimpleCalculator 
public class TestMethodsDemo2 {

	static void add() {
		int a = 100;
		int b = 200;
		System.out.println("SUM of two numbers : " + (a + b));
	}

	static void sub() {
		int a = 100;
		int b = 200;
		System.out.println("Diffferences of Two number s: " + (b - a));
	}

	static void mul() {
		int a = 100;
		int b = 200;
		System.out.println("Product of the Two numbers " + (b * a));
	}

	static void div() {
		int a = 100;
		int b = 5;
		System.out.println("Quotient of two numbers: " + a / b);
	}

	static void mod() {
		int a = 98;
		int b = 5;
		System.out.println("Reminder of two numbers: " + a % b);
	}

	public static void main(String[] args) {

		add();
		sub();
		mul();
		div();
		mod();

	}

}