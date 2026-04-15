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

	static void show() {
		int a = method1();
		System.out.println("int value: " + a);
		System.out.println("string value: " + method2());
		System.out.println("double value: " + method3());
	}

	public static void main(String[] args) {
		show();

	}

}
