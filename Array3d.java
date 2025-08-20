package com.ruthik.www;

import java.util.Scanner;

public class Array3d {
	public static void main(String[] args) {
		int[][][] arr = new int[2][2][4];
		Scanner c = new Scanner(System.in);
	
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				for(int k=0;k<4;k++) {
				System.out.println("Enter the value["+i+"]"+"["+j+"]"+"["+k+"]th");
			arr[i][j][k]=c.nextInt();	
				}
			}
		}
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				for(int k=0;k<4;k++) {
			
				System.out.println("The school "+i+" Section "+j+" student "+k+"is "+arr[i][j][k]);
				System.out.println(arr.length);
				System.out.println(arr[i].length);
				System.out.println(arr[i][j].length);
				}
			}
		}
		
	}
}
