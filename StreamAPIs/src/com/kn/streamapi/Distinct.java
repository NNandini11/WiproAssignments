package com.kn.streamapi;

import java.util.Arrays;
import java.util.List;


public class Distinct {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 20, 30, 10, 40, 50, 20, 60, 70);
		long count=numbers.stream()
				      .distinct()
				      .skip(2)
				      .limit(4)
				      .count();
				     
				     
		System.out.println("Count of values :"+count);

		
	}

}
