package com.oops.www;

public class Mythread1 extends Thread {

	public static void main(String[] args) {
		
		try {
		System.out.println("Sachin started ");
		Thread.sleep(3000);
		System.out.println("Sachin following her");
		Thread.sleep(3000);
		System.out.println("Sachin Proposed her ");
		Thread.currentThread().interrupt();
		
			Thread.sleep(3000);
		}
	catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("thread got interrupted");
		}
		System.out.println("She accepted him");
		System.out.println("He married her");

	}

}
