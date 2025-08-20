package com.oops.www;

import java.util.Scanner;

class MyAlpha extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread t=Thread.currentThread();
		String name=t.getName();
		if(name.equals("ADD"))
		{
			add();
		}
		else if(name.equals("CHAR"))
		{
			printChar();
		}
		else
		{
			printNum();
		}

	}
	
	public static void add() {
		System.out.println("Addition operation started");
		int a=5;
		int b=4;
		int c=a+b;
		System.out.println(c);
		System.out.println("Operation Completed");
	}
	
	public static void printChar()  {
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
	
	public static void printNum() {
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

public class MyImpl
{
	public static void main(String[] args) {
		MyAlpha o1=new MyAlpha();
		MyAlpha o2=new MyAlpha();
		MyAlpha o3=new MyAlpha();
		o1.setName("ADD");
		o2.setName("CHAR");
		o3.setName("NUM");
		o1.start();
		o2.start();
		o3.start();
	}
}
