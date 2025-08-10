package com.kn.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Student {

	String name;
	
	
	public Student(String name) {
		super();
		this.name = name;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}


	public static void main(String[] args) {
		List<String> s=Arrays.asList("John", "Alice", "Bob");
		List<Student> st=s.stream()
				.map(x->new Student(x))
				.collect(Collectors.toList());
		System.out.println(st);
		
		
	}

}
