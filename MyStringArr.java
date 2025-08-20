package com.ruthik.www;

public class MyStringArr {

	public static void main(String[] args) {
		String s1="Universe";
		String s2="Universe";
		String s3 =new String("Universe");
		String s4="UNIVERSE";
		//s1=s1.toUpperCase();
		System.out.println(s2);
		System.out.println(s1);
		System.out.println(s1==s4);
		System.out.println(s3==s4);
		
		System.out.println(s1.charAt(0));
		char[] ch=s1.toCharArray();
		for(int i=0;i<8;i++) {
			System.out.print(ch[i]);
		}
		for(char c:ch) {			//enhanced for loop
			System.out.println(c);
		}
		System.out.println(s1.charAt(3));
		System.out.println(s1.indexOf("v"));
		System.out.println(s1.indexOf("e"));
		System.out.println(s1.lastIndexOf("e"));
		System.out.println(s1.startsWith("Uni"));
		System.out.println(s1.endsWith("verse"));
		System.out.println(s1.endsWith("VERSE"));
		
	}

}
