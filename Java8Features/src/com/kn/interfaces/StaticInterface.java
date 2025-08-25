package com.kn.interfaces;


	interface add2Number
	{
		int add(int x,int y);
	}
	 
	public class StaticInterface {
	 
		public static void main(String[] args) {
		add2Number z=(x,y)->x+y;
			System.out.print(z.add(6,4));
			
		}
	 
	}


