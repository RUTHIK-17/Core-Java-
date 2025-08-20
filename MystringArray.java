package com.ruthik.www;

import java.util.Scanner;

public class MystringArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the line of string");
		String s=sc.nextLine();
		String[] arr=s.split(" ");
		
		for(String s1:arr) {
			System.out.println(s1);
		}
	}

}
