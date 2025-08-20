package com.ruthik.www;

public class Testing {

	public static void main(String[] args) {
		//		Calculator cal = new Calculator();	
		//		cal.add();
		
		//		Calculator1 ca = new Calculator1();
		//		int res=ca.add();
		//		System.out.println(res);
		
		//		Calculator2 caa = new Calculator2();
		//		int x=200 , y=100;
		//		caa.add(x, y);
		
		Calculator3 c = new Calculator3();
		int x=10 , y=20;
		int res =c.add(x, y);
		System.out.println(res);
		
	}

}

//class Calculator{				//no input and no output
//	int a=100 , b=200 ,c;
//	public void add()
//	{
//		c=a+b;
//		System.out.println(c);
//	}
//}

//class Calculator1{				//no input and gives output
//	int a=100, b=200, c;
//	public int add() {
//		c = a+b;
//		return c;
//	}	
//}

//class Calculator2{					//takes input and no output
//	int c;
//	public void add(int a,int b)
//	{
//		c=a+b;
//		System.out.println("printing c inside add() ="+c);       
//	}
//}

class Calculator3{						//takes input and gives output
	int c;
	public int add(int a,int b)
	{
		c=a+b;
		return c;
	}
}

