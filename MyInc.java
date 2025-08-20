package com.ruthik.www;

public class MyInc {
	public static void main(String[] args) {
		int a = 100,b=0;
		//b=a++;
		b=++a;
		System.out.println("value of a before increment " +a);
		System.out.println("value of a after increment " +b);
	}

}
