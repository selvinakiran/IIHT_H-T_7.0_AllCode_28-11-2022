package com.basics.functionalInterface;

import java.util.function.Supplier;

public class SupplierDemo implements Supplier<String>{

	
	public static void main(String[] args)
	{
		Supplier<String> supply = new SupplierDemo();
		System.out.println(supply.get());
	}

	@Override
	public String get() {
		// TODO Auto-generated method stub
		return "Hello Selvina ";
	}

}
