package com.ruthik.www;

import java.util.Scanner;

interface Calci{
	public abstract void add();
	public abstract void sub();
	
}

class MyCalci1 implements Calci{
	void add() {
		int a=20;
		int b=30;
		int c=a+b;
		System.out.println("Sum of add is "+c);
		
	}
	void sub() {
		int a=30;
		int b=10;
		int c= a-b;
		System.out.println("Difference of sub is "+c);
	}
}
class MyCalci2 implements Calci{
	void add() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number ");
		int a=sc.nextInt();
		System.out.println("Enter second number ");
		int b=sc.nextInt();
		int c=a+b;
		System.out.println("Sum of add is "+c);
		
	}
	void sub() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number ");
		int a=sc.nextInt();
		System.out.println("Enter second number ");
		int b=sc.nextInt();
		int c=a-b;
		System.out.println("Difference of sub is "+c);
	}
}
class MyCalci3 implements Calci{
	void add() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number ");
		int a=sc.nextInt();
		System.out.println("Enter second number ");
		int b=sc.nextInt();
		if(b==0) {
			System.out.println("Since b is zero operation cannot be done ");
		}
		int c=a+b;
		System.out.println("Sum of add is "+c);
		
	}
	void sub() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number ");
		int a=sc.nextInt();
		System.out.println("Enter second number ");
		int b=sc.nextInt();
		if(b==0) {
			System.out.println("Since b is zero operation cannot be done ");
		}
		int c=a-b;
		System.out.println("Difference of sub is "+c);
	}
}



public class MyLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
