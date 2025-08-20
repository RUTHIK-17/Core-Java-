package com.ruthik.www;

import java.util.Scanner;

public class MyStringendswith {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=sc.next();
		System.out.println("Enter the string to check");
		String s2=sc.next();
		boolean st=myendswith(s1,s2);
		System.out.println(st);
	}
	
	public static boolean myendswith(String s1,String s2) {
		for(int i=s1.length()-1,j=s2.length()-1;j>=0;i--,j--) {
			if(s1.charAt(i)!=s2.charAt(j)) {
				return false;
			}
		}
		return true;
	}
}
