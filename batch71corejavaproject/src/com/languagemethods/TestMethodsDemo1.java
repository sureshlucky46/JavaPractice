package com.languagemethods;

public class TestMethodsDemo1 {

	// no return type + no arguments
	static void show() {
		System.out.println("Show your ID card !");
	}

	void displayStudentInfo() {
		System.out.println("Student info ");
	}

	// no return type + with args
	public static void main(String[] args) {
		System.out.println("main method started !");

		TestMethodsDemo1 t1 = new TestMethodsDemo1();

		TestMethodsDemo1.show();

		t1.displayStudentInfo();

		System.out.println("main method ended !");
	}
}