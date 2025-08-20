package com.ruthik.www;

import java.util.Scanner;

public class MyEquals {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string1 ");
		String s1=sc.next();
		System.out.print("Enter the string2 ");
		String s2=sc.next();
		
		if(s1.length()==s2.length()) {
			System.out.println(myequalsto(s1,s2));
		}
		else {
			System.out.println("The given input is not equal");
		}
		
		
	}
	public static boolean myequalsto(String s1,String s2) {
		for(int i=0;i<=s2.length();i++) {
			if(s1.charAt(i)!=s2.charAt(i)) {
				return false;
			}
		}
		return true;
	}

}
