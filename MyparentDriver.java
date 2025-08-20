package com.ruthik.www;

class Myparent{
	String name;
	String property;
	private void readBook() {
		System.out.println("Mom reads books");
	}
	void driveCar() {
		System.out.println("Mom drives car");
	}
}

class Son11 extends Myparent{
	
	void readBook() {
		System.out.println("Son likes to read comics");
	}
}

public class MyparentDriver {

	public static void main(String[] args) {
		Son11 s = new Son11();
		s.readBook();

	}

}
