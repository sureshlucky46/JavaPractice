package com.javaintro;

public class Student {
	int rollnumber;
	String studentname;
	String email;
	String address;
	

	public static void main(String[] args) {
		
		System.out.println("student1 details");
		Student a1 = new Student();
		a1.rollnumber=1;
		a1.studentname="suresh";
		a1.email="lucky1@gmail.com";
		a1.address="palakonda";
		System.out.println("rollnumber:"+a1.rollnumber);
		System.out.println("studentname:"+ a1.studentname);
		System.out.println("email:"+ a1.email);
		System.out.println("address:"+a1.address);
		
		System.out.println("student2 details");
		Student a2 = new Student();
		a2.rollnumber=2;
		a2.studentname="pavan";
		a2.email="pavan2@gmail.com";
		a2.address="vijayawada";
		System.out.println("rollnumber:"+a2.rollnumber);
		System.out.println("studentname:"+ a2.studentname);
		System.out.println("email:"+ a2.email);
		System.out.println("address:"+a2.address);
		
		System.out.println("student3 details");
		Student a3 = new Student();
		a3.rollnumber=3;
		a3.studentname="jaanu";
		a3.email="jaanu3@gmail.com";
		a3.address="vizianagaram";
		System.out.println("rollnumber:"+a3.rollnumber);
		System.out.println("studentname:"+ a3.studentname);
		System.out.println("email:"+ a3.email);
		System.out.println("address:"+a3.address);

	}

}
