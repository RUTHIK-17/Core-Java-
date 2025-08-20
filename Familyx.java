package com.ruthik.www;

class Mom1{
	String fname="Kumars";
	String value="5000Cr";
	
	void watchMovies() {
		System.out.println("Mom watching sentiment movies");
	}	
	static void visitpilgrims() {			
		System.out.println("Mom is visiting piligrimage");
	}
	private void useAccount() {
		System.out.println("Mom uses Account");
	}
}

class Son extends Mom1{
	@Override
	void watchMovies() {
		super.watchMovies();
	}
	void fdetails() {
		System.out.println("Son belongs to "+super.fname);
		System.out.println("He has value of proerty "+super.value);
	}
	static void visitpilgrims() {
		System.out.println("Son is visiting piligrimage");
	}
	
}

public class Familyx {

	public static void main(String[] args) {
		Son s=new Son();
		s.fdetails();
		s.watchMovies();
		s.visitpilgrims();
		

	}

}
