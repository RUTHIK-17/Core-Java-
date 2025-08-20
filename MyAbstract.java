package com.ruthik.www;

abstract class Plane123 {
	String pname;
	String pno;
	
	abstract void takeoff();
	
	void fly() {
		System.out.println("Plane fly in the sky");
	}
	
	void land() {
		System.out.println("Plane lands on the ground");
	}
	
}

//class CargoPlane123 extends Plane123{
//	@Override
//	public void fly() {
//		System.out.println("Plane fly in the sky");
//	}
//}








public class MyAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
