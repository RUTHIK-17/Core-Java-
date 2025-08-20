package com.ruthik.www;

import java.util.Scanner;

public class loan {

	public static void main(String[] args) {
		String apporavel;
		Scanner c = new Scanner(System.in);
		System.out.println("Enter the salary amount");
		int am = c.nextInt();
		apporavel = (am > 50000)?("your loan is approved "):("your loan cannot be approved");
		System.out.println(apporavel);
	}

}
