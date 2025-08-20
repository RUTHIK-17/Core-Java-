package com.oops.www;

public class MyTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tables2 a1=new Tables2();
		Tables3 a2=new Tables3();
		Tables4 a3=new Tables4();
		a1.start();
		a2.start();
		a3.start();
		
	}

}

class Tables2 extends Thread{
	public void run() {
	System.out.println("Starting 2 tables");
	for(int i=1;i<=10;i++) {
		
		System.out.println("2 x "+i+"= "+2*i);
	}
	}
}
class Tables3 extends Thread{
	public void run() {
		System.out.println("Starting 3 tables");
		for(int i=1;i<=10;i++) {
			
			System.out.println("3 x "+i+"= "+3*i);
		}
	}
}
class Tables4 extends Thread{
	public void run() {
		System.out.println("Starting 4 tables");
		for(int i=1;i<=10;i++) {
			
			System.out.println("4 x "+i+"= "+4*i);
		}
	}
}
