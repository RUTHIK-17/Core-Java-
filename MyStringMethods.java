package com.ruthik.www;

public class MyStringMethods {

	public static void main(String[] args) {
		String s1 = "   CMR Uniersity   ";
		System.out.println("Before trim "+ s1);
		System.out.println("After trim "+ s1.trim());
		
		String s2="Bangalore is a Heritage city.Bangalore is a state capital";
		System.out.println(s2.replace("Bangalore", "Mysore"));
		System.out.println(s2.startsWith("Ban"));
		System.out.println(s2.contains("gal"));
		System.out.println(s2.contains("uru"));

	}

}
