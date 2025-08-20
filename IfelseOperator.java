package com.ruthik.www;

import java.util.Scanner;

public class IfelseOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("Enter the Marks: ");
		int marks =sc.nextInt();
		
		if(marks>100 || marks<0) {
			System.out.println("Invalid marks");
		}
		else if(marks>=80 && marks<100){
			System.out.println("Distinction ");
		}
		else if(marks>=70 && marks<80) {
			System.out.println("First class");
		}
		else if (marks>60 && marks<70) {
			System.out.println("second class");
		}
		else if (marks>=45 && marks<60) {
			System.out.println("pass");
		}
		else {
			System.out.println("Fail");
		}
	}

}
