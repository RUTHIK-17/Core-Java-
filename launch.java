package com.oops.www;

import java.util.ArrayList;

public class launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1=new ArrayList<>();
		System.out.println(a1.size());
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		System.out.println(a1.size());
		//a1.add(2,50);
		//System.out.println(a1);
		a1.set(2, 50);
		System.out.println(a1);

	}

}
