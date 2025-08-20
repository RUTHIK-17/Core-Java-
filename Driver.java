package com.ruthik.www;

class Bank{
	private String accNo;
	private String passWord;

	public void setDetails(String accNo,String passWord) {
		this.accNo = accNo;
		this.passWord=passWord;
	}
	
	public void setDetails(String passWord) {
		this.passWord=passWord;
	}
	public String getAccno() {
		return this.accNo;
	}


	public String getPassWord() {
		return this.passWord;
	}
//
//	public void setPassWord(String passWord) {
//		this.passWord = passWord;
//	} 
	
}

public class Driver {

	public static void main(String[] args) {
		Bank b=new Bank();
		b.setDetails("1234","abc123");
		System.out.println(b.getAccno());
		System.out.println(b.getPassWord());
		
	}

}
