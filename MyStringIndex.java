package com.ruthik.www;

import java.util.Scanner;

public class MyStringIndex {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string1 ");
		String s1=sc.next();
		System.out.println("Enter the character to find index");
		String c=sc.next();
		System.out.println(myindexAt(s1,c));
		System.out.println(mylastindex(s1,c));
	
	}
	public static int myindexAt(String s1,String c) {
		char key=c.charAt(0);
		for(int i=0;i<s1.length();i++) {
			if(key==s1.charAt(i)) {
				return i;
			}	
		}
		return -1;	
	}
	public static int mylastindex(String s1,String c) {
		char key=c.charAt(0);
		for(int i=s1.length()-1;i>=0;i--) {
			if(key==s1.charAt(i)) {
				return i;
			}	
		}
		return -1;	
	}

}
