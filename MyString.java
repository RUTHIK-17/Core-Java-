package com.ruthik.www;

public class MyString {

	public static void main(String[] args) {
		String s1=new String("Rooman");
		String s2=new String("Rooman");
		String s3="Rooman";
		String s4="Rooman";
		System.out.println(s3==s4);
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.concat(" Tech"));
		s1=s1+"TECH";
//		System.out.println(s1);
//		System.out.println(s2);
		s2=s2+"TECH";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2);
		
	}

}
