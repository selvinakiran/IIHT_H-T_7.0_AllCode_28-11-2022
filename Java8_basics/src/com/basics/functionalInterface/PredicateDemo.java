package com.basics.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


	
public class PredicateDemo {
	
	
//Using Legacy way
	//public class PredicateDemo implements Predicate<Integer>{
	//Predicate always expect input and return a boolean value as a output
	
//	@Override
//	public boolean test(Integer t) {
//		
//		if (t % 2 == 0)
//			return true;
//		else
//		return false;
//	}
	
public static void main(String[] args) {
//		Predicate<Integer> predicate = new PredicateDemo();
//		System.out.println(predicate.test(1));

	// Using Lambda Expression
//	Predicate<Integer> predicate = (t) -> {
//		if (t % 2 == 0)
//		{
//			return true;
//		}
//		return false;
//	};
	//Predicate<Integer> predicate = (t) -> t%2 ==0;
	//System.out.println(predicate.test(2));

	
	List<Integer> numberList = Arrays.asList(1,2,3,4,5);
	
	numberList.stream().filter((t) -> t%2 ==0).forEach(number -> System.out.println("Print the value :: "+number ));
	
	}


}
