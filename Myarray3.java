package com.ruthik.www;

import java.util.Scanner;

public class Myarray3 {
	public static void main(String[] args) {
		String[] ar = new String[6];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<6;i++) {
			System.out.println("Enter the name :");
			ar[i]=sc.next();
			System.out.println(ar[i]);
		}
		
				
	}

}
