package com.ruthik.www;

class Grandparent {
	String car;
	String property;
	
	void contest() {
		System.out.println("The Gradnfather wins");
	}
	
	void win() {
		System.out.println("The family wins the contest");
	}
}

class Parent extends Grandparent{
	
}

class Child extends Parent{
	
}

public class TestInteritance {

	public static void main(String[] args) {
		Child c = new Child();
		c.contest();
		c.win();

	}

}
