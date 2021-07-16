package com.ds.arrays;

import java.util.ArrayList;

public class SampleArray {

	public static void main(String[] args) {

		ArrayList<Integer> array = new ArrayList();
		
		array.add(1);
		
		array.add(2);
		
		array.add(3);
		
		array.add(4);
		
		
		array.stream().forEach(System.out::println);
	}

}
