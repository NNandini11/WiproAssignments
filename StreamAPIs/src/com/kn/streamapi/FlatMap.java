package com.kn.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {

	public static void main(String[] args) {
		List<List<String>> lists=Arrays.asList(Arrays.asList("John", "Alice"),
				                 Arrays.asList("Bob", "Carol"));
		
		List<String> list=lists.stream()
				          .flatMap(s->s.stream())
				          .collect(Collectors.toList());
		System.out.println(list);
		

	}

}
