package com.ruthik.www;

class Ac{
	private int temp,speed;
	
	void swing() {
		System.out.println("AC swings up and down");
	}
	void fan() {
		System.out.println("Fan is running");
	}
	public int getTemp() {
		return temp;
	}
	public void setTemp(int temp) {
		if(temp<=24 && temp>=16) {
			this.temp = temp;
		}
		else {
			System.out.println("Limit the AC between 16 to 24");
		}
		
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		
		this.speed = speed;
	}
	
}

public class Gamma {

	public static void main(String[] args) {
		Ac a = new Ac();
		a.setSpeed(100);
		a.setTemp(15);
		System.out.println(a.getSpeed());
		System.out.println(a.getTemp());

	}

}
