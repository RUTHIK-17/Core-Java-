package com.oops.www;

import java.util.Scanner;

public class MyThread {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		MyLaunch1 m1=new MyLaunch1();
		MyLaunch2 m2=new MyLaunch2();
		MyLaunch3 m3=new MyLaunch3();
		
		m1.start();
		m2.start();
		m3.start();
		
		
	}

}

class MyLaunch1 extends Thread{
	public void run() {
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
}
class MyLaunch2 extends Thread {
	public void run() {
		System.out.println("Alphabets printing started");
		for (int i=65;i<75;i++) {
			
			System.out.println((char)i);
		}System.out.println("Alphabets printing completed");
	}
}
class MyLaunch3 extends Thread{
	public void run() {
		System.out.println("Numbers printing started");
		for (int i=1;i<=10;i++) {
			System.out.println(i);
		}System.out.println("Numbers printing comleted");
	
	}
}
