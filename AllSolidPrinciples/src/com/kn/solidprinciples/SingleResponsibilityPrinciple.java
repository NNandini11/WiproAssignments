package com.kn.solidprinciples;

import java.util.Scanner;


public class SingleResponsibilityPrinciple {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter user Name");
		String name=scan.nextLine();
		System.out.println("Enter your Password");
		String password=scan.nextLine();
		String[] details=gettingUserDetails(name,password);
		System.out.println("User Details are");
		System.out.println("Your User Name is :"+details[0]);
		System.out.println("Your Password is :"+details[1]);
		scan.close();
	}
		public  static String[] gettingUserDetails(String name, String password) {
		
	
		 return new String[]{name, password};
		 
		
		}
		
	}

