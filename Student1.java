package com.ruthik.www;

import java.util.Scanner;

public class Student1 {
	
		String name;
		String dob;
		int age;
		String usn;
		String college;
		
		void eat() {
			System.out.println("student is eating");
		}
		
		void sleep() {
			System.out.println("student is sleeping");
		}
		
		void study() {
			System.out.println("student is studying");
		}
		
		void stuDetails()
		{
			System.out.println(name+ " is a student, with USN " +usn+ " registered in "+college); 

		}


		public static void main(String[] args) {
			Student1 s = new Student1();
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the name");
			System.out.println("Enter your age");
			s.name = scan.next();
			s.age = scan.nextInt();
			System.out.println("Your name is "+s.name);
			System.out.println("Your age is "+s.age);
//			s.name="ruthik";
//			s.dob="17-04-2003";
//			s.usn="21BBTCS192";
//			s.college="CMRU";
//			System.out.println(s.name);
//			System.out.println(s.dob);
//			s.eat();
//			s.sleep();
//			s.study();
//			s.stuDetails();
			

		}

}
