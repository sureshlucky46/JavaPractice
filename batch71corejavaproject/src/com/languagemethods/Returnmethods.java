package com.languagemethods;

public class Returnmethods {

	static int method1() {
		return 12;
	}
	
	static String method2() {
		return "lucky";
	}
	static double method3() {
		return 25.234567;
	}
	
	static float method4() {
		return (float) 34.56;
	}

	static void show() {

		System.out.println("int value: " + method1());
		System.out.println("string value: " + method2());
		System.out.println("double value: " + method3());
		System.out.println("double value: " + method4());
	}

	public static void main(String[] args) {
		show();

	}

}
