package com.ruthik.www;

class WildAnimals{
	void hunt() {
		System.out.println("Animals hunt herborious");
	}
	void eat() {
		System.out.println("Animals eat meat");
	}
}

class Lion extends WildAnimals{
	
}
class Cub1 extends Lion{
	
}
class Cub2 extends Lion{
	
}
class Cub3 extends Lion{
	
}

public class TestHybrid {

	public static void main(String[] args) {
		Cub1 c = new Cub1();
		c.eat();
		c.hunt();

	}

}
