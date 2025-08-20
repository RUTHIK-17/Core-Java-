package com.ruthik.www;

abstract class Birds{
	abstract void fly();
	abstract void eat();	
}

abstract class Eagle extends Birds{
	void fly() {
		System.out.println("It Flyes in Greater Hights");
	}
}

class GoldenEagle extends Eagle{
	void eat() {
		System.out.println("Golden Eagle eats Snakes");
	}
}
class OceanEagle extends Eagle{
	void eat() {
		System.out.println("Ocean Eagle eats Fishes");
	}
}

public class MyBirds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OceanEagle o = new OceanEagle();
		Birds b = new OceanEagle();
		b.eat();
		o.fly();
		
	}

}
