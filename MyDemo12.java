package com.ruthik.www;

import java.util.InputMismatchException;

public class MyDemo12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyParent p = new MyChild();
		p.method1();
	}

}

class MyParent{
	void method1()throws RuntimeException
	{
		System.out.println("Method 1 of parent");
	}
}
class MyChild extends MyParent{
	void method1()throws InputMismatchException
	{
		System.out.println("Method 1 overriden in child");
	}
}

