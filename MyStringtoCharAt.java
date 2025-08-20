package com.ruthik.www;

import java.util.Scanner;

public class MyStringtoCharAt {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string1 ");
		String s1=sc.next();
		char [] c=mycharArray(s1);
 		System.out.println(c);
		
	}
	
	public static char[] mycharArray(String s1) {
		char[] ch=new char[s1.length()];
		for(int i=0;i<s1.length();i++) {
			ch[i]=s1.charAt(i);
		}
		return ch;
	}

}
