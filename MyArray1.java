package com.ruthik.www;

import java.util.Scanner;

public class MyArray1 {

	public static void main(String[] args) {
	int []arr = new int[10];
	Scanner s=new Scanner(System.in);
	for(int i=0;i<10;i++) {
		System.out.println("Enter the Value for "+i+"th ");
		arr[i]=s.nextInt();
	
	}
	for(int i=0;i<10;i++) {
		System.out.println(arr[i]);
		
	}
	System.out.println("Length of array "+arr.length);
	}

}
