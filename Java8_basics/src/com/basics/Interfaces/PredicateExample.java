package com.basics.Interfaces;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		Predicate<Integer> predicate1 = num -> (num >20);  //calling the predicate 
		System.out.println(predicate1.test(220));  //calling the predicate method
		
	}
}
