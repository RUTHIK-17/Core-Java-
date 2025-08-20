package com.ruthik.www;

public class MyTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m=11;
		int[] arr=new int[6];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		arr[5]=6;
		System.out.println(arr);
		
		for(int i=1;i<=m;i++) {
			for(int j=6;j>=1;j--) {
				System.out.println(" ");
				
			}
		}
		for(int i=1;i<=m;i++) {
			for(int j=6;j>=1;j--) {
				System.out.println(" "+arr);
				
			}
		}
	}

}
