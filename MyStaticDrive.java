package com.ruthik.www;

class MyStatic {
static int a;
static int b;

static {
	System.out.println("Inside static block");
}
static void m1() {
	System.out.println("Inside static method");
	a=10;
	b=20;
}

int x;
int y;

{
	System.out.println("Inside Instance block");
}

void m2() {
	System.out.println("Inside Instance method");
}
public MyStatic(){
	System.out.println("Constructor executed");
	x=100;
	y=200;
}
}

public class MyStaticDrive{
	public static void main(String[] args) {
		MyStatic.m1();
		MyStatic stc=new MyStatic();
		stc.m1();
		System.out.println(MyStatic.a);
		System.out.println(MyStatic.b);
		System.out.println(stc.x);
		System.out.println(stc.y);
		
	}
}
