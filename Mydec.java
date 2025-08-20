package com.ruthik.www;

public class Mydec {

	public static void main(String[] args) {
		int a = 90,b=0;
		//b=a--;
		//b=--a;
		//b=a++ + ++a;
		//b=++a + ++a;
		b=a++ + --a + ++a + a++;
		System.out.println(a);
		System.out.println(b);
		

	}

}
