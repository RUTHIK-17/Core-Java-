package com.ruthik.www;

class Dog{
	String name;
	String breed;
	
	public Dog() {
		System.out.println("Dog object is creted");
	}
	
	void eat() {
		System.out.println("Dog is eating");
	}
	
	void wagTail() {
		System.out.println("Dog is wagging tail");
	}
}

class MariDog extends Dog{
	public MariDog() {
		System.out.println("Mari Dog object is created");
	}
}



public class Dogs {

	public static void main(String[] args) {
		MariDog m = new MariDog();
		m.eat();
		m.wagTail();

	}

}
