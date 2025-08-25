package com.kn.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Filter {

	public static void main(String[] args) {
		//1. Here we are creating list of Strings
		List<String> fruits=Arrays.asList("Apple", "Banana", "Avocado", "Blueberry", "Apricot", "Mango");
		//Here we are converting collection to Stream collection
		List<String> fruit=fruits.stream()
				.filter(n->n.startsWith("A"))
				.collect(Collectors.toList());
		System.out.println(fruit);
				
				

	}

}
