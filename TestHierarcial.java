package com.ruthik.www;

class Mother{
	String name;
	
	void cook() {
		System.out.println("Mother is cooking");
	}
	void clean() {
		System.out.println("Mother is cleaning");
	}
}

class Son1 extends Mother {
	
}
class Son2 extends Mother{
	
}
class Son3 extends Mother{
	
}




public class TestHierarcial {

	public static void main(String[] args) {
		Son3 s = new Son3();
		s.clean();
		s.cook();

	}

}
