package com.oops.www;

import java.util.Scanner;
import java.lang.Error;

public class MyDemo {

	public void add() {
		// TODO Auto-generated method stub
		System.out.println("Addition operation started");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter num 1");
		int a=sc.nextInt();
		System.out.println("Enter num 2");
		int b=sc.nextInt();
		int c=a+b;
		System.out.println(c);
		System.out.println("Operation Completed");
	}
	public void printchar() throws InterruptedException{
		System.out.println("Alphabets printing started");
		for (int i=65;i<75;i++) {
			
			System.out.println((char)i);
			Thread.sleep(2000);
		}System.out.println("Alphabets printing completed");
	}
	public void printNum() throws InterruptedException{
		System.out.println("Numbers printing started");
		for (int i=1;i<=10;i++) {
			System.out.println(i);
			Thread.sleep(2000);
		}System.out.println("Numbers printing comleted");
	
	}
	
	public static void main(String[] args) throws InterruptedException{
		MyDemo d1=new MyDemo();
		d1.add();
		d1.printchar();
		d1.printNum();
	}
		
	

}
