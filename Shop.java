package com.ruthik.www;

class Customer {
	private String name,id,num ;
	
	public Customer() {
		this("Ramesh","12","82634876632");
		
	}
	public Customer(String name,String id,String num) {
		System.out.println("Parameter Constructors");
		this.name=name;
		this.id=id;
		this.num=num;
	}
	public void setname(String name) {
		this.name=name;
	}
	public void setid(String id) {
		this.id=id;
	}
	public void setnum(String num) {
		this.num=num;
	}
	
	
	public String getname() {
		return this.name;
	}
	
	public String getid() {
		return this.id;
	}
	
	public String getnum() {
		return this.num;
	}
}

public class Shop {

	public static void main(String[] args) {
		Customer c= new Customer("ABCD","ABCD","ABCD");
		
		c.setid("012");
		c.setname("ABCD");
		c.setnum("267667644");
		
		System.out.println(c.getid());
		System.out.println(c.getname());
		System.out.println(c.getnum());
		
	}

}
