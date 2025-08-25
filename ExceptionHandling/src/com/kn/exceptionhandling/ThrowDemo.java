package com.kn.exceptionhandling;

import java.util.Scanner;

public class ThrowDemo {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter First Number");
	int a=scan.nextInt();
	System.out.println("Enter Second Number");
	int b=scan.nextInt();
	try {
		if(b==0) {
			throw new ArithmeticException("cannot divide with zero");
			
		}
		int result=a/b;
		System.out.println("The Result is "+a/b);
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
	scan.close();
	}

}
