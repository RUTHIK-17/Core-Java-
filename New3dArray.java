package com.ruthik.www;

import java.util.Scanner;

public class New3dArray {

	public static void main(String[] args) {
		int [][][] arr = new int[2][4][6];
		Scanner n=new Scanner(System.in);
		for(int i=0;i<2;i++) {
			for(int j=0;j<4;j++) {
				for(int k=0;k<6;k++){
					
					
					System.out.println(arr.length);
					System.out.println(arr[i].length);
					System.out.println(arr[i][j].length);
					arr[i][j][k]=n.nextInt();
				}
			}
		}

	}

}
