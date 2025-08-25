package com.kn.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapWithFilter {

	public static void main(String[] args) {
	List<List<String>> lists=Arrays.asList(Arrays.asList("Tom", "Alice"),
			                 Arrays.asList("Bob", "Steve", "Amy"));
	List<String> list=lists.stream()
			.flatMap(l->l.stream())
			.filter(m->m.length()>3)
			.collect(Collectors.toList());
	System.out.println(list);
	}

}
