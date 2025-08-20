package com.ruthik.www;
class Bike{
	String name;
	String bno;
	
	void start() {
		System.out.println("Bike starts");
	}
	void accelerate() {
		System.out.println("Bike accelerate");
	}
	void applyBreak() {
		System.out.println("Bike apply Breaks");
	}
}

class Splendor extends Bike{
	@Override
	void accelerate() {
		System.out.println("It acclerates slowly");
	}
	void familyBike() {
		System.out.println("Splendor is a family bike");
	}
}

class SuperBike extends Bike{
	@Override
	void accelerate() {
		System.out.println("It accelerates very fast");
	}
	void soloRide() {
		System.out.println("It is solo rider bike");
	}
}

class Moped extends Bike{
	@Override
	void accelerate() {
		System.out.println("It accelerates very solwly");
	}
	void carryLoad() {
		System.out.println("It helps in carrying load");
	}
}

class Servicestation{
	void permit(Bike b) {
		b.start();
		b.accelerate();
		b.applyBreak();
	}
}
public class BikeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Moped m = new Moped();
		m.accelerate();
		m.carryLoad();
		m.start();
		m.applyBreak();

	}

}
