package com.ruthik.www;

abstract class Car13{
	void ignation(){
		System.out.println("To ignation car push the button");
	}
	void changeGear() {
		System.out.println("Car change the gear");
	}
	abstract void Accelerate();
	abstract void ApplyBreaks();
	
}

class Hashback extends Car13{
	@Override
	void Accelerate() {
		System.out.println("slow acceleration");
	}
	void ApplyBreaks() {
		System.out.println("Manual breaks");
	}
	
}
class Suv extends Car13{
	@Override
	void Accelerate() {
		System.out.println("fast acceleration");
	}
	void ApplyBreaks() {
		System.out.println("Manual breaks and automatic breaks");
	}
	
}
class Xuv extends Car13{
	@Override
	void Accelerate() {
		System.out.println("Very fast acceleration");
	}
	void ApplyBreaks() {
		System.out.println("Manual breaks and automatic breaks");
	}
	
}


public class MyCarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car13 x=new Xuv();
		Car13 s=new Suv();
		Car13 h=new Hashback();
		x.Accelerate();
		x.ApplyBreaks();
		x.changeGear();
		s.Accelerate();
		h.Accelerate();
		

	}

}
