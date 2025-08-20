package com.ruthik.www;

abstract class RtcBus{
	void ignation(){
		System.out.println("ignation of bus");
	}
	void changeGear() {
		System.out.println("change gear in bus");
	}
}

class SuperDelux extends RtcBus{
	@Override
	void changeGear() {
		System.out.println("Automatic gear change in delux bus");
	}
	
}
public class MyFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperDelux s = new SuperDelux();
		s.ignation();
		s.changeGear();
		System.out.println(Math.PI);
	}

}
