package com.ruthik.www;


class Plane12 {
	String pname;
	String pno;
	
	void takeoff() {
		System.out.println("Plane takes off from runway");
	}
	
	void fly() {
		System.out.println("Plane fly in the sky");
	}
	
	void land() {
		System.out.println("Plane lands on the ground");
	}
	
}

class CargoPlane12 extends Plane{
	@Override
	void takeoff() {
		System.out.println("Plane takes off from runway");
	}
	
	void land() {
		System.out.println("Plane lands on the ground");
	}
	void fly() {
		System.out.println("Plane fly in the mid sky");
	}
	void carriescargo() {
		System.out.println("Cargo Plane carries cargo ");
	}
}

class Passengerplane12 extends Plane{
	@Override
	void fly() {
		System.out.println("Plane fly in the normal sky");
	}
	void takeoff() {
		System.out.println("Plane takes off from runway");
	}
	
	void land() {
		System.out.println("Plane lands on the ground");
	}
	void carriespassenger() {
		System.out.println("passenger Plane carries passenger ");
	}
}

class Fighterplane12 extends Plane{
	@Override
	void fly() {
		System.out.println("Plane fly in the extreme high sky");
	}
	void takeoff() {
		System.out.println("Plane takes off from runway");
	}
	void land() {
		System.out.println("Plane lands on the ground");
	}
	void carriesArms() {
		System.out.println("Fighter Plane carries Arms ");
	}
}

public class MyPlaneEx2 {

	public static void main(String[] args) {
		Plane r=new CargoPlane();	//Calling child class using parent class
		r.takeoff();
		r.fly();
		r.land();
		((CargoPlane)(r)).carriescargo();

	}

}
