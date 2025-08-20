package com.ruthik.www;

import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		int[][] arr = new int[2][5];
		Scanner c = new Scanner(System.in);
	
		for(int i=0;i<2;i++) {
			for(int j=0;j<5;j++) {
				System.out.println("Enter the value["+i+"]"+"["+j+"]th");
			arr[i][j]=c.nextInt();	
			}
		}
		for(int i=0;i<2;i++) {
			for(int j=0;j<5;j++) {
				System.out.println(arr[i][j]);
			}
		}

	}

}
