package com.ruthik.www;

public class MyStringMethods1 {

	public static void main(String[] args) {
		String s1=new String("ROOMAN");
		String s2=new String("ROOMAn");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println("Printing S1 : "+s1);
		System.out.println("Printing S1 after lowerCase : "+s1.toLowerCase());
		System.out.println(s1);
		s1=s1.toLowerCase();
		System.out.println(s1);
		System.out.println(s2.toUpperCase());
		System.out.println(s2);
		s2=s2.toUpperCase();
		System.out.println(s2.concat(" TECHONOLOGIES"));
		s2=s2.concat(" TECHNOLOGIES");
		System.out.println(s2.length());
		System.out.println(s2.charAt(16));
		System.out.println(s2.substring(7,13));
		System.out.println(s2.substring(3,6));
		System.out.println(s2.substring(0));
		System.out.println(s2.substring(10,11));
		
		
	}

}
