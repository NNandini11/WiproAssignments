package com.kn.java8features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class TimeApI {

	public static void main(String[] args) {
		LocalDate date= LocalDate.now();
		System.out.println("LocalDate "+date);
		
		LocalTime time=LocalTime.now();
		System.out.println("LocalTime "+time);
		
		LocalDateTime ldt=LocalDateTime.now();
		System.out.println("LocalDateTime "+ldt);
		
		
		
		//Duration d=Duration.now();
		
		LocalDate birthdaydate=LocalDate.of(2001, 8, 19);
		LocalDate currentdate=LocalDate.now();
		Period age=Period.between(birthdaydate, currentdate);
		System.out.println("My age is "+age);
		 Period age1 = Period.parse("P23Y11M6D");

	        // Access individual parts
	        System.out.println("Years: " + age1.getYears());
	        System.out.println("Months: " + age1.getMonths());
	        System.out.println("Days: " + age1.getDays());

	}

}
