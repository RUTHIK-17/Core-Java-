package com.ruthik.www;

class Rectangle{
	int area(int l,int b) {
		return l*b;
	}
	 
	float area(int l,float b) {
		return l*b;

	}	
}

public class Alpha {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		float a=r.area(10, 4.5f);
		System.out.println(a);
	}

}
