package com.ruthik.www;

public class Mybuffer1 {

	public static void main(String[] args) {
		String s1=new String("Bangaluru");
		StringBuffer sb1=new StringBuffer(s1);
		System.out.println(sb1);
		sb1.append(" IT city");
		System.out.println(sb1);
	}

}
