package com.ruthik.www;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		int[][] arr=new int[2][];
		Scanner scan=new Scanner(System.in);
		arr[0]=new int[3];
		arr[1]=new int[5];
		for(int i=0;i<2;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter "+i+"th row "+j+"th column");
				arr[i][j]=scan.nextInt();
			}
		}
		
	for(int i=0;i<2;i++) {
		for(int j=0;j<arr[i].length;j++) {
			System.out.println(arr[i][j]);
		}
	}
}
	

}
