package com.ruthik.www;

import java.util.Scanner;

public class MysubString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string1 ");
		String s1=sc.next();
		System.out.println("Enter the starting index: ");
		int i1=sc.nextInt();
		System.out.println("Enter the last index: ");
		int i2=sc.nextInt();
		if(i1!=i2) {
		System.out.println(mysubString(s1,i1,i2));
		}
		else {
			System.out.println("You have entered the same index.Change the index");
		}

	}
	public static String mysubString(String s1,int i1,int i2) {
		String t="";
		for(int i=i1;i<i2;i++) {
				t=t+s1.charAt(i);
		}
		return t;
	}

}
