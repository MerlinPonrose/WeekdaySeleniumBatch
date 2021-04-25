package com.sample.test;

public class ReturnType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ReturnType type = new ReturnType();
int addition = type.add();
System.out.println(addition);
int addition1 = type.additionOfNum(8, 7);
System.out.println(addition1);

	}
	
	public int add()
	{
		int a = 5;
		int b=7;
		int c = a+b;
		return c;
	}
	
	public int additionOfNum(int a, int b)
	{
		int z= a+b;
		return z;
	
	}

}
