package com.ruthik.www;

public class Student {
	String name;
	String dob;
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
		Student s= new Student();
		s.name="ruthik";
		s.dob="17-04-2003";
		s.usn="21BBTCS192";
		s.college="CMRU";
		System.out.println(s.name);
		System.out.println(s.dob);
		s.eat();
		s.sleep();
		s.study();
		s.stuDetails();
		

	}

}
