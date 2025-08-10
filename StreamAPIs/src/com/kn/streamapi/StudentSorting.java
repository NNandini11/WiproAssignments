package com.kn.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StudentSorting {
	String name;
	int marks;
	

	public StudentSorting(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}


	public static void main(String[] args) {
		
		List<StudentSorting >  l=Arrays.asList(
				 new StudentSorting ("Alice", 85),
				 new StudentSorting ("Bob", 75),
				 new StudentSorting ("John", 90)
				 );
		List<StudentSorting> st=l.stream()
				.sorted((s1, s2) -> Integer.compare(s2.marks, s1.marks)) // descending
				.collect(Collectors.toList());
		System.out.println(st);
				
		

	}

}
