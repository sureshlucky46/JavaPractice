package com.languagemethods;

//No return type + with arguments 
public class TestMethodsDemo3 {

	static void addition(int a, int b) {
		System.out.println("Addition :" + (a + b));
	}

	static void subtraction(float a, float b) {
		System.out.println("subtraction " + (a - b));
	}

	public static void main(String[] args) {

		addition(10, 50);
		addition(1000, 5000);

		subtraction(600, 300);
		subtraction(6000, 3000);

	}

}