package com.ruthik.www;

import java.util.Scanner;

public class MyStringltou {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=sc.next();
		String st=Mycase(s1);
		System.out.println(st);

	}
	public static String Mycase(String s1) {
		String t="";
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>='A'&& s1.charAt(i)<='Z') {
				t=t+(char)(s1.charAt(i)+32);
			}
			else if(s1.charAt(i)>='a'&& s1.charAt(i)<='z') {
				t=t+(char)(s1.charAt(i)-32);
			}
			else {
				t=t+(char)(s1.charAt(i));
			}
		}
		return t;
	}

}
