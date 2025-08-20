package com.ruthik.www;

class Plane1 {
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

class CargoPlane1 extends Plane{
	@Override
	void fly() {
		System.out.println("Plane fly in the mid sky");
	}
	void carriescargo() {
		System.out.println("Cargo Plane carries cargo ");
	}
}

class Passengerplane1 extends Plane{
	@Override
	void fly() {
		System.out.println("Plane fly in the normal sky");
	}
	void carriespassenger() {
		System.out.println("passenger Plane carries passenger ");
	}
}

class Fighterplane1 extends Plane{
	@Override
	void fly() {
		System.out.println("Plane fly in the extreme high sky");
	}
	void carriesArms() {
		System.out.println("Fighter Plane carries Arms ");
	}
}

class Airport{
	void permit(Plane c) {
		c.takeoff();
		c.fly();
		c.land();
		
	}
}
		
public class MyPoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	CargoPlane c=new CargoPlane();
		//c.takeoff();
		//c.fly();
		//c.carriescargo();
		//c.land();
		Airport a = new Airport(); 
		CargoPlane c=new CargoPlane();
		a.permit(c);
		System.out.println("*****");
		Passengerplane pp=new Passengerplane();
		a.permit(pp);
	}

}
