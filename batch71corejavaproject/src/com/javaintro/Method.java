package com.javaintro;

public class Method {
	
	static void method1() {
		Method m1=new Method();
		m1.method2();
		System.out.println("method 1 called");
		
	}
	
	void method2() {
		System.out.println("method 2 called");
	}
	
      public static void main(String[] args) {

		System.out.println("main method started");
		method1();
		System.out.println("main  method ended");

	}

}
