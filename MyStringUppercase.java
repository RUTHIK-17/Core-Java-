package com.ruthik.www;

import java.util.Scanner;

public class MyStringUppercase {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=sc.next();
		String st=myUpperCase(s1);
		System.out.println(st);
		
	}
		public static String myUpperCase(String s1) {
			
		String t="";
	//	String s1="universe";
	//	System.out.println(s1);
		for(int i=0;i<s1.length();i++) {				//using ascii to convert lowercase to uppercase 
			if(s1.charAt(i)>='a'&& s1.charAt(i)<='z') {
				
			t=t+(char)(s1.charAt(i)-32);
			}
			else {
				t=t+s1.charAt(i);
			}
		}  
		return t;
	}
		

}
