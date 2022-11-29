package com.basics.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		
		Consumer<Integer> consumer = (t) -> System.out.println("Printing:" +t); //Single Line statement doesnot require Cury braces
		consumer.accept(500);
	
		//Adding list in the consumer interface
		
		List<Integer> numberList = Arrays.asList(1,2,3,4,5);
		
		numberList.forEach(consumer); //we can straight away can call for each without calling stream()
		
		
		numberList.forEach(number -> System.out.println("The value"+ number));
		
		
		
		
		
		
		

	}

}
