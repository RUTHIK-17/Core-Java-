package com.oops.www;

public class MyMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Started");
		Myclass user=new Myclass();
		MyDaemon daemon=new MyDaemon();
//		m.start();
		daemon.setDaemon(true);
		user.start();
		daemon.start();
		System.out.println("Main Completed");

	}

}
class Myclass extends Thread{
	public void run() {
		System.out.println("Thread Started");
		for(int i =0;i<10;i++) {
			System.out.println("Thread executing");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Thread completed");
	}
//	public void run() {
//		System.out.println("Thread Started");
//		for(;;) {
//			System.out.println("Thread executing");
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//	}
}

class MyDaemon extends Thread{
	public void run() {
		System.out.println("Daemon Thread Started");
		for(;;) {
			System.out.println("Daemon Thread executing");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}