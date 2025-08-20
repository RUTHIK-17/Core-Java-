package com.oops.www;

import java.util.Scanner;

public class Mymain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLunch1 m1=new MyLunch1();
		MyLunch2 m2=new MyLunch2();
		MyLunch3 m3=new MyLunch3();
		
		Thread t1 = new Thread(m1);
		Thread t2 = new Thread(m2);
		Thread t3 = new Thread(m3);
		
		t1.start();
		t2.start();
		t3.start();

	}

}

class MyLunch1 implements Runnable{
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
class MyLunch2 implements Runnable {
	public void run()  {
		System.out.println("Alphabets printing started");
		for (int i=97;i<123;i++) {
			
			System.out.println((char)i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}System.out.println("Alphabets printing completed");
	}
}
class MyLunch3 implements Runnable{
	public void run() {
		System.out.println("Numbers printing started");
		for (int i=1;i<=10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}System.out.println("Numbers printing comleted");
	
	}
}