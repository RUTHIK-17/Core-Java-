package com.ruthik.www;

public class MyBuffer {

	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer();
		System.out.println(s1.capacity());
		s1.append("JAVA");
		System.out.println(s1);
		System.out.println(s1.capacity());
		s1.append("JAVASCRIpT");
		System.out.println(s1);
		System.out.println(s1.capacity());
		s1.append("JAMESGOSLING");
		System.out.println(s1);
		System.out.println(s1.capacity());
		s1.trimToSize();
		System.out.println(s1.capacity());
	}

}
