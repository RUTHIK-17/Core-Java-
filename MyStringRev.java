package com.ruthik.www;

import java.util.Scanner;

public class MyStringRev {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=sc.next();
		String st=myreverse(s1);
		
		System.out.println(st);

	}
	public static String myreverse(String s1) {
		String t="";
		for(int i=s1.length()-1;i>=0;i--){
			t=t+s1.charAt(i);
		}
		return t;
		
	}

}
