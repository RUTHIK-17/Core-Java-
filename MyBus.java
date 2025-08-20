package com.ruthik.www;

abstract class Bus{ 
	void ignition() {	//concrete method
		System.out.println("ignation of bus");
	}
	abstract void accelerate() ;//abstract method
	
	void breaks() {	//concrete method
	}	
}

public class MyBus {

	public static void main(String[] args) {
	// I don't want any one to allow change the class user
//		Bus b = new Bus();
//		b.ignition();
//		b.accelerate();
	}

}
