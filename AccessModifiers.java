package com.ruthik.www;

class Test1{
	private int a;
	int b;
	protected int c;
	public int d;
	
	void display() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}

class Test2 extends Test1{
	void display(){
	//	System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}

public class AccessModifiers {

}
