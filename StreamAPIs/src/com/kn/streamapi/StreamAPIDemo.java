package com.kn.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPIDemo {

    public static void main(String[] args) {

        // Step 1: Create a list of integers
        List<Integer> nums = Arrays.asList(1, 0, 10, 9, 3, 8);

        // Step 2: Create a stream from the list to count elements
        long countElements = nums.stream().count(); // Stream is consumed here
        System.out.println("Total number of elements: " + countElements);

        // Step 3: Create a new stream to sort the elements
        Stream<Integer> sortedStream = nums.stream().sorted();

        // Step 4: Print the sorted elements using forEach
        System.out.println("Sorted elements:");
        sortedStream.forEach(n -> System.out.println(n)); // Stream is consumed here
        System.out.println("Applying filter: only odd numbers");
		Stream<Integer> s1=nums.stream()
				.filter(n->n%2==1);
				System.out.println("Applying  sorted Operation");
		       s1=s1.sorted();
		      
		       System.out.println("Applying Map function ");
	           s1=s1.map(n->n*4);
	          
		s1.forEach(n->System.out.println(n));
		
 
    }
}
