package com.ruthik.www;

class Cat{
	String name;
	String breed;
	int cost;
	
	public Cat() {
		System.out.println("Default Constructor cat class");
	}
	public Cat(String name,String breed) {
		this(5000);
		this.name=name;
		this.breed=breed;
		System.out.println("Inside Name and breed Constructor");
	}
	public Cat(int cost) {
		this.cost=cost;
		System.out.println("Inside cost Constructor");
	}
	public Cat(String name) {
		this.cost=cost;
		System.out.println("Inside cost Constructor");
	}
	
	void eat() {
		System.out.println("Cat eat rat");
	}
	void meow() {
		System.out.println("Cat meows");
	}
}

class MariCat extends Cat{
	public MariCat() {
		super("Simba","Persian");
		System.out.println("Default Mari Cat class");
	}
}

public class CatInthritance {

	public static void main(String[] args) {
		MariCat m = new MariCat();
		Cat c=new Cat();
		System.out.println(c.name);
		System.out.println(c.breed);
		System.out.println(c.cost);
		
		m.eat();
		m.meow();
		
	}

}
