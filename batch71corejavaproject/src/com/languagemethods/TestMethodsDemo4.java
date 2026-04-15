package com.languagemethods;

public class TestMethodsDemo4 {

	static void getName(String name) {
		System.out.println("Good Morning Mr. :" + name);
	}

	static void method1(char c) {
		System.out.println(c);
	}

	static void method2(int c) {
		System.out.println(c);
	}

	public static void main(String[] args) {
		getName("Srikanth");
		getName("Surya");
		method1('A');
		method1('C');
		method2('A');
		method2(100);

	}

}