package com.ruthik.www;

class Plane {
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

class CargoPlane extends Plane{
	@Override
	void fly() {
		System.out.println("Plane fly in the mid sky");
	}
	void carriescargo() {
		System.out.println("Cargo Plane carries cargo ");
	}
}

class Passengerplane extends Plane{
	@Override
	void fly() {
		System.out.println("Plane fly in the normal sky");
	}
	void carriespassenger() {
		System.out.println("passenger Plane carries passenger ");
	}
}

class Fighterplane extends Plane{
	@Override
	void fly() {
		System.out.println("Plane fly in the extreme high sky");
	}
	void carriesArms() {
		System.out.println("Fighter Plane carries Arms ");
	}
}

public class MyPlaneEx {

	public static void main(String[] args) {
		CargoPlane c=new CargoPlane();
		c.takeoff();
		c.fly();
		c.carriescargo();
		c.land();
		System.out.println("**********");
		
		Plane r=new CargoPlane();	//Calling child class using parent class
		r.takeoff();
		r.fly();
		r.land();
		((CargoPlane)(r)).carriescargo();
		
		//	CargoPlane b=new Plane();    
		//  Cannot call parent class from child class

	}

}
