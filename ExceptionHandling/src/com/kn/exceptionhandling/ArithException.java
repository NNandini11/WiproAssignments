package com.kn.exceptionhandling;

public class ArithException {
	public static void  main(String[] args) {
		try {
			int y=100/0;
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getClass().getName());
		}
	}

}
