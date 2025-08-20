package com.ruthik.www;

class Bank1 {
	
	public Bank1() {
		System.out.println("Zero parameter constructors");
		//this("1234","ABCS");
	}
	
	private String accNo;
	private String passWord;
	
	public Bank1(String accNo,String passWord){
		this();
		System.out.println("Parameter Constructors");
		this.accNo=accNo;
		this.passWord=passWord;
	}
	String getAccno() {
		return this.accNo;
	}
	
	String getPassword() {
		return this.passWord;
	}
}
	
public class Driver1{
	public static void main(String[] args) {
		Bank1 b1=new Bank1("1234","ABCD");
		System.out.println(b1.getAccno());
		
	}
}
