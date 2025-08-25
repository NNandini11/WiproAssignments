package com.kn.streamapi;

import java.util.List;
import java.util.stream.Collectors;

public class SortedDo {

	public static void main(String[] args) {
		 List<Integer> l=List.of(5,8,2,1,3,6,7,4);
		 List<Integer> num=l.stream()
				 .sorted((a,b)->b-a)
				 //.sorted(Comparator.reverseOrder())
				 .collect(Collectors.toList());
		 System.out.println(num);
	}

}
