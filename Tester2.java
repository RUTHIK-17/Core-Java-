package com.ruthik.www;

class Printer1 {
	public void print(int a)
	{
	System.out.println("Printing int");
	}

	public void print(short b)
	{
	System.out.println("Printing short");
	}


}

public class Tester2 {

	public static void main(String[] args) {
		short a=128;
		Printer p1= new Printer();
		p1.print(a);
		

	}

}
