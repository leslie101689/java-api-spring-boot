package com.in28minutes.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringIn5StepsApplication {

	public static void main(String[] args) {
	
		BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3);
		System.out.println(result);
		//com.in28minutes.spring.basics.springin5steps.BubbleSortAlgorithm@41a4555e
		//com.in28minutes.spring.basics.springin5steps.QuickSortAlgorithm@41a4555e
		
		//SpringApplication.run(SpringIn5StepsApplication.class, args);
	}

}
