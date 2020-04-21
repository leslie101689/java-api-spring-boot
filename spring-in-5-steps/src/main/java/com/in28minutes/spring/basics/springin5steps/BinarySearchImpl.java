package com.in28minutes.spring.basics.springin5steps;

public class BinarySearchImpl {
	
	private SortAlgorithm sortAlgorithm;
	
	
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}

	public int binarySearch(int[] numbers, int numberToSearchFor) {
		
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		//Implementing Sorting Logic
		//Bubble Sort Algorithm
		//QuickSort Algorithm
		
		//Return the result
		return 3;
	}
	

}
