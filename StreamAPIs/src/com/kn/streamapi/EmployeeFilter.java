package com.kn.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeFilter {
	String name;
	int marks;
	
	

	public EmployeeFilter(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	



	@Override
	public String toString() {
		return "Employee [name=" + name + ", marks=" + marks + "]";
	}




	public static void main(String[] args) {
	   List<EmployeeFilter>  employees=Arrays.asList(
			   new EmployeeFilter("Nandini",40),
			   new EmployeeFilter("Arjun",80),
			   new EmployeeFilter("Surya",60),
			   new EmployeeFilter("Deepa",50),
			   new EmployeeFilter("Chinni",99)
			   
			   );
	   
	   List<EmployeeFilter> employee=employees.stream()
			   .filter(e->e.marks>=60)
			   .collect(Collectors.toList());
	   System.out.println("The student marks who has got abbove 60 ");
	   //method reference 
	   employee.forEach(System.out::println);
	}

}
