package com.oops.www;

public class Geeks {

	public static void main(String[] args) {
		String s="geeks";
		System.out.println("given string="+s);
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i=i+2)
		{
			System.out.println(ch[i]);
		}
		String space=" ";
		for(int i=1;i<ch.length;i=i+2)
		{
			space=space+ch[i];
		}
		System.out.println(space);

	}

}
