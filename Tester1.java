package com.ruthik.www;

class Printer
{
void print(int a)
{
System.out.println("Printing int");
}

void print(float b)
{
System.out.println("Printing float");
}

void print(char c)
{
System.out.println("Printing char");
}

void print(boolean e)
{
System.out.println("Printing boolean");
}

void print(short h)
{
System.out.println("Printing short");
}

void print(double g)
{
System.out.println("Printing double");
}

void print(int a,int b)
{
System.out.println("Printing int and int");
}

void print(float a,float b)
{
System.out.println("Printing float and float");
}

void print(int a,int b,int c)
{
System.out.println("Printing int,int,int");
}

void print(int a,int b,float c)
{
System.out.println("Printing int,int,foat");
}
}

class Tester1
{
public static void main(String[] args)
{
int a=10,b=20,c=30;
char ch='A';
boolean e=false;
double d=0.4;
float f=1.0f;
short s=128;

Printer p= new Printer();
p.print(10,20);
}
}





