package com.kn.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {

	public static void main(String[] args) {
		//Creating list of string values
		List<String> l=Arrays.asList("apple", "banana", "cherry");
		//Now creating a stream object
		List<String> fruit=l.stream()
				.map(x->x.toUpperCase())
				.collect(Collectors.toList());
		System.out.println(fruit);
				

	}

}
