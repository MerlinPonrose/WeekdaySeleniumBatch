package com.sample.test;

public class ArithmeticProg {

	public static int a = 5;
	public static int b= 9;
	public static int c;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArithmeticProg prog = new ArithmeticProg();
		ReturnType type = new ReturnType();
		System.out.println(type.additionOfNum(10, 7));
		
		prog.add();
		prog.sub();
		
		
	}
	
public void add()
{
	c= a+b;
	System.out.println("Addition of tw num ="+c);
}
protected static void sub()
{
	c= a-b;
	System.out.println("Sub of tw num ="+c);
}
private void mul()
{
	c=a*b;
	System.out.println(c);
}

void div()
{
	c=a/b;
}

}
